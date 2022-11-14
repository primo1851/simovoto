package src;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int option = 9;
    long cpf;
    List list77 = new ArrayList();
    List list51 = new ArrayList();
    List list43 = new ArrayList();

    while (option != 0) {

      System.out.println("+=======Ressaquinhado Berimbau=======+");
      System.out.println("|77.Paulinho Anão                    |");
      System.out.println("|51.Rogerão                          |");
      System.out.println("|43.Darth Verde                      |");
      System.out.println("|0.Finalizar votação                 |");
      System.out.println("+====================================+");

      try {
        System.out.println("Selecione seu candidato: ");
        option = teclado.nextInt();

      } catch (Exception e) {
        System.out.println("Candidato não encotrado, insira novamente: ");
      }
      switch (option) {
        case 77:
          try {
            System.out.println("Insira seu CPF: ");
            cpf = teclado.nextLong();
            list77.add(cpf);

          } catch (Exception e) {
            System.out.println("Cpf não computado, insira novamente");
          }
          try {
            FileWriter writer = new FileWriter("voterInfo77.txt");
            for (Object str : list77) {
              writer.write(str + System.lineSeparator());
            }
            writer.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          break;

        case 51:
          try {
            System.out.println("Insira seu CPF: ");
            cpf = teclado.nextLong();
            list51.add(cpf);

          } catch (Exception e) {
            System.out.println("Cpf não computado, insira novamente");
          }
          try {
            FileWriter writer = new FileWriter("voterInfo51.txt");
            for (Object str : list51) {
              writer.write(str + System.lineSeparator());
            }
            writer.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          break;
        case 43:
          try {
            System.out.println("Insira seu CPF: ");
            cpf = teclado.nextLong();
            list43.add(cpf);

          } catch (Exception e) {
            System.out.println("Cpf não computado, insira novamente");
          }
          try {
            FileWriter writer = new FileWriter("voterInfo43.txt");
            for (Object str : list43) {
              writer.write(str + System.lineSeparator());
            }
            writer.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          break;

      }
    }
    System.out.println("Votação Finalizada!");
    if (list43.size() > list51.size() && list43.size() > list77.size()) {
      System.out.println("Candidato Darth Verde, 43, ganhou com " + list43.size() + " votos.");
    } else if (list43.size() < list51.size() && list51.size() > list77.size()) {
      System.out.println("Candidato Rogerão , 51, ganhou com " + list51.size() + " votos.");
    } else if (list77.size() > list51.size() && list77.size() > list43.size()) {
      System.out.println("Candidato Paulinho Anão , 77, ganhou com " + list77.size() + " votos.");
    }
  }
}