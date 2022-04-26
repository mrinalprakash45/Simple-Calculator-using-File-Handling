import java.io.*;
class calculator
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println();
        System.out.println("Enter your choice");
        int choice=Integer.parseInt(br.readLine());
        switch(choice)
        {
            case 1:
            System.out.println("Enter two numbers: ");
            int x=Integer.parseInt(br.readLine());
            int y=Integer.parseInt(br.readLine());
            int z=x+y;
            File myfile=new File("addition.txt");
            myfile.createNewFile();
            FileWriter filewriter=new FileWriter("addition.txt");
            filewriter.write("RESULT= "+z);
            filewriter.close();
            Scanner sc=new Scanner(myfile);
            while(sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
            break;
            case 2:
            System.out.println("Enter two numbers: ");
            int x=Integer.parseInt(br.readLine());
            int y=Integer.parseInt(br.readLine());
            int z=x-y;
            File myfile=new File("subtraction.txt");
            myfile.createNewFile();
            FileWriter filewriter=new FileWriter("subtraction.txt");
            filewriter.write("RESULT= "+z);
            filewriter.close();
            Scanner sc=new Scanner(myfile);
            while(sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
            break;
            case 3:
            System.out.println("Enter two numbers: ");
            int x=Integer.parseInt(br.readLine());
            int y=Integer.parseInt(br.readLine());
            int z=x*y;
            File myfile=new File("multiplication.txt");
            myfile.createNewFile();
            FileWriter filewriter=new FileWriter("multiplication.txt");
            filewriter.write("RESULT= "+z);
            filewriter.close();
            Scanner sc=new Scanner(myfile);
            while(sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
            break;
            case 4:
            System.out.println("Enter two numbers: ");
            int x=Integer.parseInt(br.readLine());
            int y=Integer.parseInt(br.readLine());
            int z=x/y;
            File myfile=new File("division.txt");
            myfile.createNewFile();
            FileWriter filewriter=new FileWriter("division.txt");
            filewriter.write("RESULT= "+z);
            filewriter.close();
            Scanner sc=new Scanner(myfile);
            while(sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
            break;
            default:
            System.out.println("You have entered the wrong choice");
        }
    }
}