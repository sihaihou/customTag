package com.reyco.tag.core.parsers;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * element的解析器：
 * 		可以实现@Link(BeanDefinitionParser)接口，也可以继承@Link(BeanDefinitionParser)的子类去实现如：AbstractBeanDefinitionParser、AbstractSingleBeanDefinitionParser
 * 		我这里通过实现了BeanDefinitionParser接口并手动注册了Bean
 * @author reyco
 * @version v1.0.1
 */
public class ReycoBeanDefinitionParser implements BeanDefinitionParser {

	@Override
	public BeanDefinition parse(Element element, ParserContext parserContext) {
		String beanClassName = element.getAttribute("id");
		String beanClass = element.getAttribute("class");
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition();
		AbstractBeanDefinition beanDefinition = builder.getRawBeanDefinition();
		try {
			beanDefinition.setBeanClassName(beanClassName);
			beanDefinition.setBeanClass(Class.forName(beanClass));
			BeanDefinitionHolder beanDefinitionHolder = new BeanDefinitionHolder(beanDefinition,beanClassName, null);
			//注册BeanDefinition对象
			BeanDefinitionReaderUtils.registerBeanDefinition(beanDefinitionHolder, parserContext.getRegistry());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return beanDefinition;
	}
}
