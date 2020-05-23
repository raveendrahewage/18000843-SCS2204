object Q1
{
	def main(args:Array[String])
	{
		println("\nTemperature Converter - Celcius -> Fahrenheit\n")
		print("Enter the temperature in celsius : ")
		var temp:Double=scala.io.StdIn.readDouble()

		println("\nFahrenheit : "+temp +"   |   Celcius : "+ converter(temp));
	}
	def converter(temp:Double):Double=
	{
		return (temp*1.8000)+32;
	}
}