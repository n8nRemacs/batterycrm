package com.avito.android.publish.screen.step.select.di;

import Jj.C14204c;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.Q1;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC33878l;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.S0;
import com.avito.android.publish.details.U0;
import com.avito.android.publish.screen.step.select.SelectFragment;
import com.avito.android.publish.screen.step.select.di.b;
import com.avito.android.publish.screen.step.select.m;
import com.avito.android.publish.screen.step.select.mvi.n;
import com.avito.android.publish.screen.step.select.mvi.p;
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

        @Override // com.avito.android.publish.screen.step.select.di.b.a
        public final com.avito.android.publish.screen.step.select.di.b a(com.avito.android.publish.screen.step.select.di.c cVar, InterfaceC39417a interfaceC39417a, int i12) {
            interfaceC39417a.getClass();
            return new c(new d(), cVar, interfaceC39417a, Integer.valueOf(i12), null);
        }
    }

    /* compiled from: DaggerSelectComponent.java */
    public static final class c implements com.avito.android.publish.screen.step.select.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.screen.step.select.di.c f242117a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f242118b;

        /* renamed from: c, reason: collision with root package name */
        public final u<C0> f242119c;

        /* renamed from: d, reason: collision with root package name */
        public final u<S0> f242120d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.publish.screen.step.select.loader.d> f242121e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.publish.screen.step.select.loader.a> f242122f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC33878l> f242123g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC33535v> f242124h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f242125i;

        /* renamed from: j, reason: collision with root package name */
        public final m f242126j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.checkable.d> f242127k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.checkable.a> f242128l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.select.title.b> f242129m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.select.title.f> f242130n;

        /* renamed from: o, reason: collision with root package name */
        public final u<AK0.l> f242131o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f242132p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.header.e> f242133q;

        /* renamed from: r, reason: collision with root package name */
        public final u<Q1> f242134r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.header.b> f242135s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f242136t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f242137u;

        /* renamed from: v, reason: collision with root package name */
        public final u<RecyclerView.Adapter<?>> f242138v;

        /* renamed from: w, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f242139w;

        /* compiled from: DaggerSelectComponent.java */
        /* renamed from: com.avito.android.publish.screen.step.select.di.a$c$a, reason: collision with other inner class name */
        public static final class C7255a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.select.di.c f242140a;

            public C7255a(com.avito.android.publish.screen.step.select.di.c cVar) {
                this.f242140a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f242140a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerSelectComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f242141a;

            public b(cv.b bVar) {
                this.f242141a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f242141a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSelectComponent.java */
        /* renamed from: com.avito.android.publish.screen.step.select.di.a$c$c, reason: collision with other inner class name */
        public static final class C7256c implements u<InterfaceC33878l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.select.di.c f242142a;

            public C7256c(com.avito.android.publish.screen.step.select.di.c cVar) {
                this.f242142a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC33878l interfaceC33878lQ1 = this.f242142a.Q1();
                t.c(interfaceC33878lQ1);
                return interfaceC33878lQ1;
            }
        }

        /* compiled from: DaggerSelectComponent.java */
        public static final class d implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.select.di.c f242143a;

            public d(com.avito.android.publish.screen.step.select.di.c cVar) {
                this.f242143a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f242143a.r();
            }
        }

        /* compiled from: DaggerSelectComponent.java */
        public static final class e implements u<InterfaceC33535v> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.select.di.c f242144a;

            public e(com.avito.android.publish.screen.step.select.di.c cVar) {
                this.f242144a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f242144a.P();
            }
        }

        /* compiled from: DaggerSelectComponent.java */
        public static final class f implements u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.select.di.c f242145a;

            public f(com.avito.android.publish.screen.step.select.di.c cVar) {
                this.f242145a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f242145a.z0();
            }
        }

        /* compiled from: DaggerSelectComponent.java */
        public static final class g implements u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.select.di.c f242146a;

            public g(com.avito.android.publish.screen.step.select.di.c cVar) {
                this.f242146a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C0 c0U = this.f242146a.u();
                t.c(c0U);
                return c0U;
            }
        }

        public c(com.avito.android.publish.screen.step.select.di.d dVar, com.avito.android.publish.screen.step.select.di.c cVar, cv.b bVar, Integer num, C7254a c7254a) {
            this.f242117a = cVar;
            this.f242118b = bVar;
            this.f242119c = new g(cVar);
            u<S0> uVarD = dagger.internal.g.d(new U0(dagger.internal.l.a(num), this.f242119c));
            this.f242120d = uVarD;
            u<com.avito.android.publish.screen.step.select.loader.d> uVarD2 = dagger.internal.g.d(new com.avito.android.publish.screen.step.select.loader.f(uVarD, uVarD));
            this.f242121e = uVarD2;
            u<com.avito.android.publish.screen.step.select.loader.a> uVarD3 = dagger.internal.g.d(new com.avito.android.publish.screen.step.select.loader.c(uVarD2, this.f242120d));
            this.f242122f = uVarD3;
            this.f242126j = new m(new com.avito.android.publish.screen.step.select.mvi.l(new com.avito.android.publish.screen.step.select.mvi.i(uVarD3), new com.avito.android.publish.screen.step.select.mvi.g(uVarD3, this.f242120d, this.f242119c, new C7256c(cVar), new e(cVar), new b(bVar)), n.a(), p.a()));
            u<com.avito.android.blueprints.publish.checkable.d> uVarD4 = dagger.internal.g.d(new h(dVar));
            this.f242127k = uVarD4;
            this.f242128l = dagger.internal.g.d(new com.avito.android.publish.screen.step.select.di.g(dVar, uVarD4));
            u<com.avito.android.select.title.b> uVarD5 = dagger.internal.g.d(new k(dVar));
            this.f242129m = uVarD5;
            this.f242130n = dagger.internal.g.d(new l(dVar, uVarD5));
            u<com.avito.android.blueprints.publish.header.e> uVarD6 = dagger.internal.g.d(new com.avito.android.blueprints.publish.header.i(new C14204c(new d(cVar)), new C7255a(cVar)));
            this.f242133q = uVarD6;
            u<com.avito.android.blueprints.publish.header.b> uVarD7 = dagger.internal.g.d(new com.avito.android.blueprints.publish.header.d(uVarD6, new f(cVar)));
            this.f242135s = uVarD7;
            u<com.avito.konveyor.a> uVarD8 = dagger.internal.g.d(new i(dVar, this.f242128l, this.f242130n, uVarD7));
            this.f242136t = uVarD8;
            u<com.avito.konveyor.adapter.a> uVarD9 = dagger.internal.g.d(new com.avito.android.publish.screen.step.select.di.f(dVar, uVarD8));
            this.f242137u = uVarD9;
            this.f242138v = dagger.internal.g.d(new com.avito.android.publish.screen.step.select.di.e(dVar, uVarD9, this.f242136t));
            this.f242139w = dagger.internal.g.d(new j(dVar, this.f242127k, this.f242133q));
        }

        @Override // com.avito.android.publish.screen.step.select.di.b
        public final void a(SelectFragment selectFragment) {
            selectFragment.f242072n0 = this.f242126j;
            com.avito.android.publish.screen.step.select.di.c cVar = this.f242117a;
            C0 c0U = cVar.u();
            t.c(c0U);
            selectFragment.f242074p0 = c0U;
            selectFragment.f242075q0 = this.f242138v.get();
            selectFragment.f242076r0 = this.f242137u.get();
            cv.b bVar = this.f242118b;
            com.avito.android.deeplink_handler.view.d dVarC = bVar.c();
            t.c(dVarC);
            selectFragment.f242077s0 = dVarC;
            selectFragment.f242078t0 = this.f242139w.get();
            selectFragment.f242079u0 = cVar.z0();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            t.c(aVarU4);
            selectFragment.f242080v0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
