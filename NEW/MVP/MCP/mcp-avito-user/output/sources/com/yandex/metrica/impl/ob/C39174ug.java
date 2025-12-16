package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39126sg;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ug, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39174ug implements C39126sg.a {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Set<InterfaceC38731cg> f381964a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f381965b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private C38756dg f381966c;

    public C39174ug() {
        this(F0.g().m());
    }

    @Override // com.yandex.metrica.impl.ob.C39126sg.a
    public synchronized void a(@j.P C38756dg c38756dg) {
        try {
            this.f381966c = c38756dg;
            this.f381965b = true;
            Iterator<InterfaceC38731cg> it = this.f381964a.iterator();
            while (it.hasNext()) {
                it.next().a(this.f381966c);
            }
            this.f381964a.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @j.k0
    public C39174ug(@j.N C39126sg c39126sg) {
        this.f381964a = new HashSet();
        c39126sg.a(new C39270yg(this));
        c39126sg.b();
    }

    public synchronized void a(@j.N InterfaceC38731cg interfaceC38731cg) {
        this.f381964a.add(interfaceC38731cg);
        if (this.f381965b) {
            interfaceC38731cg.a(this.f381966c);
            this.f381964a.remove(interfaceC38731cg);
        }
    }
}
