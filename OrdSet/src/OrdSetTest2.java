import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrdSetTest2 {

    // Casos de teste elencados na questao 6
    @Test
    void a_withMaxElementQtyTest() {
        final OrdSet2 OrdSet2 = new OrdSet2(12);
        try {
            OrdSet2.add(1);
            OrdSet2.add(2);
            OrdSet2.add(3);
            OrdSet2.add(4);
            OrdSet2.add(5);
            OrdSet2.add(6);
            OrdSet2.add(7);
            OrdSet2.add(8);
            OrdSet2.add(9);
            OrdSet2.add(10);
            OrdSet2.add(11);
            OrdSet2.add(12);
            OrdSet2.add(13);
            OrdSet2.add(14);
            OrdSet2.add(15);
            OrdSet2.add(16);
        } catch (OverflowException ignored) {
        }
        assertEquals(1, OrdSet2.getResizedTimes());
        assertEquals(16, OrdSet2.getActualSize());
        assertFalse(OrdSet2.isOverflow());
    }

    @Test
    void b_withMaxResizedTest() {
        final OrdSet2 OrdSet2 = new OrdSet2(8);
        try {
            OrdSet2.add(1);
            OrdSet2.add(2);
            OrdSet2.add(3);
            OrdSet2.add(4);
            OrdSet2.add(5);
            OrdSet2.add(6);
            OrdSet2.add(7);
            OrdSet2.add(8);
            OrdSet2.add(9);
            OrdSet2.add(10);
            OrdSet2.add(11);
            OrdSet2.add(12);
            OrdSet2.add(13);
            OrdSet2.add(14);
            OrdSet2.add(15);
        } catch (OverflowException ignored) {
        }
        assertEquals(2, OrdSet2.getResizedTimes());
        assertEquals(15, OrdSet2.getActualSize());
        assertFalse(OrdSet2.isOverflow());

    }

    @Test
    void c_withMaxResizedAndElementQtyTest() {
        final OrdSet2 OrdSet2 = new OrdSet2(8);
        try {
            OrdSet2.add(1);
            OrdSet2.add(2);
            OrdSet2.add(3);
            OrdSet2.add(4);
            OrdSet2.add(5);
            OrdSet2.add(6);
            OrdSet2.add(7);
            OrdSet2.add(8);
            OrdSet2.add(9);
            OrdSet2.add(10);
            OrdSet2.add(11);
            OrdSet2.add(12);
            OrdSet2.add(13);
            OrdSet2.add(14);
            OrdSet2.add(15);
            OrdSet2.add(16);
        } catch (OverflowException ignored) {
        }
        assertEquals(2, OrdSet2.getResizedTimes());
        assertEquals(16, OrdSet2.getActualSize());
        assertFalse(OrdSet2.isOverflow());
    }

    @Test
    void d_withValuesSmallerThanMax() {
        final OrdSet2 OrdSet2 = new OrdSet2(8);
        try {
            OrdSet2.add(1);
            OrdSet2.add(2);
            OrdSet2.add(3);
            OrdSet2.add(4);
            OrdSet2.add(5);
            OrdSet2.add(6);
            OrdSet2.add(7);
            OrdSet2.add(8);
        } catch (OverflowException ignored) {
        }
        assertEquals(OrdSet2.getResizedTimes(), 0);
        assertEquals(OrdSet2.getActualSize(), 8);
        assertFalse(OrdSet2.isOverflow());

    }


    // Valores limite
    @Test
    void e_withValuesSmallerThanMinimal() {
        final OrdSet2 OrdSet2 = new OrdSet2(1);
        assertEquals(OrdSet2.getSetSize(), 4);
        assertFalse(OrdSet2.isOverflow());
    }

    @Test
    void f_withValuesGreaterThanMax() {
        final OrdSet2 OrdSet2 = new OrdSet2(17);
        assertEquals(OrdSet2.getSetSize(), 16);
        assertFalse(OrdSet2.isOverflow());
    }

    @Test
    void g_SizeOverflowConditionTest() {
        final OrdSet2 OrdSet2 = new OrdSet2(12);
        try {
            OrdSet2.add(1);
            OrdSet2.add(2);
            OrdSet2.add(3);
            OrdSet2.add(4);
            OrdSet2.add(5);
            OrdSet2.add(6);
            OrdSet2.add(7);
            OrdSet2.add(8);
            OrdSet2.add(9);
            OrdSet2.add(10);
            OrdSet2.add(11);
            OrdSet2.add(12);
            OrdSet2.add(13);
            OrdSet2.add(14);
            OrdSet2.add(15);
            OrdSet2.add(16);
            OrdSet2.add(17);
        } catch (OverflowException ignored) {
        }
        assertEquals(OrdSet2.getResizedTimes(), 1);
        assertEquals(OrdSet2.getActualSize(), 16);
        assertTrue(OrdSet2.isOverflow());
    }


    @Test
    void h_ResizeOverflowConditionTest() {
        final OrdSet2 OrdSet2 = new OrdSet2(4);
        try {
            OrdSet2.add(1);
            OrdSet2.add(2);
            OrdSet2.add(3);
            OrdSet2.add(4);
            OrdSet2.add(5);
            OrdSet2.add(6);
            OrdSet2.add(7);
            OrdSet2.add(8);
            OrdSet2.add(9);
            OrdSet2.add(10);
            OrdSet2.add(11);
            OrdSet2.add(12);
            OrdSet2.add(13);
        } catch (OverflowException ignored) {
        }
        assertEquals(OrdSet2.getResizedTimes(), 2);
        assertEquals(OrdSet2.getActualSize(), 12);
        assertTrue(OrdSet2.isOverflow());
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