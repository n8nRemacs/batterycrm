package com.avito.android.loyalty.di.criteria;

import android.app.Activity;
import bX.InterfaceC25576a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deep_linking.links.x;
import com.avito.android.lib.deprecated_design.tab.CommonTab;
import com.avito.android.loyalty.di.criteria.a;
import com.avito.android.loyalty.di.criteria.g;
import com.avito.android.loyalty.ui.criteria.CriteriaActivity;
import com.avito.android.loyalty.ui.criteria.CriteriaArgs;
import com.avito.android.loyalty.ui.criteria.mvi.n;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerCriteriaComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class i {

    /* compiled from: DaggerCriteriaComponent.java */
    public static final class b implements com.avito.android.loyalty.di.criteria.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f183043a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.loyalty.di.criteria.b f183044b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC25576a> f183045c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f183046d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f183047e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f183048f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.loyalty.ui.criteria.c> f183049g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f183050h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.a> f183051i;

        /* renamed from: j, reason: collision with root package name */
        public final u<JW.a> f183052j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.criteria.mvi.g f183053k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.criteria.mvi.e f183054l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f183055m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f183056n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.criteria.k f183057o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.tab.adapter.j<CommonTab>> f183058p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.tab.adapter.c<CommonTab>> f183059q;

        /* renamed from: r, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f183060r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.l f183061s;

        /* renamed from: t, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f183062t;

        /* renamed from: u, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f183063u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.f f183064v;

        /* renamed from: w, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f183065w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f183066x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f183067y;

        /* compiled from: DaggerCriteriaComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.criteria.b f183068a;

            public a(com.avito.android.loyalty.di.criteria.b bVar) {
                this.f183068a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f183068a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCriteriaComponent.java */
        /* renamed from: com.avito.android.loyalty.di.criteria.i$b$b, reason: collision with other inner class name */
        public static final class C5368b implements u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.criteria.b f183069a;

            public C5368b(com.avito.android.loyalty.di.criteria.b bVar) {
                this.f183069a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarV = this.f183069a.v();
                t.c(aVarV);
                return aVarV;
            }
        }

        /* compiled from: DaggerCriteriaComponent.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.criteria.b f183070a;

            public c(com.avito.android.loyalty.di.criteria.b bVar) {
                this.f183070a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f183070a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCriteriaComponent.java */
        public static final class d implements u<InterfaceC25576a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.criteria.b f183071a;

            public d(com.avito.android.loyalty.di.criteria.b bVar) {
                this.f183071a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25576a interfaceC25576aY1 = this.f183071a.y1();
                t.c(interfaceC25576aY1);
                return interfaceC25576aY1;
            }
        }

        /* compiled from: DaggerCriteriaComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.criteria.b f183072a;

            public e(com.avito.android.loyalty.di.criteria.b bVar) {
                this.f183072a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f183072a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.loyalty.di.criteria.b bVar, cv.b bVar2, C28478k c28478k, com.avito.android.loyalty.ui.criteria.items.card.g gVar, Activity activity, w wVar, x xVar, CriteriaArgs criteriaArgs, a aVar) {
            this.f183043a = bVar2;
            this.f183044b = bVar;
            this.f183045c = new d(bVar);
            this.f183046d = dagger.internal.l.a(criteriaArgs);
            this.f183047e = new c(bVar);
            this.f183048f = dagger.internal.l.a(wVar);
            dagger.internal.l lVarA = dagger.internal.l.a(xVar);
            dagger.internal.l lVar = this.f183048f;
            dagger.internal.l lVar2 = this.f183046d;
            this.f183049g = dagger.internal.g.d(new com.avito.android.loyalty.ui.criteria.d(this.f183045c, lVar2, this.f183047e, new com.avito.android.loyalty.ui.criteria.f(lVar, lVarA, lVar2)));
            u<JW.a> uVarD = dagger.internal.g.d(new com.avito.android.loyalty.di.criteria.e(this.f183046d, new a(bVar), new C5368b(bVar)));
            this.f183052j = uVarD;
            u<com.avito.android.loyalty.ui.criteria.c> uVar = this.f183049g;
            this.f183053k = new com.avito.android.loyalty.ui.criteria.mvi.g(uVarD, uVar);
            this.f183054l = new com.avito.android.loyalty.ui.criteria.mvi.e(uVarD, uVar);
            this.f183055m = new e(bVar);
            this.f183056n = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f183055m);
            this.f183057o = new com.avito.android.loyalty.ui.criteria.k(new com.avito.android.loyalty.ui.criteria.mvi.j(this.f183053k, this.f183054l, n.a(), com.avito.android.loyalty.ui.criteria.mvi.l.a(), this.f183056n));
            this.f183058p = dagger.internal.g.d(g.a.f183040a);
            this.f183059q = dagger.internal.g.d(new f(dagger.internal.l.a(activity), this.f183058p));
            this.f183060r = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f183061s = dagger.internal.l.a(gVar);
            this.f183062t = dagger.internal.g.d(new com.avito.android.loyalty.ui.criteria.items.card.c(com.avito.android.loyalty.ui.criteria.items.card.e.a(), this.f183061s));
            this.f183063u = dagger.internal.g.d(new com.avito.android.loyalty.ui.criteria.items.header.b(com.avito.android.loyalty.ui.criteria.items.header.e.a()));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f183064v = fVar;
            this.f183065w = dagger.internal.g.d(new com.avito.android.loyalty.ui.criteria.items.tab.c(new com.avito.android.loyalty.ui.criteria.items.tab.e(new l(new k(fVar), fVar))));
            A.b bVarA = A.a(3, 1);
            bVarA.f393938b.add(this.f183060r);
            u<TV0.b<?, ?>> uVar2 = this.f183062t;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar2);
            list.add(this.f183063u);
            list.add(this.f183065w);
            dagger.internal.f.a(this.f183064v, B.a(new com.avito.android.konveyor_adapter_module.c(bVarA.b())));
            u<com.avito.konveyor.adapter.a> uVarA = B.a(new com.avito.android.konveyor_adapter_module.b(this.f183064v));
            this.f183066x = uVarA;
            this.f183067y = dagger.internal.g.d(new h(this.f183064v, uVarA));
        }

        @Override // com.avito.android.loyalty.di.criteria.a
        public final void a(CriteriaActivity criteriaActivity) {
            criteriaActivity.f183404m = this.f183057o;
            criteriaActivity.f183406o = this.f183056n.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f183043a.u4();
            t.c(aVarU4);
            criteriaActivity.f183407p = aVarU4;
            com.avito.android.loyalty.di.criteria.b bVar = this.f183044b;
            criteriaActivity.f183408q = bVar.O();
            criteriaActivity.f183409r = bVar.h();
            criteriaActivity.f183410s = this.f183058p.get();
            criteriaActivity.f183411t = this.f183059q.get();
            criteriaActivity.f183412u = this.f183067y.get();
            criteriaActivity.f183413v = this.f183066x.get();
        }
    }

    /* compiled from: DaggerCriteriaComponent.java */
    public static final class c implements a.InterfaceC5367a {
        public c() {
        }

        @Override // com.avito.android.loyalty.di.criteria.a.InterfaceC5367a
        public final com.avito.android.loyalty.di.criteria.a a(C28478k c28478k, com.avito.android.loyalty.ui.criteria.a aVar, CriteriaActivity criteriaActivity, com.avito.android.cpt.pre_activation.ui.c cVar, com.avito.android.auction.details.i iVar, CriteriaArgs criteriaArgs, InterfaceC39417a interfaceC39417a, com.avito.android.loyalty.di.criteria.b bVar) {
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, c28478k, aVar, criteriaActivity, cVar, iVar, criteriaArgs, null);
        }
    }

    public static a.InterfaceC5367a a() {
        return new c();
    }
}
