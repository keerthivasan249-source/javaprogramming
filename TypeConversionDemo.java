public class TypeConversionDemo {   
        double temp; 
        Fahrenheit(double t) { temp = t; } 
        double getTemp() { return temp; } 
    } 
 
    static class Celsius { 
        double temp;        
            temp = (f.getTemp() - 32) * 5 / 9; 
        } 
        void show() { System.out.println("Temperature = " + temp + " Celsius"); } 
    }
 public static void main(String[] args) { 
        System.out.println("----- Implicit/Widening Conversion (int to double) -----"); 
        int a = 10; 
        double b = a;   // implicit widening 
        System.out.println("int " + a + " converted to double " + b); 
 
        System.out.println("\n----- Explicit/Narrowing Conversion (double to int) -----"); 
        double f = 9.8; 
        int x = (int) f;   // explicit narrowing 
        System.out.println("double " + f + " converted to int " + x); 
 
        System.out.println("\n----- Autoboxing (int to Integer) -----"); 
        int num = 25; 
        Integer boxed Num = num;   // autoboxing 
        System.out.println("Primitive int " + num + " auto boxed to Integer " + boxed Num); 
 
        System.out.println("\n----- Unboxing (Integer to int) -----"); 
        Integer wrapObj = 40; 
        int unboxed = wrapObj;   // unboxing 
        System.out.println("Integer " + wrap Obj + " unboxed to primitive int " + unboxed); 
 
        System.out.println("\n----- Primitive to String -----"); 
        double Val = 25.5; 
        String str Val = String. Value Of (Val); 
        System.out.println ("double " + Val + " converted to String \"" + str Val + "\""); 
 
        System.out.println ("\n----- String to Primitive -----"); 
        String num Str = "123"; 
        int parsed Int = Integer.parse Int(num Str); 
        System.out.println("String \"" + num Str + "\" converted to int " + parsed Int); 
 
        System.out.println("\n----- Class type to Class type -----"); 
        Fahrenheit f Temp = new Fahrenheit(98.6); 
        Celsius c Temp = new Celsius(f Temp);   // Fahrenheit -> Celsius 
        c Temp.show(); 
    } 
} 