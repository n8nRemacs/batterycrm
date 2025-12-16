package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* loaded from: classes8.dex */
final class q80 implements ky {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final up<ExtendedNativeAdView> f389106a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final hz0 f389107b = new hz0();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ok f389108c = new ok();

    public q80(@j.N ak akVar) {
        this.f389106a = akVar;
    }

    @Override // com.yandex.mobile.ads.impl.ky
    @j.N
    public final u80 a(@j.N Context context, @j.N AdResponse adResponse, @j.N com.yandex.mobile.ads.nativeads.u uVar, @j.N pl plVar, @j.N NativeAdEventListener nativeAdEventListener) {
        NativeAdAssets adAssets = uVar.getAdAssets();
        hz0 hz0Var = this.f389107b;
        int i12 = R.dimen.monetization_ads_internal_landscape_horizontal_icon_size;
        hz0Var.getClass();
        uk ukVar = new uk(adAssets, Math.round(context.getResources().getDimension(i12)));
        ok okVar = this.f389108c;
        up<ExtendedNativeAdView> upVar = this.f389106a;
        okVar.getClass();
        return new u80(R.layout.monetization_ads_internal_native_interstitial_landscape_horizontal_media, ExtendedNativeAdView.class, new sk(ukVar, ok.a(uVar, plVar, nativeAdEventListener, upVar), new sb0(adAssets), new ss0(adAssets), new cl1(), new yh(uVar)), new fr0(2));
    }
}
