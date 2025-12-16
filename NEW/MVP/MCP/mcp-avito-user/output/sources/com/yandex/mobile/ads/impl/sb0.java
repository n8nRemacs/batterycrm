package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

/* loaded from: classes8.dex */
public final class sb0<V extends ViewGroup> implements up<V> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final zj0 f389854a = new zj0();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final tb0 f389855b;

    public sb0(@j.N NativeAdAssets nativeAdAssets) {
        this.f389855b = new tb0(nativeAdAssets);
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N V v12) {
        this.f389854a.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) v12.findViewById(R.id.media_container);
        Float fA2 = this.f389855b.a();
        if (extendedViewContainer == null || fA2 == null) {
            return;
        }
        extendedViewContainer.setMeasureSpecProvider(new rv0(fA2.floatValue()));
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
    }
}
