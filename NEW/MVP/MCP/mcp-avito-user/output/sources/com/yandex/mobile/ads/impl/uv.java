package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes8.dex */
public final class uv {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f390634a;

    public uv(@j.N Context context) {
        this.f390634a = context;
    }

    @j.N
    public final ImageView a(int i12, int i13) {
        ImageView imageView = new ImageView(this.f390634a);
        int iA2 = rj1.a(this.f390634a, 28.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA2, iA2);
        layoutParams.gravity = 8388613;
        layoutParams.rightMargin = i12;
        layoutParams.topMargin = i13;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }
}
