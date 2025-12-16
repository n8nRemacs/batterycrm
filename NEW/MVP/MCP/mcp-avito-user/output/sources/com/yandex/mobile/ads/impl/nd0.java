package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ch;
import com.yandex.mobile.ads.impl.nv0;
import com.yandex.mobile.ads.impl.po;
import com.yandex.mobile.ads.impl.rg;
import com.yandex.mobile.ads.impl.xc0;

/* loaded from: classes8.dex */
public final class nd0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f388222a;

    public nd0(@j.N Context context) {
        this.f388222a = context.getApplicationContext();
    }

    @j.N
    public final nv0 a(@j.N sf1 sf1Var) {
        nv0.a aVar = new nv0.a(new ch.b().a(yt.a().a(this.f388222a)).a(new po.a(this.f388222a, new mn1(e11.a()).a(this.f388222a))), new uo());
        String url = sf1Var.getUrl();
        rg.a<xc0> aVar2 = xc0.f391604g;
        return aVar.a(new xc0.a().c(url).a());
    }
}
