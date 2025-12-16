package com.avito.android.loyalty.di.criteria_gray;

import bX.InterfaceC25576a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.auction.details.i;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deep_linking.links.x;
import com.avito.android.loyalty.di.criteria_gray.a;
import com.avito.android.loyalty.di.criteria_gray.g;
import com.avito.android.loyalty.ui.criteria_gray.CriteriaGrayActivity;
import com.avito.android.loyalty.ui.criteria_gray.CriteriaGrayArgs;
import com.avito.android.loyalty.ui.criteria_gray.j;
import com.avito.android.loyalty.ui.criteria_gray.mvi.n;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerCriteriaGrayComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class h {

    /* compiled from: DaggerCriteriaGrayComponent.java */
    public static final class b implements com.avito.android.loyalty.di.criteria_gray.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.loyalty.di.criteria_gray.b f183085a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f183086b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC25576a> f183087c;

        /* renamed from: d, reason: collision with root package name */
        public final l f183088d;

        /* renamed from: e, reason: collision with root package name */
        public final l f183089e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f183090f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.loyalty.ui.criteria_gray.f> f183091g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f183092h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.a> f183093i;

        /* renamed from: j, reason: collision with root package name */
        public final u<JW.a> f183094j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.criteria_gray.mvi.g f183095k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.criteria_gray.mvi.e f183096l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f183097m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f183098n;

        /* renamed from: o, reason: collision with root package name */
        public final j f183099o;

        /* renamed from: p, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f183100p;

        /* renamed from: q, reason: collision with root package name */
        public final l f183101q;

        /* renamed from: r, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f183102r;

        /* renamed from: s, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f183103s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.items.attributed_text.c f183104t;

        /* renamed from: u, reason: collision with root package name */
        public final com.avito.android.loyalty.ui.items.title_text.c f183105u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f183106v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f183107w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f183108x;

        /* compiled from: DaggerCriteriaGrayComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.criteria_gray.b f183109a;

            public a(com.avito.android.loyalty.di.criteria_gray.b bVar) {
                this.f183109a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f183109a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCriteriaGrayComponent.java */
        /* renamed from: com.avito.android.loyalty.di.criteria_gray.h$b$b, reason: collision with other inner class name */
        public static final class C5370b implements u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.criteria_gray.b f183110a;

            public C5370b(com.avito.android.loyalty.di.criteria_gray.b bVar) {
                this.f183110a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarV = this.f183110a.v();
                t.c(aVarV);
                return aVarV;
            }
        }

        /* compiled from: DaggerCriteriaGrayComponent.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.criteria_gray.b f183111a;

            public c(com.avito.android.loyalty.di.criteria_gray.b bVar) {
                this.f183111a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f183111a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCriteriaGrayComponent.java */
        public static final class d implements u<InterfaceC25576a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.criteria_gray.b f183112a;

            public d(com.avito.android.loyalty.di.criteria_gray.b bVar) {
                this.f183112a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25576a interfaceC25576aY1 = this.f183112a.y1();
                t.c(interfaceC25576aY1);
                return interfaceC25576aY1;
            }
        }

        /* compiled from: DaggerCriteriaGrayComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.loyalty.di.criteria_gray.b f183113a;

            public e(com.avito.android.loyalty.di.criteria_gray.b bVar) {
                this.f183113a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f183113a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.loyalty.di.criteria_gray.b bVar, cv.b bVar2, C28478k c28478k, w wVar, x xVar, CriteriaGrayArgs criteriaGrayArgs, com.avito.android.loyalty.ui.criteria.items.card.g gVar, a aVar) {
            this.f183085a = bVar;
            this.f183086b = bVar2;
            this.f183087c = new d(bVar);
            this.f183088d = l.a(criteriaGrayArgs);
            this.f183089e = l.a(wVar);
            this.f183091g = dagger.internal.g.d(new com.avito.android.loyalty.ui.criteria_gray.g(this.f183087c, this.f183088d, new com.avito.android.loyalty.ui.criteria_gray.e(this.f183089e, l.a(xVar)), new c(bVar)));
            u<JW.a> uVarD = dagger.internal.g.d(new f(this.f183088d, new a(bVar), new C5370b(bVar)));
            this.f183094j = uVarD;
            u<com.avito.android.loyalty.ui.criteria_gray.f> uVar = this.f183091g;
            this.f183095k = new com.avito.android.loyalty.ui.criteria_gray.mvi.g(uVarD, uVar);
            this.f183096l = new com.avito.android.loyalty.ui.criteria_gray.mvi.e(uVarD, uVar);
            this.f183097m = new e(bVar);
            this.f183098n = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f183097m);
            this.f183099o = new j(new com.avito.android.loyalty.ui.criteria_gray.mvi.j(this.f183095k, this.f183096l, com.avito.android.loyalty.ui.criteria_gray.mvi.l.a(), n.a(), this.f183098n));
            this.f183100p = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f183101q = l.a(gVar);
            this.f183102r = dagger.internal.g.d(new com.avito.android.loyalty.ui.criteria.items.card.c(com.avito.android.loyalty.ui.criteria.items.card.e.a(), this.f183101q));
            this.f183103s = dagger.internal.g.d(new com.avito.android.loyalty.ui.criteria.items.header.b(com.avito.android.loyalty.ui.criteria.items.header.e.a()));
            this.f183104t = new com.avito.android.loyalty.ui.items.attributed_text.c(new com.avito.android.loyalty.ui.items.attributed_text.f(this.f183089e));
            this.f183105u = new com.avito.android.loyalty.ui.items.title_text.c(com.avito.android.loyalty.ui.items.title_text.e.a(), g.a.f183084a);
            A.b bVarA = A.a(4, 1);
            bVarA.f393938b.add(this.f183100p);
            u<TV0.b<?, ?>> uVar2 = this.f183102r;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar2);
            list.add(this.f183103s);
            list.add(this.f183104t);
            list.add(this.f183105u);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f183106v = uVarK;
            u<com.avito.konveyor.adapter.h> uVarD2 = dagger.internal.g.d(new com.avito.android.loyalty.di.criteria_gray.e(uVarK));
            this.f183107w = uVarD2;
            this.f183108x = dagger.internal.g.d(new com.avito.android.loyalty.di.criteria_gray.d(uVarD2, this.f183106v));
        }

        @Override // com.avito.android.loyalty.di.criteria_gray.a
        public final void a(CriteriaGrayActivity criteriaGrayActivity) {
            criteriaGrayActivity.f183563m = this.f183099o;
            com.avito.android.loyalty.di.criteria_gray.b bVar = this.f183085a;
            criteriaGrayActivity.f183565o = bVar.O();
            criteriaGrayActivity.f183566p = this.f183098n.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f183086b.u4();
            t.c(aVarU4);
            criteriaGrayActivity.f183567q = aVarU4;
            criteriaGrayActivity.f183568r = bVar.h();
            criteriaGrayActivity.f183569s = this.f183108x.get();
            criteriaGrayActivity.f183570t = this.f183107w.get();
        }
    }

    /* compiled from: DaggerCriteriaGrayComponent.java */
    public static final class c implements a.InterfaceC5369a {
        public c() {
        }

        @Override // com.avito.android.loyalty.di.criteria_gray.a.InterfaceC5369a
        public final com.avito.android.loyalty.di.criteria_gray.a a(C28478k c28478k, com.avito.android.cpt.pre_activation.ui.c cVar, i iVar, CriteriaGrayArgs criteriaGrayArgs, com.avito.android.loyalty.ui.criteria.a aVar, InterfaceC39417a interfaceC39417a, com.avito.android.loyalty.di.criteria_gray.b bVar) {
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, c28478k, cVar, iVar, criteriaGrayArgs, aVar, null);
        }
    }

    public static a.InterfaceC5369a a() {
        return new c();
    }
}
