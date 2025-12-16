package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.Location;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
class Pc {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private c f379168a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private a f379169b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private b f379170c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private Context f379171d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private C38976mc f379172e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private Rc f379173f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private Sc f379174g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private Rb f379175h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final C39242xc f379176i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private Yb f379177j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private Map<String, C39266yc> f379178k;

    public static class a {
    }

    public static class b {
    }

    public static class c {
    }

    public Pc(@j.N Context context, @j.P C38976mc c38976mc, @j.N Sc sc2, @j.N Rb rb2, @j.P Ph ph2) {
        this(context, c38976mc, new c(), new C39242xc(ph2), new a(), new b(), sc2, rb2);
    }

    public void a(@j.N Location location) {
        String provider = location.getProvider();
        C39266yc c39266yc = this.f379178k.get(provider);
        if (c39266yc == null) {
            if (this.f379173f == null) {
                c cVar = this.f379168a;
                Context context = this.f379171d;
                cVar.getClass();
                this.f379173f = new Rc(null, C38899ja.a(context).f(), new Vb(context), new com.yandex.metrica.coreutils.services.e(), F0.g().c(), F0.g().b());
            }
            if (this.f379177j == null) {
                a aVar = this.f379169b;
                Rc rc2 = this.f379173f;
                C39242xc c39242xc = this.f379176i;
                aVar.getClass();
                this.f379177j = new Yb(rc2, c39242xc);
            }
            b bVar = this.f379170c;
            C38976mc c38976mc = this.f379172e;
            Yb yb2 = this.f379177j;
            Sc sc2 = this.f379174g;
            Rb rb2 = this.f379175h;
            bVar.getClass();
            c39266yc = new C39266yc(c38976mc, yb2, null, 0L, new C39232x2(), sc2, rb2);
            this.f379178k.put(provider, c39266yc);
        } else {
            c39266yc.a(this.f379172e);
        }
        c39266yc.a(location);
    }

    @j.N
    public C39242xc b() {
        return this.f379176i;
    }

    @j.k0
    public Pc(@j.N Context context, @j.P C38976mc c38976mc, @j.N c cVar, @j.N C39242xc c39242xc, @j.N a aVar, @j.N b bVar, @j.N Sc sc2, @j.N Rb rb2) {
        this.f379178k = new HashMap();
        this.f379171d = context;
        this.f379172e = c38976mc;
        this.f379168a = cVar;
        this.f379176i = c39242xc;
        this.f379169b = aVar;
        this.f379170c = bVar;
        this.f379174g = sc2;
        this.f379175h = rb2;
    }

    @j.P
    public Location a() {
        return this.f379176i.a();
    }

    public void a(@j.P C38976mc c38976mc) {
        this.f379172e = c38976mc;
    }

    public void a(@j.N C39057pi c39057pi) {
        if (c39057pi.d() != null) {
            this.f379176i.c(c39057pi.d());
        }
    }
}
