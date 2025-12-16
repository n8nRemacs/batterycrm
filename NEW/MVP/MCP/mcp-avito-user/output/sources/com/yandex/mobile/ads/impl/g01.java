package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class g01 implements ay<f01> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f385545a;

    public g01(@Y61.k Context context) {
        this.f385545a = context;
    }

    @Override // com.yandex.mobile.ads.impl.ay
    public final fy a(AdResponse adResponse, n2 n2Var, lx lxVar) {
        return new f01(this.f385545a, adResponse, n2Var, lxVar);
    }
}
