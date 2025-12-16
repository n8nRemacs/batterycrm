package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R;

/* loaded from: classes8.dex */
final class hy0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final dq f386245a = new dq();

    @j.N
    public final Button a(@j.N Context context) {
        Button button = new Button(context);
        button.setBackground(androidx.core.content.d.getDrawable(context, R.drawable.monetization_ads_video_ic_replay));
        this.f386245a.getClass();
        int iRound = Math.round(TypedValue.applyDimension(1, 90.0f, context.getResources().getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iRound, iRound);
        layoutParams.gravity = 17;
        button.setLayoutParams(layoutParams);
        return button;
    }
}
