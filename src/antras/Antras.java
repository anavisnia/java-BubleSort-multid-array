package antras;

import java.util.Collections;

public class Antras {

    public static void main(String[] args) {
        
        
        // ************************************ namu darbas: ************************************
        
        int [] masyvas = {15, 42, 15, 98, -2, -47, 10, 3, -14, 36};
        
        // ispausinti visa masyva
        System.out.println("Originalus masyvas:");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + " ");
        }
        
        
        int lengthM = masyvas.length;
        int temp = 0;
        //surusioti didejimo tvarka
        // atspauzdinti
        System.out.println("");
        System.out.println("Didejimo tvarka:");
        for (int i = 0; i < lengthM; i++) {
            for (int j = 1; j < (lengthM-i); j++) {
                if(masyvas[j-1] > masyvas[j]) {
                    // sukeiciam vietomis
                    temp = masyvas[j-1];
                    masyvas[j-1] = masyvas[j];
                    masyvas[j] = temp;
                }
            }
        }

        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + " ");
        }
        
        //surusioti mazejimo tvarka
        // atspauzdinti
        System.out.println(" ");
        System.out.println("Mazejimo tvarka:");
        for (int i = 0; i < lengthM; i++) {
            for (int j = 1; j < (lengthM-i); j++) {
                if(masyvas[j-1] < masyvas[j]) {
                    // sukeiciam vietomis
                    temp = masyvas[j-1];
                    masyvas[j-1] = masyvas[j];
                    masyvas[j] = temp;
                }
            }
        }

        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + " ");
        }
        
        
        // ************************************ antras namu darbas *********************************
        
        System.out.println("");
        int[] m = {1, 2, 3, 4, 5}; // masyvas masyve
        
        int[][] rez = new int[m.length][m.length]; // masyvas tokio dydzio, kiek reikia, tik bus uzpildytas nuliais 
        
        for (int i = 0; i < rez.length; i++) {
            int[] eilute = rez[i];
            for(int j = 0; j < eilute.length; j++){
                int elementas = eilute[j];
                System.out.print(elementas + " ");
            }
            System.out.println();
        }
        System.out.println("");
         for (int i = 0; i < rez.length; i++) {
            int[] eilute = rez[i];
            int elementasEilutei = rez[0][0];
            for(int j = 0; j < eilute.length; j++){
                int elementas = eilute[j];
                elementasEilutei++;
                System.out.print(elementasEilutei + " ");
            }
            System.out.println();
        }
        
        
//        for (int i = 0; i < rez.length; i++) {
//            int[] eilute = rez[i];
//            int elementasEilutei = rez[0][0];
//            for(int j = 0; j < eilute.length; j++){
//                int elementas = eilute[j];
////              System.out.print(elementas + " ");
//                elementasEilutei++;
//                System.out.print(elementasEilutei + " ");
//            }
//            System.out.println();
//        }
        
        int [][] mr = {
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5, 1},
            {3, 4, 5, 1, 2},
            {4, 5, 1, 2, 3},
            {5, 1, 2, 3, 4}
        };
        int [][] mr1 = {
            {1, 2, 3, 4, 5},
            {5, 1, 2, 3, 4},
            {4, 5, 1, 2, 3},
            {3, 4, 5, 1, 2},
            {2, 3, 4, 5, 1}
        };
        
        
    }
    
}
