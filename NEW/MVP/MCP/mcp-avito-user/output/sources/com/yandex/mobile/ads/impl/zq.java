package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* loaded from: classes8.dex */
public final class zq implements ky {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.yandex.div2.H0 f392334a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final up<ExtendedNativeAdView> f392335b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InterfaceC39377x0 f392336c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final qq f392337d;

    /* renamed from: e, reason: collision with root package name */
    private final int f392338e;

    public zq(@j.N com.yandex.div2.H0 h02, @j.N sk skVar, @j.N InterfaceC39377x0 interfaceC39377x0, @j.N qq qqVar, int i12) {
        this.f392334a = h02;
        this.f392335b = skVar;
        this.f392336c = interfaceC39377x0;
        this.f392337d = qqVar;
        this.f392338e = i12;
    }

    @Override // com.yandex.mobile.ads.impl.ky
    @j.N
    public final u80 a(@j.N Context context, @j.N AdResponse adResponse, @j.N com.yandex.mobile.ads.nativeads.u uVar, @j.N pl plVar, @j.N NativeAdEventListener nativeAdEventListener) {
        vi viVar = new vi();
        return new u80(R.layout.monetization_ads_internal_divkit, ExtendedNativeAdView.class, new sk(new ez0(this.f392336c, this.f392338e), new rq(context, this.f392334a, viVar, plVar, this.f392337d), new gy(uVar, plVar, nativeAdEventListener, viVar), this.f392335b), new yq(adResponse));
    }
}
