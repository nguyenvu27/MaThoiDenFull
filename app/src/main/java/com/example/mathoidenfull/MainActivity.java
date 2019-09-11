package com.example.mathoidenfull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.mathoidenfull.activity.MeDongLongLinhActivity;
import com.example.mathoidenfull.activity.MoHoangBiTuActivity;
import com.example.mathoidenfull.activity.NamHaiQuyKhuActivity;
import com.example.mathoidenfull.activity.ThanCungConLuanActivity;
import com.example.mathoidenfull.activity.ThanhCoTinhTuyetActivity;
import com.example.mathoidenfull.activity.ThanhTuyenTamTungActivity;
import com.example.mathoidenfull.activity.ThiVuongTuongTayActivity;
import com.example.mathoidenfull.activity.TrungCocVanNamActivity;
import com.example.mathoidenfull.activity.VuHiepQuanSonActivity;
import com.example.mathoidenfull.adapter.Face;
import com.example.mathoidenfull.adapter.FaceAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements FaceAdapter.OnCallBack {
    private RecyclerView mRcvFace;
    private FaceAdapter mAdapter;
    private List<Face> mListFace;
    private ImageView imageView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }


    private void initView() {
        mListFace = new ArrayList<>();
//        for (int i = 0; i < 2; i++) {
        mListFace.add(new Face("1.THÀNH CỔ TINH TUYỆT", R.drawable.mathoiden1));
        mListFace.add(new Face("2.MÊ ĐỘNG LONG LĨNH", R.drawable.mathoiden2));
        mListFace.add(new Face("3.TRÙNG CỐC VÂN NAM", R.drawable.mathoiden8));
        mListFace.add(new Face("4.THẦN CUNG CÔN LUÂN", R.drawable.mathoiden4));
        mListFace.add(new Face("5.MỘ HOÀNG BÌ TỬ", R.drawable.mathoiden5));
        mListFace.add(new Face("6.NAM HẢI QUY KHƯ", R.drawable.mathoiden6));
        mListFace.add(new Face("7.THI VƯƠNG TƯƠNG TÂY", R.drawable.mathoiden7));
        mListFace.add(new Face("8.VU HIỆP QUAN SƠN", R.drawable.vuhiepquanson));
        mListFace.add(new Face("9.THÁNH TUYỀN TẦM TUNG", R.drawable.mathoiden9));
//        }


        mRcvFace = (RecyclerView) findViewById(R.id.rcv_face);

        mRcvFace.setHasFixedSize(true);
        mRcvFace.setLayoutManager(new GridLayoutManager(this, 2));
        mAdapter = new FaceAdapter(this, mListFace);
        mRcvFace.setAdapter(mAdapter);
    }



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater() ;
//        inflater.inflate(R.menu.search_menu, menu);
//        MenuItem item = menu.findItem(R.id.rcv_face) ;
//        SearchView searchView = (SearchView) item.getActionView();
//       searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//           @Override
//           public boolean onQueryTextSubmit(String s) {
//               return false;
//           }
//
//           @Override
//           public boolean onQueryTextChange(String s) {
//               return false;
//           }
//       });
//       return super.onCreateOptionsMenu(menu) ;
//    }

    @Override
    public void onItemClicked(int position) {
//        Toast.makeText(this, "position" + position, Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(MainActivity.this, ThanhCoTinhTuyetActivity.class) ;
//        startActivity(intent);
        if (position == 0) {
            Intent intent = new Intent(MainActivity.this, ThanhCoTinhTuyetActivity.class);
            startActivity(intent);
        } else if (position == 1) {
            Intent intent = new Intent(MainActivity.this, MeDongLongLinhActivity.class);
            startActivity(intent);
        } else if (position == 2) {
            Intent intent = new Intent(MainActivity.this, TrungCocVanNamActivity.class);
            startActivity(intent);
        } else if (position == 3) {
            Intent intent = new Intent(MainActivity.this, ThanCungConLuanActivity.class);
            startActivity(intent);
        } else if (position == 4) {
            Intent intent = new Intent(MainActivity.this, MoHoangBiTuActivity.class);
            startActivity(intent);
        }else if (position == 5) {
            Intent intent = new Intent(MainActivity.this, NamHaiQuyKhuActivity.class);
            startActivity(intent);
        }else if (position == 6) {
            Intent intent = new Intent(MainActivity.this, ThiVuongTuongTayActivity.class);
            startActivity(intent);
        }else if (position == 7) {
            Intent intent = new Intent(MainActivity.this, VuHiepQuanSonActivity.class);
            startActivity(intent);
        }else if (position == 8) {
            Intent intent = new Intent(MainActivity.this, ThanhTuyenTamTungActivity.class);
            startActivity(intent);
        }




    }
}
