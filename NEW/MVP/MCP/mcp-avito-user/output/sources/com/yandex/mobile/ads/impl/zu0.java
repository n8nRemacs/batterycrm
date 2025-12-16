package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.R;

/* loaded from: classes8.dex */
public final class zu0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final dq f392349a = new dq();

    @j.N
    public final ProgressBar a(@j.N Context context) {
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminateDrawable(androidx.core.content.d.getDrawable(context, R.drawable.monetization_ads_video_progress_bar_background));
        this.f392349a.getClass();
        int iRound = Math.round(TypedValue.applyDimension(1, 45.0f, context.getResources().getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iRound, iRound);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        return progressBar;
    }
}
