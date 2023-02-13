class Assignment3 {

    public static void main(String[] args) {
        // fact(5);
        // prime(50);
        // sum_avg(10);
    }
// -------------------------Factorial--------------------------//
    public static void fact(int num) {
        long temp = 1;
        if (num==1) {
            System.out.println(1);
        }
        else{
            for(int i=num;i>=1;i--)
            {
                temp=temp*i;
            }
            System.out.println("The factorial of the number is :"+temp);
        }
    }

//-----------------------------Prime------------------------//
    public static void prime(int num) {
        int count; 
        System.out.println("The prime numbers are :"); 
        for(int i=1;i<num;i++)
        {   
            count = 0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {count++;}
            }
        if(count==0)
        {System.out.print(i+" ");}
        }
    }

//--------------------------Sum & Avg------------------------------//
    public static void sum_avg(int num) {
        float sum = 0;
        float avg = 0;
        for(float i=num;i>0;i--)
        {
            sum = sum+i;
        }
        System.out.println("The sum is : "+sum);
        avg = sum/num;
        System.out.println("The avg is :"+avg);
    }
}   
