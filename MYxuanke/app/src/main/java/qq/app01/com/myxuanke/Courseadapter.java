package qq.app01.com.myxuanke;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import qq.app01.com.myxuanke.mode.Course;
import qq.app01.com.myxuanke.mode.Students;

/**
 * Created by Administrator on 2016/8/11.
 */


public class Courseadapter extends BaseAdapter {
public LayoutInflater layoutInflater;
    private List<Students> list;

    public Courseadapter(Context context){
        layoutInflater =LayoutInflater.from(context);

    }
    @Override
    public int getCount() {
        return list==null?0:list.size();
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = layoutInflater.inflate(R.layout.course,null);
        return view1;
    }
}
