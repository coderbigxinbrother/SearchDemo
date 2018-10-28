package com.atguigu.search;

public class LoopSearch {
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 5, 7, 9, 11, 20 };
		LoopSearch loopSearch = new LoopSearch();
		int result = loopSearch.Search(number, 11);
		System.out.println("Find at position " + result);
	}

	/**
	 * * 可以利用设置哨兵的方式，省去一次判断， * 哨兵通常設定在数列最前或者最后，假設設定在列前方好了（索引0的 位置）， *
	 * 我们从数列后面开始查找，如果找到指定的值時，其索引值不是0， * 表示在数列循环完之前就找到了，coding的时候只要使用一個while循环就可
	 * 以了。
	 */
	public int Search(int[] number, int dest) {
		int[] tmp = new int[number.length + 1];
		for (int i = 1; i <= number.length; i++) {
			tmp[i] = number[i - 1];
		}
		tmp[0] = dest;
		int j = number.length;
		while (tmp[j] != tmp[0]) {
			j--;
		}
		return j - 1;
	}
}
