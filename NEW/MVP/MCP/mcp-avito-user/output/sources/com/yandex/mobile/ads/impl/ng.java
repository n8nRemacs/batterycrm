package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.ResultReceiver;

/* loaded from: classes8.dex */
public final class ng {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final mg f388273a;

    @X41.j
    public ng(lo1 lo1Var, @Y61.k int i12) {
        this(lo1Var);
    }

    public final void a(@Y61.k Context context, @Y61.k ResultReceiver resultReceiver, @Y61.k String str) {
        try {
            context.startActivity(this.f388273a.a(context, resultReceiver, str));
        } catch (Exception e12) {
            e12.toString();
        }
    }

    @X41.j
    public ng(@Y61.k lo1 lo1Var, @Y61.k mg mgVar) {
        this.f388273a = mgVar;
    }

    public /* synthetic */ ng(lo1 lo1Var) {
        this(lo1Var, new mg(lo1Var));
    }
}
