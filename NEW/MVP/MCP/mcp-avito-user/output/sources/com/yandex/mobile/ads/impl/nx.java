package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* loaded from: classes8.dex */
public final class nx {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ko1 f388399a;

    public nx(@Y61.k ko1 ko1Var) {
        this.f388399a = ko1Var;
    }

    @Y61.k
    public final mx a(@Y61.k AdResponse<String> adResponse) {
        MediationData mediationDataZ = adResponse.z();
        return mediationDataZ != null ? new bf0(adResponse, mediationDataZ) : xl.f391761b == adResponse.u() ? new go1(this.f388399a) : new vn1(this.f388399a);
    }
}
