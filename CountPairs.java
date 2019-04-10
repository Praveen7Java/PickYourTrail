package com.renault.bod.enterprise.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountPairs {

	 

    /**

    * @param args

    */

    public static void main(String[] args) {

           Scanner scan = new Scanner(System.in); 

           System.out.println("Provide the number of Inputs");

           int noOfElements = scan.nextInt();

           List<Integer> inputElements = new ArrayList<>();

           Map<Integer,Integer> outputMap = new HashMap<>();

           for(int i=0;i<noOfElements;i++){

                  Scanner scanInput = new Scanner(System.in);

                  inputElements.add(scanInput.nextInt());

           }

           System.out.println("Provide the difference expected");

           Scanner scanDifference = new Scanner(System.in); 

           int difference = scanDifference.nextInt();

           for(int i=0;i<inputElements.size()-1;i++){

                  int firstElement = inputElements.get(i);

                  int secondElement = inputElements.get(i+1);

                  if(firstElement<=secondElement && (difference == secondElement-firstElement)){

                        boolean exists = false;

                        for(Entry<Integer,Integer> entry : outputMap.entrySet()){

                               if((firstElement==entry.getKey() && secondElement==entry.getValue()) ||

                                             (secondElement==entry.getKey() && firstElement==entry.getValue())) {

                                      exists = true;

                                      break;

                               }

                        }

                        if(!exists){

                               outputMap.put(firstElement, secondElement);

                        }

                  }

           }

           System.out.println(outputMap);

           System.out.println(outputMap.size());

    }



}
