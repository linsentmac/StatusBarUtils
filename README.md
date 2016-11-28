StatusBarUtils
====

What is The StatusBarUtils?
----

##### StatusBarUtils is a display immersion tools of the status bar 



How to use the tools?
----

Add it to your BasicActivity title layout:

<include layout="@layout/status_layout"/>

*status_layout.xml*
```
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical" android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <TextView
        android:id="@+id/tv_status"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/statusBg" />

</RelativeLayout>
```


and add it to BasicActivity:

```
@Override
protected void onCreate(Bundle savedInstanceState) {
    StatusUtils.setWindowLayout(getWindow());
    super.onCreate(savedInstanceState);

    tv_status = (TextView) findViewById(R.id.tv_status);

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
        tv_status.setHeight(StatusUtils.getStatusHeight(this));
        tv_status.setVisibility(View.VISIBLE);
    } else {
        tv_status.setHeight(0);
        tv_status.setVisibility(View.GONE);
    }
}
```

and extends BasicActivity in MainActivity


```
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        tv_status.setBackgroundResource(R.color.statusBg);
    }
}
```

