/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ContinousIntegration1;

/**
 *
 * @author Win
 */
public class ABB extends AB{

    private int x;
    
    public ABB() {
        x = 0;
        System.out.println("ctor-ABB");
    }
    
    public ABB(int i){
        x = i;
        System.out.println("ctor-ABB");
    }
    
    @Override
    public void f(){
        System.out.println("ABB");
    }
    
    public void ToString(){
        System.out.println(x);
    }
    
}
