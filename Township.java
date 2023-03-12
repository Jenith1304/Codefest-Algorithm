import java.util.Scanner;

public class Township {
    /**
     * @param args
     */
    public static void main(String args[])
    {
        int t;
        int n;
        
        int rb;
        int st;
        int h;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No Of Township :");
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println("Enter No Of Houses in Township["+(i+1)+"] :");
            n=sc.nextInt();
            for( int j=0;j<n;j++)
            {
                System.out.println("Enter Total No of Roof Bedrooms in House["+(j+1)+"] in Township["+(i+1)+"]: ");
                rb=sc.nextInt();
                System.out.println("Enter Total No of Standard rooms in House["+(j+1)+"] in Township["+(i+1)+"]: ");
                st=sc.nextInt();
                System.out.println("Enter Total No of Victorian Style Halls in House["+(j+1)+"] in Township["+(i+1)+"]: ");
                h=sc.nextInt();
                float wallrb=rb*3;
                float wallstrm=st*4;
                float wallhall=h*6;
                float wall=wallrb+wallstrm+wallhall;
                float acwallrb=wallrb/3;
                float acwallstrm=wallstrm/3;
                float acwallhall=wallhall/3;
                float normwallrb=wallrb-acwallrb;
                float normwallstrm=wallstrm-acwallstrm;
                float normwallhall=wallhall-acwallhall;
                float accent=acwallrb+acwallstrm+acwallhall;
                float norm=normwallrb+normwallstrm+normwallhall;
                
                float acltr=(float) 1.5;
                float quantity_accent=accent*acltr;
                float normltr=(float)2.25;
                float quantity_norm=norm*normltr;
                float timeac=(float)2.5;
                float time_accent=quantity_accent*timeac;
                float timenm=(float)3.25;
                float time_norm=quantity_accent*timenm;
                float totaltime=time_accent+time_norm;
                System .out.println("The Quantuity of Accent Colour Required to Paint House["+(j+1)+"] of township ["+(i+1)+"]: "+quantity_accent);
                System .out.println("The Quantuity of Norm Colour Required to Paint House["+(j+1)+"] of township ["+(i+1)+"]: "+quantity_norm);
                System .out.println("The Time Required to Paint House["+(j+1)+"] of township ["+(i+1)+"]: "+totaltime);
               




                
            }
        }
        
        
}
}
