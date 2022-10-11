public class Projeto{
    public static void main(String[] args){
        System.out.println("Olá Professor!");

        Bhaskara formula = new Bhaskara();
        formula.a = 1;
        formula.b = 3;
        formula.c = 2;

        formula.calculaDelta();
        formula.calcularx1();
        formula.calcularx2();

        System.out.println("O valor de delta é: " + formula.delta);
        System.out.println("O valor de x1 é: " + formula.x1);
        System.out.println("O valor de x2 é: " + formula.x2);

        //Aluno aluno01 = new Aluno();
        //aluno01.nome = "Alinne";
        //aluno01.semestre = 1;
        //aluno01.idade = 19;

        //aluno01.informacoesAluno();

         //Aluno aluno02 = new Aluno();
        //aluno02.nome = "Castiel";
        //aluno02.semestre = 1; 
        //aluno02.idade = 20;

        //aluno02.informacoesAluno();
    }
}