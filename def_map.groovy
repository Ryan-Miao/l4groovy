/**
 * map的用法
 *  知识点:
 1>如何使用map
 2>如何遍历map
 * Created by miaorf on 2016/4/5.
 */
def mymap = ["name":"Diego",age:30,hobbies:["Football","Reading","bile"]];
println("Your name is "+ mymap["name"]+",age is "+mymap["age"]+",hobbie:"+mymap["hobbies"])
mymap.location = "ShenZhen";
println(mymap);

//loop map by closure
mymap.each {key,value->
    println("key:"+key+",value:"+value);
}
