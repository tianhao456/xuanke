package qq.app01.com.myxuanke.mode;

import java.util.List;

/**
 * Created by Administrator on 2016/8/10.
 */
public class Course {
    private String classNo;
    private String className;
    private Teach teach;
    private List<Students> studentses;

    public Course() {
    }

    public Course(String classNo, String className, Teach teach, List<Students> studentses) {
        this.classNo = classNo;
        this.className = className;
        this.teach = teach;
        this.studentses = studentses;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teach getTeach() {
        return teach;
    }

    public void setTeach(Teach teach) {
        this.teach = teach;
    }

    public List<Students> getStudentses() {
        return studentses;
    }

    public void setStudentses(List<Students> studentses) {
        this.studentses = studentses;
    }
}
