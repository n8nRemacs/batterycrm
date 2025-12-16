package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C39057pi;
import com.yandex.metrica.impl.ob.C39205w;
import com.yandex.metrica.impl.ob.E;
import j.InterfaceC42148d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.qc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39075qc implements E.c, C39205w.b {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private List<C39026oc> f381456a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final E f381457b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39194vc f381458c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39205w f381459d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private volatile C38976mc f381460e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final Set<InterfaceC39001nc> f381461f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f381462g;

    public C39075qc(@j.N Context context) {
        this(F0.g().c(), C39194vc.a(context), new C39057pi.b(context), F0.g().b());
    }

    @InterfaceC42148d
    private void d() {
        C38976mc c38976mcA = a();
        if (A2.a(this.f381460e, c38976mcA)) {
            return;
        }
        this.f381458c.a(c38976mcA);
        this.f381460e = c38976mcA;
        C38976mc c38976mc = this.f381460e;
        Iterator<InterfaceC39001nc> it = this.f381461f.iterator();
        while (it.hasNext()) {
            it.next().a(c38976mc);
        }
    }

    @InterfaceC42148d
    public synchronized void a(@j.N InterfaceC39001nc interfaceC39001nc) {
        this.f381461f.add(interfaceC39001nc);
    }

    public void b() {
        synchronized (this.f381462g) {
            this.f381457b.a(this);
            this.f381459d.a(this);
        }
    }

    public synchronized void c() {
        d();
    }

    @InterfaceC42148d
    public synchronized void a(@j.N C39057pi c39057pi) {
        this.f381456a = c39057pi.w();
        this.f381460e = a();
        this.f381458c.a(c39057pi, this.f381460e);
        C38976mc c38976mc = this.f381460e;
        Iterator<InterfaceC39001nc> it = this.f381461f.iterator();
        while (it.hasNext()) {
            it.next().a(c38976mc);
        }
    }

    @j.k0
    public C39075qc(@j.N E e12, @j.N C39194vc c39194vc, @j.N C39057pi.b bVar, @j.N C39205w c39205w) {
        this.f381461f = new HashSet();
        this.f381462g = new Object();
        this.f381457b = e12;
        this.f381458c = c39194vc;
        this.f381459d = c39205w;
        this.f381456a = bVar.a().w();
    }

    @Override // com.yandex.metrica.impl.ob.C39205w.b
    public synchronized void a(@j.N C39205w.a aVar) {
        d();
    }

    @Override // com.yandex.metrica.impl.ob.E.c
    public synchronized void a(@j.N E.b.a aVar) {
        d();
    }

    @j.P
    private C38976mc a() {
        C39205w.a aVarC = this.f381459d.c();
        E.b.a aVarB = this.f381457b.b();
        for (C39026oc c39026oc : this.f381456a) {
            if (c39026oc.f381240b.f377769a.contains(aVarB) && c39026oc.f381240b.f377770b.contains(aVarC)) {
                return c39026oc.f381239a;
            }
        }
        return null;
    }
}
