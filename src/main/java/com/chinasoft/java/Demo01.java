package com.chinasoft.java;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;


/**
 * @author :Mr.Xu
 * Date    :2019-3-6
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {

        // 创建一个解析器
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("C:\\Users\\Administrator\\Desktop\\phone.xml"));
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());

        getNode(rootElement);


    }

    public static void getNode(Element rootElement) {
        List<Element> elements = rootElement.elements();
        for (Element element  :elements) {
            System.out.println(element.getName());
            List<Attribute> attributes = element.attributes();
            Attribute id = attributes.get(0);
            System.out.println(id.getName());
            String val = element.attributeValue("id");
            System.out.println(val);

        }
    }


}
