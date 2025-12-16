package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* loaded from: classes8.dex */
final class nf0 implements vl0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResponse<bl0> f388265a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final MediationData f388266b;

    public nf0(@j.N AdResponse<bl0> adResponse, @j.N MediationData mediationData) {
        this.f388265a = adResponse;
        this.f388266b = mediationData;
    }

    @Override // com.yandex.mobile.ads.impl.vl0
    @j.N
    public final ul0 a(@j.N com.yandex.mobile.ads.nativeads.o oVar) {
        return new mf0(oVar, this.f388265a, this.f388266b);
    }
}
