import javax.swing.JOptionPane;

public class TesteAleatorio {
    public static void main(String[] args) {
        double raizDeDois = Math.sqrt(2);
        JOptionPane.showInputDialog("Digite um valor");

        //Aluno.estudar();

        Aluno a1 = new Aluno();
        a1.nome = "Ana";
        //a1.estudar

        AlunoDeGraduacao a2 = new AlunoDeGraduacao();

        a2.nome = "Ana";
        a2.nota1 = 5.2;
    }
}
