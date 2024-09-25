import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


// Used: https://www.freecodecamp.org/news/how-to-initialize-a-java-list/


public class Conversation {

  // Attributes:
  /* Takes the response from user */
  Scanner input = new Scanner(System.in); // scanner for round number
  Scanner input2 = new Scanner(System.in); // scanner for user input
  /* Random numbers */
  Random rand = new Random();
  /* List of arrays to store transcript */
  ArrayList<String> transcript = new ArrayList<>();

  
  
  // User imput and their mirror words:
  String[] user_words = {"I", "me", "am", "you", "my", "your"};
  String[] mirror = {"you", "me", "are", "I", "your", "my"};
  String[] responses = {"Mmmmmm.", "Wow!", "Love that!", "Great!", "Please, tell me more.", "Interesting."};

  // Main loop:
  public void play(){
    System.out.println("How many rounds would you like to converse?");
    int rounds = input.nextInt(); 

    System.out.println("Hi friend! What's on your mind?");
    
    // for loop of the main conversation
    for (int i = 0; i < rounds; i++){
      String userInput = input2.nextLine(); // stores the user input
      // random integer
      int rand_int1 = rand.nextInt(responses.length); // randomly chooses a number from 0 to the number of responses in responses
      System.out.println(responses[rand_int1]);
      
      
      
  
      



      /* User input */
      // String userInput = input.nextLine();

      // System.out.println(userInput);
      // String[] eachUser = userInput.split(" ");
      // System.out.println(eachUser[1]);



    
      
      //for loop of checking each of the words in the user's response and checking if they match the mirror words
      // for(int j=0; j<userInput.length()){

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
  // int size = p_questions_list.length;
  // p_questions[rand.nextInt(p_questions.length)];

  // random integer
    // int rand_int1 = rand.nextInt(rounds);
    //System.out.println(rand.nextInt(rounds));


  // Possible Questions:
    /* Creating an array with potential questions */
    // String[] p_questions = {"How was your day?", 
    //   "What is your favorite color", 
    //   "What do you like to do for fun?"};
  
  /* Creating a list object */
    // List<String> p_questions_list = Arrays.asList(p_questions);
