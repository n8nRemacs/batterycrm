package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class r70 implements ay<q70> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f389434a;

    public r70(@Y61.k Context context) {
        this.f389434a = context;
    }

    @Override // com.yandex.mobile.ads.impl.ay
    public final fy a(AdResponse adResponse, n2 n2Var, lx lxVar) {
        return new q70(this.f389434a, adResponse, n2Var, lxVar);
    }
}
