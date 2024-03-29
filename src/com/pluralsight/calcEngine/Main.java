package com.pluralsight.calcEngine;

public class Main {

    public static void main(String[] args) {

    	MathEquation[] equations = new MathEquation[4];
    	equations[0] = new MathEquation('d', 100.0d, 50.0d);
    	equations[1] = new MathEquation('a', 25.0d, 92.0d);
    	equations[2] = new MathEquation('s', 225.0d, 17.0d);
    	equations[3] = new MathEquation('m', 11.0d, 3.0d);

    	for (MathEquation equation : equations) {
    		equation.execute();
    		System.out.print("result = ");
			System.out.println(equation.getResult());
		}

    	System.out.println();
    	System.out.println("Using Overloads");
    	System.out.println();

    	double leftDouble = 9.0d;
    	double rightDouble = 4.0d;
    	int leftInt = 9;
    	int rightInt = 4;

    	MathEquation equationOverload = new MathEquation('d');

		equationOverload.execute(leftDouble, rightDouble);
		System.out.print("results = ");
		System.out.println(equationOverload.getResult());

		equationOverload.execute(leftInt, rightInt);
		System.out.print("results = ");
		System.out.println(equationOverload.getResult());

		System.out.println();
		System.out.println("Using Inheritance");
		System.out.println();
		CalculateBase[] calculators = {
		        new Divider(100.0d, 50.0d),
		        new Adder(25.0d, 92.0d),
		        new Subtracter(225.0d, 17.0d),
		        new Multipler(11.0d, 3.0d),
        };

		for (CalculateBase calculator:calculators) {
		    calculator.calculate();;
		    System.out.print("results = ");
		    System.out.println(calculator.getResult());
        }

		String[] statements = {
		        "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

		CalculateHelper helper = new CalculateHelper();
		for (String statement:statements) {
		    helper.process(statement);
		    System.out.println(helper);
        }
    }
}
