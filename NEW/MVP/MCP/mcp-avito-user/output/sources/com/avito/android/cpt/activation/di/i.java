package com.avito.android.cpt.activation.di;

import Nr.InterfaceC14604a;
import Qr.InterfaceC14925a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpt.activation.CptActivationFragment;
import com.avito.android.cpt.activation.di.a;
import com.avito.android.cpt.activation.mvi.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerCptActivationComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class i {

    /* compiled from: DaggerCptActivationComponent.java */
    public static final class b implements com.avito.android.cpt.activation.di.a {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f126240A;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f126241a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC14604a f126242b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC14925a> f126243c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f126244d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.cpt.activation.mvi.d f126245e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.cpt.activation.mvi.b f126246f;

        /* renamed from: g, reason: collision with root package name */
        public final k f126247g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f126248h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C28478k> f126249i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f126250j;

        /* renamed from: k, reason: collision with root package name */
        public final l f126251k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.cpt.activation.h f126252l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.cpt.activation.ui.items.header.d> f126253m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f126254n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.cpt.activation.ui.items.header.c f126255o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.cpt.activation.ui.items.advert.d> f126256p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.cpt.activation.ui.items.advert.c f126257q;

        /* renamed from: r, reason: collision with root package name */
        public final l f126258r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.cpt.activation.ui.items.delivery.d> f126259s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.cpt.activation.ui.items.delivery.c f126260t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.cpt.activation.ui.items.dbs.d> f126261u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.cpt.activation.ui.items.dbs.c f126262v;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.cpt.activation.ui.items.cnc.c f126263w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.cpt.activation.ui.items.alert.d> f126264x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f126265y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f126266z;

        /* compiled from: DaggerCptActivationComponent.java */
        public static final class a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14604a f126267a;

            public a(InterfaceC14604a interfaceC14604a) {
                this.f126267a = interfaceC14604a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f126267a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerCptActivationComponent.java */
        /* renamed from: com.avito.android.cpt.activation.di.i$b$b, reason: collision with other inner class name */
        public static final class C3752b implements u<InterfaceC14925a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14604a f126268a;

            public C3752b(InterfaceC14604a interfaceC14604a) {
                this.f126268a = interfaceC14604a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14925a interfaceC14925aW9 = this.f126268a.W9();
                t.c(interfaceC14925aW9);
                return interfaceC14925aW9;
            }
        }

        /* compiled from: DaggerCptActivationComponent.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14604a f126269a;

            public c(InterfaceC14604a interfaceC14604a) {
                this.f126269a = interfaceC14604a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0Tc = this.f126269a.Tc();
                t.c(r0Tc);
                return r0Tc;
            }
        }

        /* compiled from: DaggerCptActivationComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14604a f126270a;

            public d(InterfaceC14604a interfaceC14604a) {
                this.f126270a = interfaceC14604a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f126270a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(InterfaceC14604a interfaceC14604a, cv.b bVar, r rVar, String str, DeepLink deepLink, Y41.l lVar, a aVar) {
            this.f126241a = bVar;
            this.f126242b = interfaceC14604a;
            com.avito.android.cpt.activation.domain.b bVar2 = new com.avito.android.cpt.activation.domain.b(l.a(str), new C3752b(interfaceC14604a), new c(interfaceC14604a), com.avito.android.cpt.activation.data.mapper.c.a());
            this.f126245e = new com.avito.android.cpt.activation.mvi.d(bVar2);
            this.f126246f = new com.avito.android.cpt.activation.mvi.b(bVar2);
            this.f126247g = new k(com.avito.android.cpt.activation.data.mapper.c.a());
            this.f126248h = new d(interfaceC14604a);
            u<C28478k> uVarD = dagger.internal.g.d(new h(l.a(rVar)));
            this.f126249i = uVarD;
            this.f126250j = com.avito.android.advert.item.delivery_suggests.l.i(this.f126248h, uVarD);
            this.f126251k = l.a(deepLink);
            this.f126252l = new com.avito.android.cpt.activation.h(new com.avito.android.cpt.activation.mvi.g(this.f126245e, this.f126246f, com.avito.android.cpt.activation.mvi.i.a(), this.f126247g, this.f126250j, this.f126251k));
            u<com.avito.android.cpt.activation.ui.items.header.d> uVarD2 = dagger.internal.g.d(com.avito.android.cpt.activation.ui.items.header.f.a());
            this.f126253m = uVarD2;
            a aVar2 = new a(interfaceC14604a);
            this.f126254n = aVar2;
            this.f126255o = new com.avito.android.cpt.activation.ui.items.header.c(uVarD2, aVar2);
            u<com.avito.android.cpt.activation.ui.items.advert.d> uVarD3 = dagger.internal.g.d(com.avito.android.cpt.activation.ui.items.advert.f.a());
            this.f126256p = uVarD3;
            this.f126257q = new com.avito.android.cpt.activation.ui.items.advert.c(uVarD3);
            l lVarA = l.a(lVar);
            this.f126258r = lVarA;
            u<com.avito.android.cpt.activation.ui.items.delivery.d> uVarD4 = dagger.internal.g.d(new com.avito.android.cpt.activation.ui.items.delivery.g(lVarA));
            this.f126259s = uVarD4;
            this.f126260t = new com.avito.android.cpt.activation.ui.items.delivery.c(uVarD4, this.f126254n);
            u<com.avito.android.cpt.activation.ui.items.dbs.d> uVarD5 = dagger.internal.g.d(new com.avito.android.cpt.activation.ui.items.dbs.g(this.f126258r));
            this.f126261u = uVarD5;
            u<com.avito.android.util.text.a> uVar = this.f126254n;
            this.f126262v = new com.avito.android.cpt.activation.ui.items.dbs.c(uVarD5, uVar);
            l lVar2 = this.f126258r;
            this.f126263w = new com.avito.android.cpt.activation.ui.items.cnc.c(new com.avito.android.cpt.activation.ui.items.cnc.g(lVar2), uVar);
            u<com.avito.android.cpt.activation.ui.items.alert.d> uVarD6 = dagger.internal.g.d(new com.avito.android.cpt.activation.ui.items.alert.h(lVar2));
            this.f126264x = uVarD6;
            u<com.avito.konveyor.a> uVarD7 = dagger.internal.g.d(new f(this.f126255o, this.f126257q, this.f126260t, this.f126262v, this.f126263w, new com.avito.android.cpt.activation.ui.items.alert.c(uVarD6, this.f126254n)));
            this.f126265y = uVarD7;
            u<com.avito.konveyor.adapter.a> uVarD8 = dagger.internal.g.d(new e(uVarD7));
            this.f126266z = uVarD8;
            this.f126240A = dagger.internal.g.d(new g(uVarD8, this.f126265y));
        }

        @Override // com.avito.android.cpt.activation.di.a
        public final void a(CptActivationFragment cptActivationFragment) {
            cptActivationFragment.f126200n0 = this.f126252l;
            cptActivationFragment.f126202p0 = this.f126250j.get();
            cptActivationFragment.f126203q0 = this.f126240A.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f126241a.u4();
            t.c(aVarU4);
            cptActivationFragment.f126204r0 = aVarU4;
            InterfaceC14604a interfaceC14604a = this.f126242b;
            InterfaceC28373a interfaceC28373aA = interfaceC14604a.a();
            t.c(interfaceC28373aA);
            cptActivationFragment.f126205s0 = interfaceC28373aA;
            com.avito.android.util.text.a aVarE = interfaceC14604a.e();
            t.c(aVarE);
            cptActivationFragment.f126206t0 = aVarE;
        }
    }

    /* compiled from: DaggerCptActivationComponent.java */
    public static final class c implements a.InterfaceC3751a {
        public c() {
        }

        @Override // com.avito.android.cpt.activation.di.a.InterfaceC3751a
        public final com.avito.android.cpt.activation.di.a a(InterfaceC14604a interfaceC14604a, InterfaceC39417a interfaceC39417a, r rVar, String str, DeepLink deepLink, Y41.l lVar) {
            interfaceC39417a.getClass();
            return new b(interfaceC14604a, interfaceC39417a, rVar, str, deepLink, lVar, null);
        }
    }

    public static a.InterfaceC3751a a() {
        return new c();
    }
}
