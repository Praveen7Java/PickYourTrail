package com.renault.wdm.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class IncrementDuplicateElements {
	public static void main(String args[]) {
		List<Integer> inputList = Arrays.asList(3,1,2,2);
		Map<Integer, Integer> arrayElementsCountMap = IterateInputList(inputList);
		Integer output = getMinimumUniqueSum(arrayElementsCountMap, inputList);
		System.out.println(output);
	}

	public static Map<Integer, Integer> IterateInputList(List<Integer> inputList) {
		Map<Integer, Integer> arrayElementsCountMap = new HashMap<Integer, Integer>();
		for (Integer inputData : inputList) {
			if (arrayElementsCountMap.containsKey(inputData)) {
				arrayElementsCountMap.put(inputData, arrayElementsCountMap.get(inputData) + 1);

			} else {
				arrayElementsCountMap.put(inputData, 1);
			}
		}
		return arrayElementsCountMap;
	}

	public static int getMinimumUniqueSum(Map<Integer, Integer> arrayElementsCountMap,
			List<Integer> inputList) {
		int output=0;
		List<Integer> outputList = new ArrayList<Integer>();
		for (Entry<Integer, Integer> entry : arrayElementsCountMap.entrySet()) {
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			if (value > 1) {
				int count = value + 1;
				while (!inputList.contains(count)) {
					count++;
				}
				outputList.add(key);
				output=output+key;
			} else {
				outputList.add(key);
				output=output+key;
			}
		}
		return output;
	}
}
