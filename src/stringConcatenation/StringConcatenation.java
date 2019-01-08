package stringConcatenation;

public class StringConcatenation {
        public static void main(String[] args) {
            String text = "Hello";
            String anotherText = new String("Hello");
            //+ operator is used in 2 ways; if both are numeric you will result in numeric
            // if any one is string you will result is string

            System.out.println(2+3);
            System.out.println("a"+"b");
            System.out.println(1+2+"d");
            System.out.println("c"+(1+2)+2+2+"d");
            System.out.println('2'+'3');

            int three = 3;
            String four = "4";
            System.out.println(1+2+three+four);

            String myString = "";
            for(int i=1;i<=10;i++){
                myString = myString+i;
            }
            System.out.println(myString);

            String hello = "Hello";
            String world = "World";
            String newString = hello+world;

            System.out.println(hello);
            System.out.println(world);
            System.out.println(newString);







        }

    }
