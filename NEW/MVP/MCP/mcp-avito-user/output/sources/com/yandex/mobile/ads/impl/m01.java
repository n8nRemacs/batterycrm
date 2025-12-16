package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class m01 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final zv0 f387790a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f387791b;

    public m01(@Y61.k Context context, @Y61.k zv0 zv0Var) {
        this.f387790a = zv0Var;
        this.f387791b = context.getApplicationContext();
    }

    @Y61.k
    public final l01 a(@Y61.k f01 f01Var) {
        return new l01(this.f387791b, f01Var, this.f387790a);
    }

    public /* synthetic */ m01(Context context) {
        this(context, new zv0());
    }
}
