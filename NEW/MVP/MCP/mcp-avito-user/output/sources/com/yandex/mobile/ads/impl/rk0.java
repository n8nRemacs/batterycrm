package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.df;
import com.yandex.mobile.ads.nativeads.NativeAdRequestConfiguration;

/* loaded from: classes8.dex */
public final class rk0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f389560a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final xw0 f389561b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final df.a<AdResponse<bl0>> f389562c;

    public rk0(@j.N Context context, @j.N df.a<AdResponse<bl0>> aVar) {
        this.f389560a = context;
        this.f389562c = aVar;
        yw0.a();
        this.f389561b = new xw0();
    }

    @j.N
    public final qk0 a(@j.N az0<bl0> az0Var, @j.N n2 n2Var, @j.N NativeAdRequestConfiguration nativeAdRequestConfiguration, @j.N String str, @j.N String str2) {
        this.f389561b.getClass();
        nativeAdRequestConfiguration.getClass();
        return new qk0(this.f389560a, az0Var, n2Var, str, str2, this.f389562c);
    }
}
