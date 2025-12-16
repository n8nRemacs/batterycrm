package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
final class vs0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f390997a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final v40 f390998b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.instream.e f390999c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final l50 f391000d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final h50 f391001e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.instream.d f391002f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final C39308b2 f391003g;

    public vs0(@j.N Context context, @j.N v40 v40Var, @j.N com.yandex.mobile.ads.instream.e eVar, @j.N com.yandex.mobile.ads.instream.d dVar, @j.N l50 l50Var, @j.N a50 a50Var) {
        Context applicationContext = context.getApplicationContext();
        this.f390997a = applicationContext;
        this.f390998b = v40Var;
        this.f390999c = eVar;
        this.f391000d = l50Var;
        this.f391002f = dVar;
        this.f391001e = new h50(applicationContext, l50Var, eVar, v40Var);
        this.f391003g = new C39308b2(a50Var);
    }

    @j.N
    public final f41 a(@j.N p60 p60Var) {
        return new f41(this.f390997a, p60Var, this.f390998b, this.f391001e, this.f391000d, this.f391003g.a());
    }

    @j.N
    public final pg0 a(@j.N y40 y40Var) {
        return new pg0(this.f390997a, y40Var, this.f391003g.a(), this.f390998b, this.f391001e, this.f391000d, this.f390999c, this.f391002f);
    }
}
