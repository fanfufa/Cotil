import java.sql.SQLOutput;

public class Aluno implements IAluno{

    @Override
    public double calcMedia(double n1, double n2) {
        return (n1+n2)/2;
    }

    @Override
    public void chorrar() {
        System.out.println("aluno chorando");
    }
}
