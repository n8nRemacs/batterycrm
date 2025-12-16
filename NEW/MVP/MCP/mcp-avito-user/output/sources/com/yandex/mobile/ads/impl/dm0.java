package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* loaded from: classes8.dex */
public final class dm0 implements NativeAdEventListener, ClosableNativeAdEventListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC39377x0 f384635a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final dy f384636b;

    public dm0(@j.N C39311c1 c39311c1, @j.N dy dyVar) {
        this.f384635a = c39311c1;
        this.f384636b = dyVar;
    }

    @Override // com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener
    public final void closeNativeAd() {
        if (this.f384636b.a()) {
            ((C39311c1) this.f384635a).a();
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public void onImpression(@j.P ImpressionData impressionData) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("impression_data_key", impressionData instanceof AdImpressionData ? (AdImpressionData) impressionData : null);
        ((C39311c1) this.f384635a).a(16, bundle);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onLeftApplication() {
        ((C39311c1) this.f384635a).a(17, null);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onReturnedToApplication() {
        ((C39311c1) this.f384635a).a(18, null);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onAdClicked() {
    }
}
