package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
/*
 * 把1~100之间的所有正整数添加到list集合，并移除索引位置为10的对象
 */
public class test1 {
	public static void main(String[] args) {
		Collection<Integer> list = new ArrayList<>();//实例化集合类对象
		Integer[] in = new Integer[99];//创建数组
		for(int i = 1; i< 100; i++){//利用for循环把数据添加到数组中
			in[i-1] = i;
		}
		list.addAll(Arrays.asList(in));//添加数组到集合
		list.remove(10);//移除索引位置为10的对象
		Iterator<Integer> it = list.iterator();//遍历集合
		while(it.hasNext()){
			Integer ib = it.next();
			System.out.print(ib+" ");
			if(ib%10==0){
				System.out.println();
			}
		}
		
	}
}
