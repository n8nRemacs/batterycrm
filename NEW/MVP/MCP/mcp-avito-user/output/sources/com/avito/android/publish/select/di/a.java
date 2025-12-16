package com.avito.android.publish.select.di;

import Jj.C14204c;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.Q1;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC33878l;
import com.avito.android.publish.analytics.C33536w;
import com.avito.android.publish.details.S0;
import com.avito.android.publish.details.U0;
import com.avito.android.publish.select.SelectFragment;
import com.avito.android.publish.select.di.b;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;

/* compiled from: DaggerSelectComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerSelectComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.publish.select.di.b.a
        public final com.avito.android.publish.select.di.b a(l lVar, InterfaceC39417a interfaceC39417a, int i12) {
            interfaceC39417a.getClass();
            return new c(new com.avito.android.publish.select.di.c(), lVar, interfaceC39417a, Integer.valueOf(i12), null);
        }
    }

    /* compiled from: DaggerSelectComponent.java */
    public static final class c implements com.avito.android.publish.select.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f242654a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f242655b;

        /* renamed from: c, reason: collision with root package name */
        public final u<C0> f242656c;

        /* renamed from: d, reason: collision with root package name */
        public final u<S0> f242657d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.publish.select.h> f242658e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.checkable.d> f242659f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.checkable.a> f242660g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.select.title.b> f242661h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.select.title.f> f242662i;

        /* renamed from: j, reason: collision with root package name */
        public final u<AK0.l> f242663j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f242664k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.header.e> f242665l;

        /* renamed from: m, reason: collision with root package name */
        public final u<Q1> f242666m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.header.b> f242667n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f242668o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f242669p;

        /* renamed from: q, reason: collision with root package name */
        public final u<RecyclerView.Adapter<?>> f242670q;

        /* renamed from: r, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f242671r;

        /* compiled from: DaggerSelectComponent.java */
        /* renamed from: com.avito.android.publish.select.di.a$c$a, reason: collision with other inner class name */
        public static final class C7278a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f242672a;

            public C7278a(l lVar) {
                this.f242672a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f242672a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerSelectComponent.java */
        public static final class b implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final l f242673a;

            public b(l lVar) {
                this.f242673a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f242673a.r();
            }
        }

        /* compiled from: DaggerSelectComponent.java */
        /* renamed from: com.avito.android.publish.select.di.a$c$c, reason: collision with other inner class name */
        public static final class C7279c implements u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final l f242674a;

            public C7279c(l lVar) {
                this.f242674a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f242674a.z0();
            }
        }

        /* compiled from: DaggerSelectComponent.java */
        public static final class d implements u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final l f242675a;

            public d(l lVar) {
                this.f242675a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C0 c0U = this.f242675a.u();
                t.c(c0U);
                return c0U;
            }
        }

        public c(com.avito.android.publish.select.di.c cVar, l lVar, cv.b bVar, Integer num, C7277a c7277a) {
            this.f242654a = lVar;
            this.f242655b = bVar;
            this.f242656c = new d(lVar);
            u<S0> uVarD = dagger.internal.g.d(new U0(dagger.internal.l.a(num), this.f242656c));
            this.f242657d = uVarD;
            this.f242658e = dagger.internal.g.d(new com.avito.android.publish.select.j(uVarD, uVarD));
            u<com.avito.android.blueprints.publish.checkable.d> uVarD2 = dagger.internal.g.d(new g(cVar));
            this.f242659f = uVarD2;
            this.f242660g = dagger.internal.g.d(new f(cVar, uVarD2));
            u<com.avito.android.select.title.b> uVarD3 = dagger.internal.g.d(new j(cVar));
            this.f242661h = uVarD3;
            this.f242662i = dagger.internal.g.d(new k(cVar, uVarD3));
            u<com.avito.android.blueprints.publish.header.e> uVarD4 = dagger.internal.g.d(new com.avito.android.blueprints.publish.header.i(new C14204c(new b(lVar)), new C7278a(lVar)));
            this.f242665l = uVarD4;
            u<com.avito.android.blueprints.publish.header.b> uVarD5 = dagger.internal.g.d(new com.avito.android.blueprints.publish.header.d(uVarD4, new C7279c(lVar)));
            this.f242667n = uVarD5;
            u<com.avito.konveyor.a> uVarD6 = dagger.internal.g.d(new h(cVar, this.f242660g, this.f242662i, uVarD5));
            this.f242668o = uVarD6;
            u<com.avito.konveyor.adapter.a> uVarD7 = dagger.internal.g.d(new e(cVar, uVarD6));
            this.f242669p = uVarD7;
            this.f242670q = dagger.internal.g.d(new com.avito.android.publish.select.di.d(cVar, uVarD7, this.f242668o));
            this.f242671r = dagger.internal.g.d(new i(cVar, this.f242659f, this.f242665l));
        }

        @Override // com.avito.android.publish.select.di.b
        public final void a(SelectFragment selectFragment) {
            l lVar = this.f242654a;
            InterfaceC35745a5 interfaceC35745a5D = lVar.d();
            t.c(interfaceC35745a5D);
            C33536w c33536wP = lVar.P();
            InterfaceC33878l interfaceC33878lQ1 = lVar.Q1();
            t.c(interfaceC33878lQ1);
            cv.b bVar = this.f242655b;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            t.c(aVarU4);
            S0 s02 = this.f242657d.get();
            com.avito.android.publish.select.h hVar = this.f242658e.get();
            C0 c0U = lVar.u();
            t.c(c0U);
            selectFragment.f242623n0 = new com.avito.android.publish.select.t(interfaceC35745a5D, c33536wP, interfaceC33878lQ1, aVarU4, s02, hVar, c0U);
            selectFragment.f242624o0 = this.f242670q.get();
            selectFragment.f242625p0 = this.f242669p.get();
            selectFragment.f242626q0 = this.f242671r.get();
            com.avito.android.deeplink_handler.view.d dVarC = bVar.c();
            t.c(dVarC);
            selectFragment.f242627r0 = dVarC;
            C0 c0U2 = lVar.u();
            t.c(c0U2);
            selectFragment.f242628s0 = c0U2;
        }
    }

    public static b.a a() {
        return new b();
    }
}
