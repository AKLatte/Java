package animal;

import java.util.ArrayList;
import java.util.List;

public class Review04 {

	public static void main(String[] args) {

		List<Human> humanList = new ArrayList<Human>(List.of(
				new Human("田中 太郎", 25, "電車"),
				new Human("鈴木 次郎", 30, "野球"),
				new Human("佐藤 花子", 20, "映画")
		));

		humanList.forEach(human -> {
			human.say();
			human.think();
		});

	}

}
