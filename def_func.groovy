def func(a,b){
    println("Your name is: "+a+" and your age is: " + b);
}

func("Diego",30)

def func1(a,b=25){
    if(b==null){
        println("Your name is: "+a+" and your age is a secret");
    }else{
        println("Your name is: "+a+" and your age is: " + b);
    }
}
func1("Diego")
func1("Diego",30)
func1("Diego",null)

/**
    ֪ʶ��:
    1>��ζ���ͺ���
    2>����ں����ﶨ��Ĭ�ϲ���
**/