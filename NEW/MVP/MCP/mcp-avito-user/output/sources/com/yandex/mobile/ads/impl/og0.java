package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes8.dex */
final class og0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f388509a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39304a2 f388510b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final v40 f388511c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final h50 f388512d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final l50 f388513e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final qe1 f388514f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final HashMap f388515g = new HashMap();

    public og0(@j.N Context context, @j.N C39304a2 c39304a2, @j.N v40 v40Var, @j.N h50 h50Var, @j.N l50 l50Var, @j.N re1 re1Var) {
        this.f388509a = context.getApplicationContext();
        this.f388510b = c39304a2;
        this.f388511c = v40Var;
        this.f388512d = h50Var;
        this.f388513e = l50Var;
        this.f388514f = re1Var;
    }

    @j.N
    public final C39375w1 a(@j.N p60 p60Var) {
        C39375w1 c39375w1 = (C39375w1) this.f388515g.get(p60Var);
        if (c39375w1 != null) {
            return c39375w1;
        }
        C39375w1 c39375w12 = new C39375w1(this.f388509a, p60Var, this.f388511c, this.f388512d, this.f388513e, this.f388510b);
        c39375w12.a(this.f388514f);
        this.f388515g.put(p60Var, c39375w12);
        return c39375w12;
    }
}
