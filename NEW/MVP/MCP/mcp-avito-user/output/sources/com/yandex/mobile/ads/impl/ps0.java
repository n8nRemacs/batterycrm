package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.df;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class ps0 extends df<zo0> {

    /* renamed from: r, reason: collision with root package name */
    private static final int f388941r = (int) TimeUnit.SECONDS.toMillis(10);

    public ps0(@j.N Context context, @j.N String str, @j.N df.a<zo0> aVar) {
        super(0, str, aVar);
        a(context);
    }

    private void a(@j.N Context context) {
        Integer numS;
        v11 v11VarA = q21.b().a(context);
        a(new hp(1.0f, f388941r, (v11VarA == null || (numS = v11VarA.s()) == null) ? 0 : numS.intValue()));
    }

    @Override // com.yandex.mobile.ads.impl.qy0
    public final kz0<zo0> a(zo0 zo0Var) {
        return kz0.a(zo0Var, j10.a(zo0Var));
    }
}
