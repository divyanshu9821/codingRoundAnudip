// WAP to find sum of 10 integers and print the sum with a proper SOP statement.
// using for loop
    
public class SumTen{
    public static void main(String[] args){
        int arr[] = new int[]{1,2,3,4,5};
        int sumArr = 0;
        for(int i = 0;i<arr.length;i++){
            sumArr+=arr[i];
        }
        System.out.println(sumArr);
    }
}
