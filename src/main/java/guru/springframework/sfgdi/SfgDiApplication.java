package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		FakeDataSource fakeDataSource =  ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());


		FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);

		System.out.println(fakeJmsBroker.getUsername());

	}

}
