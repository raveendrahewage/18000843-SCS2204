object Q2
{
	def main(args:Array[String])
	{
		println("\nVolume Calculator - Sphere\n")
		print("Enter the radius of sphere : ")
		var r:Float=scala.io.StdIn.readFloat()

		println("\nVolume of the sphere : "+volumeCalculator(r));
	}
	def volumeCalculator(r:Double):Double=
	{
		return (4*22*r*r*r)/(3*7);
	}
}