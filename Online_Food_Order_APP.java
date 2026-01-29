import java.util.Scanner;
public class Online_Food_Order_APP
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)throws Exception
     {
        Thread.sleep(3000);
        System.out.println("\t\t\t-------------------------------------");
        System.out.println("\t\t\t    Welcome to Swiggy Restaurant     ");
        System.out.println("\t\t\t-------------------------------------");
        System.out.println();

        Thread.sleep(3000);
        System.out.println("\t\t\tPlease Select Given Below Restaurants");
        System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\t\t\t   1. A2B\n\t\t\t   2. SS Hyderabad\n\t\t\t   3. Saravana Bhavan");
        
        System.out.println();
        System.out.print("\t\t\t*Select a Restaurant (1-3) : ");
        int option=sc.nextInt();

        switch(option)
        {
            case 1:
                {
                    System.out.println();
                    System.out.println("\t\t\t   ---------------------");
                    System.out.println("\t\t\t     Welcome to A2B     ");
                    System.out.println("\t\t\t   ---------------------");
                    System.out.println();
                    System.out.println("\t\t\tHere Your Menu......");
                    System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("\n\t\t\t   1. Dosa - 120 Rs/-\n\t\t\t   2. Idli - 75 Rs./- \n\t\t\t   3. Poori -90 Rs/-");

                    System.out.println();
                    Thread.sleep(3000);
                    System.out.println();
                    System.out.print("\t\t\t*Select the Food from the Menu (1-3) : ");
                    int menu=sc.nextInt();
                    System.out.println();

                    switch (menu) {
                        case 1:
                            {
                                System.out.println("\t\t\tYou are Ordering Dosai....");
                                System.out.println();
                                System.out.print("\t\t\t*How many Dosai do you want ?(Price of 1 Dosai will be - 120.Rs/-) : ");
                                int Dosai_price=120;//per Dosai
                                int quantity=sc.nextInt();

                                System.out.println();
                                Thread.sleep(3000);
                                System.out.println("\t\t\t\t   Payment Page  ");
                                System.out.println("\t\t\t\t ~~~~~~~~~~~~~~~~");

                                int payment=quantity*Dosai_price;

                               System.out.println();
                               System.out.print("\t\t\tThe Original_Paymrent will be : " + payment);
                               System.out.println();
                               System.out.print("\t\t\tEnter your Pay Amount : ");
                               int pay=sc.nextInt();
                                
                               if(payment==pay)
                               {
                                System.out.println();
                                System.out.println("\t\t\tPayment status : Successful....");
                                System.out.println("\t\t\tThank You for coming!!!!");
                               }
                               else if(pay>payment)
                               {
                                System.out.println();
                                System.out.println("\t\t\tYou are Given Extra amount!!!");
                                System.out.println("\t\t\tHere your change : "+(pay-payment));
                                System.out.println("Be care on money!");
                               }
                               else
                               {
                                System.out.println();
                                System.out.println("\t\t\tYou are Given only less amonut!!!");
                                System.out.println("\t\t\tYou need to pay : "+(payment-pay)+" Rs/-");
                               }
                            }
                            break;

                            case 2:
                                {
                                 System.out.println("\t\t\t You are Ordering Idli....");
                                System.out.println();
                                System.out.print("\t\t\t*How many Idli do you want ?(Price of 1 Idli will be - 75.Rs/-) : ");
                                int Idli_price=75;
                                int quantity=sc.nextInt();

                                System.out.println();
                                Thread.sleep(3000);
                                System.out.println("\t\t\t\t   Payment Page  ");
                                System.out.println("\t\t\t\t ~~~~~~~~~~~~~~~~");

                                int payment=quantity*Idli_price;

                               System.out.println();
                               System.out.print("\t\t\tThe Original_Paymrent will be : " + payment);
                               System.out.println();
                               System.out.print("\t\t\tEnter your Paying Amount : ");
                               int pay=sc.nextInt();
                                
                               if(payment==pay)
                               {
                                System.out.println();
                                System.out.println("\t\t\tPayment status : Successful....");
                                System.out.println("\t\t\tThank You for coming....");
                               }
                               else if(pay>payment)
                               {
                                System.out.println();
                                System.out.println("\t\t\tYou are Given Extra amount!!!");
                                System.out.println("\t\t\tHere your change will be : "+(pay-payment)+" Rs/-");
                               }
                               else
                               {
                                System.out.println();
                                System.out.println("\t\t\tYou are Given only less amonut!!!");
                                System.out.println("\t\t\tYou need to pay Extra : "+(payment-pay)+ "Rs/-");
                                }
                            }
                            break;
                            case 3:
                                  {
                                 System.out.println("\t\t\t You are Ordering Poori....");
                                System.out.println();
                                System.out.print("\t\t\t*How many Poori set do you want ?(Price of 1 set Poori will be - 75.Rs/-) : ");
                                int Poori_price=75;
                                int quantity=sc.nextInt();

                                System.out.println();
                                Thread.sleep(3000);
                                System.out.println("\t\t\t\t   Payment Page  ");
                                System.out.println("\t\t\t\t ~~~~~~~~~~~~~~~~");

                                int payment=quantity*Poori_price;

                               System.out.println();
                               System.out.print("\t\t\tThe Original_Paymrent will be : " + payment+" Rs/-");
                               System.out.println();
                               System.out.print("\t\t\tEnter your Pay Amount : ");
                               int pay=sc.nextInt();
                                
                               if(payment==pay)
                               {
                                System.out.println();
                                System.out.println("\t\t\tPayment status : Successful....");
                                System.out.println("\t\t\tThank You for coming....");
                               }
                               else if(pay>payment)
                               {
                                System.out.println();
                                System.out.println("\t\t\tYou are Given Extra amount to me!!!");
                                System.out.println("\t\t\tHere your change will be : "+(pay-payment)+" Rs/-");
                               }
                               else
                               {
                                System.out.println();
                                System.out.println("\t\t\tYou are Given only less amonut!!!");
                                System.out.println("\t\t\tYou need to pay : "+(payment-pay)+" Rs/-");
                                }
                            }
                            break;
                        default:
                            System.out.println();
                            System.out.println("\t\t\tSorry We have only [ Dosai , Idli, Poori] this foods....");
                    }
                }

                break;

                case 2:
                    {
                        System.out.println();
                        System.out.println("\t\t\t   ------------------------");
                        System.out.println("\t\t\t     SS Hyderabad Biriyani ");
                        System.out.println("\t\t\t   ------------------------");
                        System.out.println();
                        System.out.println("\t\t\tHere Your Menu......");
                        System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("\n\t\t\t   1. Chicken - 150 Rs./- \n\t\t\t   2. Mutton  - 200 Rs./- \n\t\t\t   3. Beef    - 180 Rs./-");

                        System.out.println();
                        Thread.sleep(3000);
                        System.out.println();
                        System.out.print("\t\t\t*Select the Food from the Menu (1-3) : ");
                        int menu=sc.nextInt();
                        System.out.println();

                            switch (menu) 
                            {
                                case 1:
                                    {
                                        System.out.println("\t\t\tYou are Ordering Chicken Biriyani....");
                                        System.out.println();
                                        System.out.print("\t\t\t*How many Chicken Biriyani do you want ?(Price of 1 Chicken Biriyani will be - 150.Rs/-) : ");
                                        int Chicken_price=150;
                                        int quantity=sc.nextInt();

                                        System.out.println();
                                        Thread.sleep(3000);
                                        System.out.println("\t\t\t\t   Payment Page  ");
                                        System.out.println("\t\t\t\t ~~~~~~~~~~~~~~~~");

                                        int payment=quantity*Chicken_price;

                                        System.out.println();
                                        System.out.print("\t\t\tThe Original_Paymrent will be : " + payment);
                                        System.out.println();
                                        System.out.print("\t\t\tEnter your Pay Amount : ");
                                        int pay=sc.nextInt();
                                        
                                    if(payment==pay)
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tPayment status : Successful....");
                                        System.out.println("\t\t\tThank You for coming!!!!");
                                    }
                                    else if(pay>payment)
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tYou are Given Extra amount!!!");
                                        System.out.println("\t\t\tHere your change : "+(pay-payment));
                                        System.out.println("\t\t\tBe careful on money!");
                                    }
                                    else
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tYou are Given only " + pay +" Rs/-!!!");
                                        System.out.println("\t\t\tYou need to pay : "+(payment-pay)+" Rs/-");
                                    }
                                    }
                                    break;

                                    case 2:
                                        {
                                        System.out.println("\t\t\t You are Ordering Mutton Biriyani....");
                                        System.out.println();
                                        System.out.print("\t\t\t*How many Mutton Biriyani do you want ?(Price of 1 Mutton Biriyani will be - 200.Rs/-) : ");
                                        int Mutton_price=200;
                                        int quantity=sc.nextInt();

                                        System.out.println();
                                        Thread.sleep(3000);
                                        System.out.println("\t\t\t\t   Payment Page  ");
                                        System.out.println("\t\t\t\t ~~~~~~~~~~~~~~~~");

                                        int payment=quantity*Mutton_price;

                                        System.out.println();
                                        System.out.print("\t\t\tThe Original_Paymrent will be : " + payment);
                                        System.out.println();
                                        System.out.print("\t\t\tEnter your Paying Amount : ");
                                        int pay=sc.nextInt();
                                            
                                    if(payment==pay)
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tPayment status : Successful....");
                                        System.out.println("\t\t\tThank You for coming....");
                                    }
                                    else if(pay>payment)
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tYou are Given Extra amount!!!");
                                        System.out.println("\t\t\tHere your change will be : "+(pay-payment)+" Rs/-");
                                    }
                                    else
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tYou are Given only "+ pay +  " Rs/-");
                                        System.out.println("\t\t\tYou need to pay Extra : "+(payment-pay)+ "Rs/-");
                                        }
                                    }
                                    break;
                                    case 3:
                                        {
                                        System.out.println("\t\t\t You are Ordering Beef Biriyani....");
                                        System.out.println();
                                        System.out.print("\t\t\t*How many Beef Biriyani do you want ?(Price of 1 Beef Biriyani will be - 180.Rs/-) : ");
                                        int beef_price=180;
                                        int quantity=sc.nextInt();

                                        System.out.println();
                                        Thread.sleep(3000);
                                        System.out.println("\t\t\t\t   Payment Page  ");
                                        System.out.println("\t\t\t\t ~~~~~~~~~~~~~~~~");

                                        int payment=quantity*beef_price;

                                        System.out.println();
                                        System.out.print("\t\t\tThe Original_Paymrent will be : " + payment+" Rs/-");
                                        System.out.println();
                                        System.out.print("\t\t\tEnter your Pay Amount : ");
                                        int pay=sc.nextInt();
                                            
                                    if(payment==pay)
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tPayment status : Successful....");
                                        System.out.println("\t\t\tThank You for coming....");
                                    }
                                    else if(pay>payment)
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tYou are Given Extra amount to me!!!");
                                        System.out.println("\t\t\tHere your change will be : "+(pay-payment)+" Rs/-");
                                    }
                                    else
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tYou are Given only "+ pay +" Rs/-");
                                        System.out.println("\t\t\tYou need to pay : "+(payment-pay)+" Rs/-");
                                        }
                                    }
                                    break;

                                    default:
                                    {
                                    System.out.println();
                                    System.out.println("\t\t\tSorry!!! We have only [ Chicken , Mutton, Beef (Biriyani's)] this foods....");
                            
                                    } 
                                    break;
                                    
                                }
                        }

                        break;



                        case 3:
                            {

                        System.out.println();
                        System.out.println("\t\t\t   ------------------------");
                        System.out.println("\t\t\t        Saravana Bhavan    ");
                        System.out.println("\t\t\t   ------------------------");
                        System.out.println();
                        System.out.println("\t\t\t    Here Your Menu......");
                        System.out.println("\t\t\t   ~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("\n\t\t\t   1. Laddoo       - 100 Rs./- \n\t\t\t   2. Halwa (1g)   - 2 Rs./- \n\t\t\t   3. Mixture (1g) - 1.5 Rs./-");

                        System.out.println();
                        Thread.sleep(3000);
                        System.out.println();
                        System.out.print("\t\t\t*Select the Sweet from the Menu (1-3) : ");
                        int menu=sc.nextInt();
                        System.out.println();

                            switch (menu) 
                            {
                                case 1:
                                    {
                                        System.out.println("\t\t\tYou are Selecting Laddoo....");
                                        System.out.println();
                                        System.out.print("\t\t\t*How many Laddoo Boxes do you want ?(Per Box having 6 Laddoos and the Rate will be - 100.Rs/-) : ");
                                        int Laddoo_price=100;
                                        int quantity=sc.nextInt();

                                        System.out.println();
                                        Thread.sleep(3000);
                                        System.out.println("\t\t\t\t   Payment Page  ");
                                        System.out.println("\t\t\t\t ~~~~~~~~~~~~~~~~~");

                                        int payment=quantity*Laddoo_price;

                                        System.out.println();
                                        System.out.print("\t\t\tThe Original_Paymrent will be : " + payment);
                                        System.out.println();
                                        System.out.print("\t\t\tEnter your Pay Amount : ");
                                        int pay=sc.nextInt();
                                        
                                    if(payment==pay)
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tPayment status : Successful....");
                                        System.out.println("\t\t\tThank You for coming!!!!");
                                    }
                                    else if(pay>payment)
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tYou are Given Extra amount!!!");
                                        System.out.println("\t\t\tHere your change : "+(pay-payment));
                                        System.out.println("\t\t\tBe careful on money!");
                                    }
                                    else
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tYou are Given only " + pay +" Rs/-!!!");
                                        System.out.println("\t\t\tYou need to pay : "+(payment-pay)+" Rs/-");
                                    }
                                    }
                                    break;

                                    case 2:
                                        {
                                        System.out.println("\t\t\t You are Selecting Halwa....");
                                        System.out.println();
                                        System.out.print("\t\t\t*How many gram of Halwa do you want ?(Price of Halwa Per Gram will be - 2 .Rs/-) : ");
                                        int Halwa_price=2;
                                        int quantity=sc.nextInt();

                                        System.out.println();
                                        Thread.sleep(3000);
                                        System.out.println("\t\t\t\t   Payment Page  ");
                                        System.out.println("\t\t\t\t ~~~~~~~~~~~~~~~~");

                                        int payment=quantity*Halwa_price;

                                        System.out.println();
                                        System.out.print("\t\t\tThe Original_Paymrent will be : " + payment);
                                        System.out.println();
                                        System.out.print("\t\t\tEnter your Paying Amount : ");
                                        int pay=sc.nextInt();
                                            
                                    if(payment==pay)
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tPayment status : Successful....");
                                        System.out.println("\t\t\tThank You for coming....");
                                    }
                                    else if(pay>payment)
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tYou are Given Extra amount!!!");
                                        System.out.println("\t\t\tHere your change will be : "+(pay-payment)+" Rs/-");
                                    }
                                    else
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tYou are Given only "+ pay +  " Rs/-");
                                        System.out.println("\t\t\tYou need to pay Extra : "+(payment-pay)+ "Rs/-");
                                        }
                                    }
                                    break;
                                    case 3:
                                        {
                                        System.out.println("\t\t\t You are Selecting Mixture....");
                                        System.out.println();
                                        System.out.print("\t\t\t*How many grams of Mixture do you want ?(Per gram of Mixture will be - 1.5.Rs/-) : ");
                                        float Mixture_price=1.5f;
                                        int quantity=sc.nextInt();

                                        System.out.println();
                                        Thread.sleep(3000);
                                        System.out.println("\t\t\t\t   Payment Page  ");
                                        System.out.println("\t\t\t\t ~~~~~~~~~~~~~~~~~");

                                        float payment=quantity*Mixture_price;

                                        System.out.println();
                                        System.out.print("\t\t\tThe Original_Paymrent will be : " + payment+" Rs/-");
                                        System.out.println();
                                        System.out.print("\t\t\tEnter your Pay Amount : ");
                                        int pay=sc.nextInt();
                                            
                                    if(payment==pay)
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tPayment status : Successful....");
                                        System.out.println("\t\t\tThank You for coming....");
                                    }
                                    else if(pay>payment)
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tYou are Given Extra amount to me!!!");
                                        System.out.println("\t\t\tHere your change will be : "+(pay-payment)+" Rs/-");
                                    }
                                    else
                                    {
                                        System.out.println();
                                        System.out.println("\t\t\tYou are Given only "+ pay +" Rs/-");
                                        System.out.println("\t\t\tYou need to pay : "+(payment-pay)+" Rs/-");
                                        }
                                    }
                                    break;

                                    default:
                                    {
                                    System.out.println();
                                    System.out.println("\t\t\tSorry!!! We have only [ Laddoo , Halwa , Mixture (Sweets)]....");
                            
                                    } 
                                    break;
                                    
                                }
                                break;
                            }
                            

                    default:
                    {
                        System.out.println();
                        System.out.println("\t\t\tSorry!!! We have only [ A2B, SS Hyderabad , Saravana Bhavan ] Restaurants Partnerships....");
                        System.out.println();
                    }
        }   
    }
}





