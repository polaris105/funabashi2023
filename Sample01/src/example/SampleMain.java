package example;

import java.util.ArrayList;

public class SampleMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Member> arr = new ArrayList<>();
		arr.add(new Member("", 1, 2));


		for(Member member:arr) {
			System.out.println(member.l_name);
		}

	}

}

class Member{
	String	l_name;
	int	no;
	int	age;
	//コンストラクタ
	public Member(String l_name, int no, int age) {
		this.l_name = l_name;
		this.no = no;
		this.age = age;
	}

}