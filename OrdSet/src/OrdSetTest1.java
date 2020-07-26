import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdSetTest1 {

    // Casos de teste elencados na questao 6
    @Test
    void a_withMaxElementQtyTest() {
        final OrdSet1 OrdSet1 = new OrdSet1(12);
        try {
            OrdSet1.add(1);
            OrdSet1.add(2);
            OrdSet1.add(3);
            OrdSet1.add(4);
            OrdSet1.add(5);
            OrdSet1.add(6);
            OrdSet1.add(7);
            OrdSet1.add(8);
            OrdSet1.add(9);
            OrdSet1.add(10);
            OrdSet1.add(11);
            OrdSet1.add(12);
            OrdSet1.add(13);
            OrdSet1.add(14);
            OrdSet1.add(15);
            OrdSet1.add(16);
        } catch (OverflowException ignored) {
        }
        assertEquals(1, OrdSet1.getResizedTimes());
        assertEquals(16, OrdSet1.getActualSize());
        assertFalse(OrdSet1.isOverflow());
    }

    @Test
    void b_withMaxResizedTest() {
        final OrdSet1 OrdSet1 = new OrdSet1(8);
        try {
            OrdSet1.add(1);
            OrdSet1.add(2);
            OrdSet1.add(3);
            OrdSet1.add(4);
            OrdSet1.add(5);
            OrdSet1.add(6);
            OrdSet1.add(7);
            OrdSet1.add(8);
            OrdSet1.add(9);
            OrdSet1.add(10);
            OrdSet1.add(11);
            OrdSet1.add(12);
            OrdSet1.add(13);
            OrdSet1.add(14);
            OrdSet1.add(15);
        } catch (OverflowException ignored) {
        }
        assertEquals(2, OrdSet1.getResizedTimes());
        assertEquals(15, OrdSet1.getActualSize());
        assertFalse(OrdSet1.isOverflow());

    }

    @Test
    void c_withMaxResizedAndElementQtyTest() {
        final OrdSet1 OrdSet1 = new OrdSet1(8);
        try {
            OrdSet1.add(1);
            OrdSet1.add(2);
            OrdSet1.add(3);
            OrdSet1.add(4);
            OrdSet1.add(5);
            OrdSet1.add(6);
            OrdSet1.add(7);
            OrdSet1.add(8);
            OrdSet1.add(9);
            OrdSet1.add(10);
            OrdSet1.add(11);
            OrdSet1.add(12);
            OrdSet1.add(13);
            OrdSet1.add(14);
            OrdSet1.add(15);
            OrdSet1.add(16);
        } catch (OverflowException ignored) {
        }
        assertEquals(2, OrdSet1.getResizedTimes());
        assertEquals(16, OrdSet1.getActualSize());
        assertFalse(OrdSet1.isOverflow());
    }

    @Test
    void d_withValuesSmallerThanMax() {
        final OrdSet1 OrdSet1 = new OrdSet1(8);
        try {
            OrdSet1.add(1);
            OrdSet1.add(2);
            OrdSet1.add(3);
            OrdSet1.add(4);
            OrdSet1.add(5);
            OrdSet1.add(6);
            OrdSet1.add(7);
            OrdSet1.add(8);
        } catch (OverflowException ignored) {
        }
        assertEquals(OrdSet1.getResizedTimes(), 0);
        assertEquals(OrdSet1.getActualSize(), 8);
        assertFalse(OrdSet1.isOverflow());

    }


    // Valores limite
    @Test
    void e_withValuesSmallerThanMinimal() {
        final OrdSet1 OrdSet1 = new OrdSet1(1);
        assertEquals(OrdSet1.getSetSize(), 4);
        assertFalse(OrdSet1.isOverflow());
    }

    @Test
    void f_withValuesGreaterThanMax() {
        final OrdSet1 OrdSet1 = new OrdSet1(17);
        assertEquals(OrdSet1.getSetSize(), 16);
        assertFalse(OrdSet1.isOverflow());
    }

    @Test
    void g_SizeOverflowConditionTest() {
        final OrdSet1 OrdSet1 = new OrdSet1(12);
        try {
            OrdSet1.add(1);
            OrdSet1.add(2);
            OrdSet1.add(3);
            OrdSet1.add(4);
            OrdSet1.add(5);
            OrdSet1.add(6);
            OrdSet1.add(7);
            OrdSet1.add(8);
            OrdSet1.add(9);
            OrdSet1.add(10);
            OrdSet1.add(11);
            OrdSet1.add(12);
            OrdSet1.add(13);
            OrdSet1.add(14);
            OrdSet1.add(15);
            OrdSet1.add(16);
            OrdSet1.add(17);
        } catch (OverflowException ignored) {
        }
        assertEquals(OrdSet1.getResizedTimes(), 1);
        assertEquals(OrdSet1.getActualSize(), 16);
        assertTrue(OrdSet1.isOverflow());
    }


    @Test
    void h_ResizeOverflowConditionTest() {
        final OrdSet1 OrdSet1 = new OrdSet1(4);
        try {
            OrdSet1.add(1);
            OrdSet1.add(2);
            OrdSet1.add(3);
            OrdSet1.add(4);
            OrdSet1.add(5);
            OrdSet1.add(6);
            OrdSet1.add(7);
            OrdSet1.add(8);
            OrdSet1.add(9);
            OrdSet1.add(10);
            OrdSet1.add(11);
            OrdSet1.add(12);
            OrdSet1.add(13);
        } catch (OverflowException ignored) {
        }
        assertEquals(OrdSet1.getResizedTimes(), 2);
        assertEquals(OrdSet1.getActualSize(), 12);
        assertTrue(OrdSet1.isOverflow());
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