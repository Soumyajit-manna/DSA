public class PrintSubarrays{
    public static void printSubarrays(int numbers[]){
        int totalSubarrays=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                totalSubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Toal Subarrays= "+totalSubarrays);
        

    }
    public static void main (String args[]){
        int numbers[]={2,4,6,8,10};
        printSubarrays(numbers);
    }
}