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
class AB extends A implements B{

    public AB() {
        System.out.println("ctor-AB");
    }
    
    void f(){
        System.out.println("AB");
    }

    @Override
    public void g() {
        System.out.println("");
    }
    
}
