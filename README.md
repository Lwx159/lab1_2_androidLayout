# lab1_2_androidLayout
实验内容：验证生命周期，三个布局界面
实验截图存放在img文件夹中，共5个截图
实验代码如下：

实验1：验证生命周期

```
package com.example.win.helloworld2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivityLife","调用onCreate()");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("MainActivityLife","调用onStart()");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("MainActivityLife","调用onResume()");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("MainActivityLife","调用onPause()");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("MainActivityLife","调用onStop()");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("MainActivityLife","调用onDestroy()");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("MainActivityLife","调用onRestart()");
    }
}
```
实验2.1 线性布局
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="One,One"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="One,Two"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="One,Three"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="One,Four"/>
    </LinearLayout>

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Two,One"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Two,Two"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Two,Three"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Two,Four"/>
    </LinearLayout>

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Three,One"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Three,Two"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Three,Three"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Three,Four"/>
    </LinearLayout>

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Four,One"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Four,Two"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Four,Three"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Four,Four"/>
    </LinearLayout>
</LinearLayout>
```
实验2.2 相对布局
```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/black">

    <Button
        android:id="@+id/red"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="@color/red"
        android:text="red"/>

    <Button
        android:id="@+id/orange"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        android:background="@color/orange"
        android:text="orange" />

    <Button
        android:id="@+id/yellow"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintRight_toRightOf="parent"
        android:background="@color/yellow"
        android:text="yellow" />

    <Button
        android:id="@+id/green"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintRight_toLeftOf="@id/blue"
        app:layout_constraintTop_toBottomOf="@id/red"
        android:layout_marginTop="30dp"
        android:layout_marginRight="15dp"
        android:background="@color/green"
        android:text="green" />

    <Button
        android:id="@+id/blue"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintTop_toBottomOf="@id/red"
        android:layout_marginTop="30dp"
        android:background="@color/blue"
        android:text="blue" />

    <Button
        android:id="@+id/indigo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintTop_toBottomOf="@id/red"
        app:layout_constraintLeft_toRightOf="@id/blue"
        android:layout_marginTop="30dp"
        android:layout_marginLeft="15dp"
        android:background="@color/indigo"
        android:text="indigo" />

    <Button
        android:id="@+id/violet"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:layout_constraintTop_toBottomOf="@id/green"
        android:layout_marginTop="30dp"
        android:background="@color/violet"
        android:text="violet" />
</android.support.constraint.ConstraintLayout>

```
实验2.3表格布局
```
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#000000">
    <TableRow>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text=" " />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="30dp"
            android:textColor="#8B8989"
            android:text="Open..." />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"  />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="30dp"
            android:textColor="#8B8989"
            android:gravity="right"
            android:text="Ctrl-O" />
    </TableRow>
    <TableRow>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="30dp"
            android:text=" " />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="30dp"
            android:textColor="#8B8989"
            android:text="Save..." />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"  />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="30dp"
            android:textColor="#8B8989"
            android:gravity="right"
            android:text="Ctrl-S" />
    </TableRow>
    <TableRow>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="30dp"
            android:text=" " />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="30dp"
            android:textColor="#8B8989"
            android:text="Save As..." />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"  />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="30dp"
            android:textColor="#8B8989"
            android:gravity="right"
            android:text="Ctrl-Shift-S" />
    </TableRow>
    <TableRow>
        <View android:layout_height="10px"
            android:layout_width="match_parent"
            android:layout_weight="1"
            android:background="#8B8989"/>
    </TableRow>
    <TableRow>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="30dp"
            android:textColor="#8B8989"
            android:text="X " />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="30dp"
            android:textColor="#8B8989"
            android:text="Import..." />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"  />
    </TableRow>
    <TableRow>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="30dp"
            android:textColor="#8B8989"
            android:text="X " />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="30dp"
            android:textColor="#8B8989"
            android:text="Export..." />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"  />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="30dp"
            android:textColor="#8B8989"
            android:gravity="right"
            android:text="Ctrl-E" />
    </TableRow>
    <TableRow>
        <View android:layout_height="10px"
            android:layout_width="match_parent"
            android:layout_weight="1"
            android:background="#8B8989"/>
    </TableRow>
    <TableRow>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text=" "
            android:textSize="30dp" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#8B8989"
            android:text="Quit..."
            android:textSize="30dp" />
    </TableRow>

</TableLayout>
```

