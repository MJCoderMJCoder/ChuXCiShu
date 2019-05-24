package com.ccf.test;
/**
 * 逆时针旋转90度
 */
import java.util.Scanner;

public class Revolve {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner (System.in);
		Integer a = sc1.nextInt();
		Integer b = sc1.nextInt();
		int [][] array1 = new int[a][b];
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner (System.in);
		for(int j=0; j<a; j++)
			for(int k=0; k<b; k++) {
				array1[j][k] = (int) (sc2.nextInt());
			}
		System.out.println("原矩阵元素如下：");
		for(int j=0; j<a; j++){
			for(int k=0; k<b; k++)
				System.out.print(array1[j][k]+"\t");
			System.out.println();
		}
		
		int [][] array2 = new int[b][a];
		for(int j=0; j<b; j++)
			for(int k=0; k<a; k++) {
				array2[j][k] = array1[a-1-k][j];
			}
		//即aa[外层循环][内层循环]=bb[二维数组里的一维数组的长度-1-内层循环][外层循环] 
		int [][] array3 = new int[a][b];
		for(int j=0; j<a; j++)
			for(int k=0; k<b; k++) {
				array3[j][k] = array2[b-1-k][j];
			}
		int [][] array4 = new int[b][a];
		for(int j=0; j<b; j++)
			for(int k=0; k<a; k++) {
				array4[j][k] = array3[a-1-k][j];
			}
		System.out.println("旋转后的矩阵元素如下：");
		for(int j=0; j<b; j++){
			for(int k=0; k<a; k++)
				System.out.print(array4[j][k]+"\t");
			System.out.println();
		}
	}
	
}
