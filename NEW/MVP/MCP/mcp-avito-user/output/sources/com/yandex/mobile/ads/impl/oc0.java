package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

/* loaded from: classes8.dex */
public final class oc0<V extends ViewGroup> implements up<V> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final NativeAdAssets f388490a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final zj0 f388491b = new zj0();

    public oc0(@j.N NativeAdAssets nativeAdAssets) {
        this.f388490a = nativeAdAssets;
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N V v12) {
        this.f388491b.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) v12.findViewById(R.id.media_container);
        if (extendedViewContainer != null && this.f388490a.getImage() == null && this.f388490a.getMedia() == null) {
            extendedViewContainer.setVisibility(8);
        }
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
    }
}
