package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class ln0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ot f387585a;

    public ln0(@j.N Context context, @j.N AdResponse adResponse, @j.N n2 n2Var) {
        this.f387585a = new ot(context, adResponse, n2Var);
    }

    @j.N
    public final du a(@j.N ff1 ff1Var) {
        du duVarA = au.a().a(ff1Var);
        if (duVarA != null && !duVarA.g()) {
            return duVarA;
        }
        du duVarA2 = this.f387585a.a();
        au.a().a(ff1Var, duVarA2);
        return duVarA2;
    }
}
