package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.X5;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public abstract class R5 implements U5<W5> {

    /* renamed from: a, reason: collision with root package name */
    private final L3 f379283a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38671a6 f379284b;

    /* renamed from: c, reason: collision with root package name */
    private final C38771e6 f379285c;

    /* renamed from: d, reason: collision with root package name */
    private final Z5 f379286d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final M0 f379287e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.e f379288f;

    public R5(@j.N L3 l32, @j.N C38671a6 c38671a6, @j.N C38771e6 c38771e6, @j.N Z5 z52, @j.N M0 m02, @j.N com.yandex.metrica.coreutils.services.e eVar) {
        this.f379283a = l32;
        this.f379284b = c38671a6;
        this.f379285c = c38771e6;
        this.f379286d = z52;
        this.f379287e = m02;
        this.f379288f = eVar;
    }

    @j.N
    public V5 a(@j.N Object obj) {
        W5 w52 = (W5) obj;
        if (this.f379285c.h()) {
            this.f379287e.reportEvent("create session with non-empty storage");
        }
        L3 l32 = this.f379283a;
        C38771e6 c38771e6 = this.f379285c;
        long jA2 = this.f379284b.a();
        C38771e6 c38771e6D = this.f379285c.d(jA2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c38771e6D.e(timeUnit.toSeconds(w52.f379804a)).a(w52.f379804a).c(0L).a(true).b();
        this.f379283a.i().a(jA2, this.f379286d.b(), timeUnit.toSeconds(w52.f379805b));
        return new V5(l32, c38771e6, a(), new com.yandex.metrica.coreutils.services.e());
    }

    @j.P
    public final V5 b() {
        if (this.f379285c.h()) {
            return new V5(this.f379283a, this.f379285c, a(), this.f379288f);
        }
        return null;
    }

    @j.N
    @j.k0
    public X5 a() {
        X5.b bVarD = new X5.b(this.f379286d).a(this.f379285c.i()).b(this.f379285c.e()).a(this.f379285c.c()).c(this.f379285c.f()).d(this.f379285c.g());
        bVarD.f379860a = this.f379285c.d();
        return new X5(bVarD);
    }
}
