package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;

/* loaded from: classes8.dex */
public final class dl0 {
    @Y61.k
    public static vl0 a(@Y61.k AdResponse adResponse) {
        MediationData mediationDataZ = adResponse.z();
        return mediationDataZ != null ? new nf0(adResponse, mediationDataZ) : new fo1();
    }
}
