package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* loaded from: classes8.dex */
final class r80 implements ky {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final up<ExtendedNativeAdView> f389439a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final hz0 f389440b = new hz0();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ok f389441c = new ok();

    public r80(@j.N ak akVar) {
        this.f389439a = akVar;
    }

    @Override // com.yandex.mobile.ads.impl.ky
    @j.N
    public final u80 a(@j.N Context context, @j.N AdResponse adResponse, @j.N com.yandex.mobile.ads.nativeads.u uVar, @j.N pl plVar, @j.N NativeAdEventListener nativeAdEventListener) {
        NativeAdAssets adAssets = uVar.getAdAssets();
        hz0 hz0Var = this.f389440b;
        int i12 = R.dimen.monetization_ads_internal_landscape_vertical_icon_size;
        hz0Var.getClass();
        uk ukVar = new uk(adAssets, Math.round(context.getResources().getDimension(i12)));
        ok okVar = this.f389441c;
        up<ExtendedNativeAdView> upVar = this.f389439a;
        okVar.getClass();
        sk skVar = new sk(ukVar, ok.a(uVar, plVar, nativeAdEventListener, upVar), new sb0(adAssets), new ss0(adAssets), new cl1(), new yh(uVar));
        NativeAdAssets adAssets2 = uVar.getAdAssets();
        hz0 hz0Var2 = this.f389440b;
        int i13 = R.dimen.monetization_ads_internal_landscape_vertical_media_content_min_width;
        hz0Var2.getClass();
        return new u80(R.layout.monetization_ads_internal_native_interstitial_landscape_vetrical_media, ExtendedNativeAdView.class, skVar, new tk(new fr0(2), new yb0(adAssets2, Math.round(context.getResources().getDimension(i13)))));
    }
}
