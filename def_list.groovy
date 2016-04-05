/**
 * Created by miaorf on 2016/4/5.
 */
def myrange = 25 .. 10;
println(myrange);

myrange = 11 ..19;
println(myrange);

println("First element of collection is:"+myrange[0]);
println("Last element of collection is :"+myrange[-1]);
//myrange<<20;//报错
println("now myrange:"+myrange)
println("Reverse:"+myrange.reverse());
println("Remove sub collection "+(myrange - [12,13,14,15]));
println("Remove element"+(myrange-18))
//=============================================
def cool =["c","c++","java","javascript","python"];
println("Program anguages you're knowing:"+cool);
cool<<"groovy";//添加
println("now cool="+cool);
cool = cool*.toUpperCase();
println(cool)
/**
 知识点:
 1>如何方便定义collection
 2>collection的各种操作
 3>注意groovy重载了+和-运算符. 所以collection可以很方便的用+和-删除元素. 在这样做的时候, 最好加上().
 4>*是很酷的一个功能, 方便的遍历集合元素.
 **/

