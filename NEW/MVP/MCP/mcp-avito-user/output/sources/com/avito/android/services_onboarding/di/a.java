package com.avito.android.services_onboarding.di;

import Bs0.InterfaceC13182a;
import android.content.res.Resources;
import androidx.recyclerview.widget.C;
import com.avito.android.J0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.services_onboarding.ServicesOnboardingFragment;
import com.avito.android.services_onboarding.ServicesOnboardingTarget;
import com.avito.android.services_onboarding.di.d;
import com.avito.android.services_onboarding.di.i;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerServicesOnboardingComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerServicesOnboardingComponent.java */
    public static final class b implements d.a {
        public b() {
        }

        @Override // com.avito.android.services_onboarding.di.d.a
        public final d a(e eVar, InterfaceC39417a interfaceC39417a, Resources resources, C28478k c28478k, ServicesOnboardingTarget servicesOnboardingTarget, Integer num) {
            interfaceC39417a.getClass();
            return new c(eVar, interfaceC39417a, resources, c28478k, servicesOnboardingTarget, num, null);
        }
    }

    /* compiled from: DaggerServicesOnboardingComponent.java */
    public static final class c implements com.avito.android.services_onboarding.di.d {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f279820a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f279821b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC13182a> f279822c;

        /* renamed from: d, reason: collision with root package name */
        public final u<J0> f279823d;

        /* renamed from: e, reason: collision with root package name */
        public final Yu0.f f279824e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f279825f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.service_booking_persistence.f> f279826g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Yu0.g> f279827h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.services_onboarding.mvi.g f279828i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.services_onboarding.mvi.b f279829j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28373a> f279830k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.services_onboarding.mvi.n f279831l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f279832m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f279833n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.services_onboarding.h f279834o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.f f279835p;

        /* renamed from: q, reason: collision with root package name */
        public final u<C> f279836q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f279837r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.services_onboarding.step.b f279838s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f279839t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f279840u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f279841v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f279842w;

        /* compiled from: DaggerServicesOnboardingComponent.java */
        /* renamed from: com.avito.android.services_onboarding.di.a$c$a, reason: collision with other inner class name */
        public static final class C8323a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.services_onboarding.di.e f279843a;

            public C8323a(com.avito.android.services_onboarding.di.e eVar) {
                this.f279843a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f279843a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerServicesOnboardingComponent.java */
        public static final class b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.services_onboarding.di.e f279844a;

            public b(com.avito.android.services_onboarding.di.e eVar) {
                this.f279844a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f279844a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerServicesOnboardingComponent.java */
        /* renamed from: com.avito.android.services_onboarding.di.a$c$c, reason: collision with other inner class name */
        public static final class C8324c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.services_onboarding.di.e f279845a;

            public C8324c(com.avito.android.services_onboarding.di.e eVar) {
                this.f279845a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f279845a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerServicesOnboardingComponent.java */
        public static final class d implements u<J0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.services_onboarding.di.e f279846a;

            public d(com.avito.android.services_onboarding.di.e eVar) {
                this.f279846a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                J0 j0F0 = this.f279846a.f0();
                t.c(j0F0);
                return j0F0;
            }
        }

        /* compiled from: DaggerServicesOnboardingComponent.java */
        public static final class e implements u<InterfaceC13182a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.services_onboarding.di.e f279847a;

            public e(com.avito.android.services_onboarding.di.e eVar) {
                this.f279847a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC13182a interfaceC13182aU4 = this.f279847a.U4();
                t.c(interfaceC13182aU4);
                return interfaceC13182aU4;
            }
        }

        /* compiled from: DaggerServicesOnboardingComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.services_onboarding.di.e f279848a;

            public f(com.avito.android.services_onboarding.di.e eVar) {
                this.f279848a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f279848a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerServicesOnboardingComponent.java */
        public static final class g implements u<com.avito.android.service_booking_persistence.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.services_onboarding.di.e f279849a;

            public g(com.avito.android.services_onboarding.di.e eVar) {
                this.f279849a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f279849a.V2();
            }
        }

        public c(com.avito.android.services_onboarding.di.e eVar, cv.b bVar, Resources resources, C28478k c28478k, ServicesOnboardingTarget servicesOnboardingTarget, Integer num, C8322a c8322a) {
            this.f279820a = bVar;
            this.f279821b = dagger.internal.l.a(servicesOnboardingTarget);
            this.f279822c = new e(eVar);
            this.f279823d = new d(eVar);
            Yu0.f fVar = new Yu0.f(dagger.internal.l.a(resources), this.f279823d);
            this.f279824e = fVar;
            C8324c c8324c = new C8324c(eVar);
            this.f279825f = c8324c;
            com.avito.android.services_onboarding.domain.cpx_onboarding.h hVar = new com.avito.android.services_onboarding.domain.cpx_onboarding.h(new com.avito.android.services_onboarding.domain.cpx_onboarding.b(this.f279822c, fVar, c8324c, this.f279821b), com.avito.android.services_onboarding.domain.cpx_onboarding.d.a(), com.avito.android.services_onboarding.domain.cpx_onboarding.f.a());
            u<InterfaceC13182a> uVar = this.f279822c;
            Yu0.f fVar2 = this.f279824e;
            u<R0> uVar2 = this.f279825f;
            com.avito.android.services_onboarding.domain.booking_onboarding.b bVar2 = new com.avito.android.services_onboarding.domain.booking_onboarding.b(uVar, fVar2, uVar2);
            g gVar = new g(eVar);
            dagger.internal.l lVar = this.f279821b;
            this.f279827h = dagger.internal.g.d(new j(lVar, hVar, new com.avito.android.services_onboarding.domain.booking_onboarding.h(bVar2, new com.avito.android.services_onboarding.domain.booking_onboarding.d(lVar, gVar, uVar2), new com.avito.android.services_onboarding.domain.booking_onboarding.f(lVar, gVar, uVar2))));
            dagger.internal.l lVarB = dagger.internal.l.b(num);
            u<Yu0.g> uVar3 = this.f279827h;
            this.f279828i = new com.avito.android.services_onboarding.mvi.g(lVarB, uVar3);
            this.f279829j = new com.avito.android.services_onboarding.mvi.b(lVarB, uVar3);
            this.f279831l = new com.avito.android.services_onboarding.mvi.n(new com.avito.android.services_onboarding.mvi.e(lVarB, new C8323a(eVar)));
            this.f279832m = new f(eVar);
            this.f279833n = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f279832m);
            this.f279834o = new com.avito.android.services_onboarding.h(new com.avito.android.services_onboarding.mvi.j(this.f279828i, this.f279829j, com.avito.android.services_onboarding.mvi.l.a(), this.f279831l, this.f279833n));
            dagger.internal.f fVar3 = new dagger.internal.f();
            this.f279835p = fVar3;
            this.f279836q = dagger.internal.g.d(new l(fVar3));
            this.f279837r = new b(eVar);
            this.f279838s = new com.avito.android.services_onboarding.step.b(com.avito.android.services_onboarding.step.e.a(), this.f279837r);
            A.b bVarA = A.a(1, 0);
            bVarA.f393937a.add(this.f279838s);
            u<com.avito.konveyor.a> uVarD = dagger.internal.g.d(new k(bVarA.b()));
            this.f279839t = uVarD;
            this.f279840u = dagger.internal.g.d(new com.avito.android.services_onboarding.di.g(uVarD));
            u<com.avito.android.recycler.data_aware.e> uVarD2 = dagger.internal.g.d(i.a.f279857a);
            this.f279841v = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new h(uVarD2, this.f279836q, this.f279840u));
            this.f279842w = uVarD3;
            dagger.internal.f.a(this.f279835p, dagger.internal.g.d(new m(uVarD3, this.f279839t)));
        }

        @Override // com.avito.android.services_onboarding.di.d
        public final void a(ServicesOnboardingFragment servicesOnboardingFragment) {
            servicesOnboardingFragment.f279770n0 = this.f279834o;
            servicesOnboardingFragment.f279772p0 = this.f279833n.get();
            servicesOnboardingFragment.f279773q0 = (com.avito.konveyor.adapter.j) this.f279835p.get();
            servicesOnboardingFragment.f279774r0 = this.f279842w.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f279820a.u4();
            t.c(aVarU4);
            servicesOnboardingFragment.f279775s0 = aVarU4;
        }
    }

    public static d.a a() {
        return new b();
    }
}
