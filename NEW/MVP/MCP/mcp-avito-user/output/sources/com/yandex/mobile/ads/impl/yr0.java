package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.MediationData;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes8.dex */
public final class yr0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final String f392058a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final MediationData f392059b;

    public yr0(@Y61.l String str, @Y61.k MediationData mediationData) {
        this.f392058a = str;
        this.f392059b = mediationData;
    }

    @Y61.k
    public final Map<String, String> a() {
        String str = this.f392058a;
        return (str == null || str.length() == 0) ? this.f392059b.d() : kotlin.collections.P0.k(this.f392059b.d(), Collections.singletonMap("adf-resp_time", this.f392058a));
    }
}
