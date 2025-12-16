package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class ui1 {
    @Y61.k
    public static ti1 a(@Y61.k Context context, @Y61.k ff1 ff1Var, @Y61.k EnumC39381y1 enumC39381y1) {
        pi1 pi1Var = new pi1(context);
        jh1 jh1Var = new jh1(context);
        zk zkVar = new zk();
        zkVar.a(new rm(ff1Var.a(), pi1Var, jh1Var));
        zkVar.a(new sg1(ff1Var.e(), pi1Var));
        fe1 fe1VarA = new ge1().a(context, ff1Var, enumC39381y1, pi1Var);
        if (fe1VarA != null) {
            zkVar.a(fe1VarA);
        }
        return new ti1(zkVar);
    }
}
