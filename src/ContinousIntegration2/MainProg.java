/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ContinousIntegration2;

import ContinousIntegration1.ABB;

/**
 *
 * @author Win
 */

class MainProg implements X{
    @Override
    public int w(){
        return 2;
    }
    
    public static void main(String[] args) {
        AllConst x;
        P p;
        Q q;
        int N = 5;
        ABB a = new ABB(N);
        int v[] = new int[N];
        
        a.f();
        for (int i=0; i<N; i++){
            v[i] = i;
            System.out.println(v[i]);
        }
        
        //System.out.println(x.PI);
        
    }
}
