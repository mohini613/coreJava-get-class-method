package getClassMethod;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class usingGetField {

	public static void main(String[] args) {
		String s = new String();
		Class c= s.getClass();
		Field[] f=c.getFields();
		System.out.println("using this we'll get all methods and constructors");
		{
			for(Field f1:f)
			{
				System.out.println(f1.getName());
			}
			Method[] methods=c.getDeclaredMethods();
			for(Method method: methods)
			{
				System.out.println(method.getName());
			}
		}

	}

}
