package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class tj {
    @j.N
    public static hx a(@j.N AdResponse adResponse, @j.N wj wjVar, @j.N om0 om0Var, @j.N f91 f91Var) {
        sn0 sn0VarA = om0Var.a();
        ro0 ro0VarB = om0Var.b();
        return sn0VarA != null ? new qn0(adResponse, sn0VarA, wjVar, f91Var) : ro0VarB != null ? new po0(ro0VarB, wjVar) : new xl0(adResponse, wjVar, f91Var);
    }
}
