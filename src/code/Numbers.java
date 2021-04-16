package code;

public class Numbers {
	
	  public static void main(String[] args) {
	    for (int i = 0; i < 100; i++) {
	      // skips numbers that are NOT divisible by 5
	      if(i % 5 != 0){
	        continue;
	      }else{
	    	  //Prints only numbers divisible by 5
	        System.out.println(i);
	      }
	    }
	  }
	}
