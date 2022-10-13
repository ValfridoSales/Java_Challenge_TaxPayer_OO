import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Quantos contribuintes você vai digitar? ");
        int N = sc.nextInt();
        System.out.println();

        for (int i = 0; i<N; i++){
            System.out.println("Digite os dados do " + (i+1) + "o " + "contribuinte: ");
            System.out.print("Renda anual com salário: ");
            double salaryIncome = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            double servicesIncome = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double capitalIncome = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            double healthSpending = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            double educationSpending = sc.nextDouble();
            System.out.println();
            TaxPayer contributer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
            taxPayers.add(contributer);
        }
        for (int i = 0; i<N; i++){
            System.out.println("Resumo do "+ (i + 1) +"o contribuinte:");
            System.out.println(taxPayers.get(i).toString());
        }


    }
}
