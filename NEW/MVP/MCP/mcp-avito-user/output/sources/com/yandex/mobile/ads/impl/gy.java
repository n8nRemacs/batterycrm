package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* loaded from: classes8.dex */
public final class gy implements up<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final up<ExtendedNativeAdView> f385856a;

    public gy(@j.N com.yandex.mobile.ads.nativeads.u uVar, @j.N pl plVar, @j.N NativeAdEventListener nativeAdEventListener, @j.N vi viVar) {
        if (uVar instanceof z41) {
            this.f385856a = new y41((z41) uVar, plVar, nativeAdEventListener, viVar);
        } else {
            this.f385856a = new jk0(uVar, plVar, nativeAdEventListener, viVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        up<ExtendedNativeAdView> upVar = this.f385856a;
        if (upVar != null) {
            upVar.a(extendedNativeAdView);
        }
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
        up<ExtendedNativeAdView> upVar = this.f385856a;
        if (upVar != null) {
            upVar.c();
        }
    }
}
