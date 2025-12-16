package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes8.dex */
public final class iy implements ey {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final pl f386698a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final y80<ExtendedNativeAdView> f386699b;

    public iy(@j.N y80<ExtendedNativeAdView> y80Var, @j.N pl plVar) {
        this.f386698a = plVar;
        this.f386699b = y80Var;
    }

    @Override // com.yandex.mobile.ads.impl.ey
    public final void c() {
        if (this.f386699b.a()) {
            return;
        }
        this.f386698a.e();
    }

    @Override // com.yandex.mobile.ads.impl.ey
    public final void invalidate() {
        this.f386699b.b();
    }
}
