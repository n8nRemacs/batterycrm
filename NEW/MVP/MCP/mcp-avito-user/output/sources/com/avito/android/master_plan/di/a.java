package com.avito.android.master_plan.di;

import Y41.p;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.master_plan.MasterPlanActivity;
import com.avito.android.master_plan.adapter.info.f;
import com.avito.android.master_plan.di.b;
import com.avito.android.master_plan.h;
import com.avito.android.master_plan.j;
import com.avito.android.master_plan.k;
import com.avito.android.master_plan.m;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;
import pY.InterfaceC47032c;
import tY.InterfaceC48614a;
import wY.C49575a;

/* compiled from: DaggerMasterPlanComponent.java */
@e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerMasterPlanComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.master_plan.di.b.a
        public final com.avito.android.master_plan.di.b a(com.avito.android.master_plan.di.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, C49575a c49575a, p pVar) {
            interfaceC39417a.getClass();
            c49575a.getClass();
            return new c(cVar, interfaceC39417a, c28478k, c49575a, pVar, null);
        }
    }

    /* compiled from: DaggerMasterPlanComponent.java */
    public static final class c implements com.avito.android.master_plan.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f186021a;

        /* renamed from: b, reason: collision with root package name */
        public final l f186022b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC48614a> f186023c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f186024d;

        /* renamed from: e, reason: collision with root package name */
        public final u<h> f186025e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f186026f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC47032c> f186027g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.master_plan.mvi.e f186028h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.master_plan.mvi.b f186029i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f186030j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f186031k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.master_plan.p f186032l;

        /* renamed from: m, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f186033m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.master_plan.adapter.title.c> f186034n;

        /* renamed from: o, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f186035o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.master_plan.adapter.empty.c> f186036p;

        /* renamed from: q, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f186037q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.master_plan.adapter.info.c> f186038r;

        /* renamed from: s, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f186039s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f186040t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f186041u;

        /* renamed from: v, reason: collision with root package name */
        public final u<k> f186042v;

        /* compiled from: DaggerMasterPlanComponent.java */
        /* renamed from: com.avito.android.master_plan.di.a$c$a, reason: collision with other inner class name */
        public static final class C5459a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.master_plan.di.c f186043a;

            public C5459a(com.avito.android.master_plan.di.c cVar) {
                this.f186043a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f186043a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerMasterPlanComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.master_plan.di.c f186044a;

            public b(com.avito.android.master_plan.di.c cVar) {
                this.f186044a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f186044a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerMasterPlanComponent.java */
        /* renamed from: com.avito.android.master_plan.di.a$c$c, reason: collision with other inner class name */
        public static final class C5460c implements u<InterfaceC48614a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.master_plan.di.c f186045a;

            public C5460c(com.avito.android.master_plan.di.c cVar) {
                this.f186045a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48614a interfaceC48614aS8 = this.f186045a.s8();
                t.c(interfaceC48614aS8);
                return interfaceC48614aS8;
            }
        }

        /* compiled from: DaggerMasterPlanComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.master_plan.di.c f186046a;

            public d(com.avito.android.master_plan.di.c cVar) {
                this.f186046a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f186046a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.master_plan.di.c cVar, cv.b bVar, C28478k c28478k, C49575a c49575a, p pVar, C5458a c5458a) {
            this.f186021a = bVar;
            this.f186022b = l.a(c49575a);
            this.f186025e = g.d(new j(new C5460c(cVar), new b(cVar)));
            C5459a c5459a = new C5459a(cVar);
            l lVar = this.f186022b;
            u<InterfaceC47032c> uVarD = g.d(new pY.e(lVar, lVar, c5459a));
            this.f186027g = uVarD;
            this.f186028h = new com.avito.android.master_plan.mvi.e(this.f186022b, uVarD, this.f186025e);
            this.f186029i = new com.avito.android.master_plan.mvi.b(uVarD);
            this.f186030j = new d(cVar);
            this.f186031k = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f186030j);
            this.f186032l = new com.avito.android.master_plan.p(new com.avito.android.master_plan.mvi.h(this.f186028h, this.f186029i, com.avito.android.master_plan.mvi.j.a(), com.avito.android.master_plan.mvi.l.a(), this.f186031k));
            this.f186033m = B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<com.avito.android.master_plan.adapter.title.c> uVarD2 = g.d(com.avito.android.master_plan.adapter.title.e.a());
            this.f186034n = uVarD2;
            this.f186035o = g.d(new com.avito.android.master_plan.adapter.title.b(uVarD2));
            u<com.avito.android.master_plan.adapter.empty.c> uVarD3 = g.d(com.avito.android.master_plan.adapter.empty.e.a());
            this.f186036p = uVarD3;
            this.f186037q = g.d(new com.avito.android.master_plan.adapter.empty.b(uVarD3));
            u<com.avito.android.master_plan.adapter.info.c> uVarD4 = g.d(new f(l.a(pVar)));
            this.f186038r = uVarD4;
            this.f186039s = g.d(new com.avito.android.master_plan.adapter.info.b(uVarD4));
            A.b bVarA = A.a(3, 1);
            bVarA.f393938b.add(this.f186033m);
            u<TV0.b<?, ?>> uVar = this.f186035o;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f186037q);
            list.add(this.f186039s);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f186040t = uVarK;
            this.f186041u = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f186042v = g.d(m.a());
        }

        @Override // com.avito.android.master_plan.di.b
        public final void a(MasterPlanActivity masterPlanActivity) {
            masterPlanActivity.f185970m = this.f186032l;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f186021a.u4();
            t.c(aVarU4);
            masterPlanActivity.f185972o = aVarU4;
            masterPlanActivity.f185973p = this.f186041u.get();
            masterPlanActivity.f185974q = this.f186040t.get();
            masterPlanActivity.f185975r = this.f186042v.get();
            masterPlanActivity.f185976s = this.f186031k.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
