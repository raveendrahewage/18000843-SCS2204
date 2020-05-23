object Q3
{
	def main(args:Array[String])
	{
		println("\nWholesale Cost Calculator - Books\n")
		print("Enter the number of copies : ")
		var copies:Int=scala.io.StdIn.readInt()

		println("\nWholesale cost for "+copies+" copies : "+(bookPrice(copies)-discount(copies)+shippingCost(copies)));
	}
	def bookPrice(copies:Int):Double=
	{
		return 24.95*copies;
	}
	def discount(copies:Int):Double=
	{
		println((24.95*copies*40)/100)
		return (24.95*copies*40)/100;
	}
	def shippingCost(copies:Int):Double=
	{
		if(copies<50)
		{
			return 3;
		}
		else
		{
			return 3+(copies-50)*0.75;
		}
	}
}