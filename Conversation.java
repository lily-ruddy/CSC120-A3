import java.util.List;
import java.util.Scanner;


public class Conversation {

  // Attributes:
  /* Store the number of rounds */
  Scanner input;
  String[] possible_questions;
  



  // Constructor:
  public Conversation(){
    this.input = new Scanner(System.in);




  }
  


  // Loop:
  public void play(){
    System.out.println("How many rounds would you like to converse?");
    int rounds = this.input.nextInt(); 

    // for loop of the main conversation
    for (int i=0; i<rounds; i++){
      System.out.println("Hello friend! How was your day today?");
      String feeling = this.input.next();
      System.out.println("You're feeling " + feeling +"?");



    }






  }


  public static void main(String[] arguments) {
    // You will start the conversation here.
    Conversation myConversation = new Conversation();

    // Asking how many conversations
    myConversation.play();
  }
}




// Idea Dump
    // ask name
    // if(rounds > 1){
    //   System.out.println("Hello friend! What would you like me to call you?");
    //   String name = this.input.next();
    //   System.out.println("It is nice to meet you"+ name);
    // } else{
    //   System.out.println("Hi how are you!");
    // }

    // Use
    //if word.equal(){
    //}
