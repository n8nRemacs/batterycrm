package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

/* loaded from: classes8.dex */
public final class yc0<V extends ViewGroup> implements up<V> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final zj0 f391993a = new zj0();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final tb0 f391994b;

    public yc0(@j.N NativeAdAssets nativeAdAssets) {
        this.f391994b = new tb0(nativeAdAssets);
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N V v12) {
        this.f391993a.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) v12.findViewById(R.id.media_container);
        Float fA2 = this.f391994b.a();
        if (extendedViewContainer == null || fA2 == null) {
            return;
        }
        extendedViewContainer.setMeasureSpecProvider(new wk(new rv0(Math.min(Math.max(fA2.floatValue(), 1.0f), 1.7777778f)), new lb0(v12, 0.5f)));
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
    }
}
