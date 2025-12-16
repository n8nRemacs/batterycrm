package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* loaded from: classes8.dex */
public final class nk0 implements InterfaceC39306b0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Handler f388331a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private NativeAdEventListener f388332b;

    @Override // com.yandex.mobile.ads.impl.InterfaceC39306b0
    public final void onLeftApplication() {
        this.f388331a.post(new B1(this, 1));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39306b0
    public final void onReturnedToApplication() {
        this.f388331a.post(new B1(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        NativeAdEventListener nativeAdEventListener = this.f388332b;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdClicked();
            nativeAdEventListener.onLeftApplication();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        NativeAdEventListener nativeAdEventListener = this.f388332b;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onReturnedToApplication();
        }
    }

    public final void a(@j.P NativeAdEventListener nativeAdEventListener) {
        this.f388332b = nativeAdEventListener;
    }

    public final void b(@j.P AdImpressionData adImpressionData) {
        this.f388331a.post(new H(17, this, adImpressionData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdImpressionData adImpressionData) {
        NativeAdEventListener nativeAdEventListener = this.f388332b;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onImpression(adImpressionData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        NativeAdEventListener nativeAdEventListener = this.f388332b;
        if (nativeAdEventListener instanceof ClosableNativeAdEventListener) {
            ((ClosableNativeAdEventListener) nativeAdEventListener).closeNativeAd();
        }
    }

    public final void a() {
        this.f388331a.post(new B1(this, 0));
    }
}
