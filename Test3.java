package test.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//创建Emp对象
class Emp {
	private String id;
	private String name;

	public Emp(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

// 创建测试类
public class Test3 {
	public static void main(String[] args) {
		// 实例化Emp对象
		Emp emp = new Emp("010", "李文字");
		Emp emp2 = new Emp("015", "张飞");
		Emp emp3 = new Emp("022", "西门庆");
		Emp emp4 = new Emp("008", "孙越");
		// 创建map集合
		Map<String, String> map = new HashMap<>();
		// 添加键值和对应的对象到map集合中
		map.put(emp.getId(), emp.getName());
		map.put(emp2.getId(), emp2.getName());
		map.put(emp3.getId(), emp3.getName());
		map.put(emp4.getId(), emp4.getName());
		Set<String> set = map.keySet();
		// 遍历集合
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String str = it.next();
			String name = map.get(str);
			System.out.println(str + " " + name);
		}

		System.out.println("移除”015“键值的对象后");
		map.remove("015");
		Set<String> set1 = map.keySet();
		Iterator<String> it1 = set1.iterator();
		while (it1.hasNext()) {
			String str = it1.next();
			String name = map.get(str);
			System.out.println(str + " " + name);
		}
	}
}
