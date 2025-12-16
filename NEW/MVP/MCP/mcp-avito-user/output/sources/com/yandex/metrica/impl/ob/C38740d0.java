package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.d0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38740d0 extends B {

    /* renamed from: p, reason: collision with root package name */
    @j.N
    private final C38995n6 f380353p;

    /* renamed from: q, reason: collision with root package name */
    @j.N
    private final C39188v6 f380354q;

    public C38740d0(@j.N Context context, @j.N A3 a32, @j.N com.yandex.metrica.j jVar, @j.N T1 t12) {
        this(context, a32, jVar, t12, new A0(context));
    }

    @Override // com.yandex.metrica.impl.ob.B, com.yandex.metrica.impl.ob.R0
    public void a(@j.N H6 h62) {
        this.f380353p.a(this.f380354q.a(h62, this.f377793b));
        b(h62);
    }

    private C38740d0(@j.N Context context, @j.N A3 a32, @j.N com.yandex.metrica.j jVar, @j.N T1 t12, @j.N A0 a02) {
        this(context, t12, new Q1(a32, new CounterConfiguration(jVar, CounterConfiguration.b.CRASH), jVar.userProfileID), a02, new C38995n6(context), new C39188v6(), P.g().j(), new Ug(), new Yg(null, null), new X6(), new S6(), new M6(), new K6(), new C39116s6(a02));
    }

    @j.k0
    public C38740d0(@j.N Context context, @j.N T1 t12, @j.N Q1 q12, @j.N A0 a02, @j.N C38995n6 c38995n6, @j.N C39188v6 c39188v6, @j.N InterfaceC38712bm interfaceC38712bm, @j.N com.yandex.metrica.rtm.wrapper.d dVar, @j.N Yg yg2, @j.N X6 x62, @j.N S6 s62, @j.N M6 m62, @j.N K6 k62, @j.N C39116s6 c39116s6) {
        super(context, t12, q12, a02, interfaceC38712bm, dVar, yg2, x62, s62, m62, k62, c39116s6);
        this.f380353p = c38995n6;
        this.f380354q = c39188v6;
    }
}
