package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer;

/* loaded from: classes8.dex */
public final class ti0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final j11<MultiBannerControlsContainer> f390207a = new j11<>();

    @Y61.l
    public final MultiBannerControlsContainer a(@Y61.k Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        j11<MultiBannerControlsContainer> j11Var = this.f390207a;
        int i12 = R.layout.monetization_ads_internal_multibanner_controls;
        j11Var.getClass();
        MultiBannerControlsContainer multiBannerControlsContainer = (MultiBannerControlsContainer) j11.a(context, MultiBannerControlsContainer.class, i12, null);
        if (multiBannerControlsContainer != null) {
            multiBannerControlsContainer.setLayoutParams(layoutParams);
        }
        return multiBannerControlsContainer;
    }
}
