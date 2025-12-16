package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.jl0;
import com.yandex.mobile.ads.nativeads.c0;
import j.N;

/* loaded from: classes8.dex */
final class x implements jl0 {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final NativeAdViewBinder f392894a;

    public x(@N NativeAdViewBinder nativeAdViewBinder) {
        this.f392894a = nativeAdViewBinder;
    }

    @Override // com.yandex.mobile.ads.impl.jl0
    @N
    public final c0 a() {
        return new c0.a(this.f392894a.getNativeAdView(), this.f392894a.getAssetViews()).a();
    }
}
