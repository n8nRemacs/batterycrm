package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* loaded from: classes8.dex */
public final class sl0 implements NativeAdEventListener {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final com.yandex.mobile.ads.banner.f f389981a;

    public sl0(@Y61.k com.yandex.mobile.ads.banner.f fVar) {
        this.f389981a = fVar;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public void onImpression(@Y61.l ImpressionData impressionData) {
        this.f389981a.a((AdImpressionData) impressionData);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onLeftApplication() {
        this.f389981a.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onReturnedToApplication() {
        this.f389981a.onReturnedToApplication();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onAdClicked() {
    }
}
