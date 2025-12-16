package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.qm0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
final class tn0 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final on0 f390242b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final a4 f390243c;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Object f390241a = new Object();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final go0 f390244d = new go0();

    public interface a {
    }

    public static class b implements zg1 {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final AtomicInteger f390245a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final a4 f390246b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final a f390247c;

        /* renamed from: d, reason: collision with root package name */
        @j.N
        private final pn f390248d;

        public b(@j.N a4 a4Var, int i12, @j.N qm0.b bVar, @j.N qn qnVar) {
            this.f390245a = new AtomicInteger(i12);
            this.f390246b = a4Var;
            this.f390247c = bVar;
            this.f390248d = qnVar;
        }

        @Override // com.yandex.mobile.ads.impl.zg1
        public final void a() {
            if (this.f390245a.decrementAndGet() == 0) {
                this.f390246b.a(z3.f392169i);
                ((qm0.b) this.f390247c).c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.zg1
        public final void b() {
            if (this.f390245a.getAndSet(0) > 0) {
                this.f390246b.a(z3.f392169i);
                this.f390248d.a(on.f388591e);
                ((qm0.b) this.f390247c).c();
            }
        }
    }

    public tn0(@j.N Context context, @j.N a4 a4Var) {
        this.f390242b = new on0(context);
        this.f390243c = a4Var;
    }

    public final void a(@j.N uj0 uj0Var, @j.N qm0.b bVar, @j.N qn qnVar) {
        synchronized (this.f390241a) {
            try {
                boolean zJ2 = uj0Var.b().J();
                bl0 bl0VarC = uj0Var.c();
                this.f390244d.getClass();
                HashSet hashSetA = go0.a(bl0VarC);
                if (!zJ2 || hashSetA.size() == 0) {
                    bVar.c();
                } else {
                    b bVar2 = new b(this.f390243c, hashSetA.size(), bVar, qnVar);
                    this.f390243c.b(z3.f392169i);
                    Iterator it = hashSetA.iterator();
                    while (it.hasNext()) {
                        this.f390242b.a((String) it.next(), bVar2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        synchronized (this.f390241a) {
            this.f390242b.a();
        }
    }
}
