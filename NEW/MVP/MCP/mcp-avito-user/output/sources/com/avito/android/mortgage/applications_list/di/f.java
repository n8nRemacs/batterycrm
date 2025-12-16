package com.avito.android.mortgage.applications_list.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.applications_list.ApplicationsListArguments;
import com.avito.android.mortgage.applications_list.ApplicationsListFragment;
import com.avito.android.mortgage.applications_list.di.a;
import com.avito.android.mortgage.applications_list.h;
import com.avito.android.mortgage.applications_list.mvi.g;
import com.avito.android.mortgage.applications_list.mvi.j;
import com.avito.android.mortgage.applications_list.mvi.k;
import com.avito.android.mortgage.applications_list.mvi.m;
import com.avito.android.mortgage.applications_list.mvi.p;
import com.avito.android.mortgage.applications_list.mvi.r;
import com.avito.android.mortgage.di.o;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerApplicationsListComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class f {

    /* compiled from: DaggerApplicationsListComponent.java */
    public static final class b implements com.avito.android.mortgage.applications_list.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f198372a;

        /* renamed from: b, reason: collision with root package name */
        public final l f198373b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f198374c;

        /* renamed from: d, reason: collision with root package name */
        public final u<QZ.b> f198375d;

        /* renamed from: e, reason: collision with root package name */
        public final g f198376e;

        /* renamed from: f, reason: collision with root package name */
        public final u<IZ.a> f198377f;

        /* renamed from: g, reason: collision with root package name */
        public final u<R0> f198378g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.mortgage.applications_list.c> f198379h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.mortgage.applications_list.mvi.e f198380i;

        /* renamed from: j, reason: collision with root package name */
        public final u<k> f198381j;

        /* renamed from: k, reason: collision with root package name */
        public final r f198382k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f198383l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f198384m;

        /* renamed from: n, reason: collision with root package name */
        public final h f198385n;

        /* renamed from: o, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f198386o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f198387p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f198388q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f198389r;

        /* compiled from: DaggerApplicationsListComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f198390a;

            public a(o oVar) {
                this.f198390a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f198390a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerApplicationsListComponent.java */
        /* renamed from: com.avito.android.mortgage.applications_list.di.f$b$b, reason: collision with other inner class name */
        public static final class C5852b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final o f198391a;

            public C5852b(o oVar) {
                this.f198391a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f198391a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerApplicationsListComponent.java */
        public static final class c implements u<IZ.a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f198392a;

            public c(o oVar) {
                this.f198392a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IZ.a aVarLc = this.f198392a.lc();
                t.c(aVarLc);
                return aVarLc;
            }
        }

        /* compiled from: DaggerApplicationsListComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f198393a;

            public d(o oVar) {
                this.f198393a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f198393a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.mortgage.applications_list.di.b bVar, o oVar, cv.b bVar2, C28478k c28478k, ApplicationsListArguments applicationsListArguments, Y41.l lVar, a aVar) {
            this.f198372a = bVar2;
            this.f198373b = l.a(applicationsListArguments);
            u<QZ.b> uVarD = dagger.internal.g.d(new QZ.d(new a(oVar)));
            this.f198375d = uVarD;
            this.f198376e = new g(this.f198373b, uVarD);
            u<com.avito.android.mortgage.applications_list.c> uVarD2 = dagger.internal.g.d(new com.avito.android.mortgage.applications_list.e(new com.avito.android.mortgage.deeplink.domain.k(new c(oVar), new C5852b(oVar))));
            this.f198379h = uVarD2;
            this.f198380i = new com.avito.android.mortgage.applications_list.mvi.e(uVarD2, this.f198375d);
            u<k> uVarD3 = dagger.internal.g.d(m.a());
            this.f198381j = uVarD3;
            this.f198382k = new r(uVarD3);
            this.f198383l = new d(oVar);
            this.f198384m = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f198383l);
            this.f198385n = new h(new j(this.f198376e, this.f198380i, p.a(), this.f198382k, this.f198384m));
            this.f198386o = dagger.internal.g.d(new com.avito.android.mortgage.applications_list.items.application.c(new com.avito.android.mortgage.applications_list.items.application.g(l.a(lVar))));
            A.b bVarA = A.a(1, 0);
            bVarA.f393937a.add(this.f198386o);
            u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new e(bVar, bVarA.b()));
            this.f198387p = uVarD4;
            u<com.avito.konveyor.adapter.a> uVarD5 = dagger.internal.g.d(new com.avito.android.mortgage.applications_list.di.c(bVar, uVarD4));
            this.f198388q = uVarD5;
            this.f198389r = dagger.internal.g.d(new com.avito.android.mortgage.applications_list.di.d(bVar, uVarD5, this.f198387p));
        }

        @Override // com.avito.android.mortgage.applications_list.di.a
        public final void a(ApplicationsListFragment applicationsListFragment) {
            applicationsListFragment.f198338n0 = this.f198385n;
            applicationsListFragment.f198340p0 = this.f198384m.get();
            applicationsListFragment.f198341q0 = this.f198389r.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f198372a.u4();
            t.c(aVarU4);
            applicationsListFragment.f198342r0 = aVarU4;
        }
    }

    /* compiled from: DaggerApplicationsListComponent.java */
    public static final class c implements a.InterfaceC5850a {
        public c() {
        }

        @Override // com.avito.android.mortgage.applications_list.di.a.InterfaceC5850a
        public final com.avito.android.mortgage.applications_list.di.a a(o oVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, ApplicationsListArguments applicationsListArguments, Y41.l lVar) {
            interfaceC39417a.getClass();
            return new b(new com.avito.android.mortgage.applications_list.di.b(), oVar, interfaceC39417a, c28478k, applicationsListArguments, lVar, null);
        }
    }

    public static a.InterfaceC5850a a() {
        return new c();
    }
}
