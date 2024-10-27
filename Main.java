import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Exercise (Array)");
        System.out.println("""
                    ********************************************************
                \t\t\t\t\t\t\t\
                question  1
                    ********************************************************""");

//        1.Write a Java program to test if the first and the last element of an array of
//        integers are same.
//        The length of the array must be greater than or equal to
//        2 Test Data:
//        array = 50, -20, 0, 30, 40, 60, 10
//        Sample Output: false
        System.out.println("enter a number of items:");
        int itemcount=input.nextInt();
        int count=0;
        int [] myArry=new int[itemcount];
        while (count<myArry.length){
            System.out.println("enter a number :");
            int item=input.nextInt();
            myArry[count]=item;
            count++;
        }
        System.out.println(myArry[0]==myArry[myArry.length-1]);

        System.out.println("""
                    ********************************************************
                \t\t\t\t\t\t\t\
                question  2
                    ********************************************************""");

//        2.Write a Java program to find the numbers greater than the average of the
//        numbers of a given array.
//                Original Array:
//                  [1, 4, 17, 7, 25, 3, 100]
//        Expected Output:
//        The average of the said array is: 22.0
//        The numbers in the said array that are
//        greater than the average are: 25 100
        int[] maArray={1,4,17,7,25,3,100};

        ArrayList <Integer> sidArray=new ArrayList<>();
        System.out.println(maArray.length);
        int average=0;
        int sum = 0;
        System.out.println(sum);
        System.out.println(average);

        for (int v =0;v<maArray.length;v++){
            sum=sum+maArray[v];
        }

//        System.out.println(sum);
        average=sum/maArray.length;
//        System.out.println(average);
        for (int v =0;v<maArray.length;v++){
            if (average<maArray[v]){
                sidArray.add(maArray[v]);
            }
        }

        System.out.println(" The average of the said array is:"+average);

        System.out.println("greater than the average are:"+ sidArray);


        System.out.println("""
                    ********************************************************
                \t\t\t\t\t\t\t\
                question  3
                    ********************************************************""");
//
//        3.Write a Java program to get the larger value between first and last
//        element of an array of integers.
//        Original Array:
//          [20, 30, 40]
//        Sample Output:
//        Larger value between first and last element: 40
        int[] maArrayQ3={20,30,40};
        int larger=maArrayQ3[0];
        for (int v =0;v<maArrayQ3.length;v++){
            if(larger<maArrayQ3[v]){
                larger=maArrayQ3[v];
            }
        }

            System.out.println("Larger value between first and last element = "+larger);

        System.out.println("""
                    ********************************************************
                \t\t\t\t\t\t\t\
                question  4
                    ********************************************************""");
//
//        4.Write a Java program to swap the first and last elements of an array and
//        create a new array.
//                Original Array:
//[20, 30, 40]
//        Sample Output:
//        New array after swapping the first and last elements: [40, 30, 20]
        int temp = maArrayQ3[0];
        maArrayQ3[0]=maArrayQ3[maArrayQ3.length-1];
        maArrayQ3[maArrayQ3.length-1]=temp;

        System.out.println(Arrays.toString(maArrayQ3));
            System.out.println("""
                    ********************************************************
                \t\t\t\t\t\t\t\
                question  5
                    ********************************************************""");

//        5. Write a program that places the odd elements of an array before the
//        even elements.
//        Original Array:
//         [2,3,40,1,5,9,4,10,7]
//        Sample Output:
//          [3,1,5,9,7,2,40,4,10]
        ArrayList<Integer> sortNumb=new ArrayList<>();
        sortNumb.add(2);
        sortNumb.add(3);
        sortNumb.add(40);
        sortNumb.add(1);
        sortNumb.add(5);
        sortNumb.add(9);
        sortNumb.add(4);
        sortNumb.add(10);
        sortNumb.add(7);

        for (int v :sortNumb){
            if (v %2!=0){
                sortNumb.set(0,v);
            }
        }
        System.out.println(sortNumb);
        System.out.println("""
                    ********************************************************
                \t\t\t\t\t\t\t\
                question  6
                    ********************************************************""");

//        6. Write a program that test the equality of two arrays.
//          [2,3,6,6,4] [2,3,6,6,4]
//        Sample Output: true
//
        int [] testArray1={2,3,6,6,4};
        int [] testArray2={2,3,6,6,4};
        boolean equals=true;
        for (int i =0 ;i<testArray1.length;i++){
            if (testArray1[i]==testArray2[i]){
                continue;
            }else equals=false;

        }
        System.out.println(equals);

    }
}