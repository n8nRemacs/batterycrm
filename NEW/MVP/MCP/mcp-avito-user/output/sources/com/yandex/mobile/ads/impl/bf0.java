package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* loaded from: classes8.dex */
final class bf0 implements mx {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResponse<String> f383945a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final MediationData f383946b;

    public bf0(@j.N AdResponse<String> adResponse, @j.N MediationData mediationData) {
        this.f383945a = adResponse;
        this.f383946b = mediationData;
    }

    @Override // com.yandex.mobile.ads.impl.mx
    @j.N
    public final lx<q70> a(@j.N rx<q70> rxVar) {
        return new gf0(rxVar, this.f383945a, this.f383946b);
    }

    @Override // com.yandex.mobile.ads.impl.mx
    @j.N
    public final lx<f01> b(@j.N rx<f01> rxVar) {
        return new qf0(rxVar, this.f383945a, this.f383946b);
    }

    @Override // com.yandex.mobile.ads.impl.mx
    @j.N
    public final lx<sa> c(@j.N rx<sa> rxVar) {
        return new gf0(rxVar, this.f383945a, this.f383946b);
    }
}
