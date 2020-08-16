import java.util.Scanner;

public class LoginSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Sobrenome: ");
        String sobrenome = scanner.nextLine();

        String username = nome.charAt(0) + "_" + sobrenome;

        boolean senhasucesso = false;

        String senha = null;

        while (senhasucesso == false) {

            System.out.println("Digite uma senha: ");
             senha = scanner.nextLine();

            if (senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() > 7) {
                System.out.println("Senha criada com SUCESSO!");

                senhasucesso = true;

            } else {
                System.out.println("A senha deve conter mais de 8 caracteres, incluindo pelo menos uma letra Maiúscula e Caracteres especiais");

                 }

            }

        System.out.println("Username: " + nome.charAt(0) + "_" + sobrenome);
        System.out.println("Senha: " + senha);

        boolean Entrada = false;
        while (Entrada == false){

            System.out.println("Digite seu username: ");
            String login = scanner.nextLine();

            System.out.println("Digite sua senha: ");
            String senhav = scanner.nextLine();

            if (login.equals(username) && senhav.equals(senha)){

                System.out.println("Sucess!!!");

                Entrada = true;

            }else {
                System.out.println("Dados inválidos!");
            }

        }
    }
}
