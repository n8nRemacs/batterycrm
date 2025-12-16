package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class ta implements ay<sa> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Context f390136a;

    public ta(@Y61.k Context context) {
        this.f390136a = context;
    }

    @Override // com.yandex.mobile.ads.impl.ay
    public final fy a(AdResponse adResponse, n2 n2Var, lx lxVar) {
        return new sa(this.f390136a, adResponse, n2Var, lxVar);
    }
}
