package com.reyco.tag.core.handlers;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

import com.reyco.tag.core.parsers.ReycoBeanDefinitionParser;
/**
 * @author reyco
 * @version v1.0.1
 */
public class ReycoNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("reyco", new ReycoBeanDefinitionParser());
	}

}
