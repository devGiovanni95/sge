
import java.util.Scanner;

public class sge {

    public static void main(String[] args) {
        String username = null;
        String senha = null;
        String login = null;
        String loginPassword = null;

        System.out.println(" Cadastro de novo usúario ");
        System.out.println("Seja bem vindo ");

        System.out.println("Digite seu primeiro nome: ");
        Scanner dados = new Scanner(System.in);

        String nome = dados.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = dados.nextLine();

        String nomeCompleto = (nome + sobrenome);
        System.out.println("Nome completo :");
        System.out.println(nomeCompleto);

        username = nome.charAt(0) + "_" + sobrenome;
        System.out.println("Seu usuario de login será:" + username);

        System.out.println("Agora iremos definir uma senha, ");
        System.out.println("lembrando que a sua senha deverá conter pelo menos 1 de cada, dos sequintes caracteres:");
        System.out.println("Letra maiuscula, minuscula, numero, caracteres especiais: @, -, _, ou  #  .");
        System.out.println("E ter sequencia de no minimo 8 digitos");

        boolean validaSenha = false;

        while (validaSenha == false) {
            System.out.println("Digite a senha: ");
            senha = dados.nextLine();

            if (senha.length() >= 8 && senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, _, @, #])(?=.*[A-Z])(?=.*\\d).+")) {
                System.out.println("Senha criada com sucesso, aguarde para ser redirecionado");
                validaSenha = true;
            } else {
                System.out.println("Senha criada, não corresponde, com as informações passadas para sua criação, refaça novamente a senha");
            }
        }



        System.out.println("Pronto, agora que já criamos seu login e senha \n vamos para o proximo passo  ");
        System.out.println("Área de login");
        System.out.println("Para continuar digite os seguintes dados: ");


        do {
            System.out.println("Usuário: ");
            login = dados.nextLine();

            System.out.println("Senha: ");
            loginPassword = dados.nextLine();

            if(!login.equals(username) || !loginPassword.equals(senha)){
                System.out.println("Usuário ou senha incorretos");
            }

        } while(!login.equals(username) || !loginPassword.equals(senha));

        System.out.println("Seja bem vindo " + username);

    }
}