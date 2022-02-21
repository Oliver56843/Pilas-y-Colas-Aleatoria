
package pilas.y.colas.umg;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Random;

public class Main {
    public static void main (String[] args) {
        int Integer=0;
        Random r= new Random();
        Integer =(int) (r.nextGaussian()*1000000);
        
        Stack<Integer> pila=new Stack<>();
        Queue<Integer> cola=new LinkedList<> ();
        pila.add(new Integer ("5000"));
        pila.add(new Integer ("5600"));
        pila.add(new Integer ("1263"));
        Integer cachar = pila.pop();
        System.out.println(pila);
        cachar=pila.pop();
         pila.pop ();
         if (pila.isEmpty()) System.out.println ("Esta vacia la pila");
         cola.add(new Integer ("8513326"));
         cola.add (new Integer ("536711"));
         cola.add (new Integer ("46823596"));   
         Integer usr=cola.poll();
         Integer cachar2=cola.peek();
         System.out.println(cola);
         if (cola.isEmpty()) System.out.println ("Esta vacia la cola");
         System.out.println("El numero ingresado aleatorio es:"+Integer);
         
    
    
    
    
    
    }
    
}
