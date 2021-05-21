public class Challenge1 {

        public static void main(String[] args){

            for(int i = 1; i <= 100; i++) {//for loop used for the iteration to check value of i from 1 to 100

                if((i % 3 == 0)&&(i % 5 == 0)) //checking value of 'i' that if number is multiple of both five and three then print "Planittesting"
                    System.out.println("PlanitTesting");
                else if(i % 3 == 0)//checking value of 'i' that if number is multiple of three then print "Planit"
                    System.out.println("Planit");
                else if(i % 5 == 0)//checking value of 'i' that if number is multiple of five then print "Testing"
                    System.out.println("Testing");
                else System.out.println(i);// for all other value print 'i'
            }
        }

    }
