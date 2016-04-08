package test.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * 分别向set集合及list集合添加有重复值的元素，观察重复值是否能在list集合以及set集合中成功的添加
 */
public class Test2 {
	public void listTest() {
		//新建list集合，把元素添加到list集合中
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("a");
		list.add("c");
		list.add("C");
		list.add("a");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

	public void setTest() {
		//新建set集合，把元素添加到set集合中
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("a");
		set.add("c");
		set.add("C");
		set.add("a");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		Test2 test = new Test2();
		System.out.println("***输出list集合的元素***");
		test.listTest();//调用list集合的方法
		System.out.println("***输出set集合的元素***");
		test.setTest();//调用set集合的方法
	}
}
