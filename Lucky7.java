import java.util.Random;
import java.util.Scanner;


public class Lucky7 {
    public static void main(String[] args) throws Exception {


                
                    Scanner in = new Scanner(System.in);
                    Random random = new Random();
                    int Tokens = 5;
                    int randomNumber1;
                    int randomNumber2;
                    int randomNumber3;
                    String valinta;
                    String correctName = "Asko";
                    
                
                    
                    
        // Loop until the user inputs the correct name
        do {
            System.out.print("Arvaa nimeni: ");
            valinta = in.nextLine();

            if (valinta.equals(correctName)) {
                System.out.println("Arvasit oikein!");
            } else {
                System.out.println("Väärin!");
            }

        } while (!valinta.equals(correctName)); // Continue looping until the correct name is entered
                
                    

            


                    
                    
                    System.out.println("Write, how many Tokens you wish to buy?");
                    
                    String input = in.nextLine();
                    Tokens = Integer.parseInt(input);
                    System.out.println("You have "+ Tokens + " Tokens");


                    System.out.println("Start game? Write Yes or No.");
                    valinta = in.nextLine();
                    
                    if (!valinta.equals("Yes") && !valinta.equals("No")) {

                        System.out.println("Error");
                        System.out.println("You withdrew " + Tokens + " Tokens. Contact support.");
                        Tokens = 0;
                    }
                    
                    
                    else if (valinta.equals("Yes")) {

                        // Continue

                    }


                    else if (valinta.equals("No")) {

                    // Stop and withdraw Tokens
                    System.out.println("You withdrew " + Tokens + " Tokens");
                    Tokens = 0;
            

                    }



                    while (Tokens >= 1) {
                    Tokens--;
                    
            







                    
                    randomNumber1 = random.nextInt(10);
                    System.out.println(randomNumber1+1);    //Print random number between 1 and 10


                    randomNumber2 = random.nextInt(10);
                    System.out.println(randomNumber2+1);    //Print random number between 1 and 10

                    randomNumber3 = random.nextInt(10);
                    System.out.println(randomNumber3+1);    //Print random number between 1 and 10
                    
                    
                    // Check if all three numbers are 7
                    if (randomNumber1 == 6 && randomNumber2 == 6 && randomNumber3 == 6) {
                    System.out.println("Jackpot!");
                    Tokens += 5;
                    }



                        // Check if exactly two of the three numbers are 7
                        else if (randomNumber1 == 6 && randomNumber2 == 6 || randomNumber2 == 6 && randomNumber3 == 6 || randomNumber1 == 6 && randomNumber3 == 6) {
                        System.out.println("Two wins!");
                        Tokens += 3;
                    }


                    //Check if you have single wins

                    else if (randomNumber1 == 6 || randomNumber2 == 6 || randomNumber3 == 6) {
                    System.out.println("You win!");
                    Tokens += 1;
                    }

                    else {
                        System.out.println("You lose");
                    }

                    //Print token count
                    System.out.println("You have "+ Tokens + " Tokens");
                    System.out.println("Do you want to continue? Type Yes or No.");
                    





                    valinta = in.nextLine();
                    
                    if (!valinta.equals("Yes") && !valinta.equals("No")) {

                        System.out.println("Error");
                        System.out.println("You withdrew " + Tokens + " Tokens. Contact support.");
                        Tokens = 0;
                    }
                    
                    
                    else if (valinta.equals("Yes")) {

                        // Continue

                    }


                    else if (valinta.equals("No")) {

                    // Stop and withdraw Tokens
                    System.out.println("You withdrew " + Tokens + " Tokens");
                    Tokens = 0;
            

                    }





                }


            }

        }












            