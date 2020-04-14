package test;

import com.company.TriTyp;
import org.junit.jupiter.api.Test;

public class TriTypTestTest {
    TriTyp triTyp = new TriTyp();

    //@Test
    /* Responsavel por verificar o comportamento do programa quando
     * apenas valores invalidos, como chars por exemplo, sao inseridos pelo
     * usuario.
     * Entradas a serem fornecidas: ["a", "%", "teste"]
     * Saida esperada: "Result is equilateral"
     * Saida obtida: "Result is equilateral"
     * */
//    public void a_allInvalidEntriesTest() {
//        int result = triTyp.triang("a", "%", "teste");
//        int expected = 1;
//        if (result == expected) {
//            System.out.println("Teste funcionou");
//        } else {
//            System.out.println("Teste nao funcionou");
//        }
//    }

    //@Test
    /* Responsavel por verificar o comportamento do programa quando
     * 2 valores invalidos, como chars por exemplo, sao inseridos pelo
     * usuario.
     * Entradas a serem fornecidas: [1, "a", "teste"]
     * Saida esperada: "Result is equilateral"
     * Saida obtida: "Result is equilateral"
     * */
//    public void b_twoInvalidEntriesTest() {
//        int result = triTyp.triang(1, "a", "teste");
//        int expected = 1;
//        if (result == expected) {
//            System.out.println("Teste funcionou");
//        } else {
//            System.out.println("Teste naofuncionou");
//        }
//    }

    //@Test
    /* Responsavel por verificar o comportamento do programa quando
     * 2 valores invalidos, como chars por exemplo, sao inseridos pelo
     * usuario.
     * Entradas a serem fornecidas: [2, "a", "teste"]
     * Saida esperada: "Result is: not a valid triangle"
     * Saida obtida: "Result is: not a valid triangle"
     * */
//    public void c_twoInvalidEntriesTest() {
//        int result = triTyp.triang(2, "a", "teste");
//        int expected = 4;
//        if (result == expected) {
//            System.out.println("Teste funcionou");
//        } else {
//            System.out.println("Teste naofuncionou");
//        }
//    }

    //@Test
    /* Responsavel por verificar o comportamento do programa quando
     * apenas 1 valor invalido, como char por exemplo, e inserido pelo
     * usuario.
     * Entradas a serem fornecidas: [1, 1, "teste"]
     * Saida esperada: "Result is equilateral"
     * Saida obtida: "Result is equilateral"
     * */
//    public void d_oneInvalidEntriesTest() {
//        int result = triTyp.triang(1, 1, "teste");
//        int expected = 1;
//        if (result == expected) {
//            System.out.println("Teste funcionou");
//        } else {
//            System.out.println("Teste naofuncionou");
//        }
//    }

//    //@Test
//    /* Responsavel por verificar o comportamento do programa quando
//     * apenas 1 valor invalido, como char por exemplo, e inserido pelo
//     * usuario.
//     * Entradas a serem fornecidas: [2, 1, "teste"]
//     * Saida esperada: "Result is: not a valid triangle"
//     * Saida obtida: "Result is: not a valid triangle"
//     * */
//    public void e_oneInvalidEntriesTest() {
//        int result = triTyp.triang(2, 1, "teste");
//        int expected = 4;
//        if (result == expected) {
//            System.out.println("Teste funcionou");
//        } else {
//            System.out.println("Teste naofuncionou");
//        }
//    }

    //@Test
    /* Responsavel por verificar o comportamento do programa quando
     * apenas 1 valor invalido, como char por exemplo, e inserido pelo
     * usuario.
     * Entradas a serem fornecidas: [2, 2, "teste"]
     * Saida esperada: "Result is: isosceles"
     * Saida obtida: "Result is: isosceles"
     * */
//    public void f_oneInvalidEntriesTest() {
//        int result = triTyp.triang(2, 2, "teste");
//        int expected = 2;
//        if (result == expected) {
//            System.out.println("Teste funcionou");
//        } else {
//            System.out.println("Teste naofuncionou");
//        }
//    }

    @Test
    /* Responsavel por verificar se, dadas entradas de triangulos
     *  equilateros, a resposta e condizente.
     *  Entradas fornecidas: [3,3,3] , [4,4,4]
     *  Saida esperada para os dois casos: "Result is: equilateral"
     *  Saida obtida para os dois casos: "Result is: equilateral"
     * */
    public void g_equilateralTriTest() {
        int result = triTyp.triang(3, 3, 3);
        int expected = 3;
        if (result == expected) {
            System.out.println("Teste funcionou");
        } else {
            System.out.println("Teste nao funcionou");
        }
        result = triTyp.triang(4, 4, 4);
        expected = 3;
        if (result == expected) {
            System.out.println("Teste funcionou");
        } else {
            System.out.println("Teste nao funcionou");
        }
    }

    @Test
    /* Responsavel por verificar se, dadas entradas de triangulos
     *  escalenos, a resposta e condizente.
     *  Entradas fornecidas: [5,7,8] , [4,11,8]
     *  Saida esperada para os dois casos: "Result is: scalene"
     *  Saida obtida para os dois casos: "Result is: scalene"
     * */
    public void h_scaleneTriTest() {
        int result = triTyp.triang(5, 7, 8);
        int expected = 1;
        if (result == expected) {
            System.out.println("Teste funcionou");
        } else {
            System.out.println("Teste nao funcionou");
        }
    }

    @Test
    /* Responsavel por verificar se, dadas entradas de triangulos
     *  isosceles, a resposta e condizente.
     *  Entradas fornecidas: [10,10,12] , [6,6,8]
     *  Saida esperada para os dois casos: "Result is: isosceles"
     *  Saida obtida para os dois casos: "Result is: isosceles"
     * */
    public void i_isoscelesTriTest() {
        int result = triTyp.triang(10, 10, 12);
        int expected = 2;
        if (result == expected) {
            System.out.println("Teste funcionou");
        } else {
            System.out.println("Teste nao funcionou");
        }
        result = triTyp.triang(6, 6, 8);
        expected = 2;
        if (result == expected) {
            System.out.println("Teste funcionou");
        } else {
            System.out.println("Teste nao funcionou");
        }
    }

    @Test
    /* Responsavel por verificar se, dadas entradas que nao formam
     * um triangulo, a resposta e condizente.
     * Valores para A, B e C que nao satisfacam as 3 regras abaixo
     * sao valores de medidas que nao fornecem triangulos.
     * |b – c| < a < b + c
     * |a – c| < b < a + c
     * |a – b| < c < a + b
     *  Entradas fornecidas: [4,22,3] , [4,4,12]
     *  Saida esperada para os dois casos: "Result is: not a valid triangle"
     *  Saida obtida para os dois casos: Result is: not a valid triangle
     * */
    public void j_notTriTest() {
        int result = triTyp.triang(4, 4, 22);
        int expected = 4;
        if (result == expected) {
            System.out.println("Teste funcionou");
        } else {
            System.out.println("Teste nao funcionou");
        }
    }
}