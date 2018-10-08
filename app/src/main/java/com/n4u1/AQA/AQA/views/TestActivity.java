package com.n4u1.AQA.AQA.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.n4u1.AQA.AQA.R;
import com.github.chrisbanes.photoview.PhotoView;

public class TestActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        PhotoView photoView = findViewById(R.id.photoView);

        String imgUrl = getIntent().getStringExtra("imgUrl");

        Glide.with(this).load(imgUrl).into(photoView);



    }
}

/*
ToDo
###################################################################################################################################################
공유하기 버튼 구현 필요 / 댓글 or 게시글 삭제 및 수정 기능 필요 / 동영상을 어떻게 하지.... / 비밀번호 변경 / 계정명 픽스.. / 개인정보보호처리
###################################################################################################################################################
###################################################################################################################################################

to
RegisterActivity.java

from
userAge = Integer.parseInt(editText_age.getText().toString());

why
21억이상의 숫자가 입력이 된다면? 에 대한 예외처리를 해줘야할듯한데?

###################################################################################################################################################

to
String userDevice

from
userDevice = android.provider.Settings.Secure.getString(getBaseContext().getContentResolver(), Settings.Secure.ANDROID_ID);

why
사용자 디바이스 번호를 가져와서 디비에 저장하는데
만일 사용자가 핸드폰을 중고로 팔았을경우
구매자가 해당어플을 이용할경우에 대한 예외처리 및......
-> 아마 디바이스 번호로 고유성을 체크하지 않고 통신사 본인확인으로 해야할듯. (나이스 신용, 다날 등.. 같은것으로..)

###################################################################################################################################################

to
RegisterActivity.java

from
전체

why
기존에 저장되어있는 userDevice 라도 또 입력하면 덮어씌워지지 않음 ( 사실 예외처리는 필요없을것 같기는 하지만... )

###################################################################################################################################################

앱 최초 실행시 권한 요청하는 다이얼로그?

###################################################################################################################################################

팔로우, 공유 버튼 필요

###################################################################################################################################################

Activity Stack clear
Intent.FLAG_ACTIVITY_CLEAR_TOP

Intent intent = new Intent(getApplicationContext(),FlagTestActivity.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);

###################################################################################################################################################

http://gogorchg.tistory.com/entry/Android-%EC%A7%80%EB%82%98%EC%B3%90-%EC%98%A8-Activity-%EC%A0%9C%EA%B1%B0-%EB%B0%A9%EB%B2%95

출처: http://gogorchg.tistory.com/entry/Android-지나쳐-온-Activity-제거-방법 [항상 초심으로]

################################################################################################################################################### 완료

댓글 DB구조를...

users/uid/reply/
user_contents/reply/
reply


###################################################################################################################################################

VideoFragment에서 back버튼누를때 호출됨
이때 비디오 올라간 리소스 제거 해줘야함
08-27 13:49:55.703 19131-19131/com.example.n4u1.test130 D/lkjFragment onPause: onPause
08-27 13:49:56.051 19131-19131/com.example.n4u1.test130 D/lkjFragment onStop: onStop
08-27 13:49:56.105 19131-19131/com.example.n4u1.test130 D/lkjFragment onDestroy: onDestroy


###################################################################################################################################################




###################################################################################################################################################






 */