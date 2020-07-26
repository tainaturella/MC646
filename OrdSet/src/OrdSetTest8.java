import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class OrdSetTest8 {

    // Casos de teste elencados na questao 6
    @Test
    void a_withMaxElementQtyTest() {
        final OrdSet8 ordSet = new OrdSet8(12);
        try {
            ordSet.add(1);
            ordSet.add(2);
            ordSet.add(3);
            ordSet.add(4);
            ordSet.add(5);
            ordSet.add(6);
            ordSet.add(7);
            ordSet.add(8);
            ordSet.add(9);
            ordSet.add(10);
            ordSet.add(11);
            ordSet.add(12);
            ordSet.add(13);
            ordSet.add(14);
            ordSet.add(15);
            ordSet.add(16);
        } catch (OverflowException ignored) {
        }
        assertEquals(1, ordSet.getResizedTimes());
        assertEquals(16, ordSet.getActualSize());
        assertFalse(ordSet.isOverflow());
    }

    @Test
    void b_withMaxResizedTest() {
        final OrdSet8 ordSet = new OrdSet8(8);
        try {
            ordSet.add(1);
            ordSet.add(2);
            ordSet.add(3);
            ordSet.add(4);
            ordSet.add(5);
            ordSet.add(6);
            ordSet.add(7);
            ordSet.add(8);
            ordSet.add(9);
            ordSet.add(10);
            ordSet.add(11);
            ordSet.add(12);
            ordSet.add(13);
            ordSet.add(14);
            ordSet.add(15);
        } catch (OverflowException ignored) {
        }
        assertEquals(2, ordSet.getResizedTimes());
        assertEquals(15, ordSet.getActualSize());
        assertFalse(ordSet.isOverflow());

    }

    @Test
    void c_withMaxResizedAndElementQtyTest() {
        final OrdSet8 ordSet = new OrdSet8(8);
        try {
            ordSet.add(1);
            ordSet.add(2);
            ordSet.add(3);
            ordSet.add(4);
            ordSet.add(5);
            ordSet.add(6);
            ordSet.add(7);
            ordSet.add(8);
            ordSet.add(9);
            ordSet.add(10);
            ordSet.add(11);
            ordSet.add(12);
            ordSet.add(13);
            ordSet.add(14);
            ordSet.add(15);
            ordSet.add(16);
        } catch (OverflowException ignored) {
        }
        assertEquals(2, ordSet.getResizedTimes());
        assertEquals(16, ordSet.getActualSize());
        assertFalse(ordSet.isOverflow());
    }

    @Test
    void d_withValuesSmallerThanMax() {
        final OrdSet8 ordSet = new OrdSet8(8);
        try {
            ordSet.add(1);
            ordSet.add(2);
            ordSet.add(3);
            ordSet.add(4);
            ordSet.add(5);
            ordSet.add(6);
            ordSet.add(7);
            ordSet.add(8);
        } catch (OverflowException ignored) {
        }
        assertEquals(ordSet.getResizedTimes(), 0);
        assertEquals(ordSet.getActualSize(), 8);
        assertFalse(ordSet.isOverflow());

    }


    // Valores limite
    @Test
    void e_withValuesSmallerThanMinimal() {
        final OrdSet8 ordSet = new OrdSet8(1);
        assertEquals(ordSet.getSetSize(), 4);
        assertFalse(ordSet.isOverflow());
    }

    @Test
    void f_withValuesGreaterThanMax() {
        final OrdSet8 ordSet = new OrdSet8(17);
        assertEquals(ordSet.getSetSize(), 16);
        assertFalse(ordSet.isOverflow());
    }

    @Test
    void g_SizeOverflowConditionTest() {
        final OrdSet8 ordSet = new OrdSet8(12);
        try {
            ordSet.add(1);
            ordSet.add(2);
            ordSet.add(3);
            ordSet.add(4);
            ordSet.add(5);
            ordSet.add(6);
            ordSet.add(7);
            ordSet.add(8);
            ordSet.add(9);
            ordSet.add(10);
            ordSet.add(11);
            ordSet.add(12);
            ordSet.add(13);
            ordSet.add(14);
            ordSet.add(15);
            ordSet.add(16);
            ordSet.add(17);
        } catch (OverflowException ignored) {
        }
        assertEquals(ordSet.getResizedTimes(), 1);
        assertEquals(ordSet.getActualSize(), 16);
        assertTrue(ordSet.isOverflow());
    }


    @Test
    void h_ResizeOverflowConditionTest() {
        final OrdSet8 ordSet = new OrdSet8(4);
        try {
            ordSet.add(1);
            ordSet.add(2);
            ordSet.add(3);
            ordSet.add(4);
            ordSet.add(5);
            ordSet.add(6);
            ordSet.add(7);
            ordSet.add(8);
            ordSet.add(9);
            ordSet.add(10);
            ordSet.add(11);
            ordSet.add(12);
            ordSet.add(13);
        } catch (OverflowException ignored) {
        }
        assertEquals(ordSet.getResizedTimes(), 2);
        assertEquals(ordSet.getActualSize(), 12);
        assertTrue(ordSet.isOverflow());
    }

    // Cobertura de laços
    /**
     * 1. Caso já coberto de termos as quantidades máximas já presentes
     * 2. Caso em que permitimos que haja  duas execuções do laço de resize
     * 3. Caso já coberto onde permitimos apenas uma execução do laço de resize
     * **/
    // Term Coverage: A etapa inicial onde elencamos a quantidade de testes que seriam realizados ja
    // foi baseada no método de term coverage

}