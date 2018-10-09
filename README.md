# Step 1. Add the JitPack repository to your build file

  Add it in your root build.gradle at the end of repositories:

      allprojects {
        repositories {
          ...
          maven { url 'https://jitpack.io' }
        }
      }
      
# Step 2. Add the dependency

    dependencies {
            implementation 'com.github.sinothk:TabView:1.0.0815'
    }


# 使用:
  ## xml
    <?xml version="1.0" encoding="utf-8"?>
    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <LinearLayout
            android:id="@+id/refresh"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical">

            <android.support.v4.view.ViewPager
                android:id="@+id/mViewPager"
                android:layout_width="match_parent"
                android:layout_height="0dp"
                android:layout_weight="1"
                android:overScrollMode="never" />

            <View
                android:layout_width="match_parent"
                android:layout_height="1px"
                android:background="#888" />

            <com.sinothk.tab.weiXin.AlphaTabsIndicator
                android:id="@+id/alphaIndicator"
                android:layout_width="match_parent"
                android:layout_height="55dp"
                android:orientation="horizontal">

                <com.sinothk.tab.weiXin.AlphaTabView
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:padding="5dp"
                    app:tabIconNormal="@mipmap/ic_launcher"
                    app:tabIconSelected="@mipmap/ic_launcher"
                    app:tabText="服务"
                    app:tabTextSize="13sp"
                    app:textColorNormal="#999999"
                    app:textColorSelected="#FF0000" />

                <com.sinothk.tab.weiXin.AlphaTabView
                    android:layout_width="0dp"
                    android:layout_height="match_parent"
                    android:layout_weight="1"
                    android:padding="5dp"
                    app:tabIconNormal="@mipmap/ic_launcher"
                    app:tabIconSelected="@mipmap/ic_launcher"
                    app:tabText="我的"
                    app:tabTextSize="13sp"
                    app:textColorNormal="#999999"
                    app:textColorSelected="#FF0000" />
            </com.sinothk.tab.weiXin.AlphaTabsIndicator>
        </LinearLayout>
    </RelativeLayout>
    
   ## java
   
    AlphaTabsIndicator alphaTabsIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        alphaTabsIndicator = (AlphaTabsIndicator) this.findViewById(R.id.alphaIndicator);

        List<Fragment> fragments = new ArrayList<>();
        fragments.add(UnreadTipFragment.newInstance(""));
        fragments.add(Test1.newInstance(""));

        ViewPager mViewPager = (ViewPager) findViewById(R.id.mViewPager);
        WxTabMenuMainAdapter mainAdapter = new WxTabMenuMainAdapter(getSupportFragmentManager(), alphaTabsIndicator, fragments);
        mViewPager.setAdapter(mainAdapter);
        mViewPager.addOnPageChangeListener(mainAdapter);
        alphaTabsIndicator.setViewPager(mViewPager);

        // 未读数据提示
        alphaTabsIndicator.getTabView(0).showNumber(144);
//        alphaTabsIndicator.getTabView(1).showNumber(100);
        alphaTabsIndicator.getTabView(1).showPoint();
    }
