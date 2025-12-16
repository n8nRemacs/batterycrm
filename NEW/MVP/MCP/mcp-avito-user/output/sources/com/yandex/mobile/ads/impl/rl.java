package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class rl {
    @j.N
    public static hx a(@j.N AdResponse adResponse, @j.N k2 k2Var, @j.N om0 om0Var, @j.N f91 f91Var) {
        sn0 sn0VarA = om0Var.a();
        ro0 ro0VarB = om0Var.b();
        return sn0VarA != null ? new rn0(adResponse, sn0VarA, k2Var) : ro0VarB != null ? new qo0(ro0VarB, k2Var) : new zl0(k2Var, f91Var);
    }
}
