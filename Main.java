public class Main {
    public static void main(String[] args) {

        int[]list=new int[5];
        //CODE BLOCK FOR AVARAGE OF THE LIST CALCULATION
        /*for(int i=0;i< list.length;i++){
            list[i]=i+2;

        }
        int sum=0;
        for (int j:list) {
            sum+=j;

        }
        int ave=sum/ list.length;

        System.out.println("Average for the created list : "+ave );
        */
        double harmonic=0;
        double harmonicAve=0;
        for(double i=1;i< list.length+1;i++){
           harmonic+=1/i;

        }
        harmonicAve= list.length/harmonic;

        System.out.println("Harmonic Average for the Created List : "+harmonicAve);
    }
}
