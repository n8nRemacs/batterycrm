package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* loaded from: classes8.dex */
final class ve0 implements vd {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResponse<String> f390857a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final MediationData f390858b;

    public ve0(@j.N AdResponse<String> adResponse, @j.N MediationData mediationData) {
        this.f390857a = adResponse;
        this.f390858b = mediationData;
    }

    @Override // com.yandex.mobile.ads.impl.vd
    @j.N
    public final ud a(@j.N com.yandex.mobile.ads.banner.f fVar) {
        return new ue0(fVar, this.f390857a, this.f390858b);
    }
}
