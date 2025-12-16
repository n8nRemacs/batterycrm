package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.za, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39288za {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39144ta<Ud> f382309a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39144ta<C39185v3> f382310b;

    public C39288za(@j.N Context context) {
        this(context, new C39168ua());
    }

    public void a(@j.N C39057pi c39057pi) {
        this.f382309a.a(F0.g().k().a(), c39057pi.l());
        this.f382310b.a(F0.g().d().a(), c39057pi.l());
    }

    @j.k0
    public C39288za(@j.N Context context, @j.N C39168ua c39168ua) {
        this.f382309a = c39168ua.c(context, C38812fm.c());
        this.f382310b = c39168ua.b(context, C38812fm.c());
    }
}
