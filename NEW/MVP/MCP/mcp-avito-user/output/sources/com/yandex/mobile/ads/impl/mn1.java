package com.yandex.mobile.ads.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes8.dex */
public final class mn1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final f11 f388041a;

    public mn1(@Y61.k f11 f11Var) {
        this.f388041a = f11Var;
    }

    @Y61.k
    public final nn1 a(@Y61.k Context context) {
        String strA = e9.a().a(context);
        SSLSocketFactory sSLSocketFactoryA = this.f388041a.a(context);
        v11 v11VarA = q21.b().a(context);
        return new nn1(strA, sSLSocketFactoryA, v11VarA != null && v11VarA.e0());
    }

    public /* synthetic */ mn1() {
        this(e11.a());
    }
}
