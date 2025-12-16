package com.avito.android.publish.screen.step.wizard.di;

import Jf0.InterfaceC14192a;
import Jj.C14204c;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.screen.step.wizard.WizardFragment;
import com.avito.android.publish.screen.step.wizard.c;
import com.avito.android.publish.screen.step.wizard.di.b;
import com.avito.android.publish.screen.step.wizard.mvi.m;
import com.avito.android.publish.screen.step.wizard.mvi.o;
import com.avito.android.remote.model.Navigation;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;
import yc.C50213a;

/* compiled from: DaggerWizardComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerWizardComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.publish.screen.step.wizard.di.b.a
        public final com.avito.android.publish.screen.step.wizard.di.b a(com.avito.android.publish.screen.step.wizard.di.c cVar, InterfaceC39417a interfaceC39417a, int i12, Navigation navigation2, List list) {
            interfaceC39417a.getClass();
            list.getClass();
            return new c(new e(), cVar, interfaceC39417a, Integer.valueOf(i12), navigation2, list, null);
        }
    }

    /* compiled from: DaggerWizardComponent.java */
    public static final class c implements com.avito.android.publish.screen.step.wizard.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.screen.step.wizard.di.c f242462a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f242463b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC14192a> f242464c;

        /* renamed from: d, reason: collision with root package name */
        public final l f242465d;

        /* renamed from: e, reason: collision with root package name */
        public final u<C50213a> f242466e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.publish.screen.step.wizard.data.e> f242467f;

        /* renamed from: g, reason: collision with root package name */
        public final u<R0> f242468g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.publish.screen.step.wizard.data.a> f242469h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f242470i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Q1> f242471j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC33535v> f242472k;

        /* renamed from: l, reason: collision with root package name */
        public final l f242473l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.wizard.d> f242474m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.wizard.a> f242475n;

        /* renamed from: o, reason: collision with root package name */
        public final u<AK0.l> f242476o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f242477p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.header.e> f242478q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.header.b> f242479r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.checkable.d> f242480s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.checkable.a> f242481t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f242482u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f242483v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f242484w;

        /* renamed from: x, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f242485x;

        /* compiled from: DaggerWizardComponent.java */
        /* renamed from: com.avito.android.publish.screen.step.wizard.di.a$c$a, reason: collision with other inner class name */
        public static final class C7272a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.wizard.di.c f242486a;

            public C7272a(com.avito.android.publish.screen.step.wizard.di.c cVar) {
                this.f242486a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f242486a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerWizardComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f242487a;

            public b(cv.b bVar) {
                this.f242487a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f242487a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerWizardComponent.java */
        /* renamed from: com.avito.android.publish.screen.step.wizard.di.a$c$c, reason: collision with other inner class name */
        public static final class C7273c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.wizard.di.c f242488a;

            public C7273c(com.avito.android.publish.screen.step.wizard.di.c cVar) {
                this.f242488a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f242488a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerWizardComponent.java */
        public static final class d implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.wizard.di.c f242489a;

            public d(com.avito.android.publish.screen.step.wizard.di.c cVar) {
                this.f242489a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f242489a.r();
            }
        }

        /* compiled from: DaggerWizardComponent.java */
        public static final class e implements u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.wizard.di.c f242490a;

            public e(com.avito.android.publish.screen.step.wizard.di.c cVar) {
                this.f242490a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f242490a.D1();
                t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerWizardComponent.java */
        public static final class f implements u<InterfaceC33535v> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.wizard.di.c f242491a;

            public f(com.avito.android.publish.screen.step.wizard.di.c cVar) {
                this.f242491a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f242491a.P();
            }
        }

        /* compiled from: DaggerWizardComponent.java */
        public static final class g implements u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.wizard.di.c f242492a;

            public g(com.avito.android.publish.screen.step.wizard.di.c cVar) {
                this.f242492a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f242492a.z0();
            }
        }

        /* compiled from: DaggerWizardComponent.java */
        public static final class h implements u<InterfaceC14192a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.wizard.di.c f242493a;

            public h(com.avito.android.publish.screen.step.wizard.di.c cVar) {
                this.f242493a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14192a interfaceC14192aL7 = this.f242493a.l7();
                t.c(interfaceC14192aL7);
                return interfaceC14192aL7;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.publish.screen.step.wizard.di.e eVar, com.avito.android.publish.screen.step.wizard.di.c cVar, cv.b bVar, Integer num, Navigation navigation2, List list, C7271a c7271a) {
            this.f242462a = cVar;
            this.f242463b = bVar;
            this.f242464c = new h(cVar);
            this.f242465d = l.b(navigation2);
            u<com.avito.android.publish.screen.step.wizard.data.e> uVarD = dagger.internal.g.d(new j(eVar, this.f242464c, this.f242465d, l.a(list), new e(cVar)));
            this.f242467f = uVarD;
            u<com.avito.android.publish.screen.step.wizard.data.a> uVarD2 = dagger.internal.g.d(new com.avito.android.publish.screen.step.wizard.data.d(uVarD, new C7273c(cVar)));
            this.f242469h = uVarD2;
            b bVar2 = new b(bVar);
            g gVar = new g(cVar);
            this.f242471j = gVar;
            this.f242473l = l.a(new com.avito.android.publish.screen.step.wizard.e(new com.avito.android.publish.screen.step.wizard.d(new com.avito.android.publish.screen.step.wizard.mvi.k(new com.avito.android.publish.screen.step.wizard.mvi.h(uVarD2, bVar2, gVar), new com.avito.android.publish.screen.step.wizard.mvi.e(uVarD2, new f(cVar)), m.a(), o.a()))));
            u<com.avito.android.blueprints.publish.wizard.d> uVarD3 = dagger.internal.g.d(com.avito.android.blueprints.publish.wizard.g.a());
            this.f242474m = uVarD3;
            this.f242475n = dagger.internal.g.d(new com.avito.android.blueprints.publish.wizard.c(uVarD3));
            u<com.avito.android.blueprints.publish.header.e> uVarD4 = dagger.internal.g.d(new com.avito.android.blueprints.publish.header.i(new C14204c(new d(cVar)), new C7272a(cVar)));
            this.f242478q = uVarD4;
            this.f242479r = dagger.internal.g.d(new com.avito.android.blueprints.publish.header.d(uVarD4, this.f242471j));
            u<com.avito.android.blueprints.publish.checkable.d> uVarD5 = dagger.internal.g.d(com.avito.android.blueprints.publish.checkable.g.a());
            this.f242480s = uVarD5;
            u<com.avito.android.blueprints.publish.checkable.a> uVarD6 = dagger.internal.g.d(new com.avito.android.blueprints.publish.checkable.c(uVarD5));
            this.f242481t = uVarD6;
            u<com.avito.konveyor.a> uVarD7 = dagger.internal.g.d(new com.avito.android.publish.screen.step.wizard.di.h(eVar, this.f242475n, this.f242479r, uVarD6));
            this.f242482u = uVarD7;
            u<com.avito.konveyor.adapter.a> uVarD8 = dagger.internal.g.d(new com.avito.android.publish.screen.step.wizard.di.g(eVar, uVarD7));
            this.f242483v = uVarD8;
            this.f242484w = dagger.internal.g.d(new com.avito.android.publish.screen.step.wizard.di.f(eVar, uVarD8, this.f242482u));
            this.f242485x = dagger.internal.g.d(new i(eVar, this.f242474m, this.f242480s));
        }

        @Override // com.avito.android.publish.screen.step.wizard.di.b
        public final void a(WizardFragment wizardFragment) {
            com.avito.android.publish.screen.step.wizard.di.c cVar = this.f242462a;
            com.avito.android.publish.view.result_handler.a aVarF1 = cVar.F1();
            t.c(aVarF1);
            wizardFragment.f245673n0 = aVarF1;
            wizardFragment.f242390o0 = (c.a) this.f242473l.f393949a;
            wizardFragment.f242392q0 = cVar.x();
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            wizardFragment.f242393r0 = interfaceC28373aA;
            C0 c0U = cVar.u();
            t.c(c0U);
            wizardFragment.f242394s0 = c0U;
            wizardFragment.f242395t0 = this.f242484w.get();
            wizardFragment.f242396u0 = this.f242483v.get();
            wizardFragment.f242397v0 = this.f242485x.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f242463b.u4();
            t.c(aVarU4);
            wizardFragment.f242398w0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
