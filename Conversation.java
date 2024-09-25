import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


// Resources Used: 
//https://www.freecodecamp.org/news/how-to-initialize-a-java-list/
//https://stackoverflow.com/questions/858572/how-to-make-a-new-list-in-java


public class Conversation {

  // Attributes:
  /* Takes the response from user */
  Scanner input = new Scanner(System.in); // scanner for round number
  Scanner input2 = new Scanner(System.in); // scanner for user input
  /* Random numbers */
  Random rand = new Random();
  /* List of arrays to store transcript */
  ArrayList<String> transcript = new ArrayList<>();

  
  
  // User Input & Mirror Words:
  String[] user_words = {"I", "me", "am", "you", "my", "your"};
  String[] mirror = {"you", "me", "are", "I", "your", "my"};
  String[] responses = {"Mmmmmm.", "Wow!", "Love that!", "Great!", "Please, tell me more.", "Interesting."};

  // Main Loop:
  public void play(){
    System.out.println("How many rounds would you like to converse?");
    int rounds = input.nextInt(); 

    System.out.println("Hi friend! What's on your mind?");
    
    // For Loop of the Main Conversation
    for (int i = 0; i < rounds; i++){
      String userInput = input2.nextLine(); // stores the user input  
      /* Storing the indexes of the user and mirror words */
      List<Integer> user_match = new ArrayList<>(); // stores indexes for user
      List<Integer> mirror_match = new ArrayList<>(); // stores indexes for mirror
      
      /* Detects mirror words in user input*/
      String[] eachUser = userInput.split(" "); // splits user input by their spaces
      for(int j =0; j < eachUser.length; j++){  // for each word in the user's input

 
        /*for loop of checking each of the words in the user's response and checking if they match the mirror words */
        for(int k = 0; k< user_words.length; k++){ // for each word in user_words compare
          
          
          if (eachUser[j].equalsIgnoreCase(user_words[k])) {
            System.out.println(eachUser[j] + " matches " +user_words[k]);
            user_match.add(j); // adds the index
            mirror_match.add(k); // adds the index
            
            

            
          } else{

            
          }
          
          
          

        }
        
        //eachUser[j].equalsIgnoreCase()
        
        //System.out.println(eachUser[j]);


      }




      //System.out.println("user_match is " + user_match + "and mirror_match is" + mirror_match); // prints out 
      
      // Randomizes Canned Responses
      int rand_int1 = rand.nextInt(responses.length); // randomly chooses a number from 0 to the number of responses in responses
      System.out.println(responses[rand_int1]); // replies with canned responses

      //System.out.println(eachUser[j] + " doesn't match " +user_words[k]);
      
    
      
      

    }
    // Outside of For loop
    /* Thanking the user for talking with them */
    System.out.println("Thank you for talking with me. I enjoyed our conversation. Please come again to chat!");




  }


  public static void main(String[] arguments) {
    // You will start the conversation here.
    Conversation myConversation = new Conversation();

    // Asking how many conversations
    myConversation.play();
  }
}





// Idea Dump:
