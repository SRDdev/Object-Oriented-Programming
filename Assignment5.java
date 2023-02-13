import java.util.Scanner;
class Assignment5 {
    //----------------------------Main----------------------------//
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int var;
            do {
                System.out.println("What do you want to sort ?");
                System.out.println("1.Integers");
                System.out.println("2.Strings");
                var = scan.nextInt();
                switch(var) {
                    case 1:
                        System.out.println("How many values do you want in the array :");
                        int k = scan.nextInt();
                        int arr[] = create_array(k);
                        bubble_sort(arr);
                        break;
                    case 2:
                        System.out.println("How many values do you want in the array :");
                        int u = scan.nextInt();
                        String st[] = create_string(u);
                        bubble_sort(st);
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Wrong Choice");
                }
            } while (var != 0);
            scan.close();
        }
    
    //----------------------------Create Int Array----------------------------//
    public static int[] create_array(int size) {
        int arr[] = new int[size];
        try (Scanner scan = new Scanner(System.in)) {
            for (int i=0;i<size;i++)
            {
                System.out.println("Enter the number at "+i+"th position : ");
                int inp = scan.nextInt();
                arr[i] = inp;
            }
        }
            return arr;
    }
    //----------------------------Print Int Array----------------------------//
    public static void print(int arr[]) {
        System.out.println("The sorted Array is :");
        for(int i=0;i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }        
    }
    //----------------------------Bubble Int Array----------------------------//
    public static void bubble_sort(int arr[]) {
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1 ; j<arr.length ; j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        print(arr);
    }
// ---------------------------------------------String-------------------------------//
    public static String[] create_string(int size) {
        String str[] = new String[size];
        try (Scanner scan = new Scanner(System.in)){
            for (int i=0;i<size;i++)
            {
                System.out.println("Enter the string at"+i+"th position : ");
                String inp = scan.nextLine();
                str[i] = inp;
            }
        }
        return str;
    }
    //----------------------------Print String Array----------------------------//
    public static void print(String arr[]) {
        System.out.println("The sorted Array is :");
        for(int i=0;i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }        
    }
    //----------------------------Bubble Sort String----------------------------//
    public static void bubble_sort(String arr[]) {
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1 ; j<arr.length ; j++)
            {
                if(arr[i].compareTo(arr[j]) > 0)
                {
                    String temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        print(arr);
    }
}
