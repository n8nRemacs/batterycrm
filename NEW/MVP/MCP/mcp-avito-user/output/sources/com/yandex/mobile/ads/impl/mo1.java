package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.ns0;
import java.util.List;

/* loaded from: classes8.dex */
public final class mo1 implements na1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final pp0 f388051a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ns0 f388052b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final x30 f388053c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final rx0 f388054d;

    public mo1(@j.N pp0 pp0Var, @j.N rx0 rx0Var, @j.N x30 x30Var, @j.N ns0 ns0Var) {
        this.f388051a = pp0Var;
        this.f388054d = rx0Var;
        this.f388053c = x30Var;
        this.f388052b = ns0Var;
    }

    @Override // com.yandex.mobile.ads.impl.na1
    public final void a(@j.N Context context, @j.N ns0.a aVar, @j.P com.yandex.mobile.ads.nativeads.w wVar) {
        this.f388054d.b();
        this.f388051a.b();
        this.f388052b.a(context, aVar);
        if (wVar != null) {
            this.f388053c.a(context, wVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.na1
    public final void a(@j.N Context context, @j.N ns0.a aVar) {
        this.f388054d.c();
        this.f388051a.a();
        this.f388052b.b(context, aVar);
        this.f388053c.a();
    }

    @Override // com.yandex.mobile.ads.impl.na1
    public final void a(@j.N AdResponse adResponse, @j.N List<q31> list) {
        this.f388051a.a(adResponse, list);
    }

    @Override // com.yandex.mobile.ads.impl.na1
    public final void a(@j.N com.yandex.mobile.ads.nativeads.w wVar) {
        this.f388053c.a(wVar);
    }

    @Override // com.yandex.mobile.ads.impl.na1
    public final void a(@j.N n30 n30Var) {
        this.f388051a.a(n30Var);
    }

    @Override // com.yandex.mobile.ads.impl.na1
    public final void a(@j.N tm0 tm0Var) {
        this.f388054d.a(tm0Var);
    }
}
