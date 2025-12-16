package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;

/* loaded from: classes8.dex */
public final class hy implements up<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.u f386240a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final pl f386241b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final NativeAdEventListener f386242c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final ac f386243d = new ac();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final rj0 f386244e = new rj0();

    public hy(@j.N com.yandex.mobile.ads.nativeads.u uVar, @j.N pl plVar, @j.N NativeAdEventListener nativeAdEventListener) {
        this.f386240a = uVar;
        this.f386241b = plVar;
        this.f386242c = nativeAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N ViewGroup viewGroup) {
        try {
            this.f386240a.a(this.f386243d.a((ExtendedNativeAdView) viewGroup, this.f386244e));
            this.f386240a.setNativeAdEventListener(this.f386242c);
        } catch (NativeAdException unused) {
            this.f386241b.e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
        this.f386240a.setNativeAdEventListener(null);
    }
}
