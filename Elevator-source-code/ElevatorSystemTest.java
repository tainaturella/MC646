import org.junit.Test;
import static org.junit.Assert.*;


public class ElevatorSystemTest {
    /**
     * São casos de teste onde as variáveis EE, SC, EP são marcadas como “em movimento”,  “notificado” e “fechada”,
     * respectivamente.
     * Sendo assim são situações onde o elevador estaria em movimento, mas sem estar oferecendo risco aos passageiros
     * com uma porta aberta durante o percurso
     */
    @Test
    public void a_checkFloorTest(){
        ElevatorGroup group = ElevatorGroup.getGroup(1,7);
        group.startGroup();
//        resetGroup(group);
        FloorInterface f = group.getFloorInterface(1);
        f.requestUp(3);
        Elevator e = group.e[0];
//        ElevatorInterface ei = group.getElevatorInterface(0);
//        ei.requestStop(3);
        try {
            Thread.sleep(3500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        assertEquals(Elevator.MOVING, e.getState());
        assertEquals(1, e.getFloor().getFloorID());
        assertFalse(e.getDoorOpen());
    }

    /**
     * São os casos onde o elevador deve manter seu estado, ficando a espera de algum tipo de requisição ou a
     * completude da tarefa atual
     */
    @Test
    public void b_doNothingTest(){
        ElevatorGroup group = ElevatorGroup.getGroup(1,5);
        group.startGroup();
//        resetGroup(group);
        Elevator e = group.e[0];
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        assertEquals(Elevator.IDLE, e.getState());
        assertEquals(0, e.getFloor().getFloorID());
        assertTrue(e.getDoorOpen());
    }

    /**
     * São casos de teste onde as variáveis EE, SP, EP são marcadas como “em movimento”, “requisitado” e “fechada”,
     * respectivamente.
     * Sendo assim são situações onde o elevador é requisitado a ir a um determinado piso, mas sem oferecer risco aos
     * passageiros durante o percurso
     */
    @Test
    public void c_stopAtFloorTest(){
        ElevatorGroup group = ElevatorGroup.getGroup(1,5);
        group.startGroup();
//        resetGroup(group);
        Elevator e = group.e[0];
        FloorInterface f = group.getFloorInterface(1);
        f.requestUp(3);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        assertEquals(Elevator.MOVING, e.getState());
        assertEquals(0, e.getFloor().getFloorID());
        assertTrue(e.getStop(3));
    }

    /**
     * Casos de teste onde as variáveis EE, SP, EP, são marcadas como “parado”, “requisitado” e “aberta”,
     * respectivamente.
     * Esses casos indicam a situação onde o elevador já chegou no andar em que ele foi requisitado de maneira segura
     * e agora precisa abrir as portas para o embarque ou desembarque de passageiros.
     */
    @Test
    public void d_openDoorTest(){

        ElevatorGroup group = ElevatorGroup.getGroup(1,5);
        group.startGroup();
//        resetGroup(group);
        Elevator e = group.e[0];
        FloorInterface f = group.getFloorInterface(1);
        f.requestUp(3);
        try {
            Thread.sleep(7400);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        assertFalse(e.getMotorMoving());
        assertEquals(3, e.getFloor().getFloorID());
        assertTrue(e.getDoorOpen());
    }

    /**
     * São casos de teste onde as variáveis EE e EP são marcadas como “em movimento” e “aberta”, respectivamente.
     * Independente das demais variáveis, se um elevador está com estes dois elementos em sobreposição está sendo
     * presenciado um erro no sistema de segurança.
     */
    @Test
    public void e_forceErrorTest(){
        ElevatorGroup group = ElevatorGroup.getGroup(1,4);
        group.startGroup();
//        resetGroup(group);
        Elevator e = group.e[0];
        FloorInterface f = group.getFloorInterface(1);
        f.requestUp(2);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        e.openDoor();
        assertTrue(e.getMotorMoving());
        assertTrue(e.getDoorOpen());

    }

    /**
     * São casos de teste que sucedem os casos de abrir a porta, ou seja, todos os passageiros já devem ter embarcado
     * ou desembarcado e agora é necessário realizar a operação de fechamento de portas para que o sistema possa entrar
     * em stand-by ou possa iniciar um movimento.
     */
    @Test
    public void f_closeDoorTest(){
        ElevatorGroup group = ElevatorGroup.getGroup(1,4);
        group.startGroup();
//        resetGroup(group);
        Elevator e = group.e[0];
        FloorInterface f = group.getFloorInterface(1);
        f.requestUp(2);
        try {
            Thread.sleep(6200);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        assertFalse(e.getMotorMoving());
        assertTrue(e.getDoorOpen());
    }

    /**
     * São casos de teste de sucedem o fechar de portas, podendo assim iniciar uma movimentação para cima ou para baixo
     * dependendo do andar atual do elevador e do andar onde este foi requisitado por um conjunto de usuários.
     */
    @Test
    public void g_startMovingTest(){
        ElevatorGroup group = ElevatorGroup.getGroup(1,7);
        group.startGroup();
//        resetGroup(group);
        Elevator e = group.e[0];
        FloorInterface f = group.getFloorInterface(2);
        f.requestUp(2);
        try {
            Thread.sleep(6200);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        assertFalse(e.getMotorMoving());
        assertTrue(e.getDoorOpen());
        f.requestDown(6);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        assertFalse(e.getDoorOpen());
        assertTrue(e.getMotorMoving());
    }

    private void resetGroup(ElevatorGroup group){
        for(int i=0; i<group.numElevators; i++){
            group.e[i].addStop(0, true);
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
}
