public class Main {
    public static void main(String[]args){
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(2,3));
        System.out.println(calc.somar(2,3,4));
        System.out.println(calc.somar(2.5,3.7));
        System.out.println(calc.subtrair(3.4,4d));  //d significa que é double

        //Static -> usa a classe directamente
        System.out.println("");
        System.out.println(CalculadoraStatic.soma(1,2));
    }
}

