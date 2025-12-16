package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

/* loaded from: classes8.dex */
public final class d9<V extends ViewGroup> implements up<V> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final NativeAdAssets f384542a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final kk0 f384543b = new kk0();

    public d9(@j.N NativeAdAssets nativeAdAssets) {
        this.f384542a = nativeAdAssets;
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N V v12) {
        this.f384543b.getClass();
        View viewFindViewById = v12.findViewById(R.id.age_divider);
        if (viewFindViewById == null || this.f384542a.getAge() != null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
    }
}
