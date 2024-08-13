import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calendar cal = GregorianCalendar.getInstance();
        Scanner scan = new Scanner(System.in);

        int anoAtual = cal.get(Calendar.YEAR);
        int anoNascimento;
        int idadeAtual;
        String situacaoVoto;
        String completouAno;

        String anoEleitoral = (anoAtual % 2 == 0) ?
                "Esse ano terá eleições!" : "Esse ano não terá eleições!";

        System.out.print("Você já completou ano nesse ano? [S/N] ");
        completouAno = scan.nextLine();

        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = scan.nextInt();

        idadeAtual = anoAtual - anoNascimento;

        if (Objects.equals(completouAno, "N")) {
            --idadeAtual;
        }

        boolean isOpcional = (idadeAtual >= 16 && idadeAtual < 18) || (idadeAtual >= 70);

        if (idadeAtual <= 15){
            situacaoVoto = "Você não vota!";
        } else if (isOpcional) {
            situacaoVoto = "Seu voto é opcional!";
        } else {
            situacaoVoto = "Seu voto é obrigatório!";
        }

        System.out.println("----------------------------------");
        System.out.println(anoEleitoral);
        System.out.println("Você tem " + idadeAtual + " anos de idade, portanto");
        System.out.println(situacaoVoto);
    }
}