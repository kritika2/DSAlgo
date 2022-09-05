public class ReverseString {
    public static void main(String[] args)
    {
        revString("My Name is Kritika");
    }


    public static void revString(String mainString){
        if(mainString == null || mainString.length() ==0 )
        {
            return;
        }
        for(int i= mainString.length() -1; i >= 0 ;i--)
        {
            System.out.print(mainString.charAt(i));
        }

    }
}

