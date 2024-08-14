import java.util.Scanner;

public class MultipleChoiceGame {
    public static void main(String[] args){
        /*Score inicializado */
        int score = 0;
        /*scanner para a entrada de dados */
        Scanner scan = new Scanner(System.in);

        /*Arrays que guardam as respostas do user e as corretas. */
        String[] answers = {"B", "A", "C", "D", "B"};
        String[] responses = {"", "", "", "", ""}; 

        System.out.println("1 - Who plays Deadpool?");
        System.out.println("A) Hugh Jackman");
        System.out.println("B) Ryan Reynolds");
        System.out.println("C) Chris Evans");
        System.out.println("D) James McAvoy");
        System.out.println("E) Travis Scott");

        System.out.println("2 - What is capital of Brazil?");
        System.out.println("A) Brasília");
        System.out.println("B) Rio de Janeiro");
        System.out.println("C) São Paulo");
        System.out.println("D) Londrina");
        System.out.println("E) Manaus");

        System.out.println("3 - What is the result of 5 * 7?");
        System.out.println("A) 40");
        System.out.println("B) 29");
        System.out.println("C) 35");
        System.out.println("D) 25");
        System.out.println("E) 15");

        System.out.println("4 - What is the result of 9 * 7?");
        System.out.println("A) 40");
        System.out.println("B) 29");
        System.out.println("C) 35");
        System.out.println("D) 63");
        System.out.println("E) 70");

        System.out.println("5 - What is the result of 100 - 50?");
        System.out.println("A) 40");
        System.out.println("B) 50");
        System.out.println("C) 27");
        System.out.println("D) 25");
        System.out.println("E) 13");

        responses[0] = scan.next();
        responses[1] = scan.next();
        responses[2] = scan.next();
        responses[3] = scan.next();
        responses[4] = scan.next();

        for (int i = 0; i < answers.length; i++) {
            if(responses[i].equalsIgnoreCase(answers[i]))
            score++;
        }
        System.out.println("You got " + score + "/" + answers.length + ". Congrats!");
        scan.close();
        /* 
         * System.out.println(responses[0]);
            System.out.println(responses[1]);
            System.out.println(responses[2]);
        */
        
    }
}
