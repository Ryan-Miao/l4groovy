/**
 *  知识点
 1>如何读写文件
 2>groovy的文件操作
 * Created by Administrator on 2016/4/6 0006.
 */
BufferedReader reader = new File("E:/abc.txt").newReader('gbk');
BufferedWriter writer = new File("E:/abc.csv").newWriter('gbk')
reader.eachLine {line->
    if (line && line[0] !='#'){
        writer.writeLine(line)
        println(line)
    }
}
writer.close();

def createFile(path,createIfNotExist){
    def file = new File(path);
    if (!file.exists()){
        if (createIfNotExist){
            if (!file.getParentFile().exists()){
                file.getParentFile().mkdirs()
            }
            file.createNewFile();
        }else {
            throw NullPointerException("Missing file:"+path);
        }
    }
    return file;
}

def copyFile(String frompath,String topath,boolean createDestIfNotExist){
    def fromfile = new File(frompath);
    if(!fromfile.exists()){
        println("############Missing file:"+fromfile + "\n")
        return false;
    }else{
        println("Copying file:"+frompath+"\n")
    }

    def tofile = createFile(topath,createDestIfNotExist);
    tofile.withWriter {file->
        fromfile.eachLine {line->
            file.writeLine(line);
        }
    }
    return true;
}

