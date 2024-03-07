import java.util.Scanner;
class Product
	{
		int pcode;
		String pname;
		int price;
		int acceptValues(){
		Scanner s= new Scanner(System.in);
			System.out.println("Enter product code : ");
			pcode=s.nextInt();
			s.nextLine();
			System.out.println("Enter product name : ");
			pname=s.nextLine();
			System.out.println("Enter product price : ");
			price=s.nextInt();
			return price;
		}

		void display()
			{
					System.out.println("Product code"+pcode);
					System.out.println("Product name :"+pname);
					System.out.println("Product Prce : "+price+"RS");
			}
 	}
 		

class Product2
	{
		public static void main(String a[])
			{
				Product p1= new Product();
				Product p2= new Product();
				Product p3= new Product();
				System.out.println("Product 1");
				int price1 =p1.acceptValues();
				System.out.println("Product 2");
				int price2 =p2.acceptValues();
				System.out.println("Product 3");
				int price3 =p3.acceptValues();
				System.out.println("Lowest Price :");
				if((price1<price2)&&(price1<price3))
					{
						p1.display();
					}
				else if((price2<price1)&&(price2<price3))
					{
						p2.display();
					}
				else 
					{
						p3.display();
					}
			}
	}
