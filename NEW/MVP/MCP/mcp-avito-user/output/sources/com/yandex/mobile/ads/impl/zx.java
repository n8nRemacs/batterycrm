package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.base.AdResultReceiver;

/* loaded from: classes8.dex */
public final class zx {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final yx f392403a;

    @X41.j
    public zx(lo1 lo1Var, @Y61.k int i12) {
        this(lo1Var);
    }

    public final void a(@Y61.k Context context, @Y61.k C39357q0 c39357q0, @Y61.k AdResultReceiver adResultReceiver) {
        long jA2 = f20.a();
        Intent intentA = this.f392403a.a(context, jA2, adResultReceiver);
        C39359r0 c39359r0A = C39359r0.a();
        c39359r0A.a(jA2, c39357q0);
        try {
            context.startActivity(intentA);
        } catch (Exception e12) {
            c39359r0A.a(jA2);
            h70.a("Failed to show Interstitial Ad. Exception: " + e12, new Object[0]);
        }
    }

    @X41.j
    public zx(@Y61.k lo1 lo1Var, @Y61.k yx yxVar) {
        this.f392403a = yxVar;
    }

    public /* synthetic */ zx(lo1 lo1Var) {
        this(lo1Var, new yx(lo1Var));
    }
}
