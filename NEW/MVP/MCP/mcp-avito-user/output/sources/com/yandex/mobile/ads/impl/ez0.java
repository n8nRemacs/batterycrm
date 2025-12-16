package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes8.dex */
public final class ez0 implements up<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC39377x0 f385147a;

    /* renamed from: b, reason: collision with root package name */
    public final int f385148b;

    public ez0(@j.N InterfaceC39377x0 interfaceC39377x0, int i12) {
        this.f385147a = interfaceC39377x0;
        this.f385148b = i12;
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N ViewGroup viewGroup) {
        if (this.f385148b == 1) {
            ((C39311c1) this.f385147a).a(7);
        } else {
            ((C39311c1) this.f385147a).a(6);
        }
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
    }
}
