package qq.app01.com.myxuanke.mode;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/10.
 */

public class Students implements Serializable {
    public String name;
    public int sex;
    public int age;

    public Students(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
