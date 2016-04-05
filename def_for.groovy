/**
 * 学习for循环
 * Created by miaorf on 2016/4/5.
 */
def forFunc(a,repeat = 10){
    for (int i = a; i <=repeat; i++) {
        print(i+",")
    }
}

def forFunc1(a,repeat = 10){
    for(i in a .. repeat){
        print(i+",")
    }
}

forFunc(2);
println();
forFunc1(2)

/**
 知识点:
 1>两种循环风格.
 2>a .. repeat 这种风格等价于 i=a;i<=repeat;i++
 **/