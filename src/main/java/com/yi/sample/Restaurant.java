package com.yi.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

/*
 * 
<bean id="restaurant" class="com.yi.sample.Restaurant">
	<property name="member" value="ȫ�浿"/>
</bean>

class Restaurant{

	Restaurant(Member member)
	{
	
	}

}

 */


@Component
@Data
public class Restaurant {

	@Setter(onMethod_ = @Autowired)
	private Chef chef;
}
