/**
 * 读写xml
 * Created by Administrator on 2016/4/6 0006.
 */
def sample = """"
    We'll create this xml:
"""
println(sample);

//写xml
testxml = "e:/test.xml";
import groovy.xml.MarkupBuilder
xml = new MarkupBuilder(new FileWriter(testxml));

xml.beans{
    bean(id:"myBean1",class:"com.diegochen.Bean1"){
        property(name:"dao",ref:"dao1");
    }
    bean(id:"myBean2",class:"com.diegochen.Bean2"){
        property(name:"dao",ref:"dao2")
    }
}
println("Done creation,Now reading xml... \n")
//Read xml
start = System.currentTimeMillis();//传说xmlParser吃内存，xmlSlurper速度慢

def node = new XmlParser().parse(new File(testxml))

println("node name:"+node.name());//取得node的名字，为什么不是getName()
end = System.currentTimeMillis();
println("elapsed time:"+(end-start)+"ms");

//访问子节点和属性
println("How many beans?:"+node.children().size());
def bean2 = node.children()[1];
println("2nd bean's is:"+bean2."@id");
println("2nd bean's class:"+bean2."@class");
println("2nd bean's dao property:"+bean2.children()[0]."@ref");