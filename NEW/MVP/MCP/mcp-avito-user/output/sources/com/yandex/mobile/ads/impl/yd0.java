package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;

/* loaded from: classes8.dex */
public final class yd0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final a30 f392001a = new a30();

    @j.N
    public final xn1 a(@j.N CustomizableMediaView customizableMediaView, @j.N w20 w20Var, @j.N n2 n2Var) {
        ImageView imageView = new ImageView(customizableMediaView.getContext());
        this.f392001a.getClass();
        customizableMediaView.removeAllViews();
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        customizableMediaView.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        return new xn1(customizableMediaView, new j30(imageView, w20Var), n2Var);
    }
}
