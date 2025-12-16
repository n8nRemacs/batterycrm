package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* loaded from: classes8.dex */
public final class rd {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ko1 f389487a;

    public rd(@Y61.k ko1 ko1Var) {
        this.f389487a = ko1Var;
    }

    @Y61.k
    public final vd a(@Y61.k AdResponse<String> adResponse) {
        MediationData mediationDataZ = adResponse.z();
        return mediationDataZ != null ? new ve0(adResponse, mediationDataZ) : xl.f391761b == adResponse.u() ? new do1(this.f389487a) : new dn1(this.f389487a);
    }
}
