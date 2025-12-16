package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* loaded from: classes8.dex */
final class du0 implements ky {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final up<ExtendedNativeAdView> f384687a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ok f384688b = new ok();

    public du0(@j.N ak akVar) {
        this.f384687a = akVar;
    }

    @Override // com.yandex.mobile.ads.impl.ky
    @j.N
    public final u80 a(@j.N Context context, @j.N AdResponse adResponse, @j.N com.yandex.mobile.ads.nativeads.u uVar, @j.N pl plVar, @j.N NativeAdEventListener nativeAdEventListener) {
        NativeAdAssets adAssets = uVar.getAdAssets();
        ok okVar = this.f384688b;
        up<ExtendedNativeAdView> upVar = this.f384687a;
        okVar.getClass();
        return new u80(R.layout.monetization_ads_internal_native_interstitial_portrait, ExtendedNativeAdView.class, new sk(ok.a(uVar, plVar, nativeAdEventListener, upVar), new yc0(adAssets), new cl1(), new yh(uVar), new wh(context)), new fr0(1));
    }
}
