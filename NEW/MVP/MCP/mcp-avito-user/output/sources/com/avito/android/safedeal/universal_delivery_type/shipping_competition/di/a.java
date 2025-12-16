package com.avito.android.safedeal.universal_delivery_type.shipping_competition.di;

import Zi.InterfaceC19564a;
import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import com.avito.android.safedeal.universal_delivery_type.shipping_competition.UniversalDeliveryTypeShippingCompetitionFragment;
import com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.b;
import com.avito.android.safedeal.universal_delivery_type.shipping_competition.mvi.n;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import gj.InterfaceC40691b;
import java.util.Set;
import kj.InterfaceC42698a;

/* compiled from: DaggerUniversalDeliveryTypeShippingCompetitionComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerUniversalDeliveryTypeShippingCompetitionComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.b.a
        public final com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.b a(r rVar, UniversalDeliveryTypeContent.Tab.ShippingCompetition shippingCompetition, com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.c cVar, InterfaceC39417a interfaceC39417a, com.avito.android.safedeal.universal_delivery_type.di.j jVar, InterfaceC42698a interfaceC42698a) {
            shippingCompetition.getClass();
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, jVar, interfaceC42698a, rVar, shippingCompetition, null);
        }
    }

    /* compiled from: DaggerUniversalDeliveryTypeShippingCompetitionComponent.java */
    public static final class c implements com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.c f256772a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.safedeal.universal_delivery_type.di.j f256773b;

        /* renamed from: c, reason: collision with root package name */
        public final u<gj.d> f256774c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f256775d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC19564a> f256776e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.safedeal.universal_delivery_type.beduin.a> f256777f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Set<gj.f<?>>> f256778g;

        /* renamed from: h, reason: collision with root package name */
        public final u<a.b> f256779h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC40691b> f256780i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f256781j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.safedeal.universal_delivery_type.shipping_competition.a> f256782k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.safedeal.universal_delivery_type.shipping_competition.g f256783l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f256784m;

        /* renamed from: n, reason: collision with root package name */
        public final u<H> f256785n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28499v> f256786o;

        /* renamed from: p, reason: collision with root package name */
        public final u<o> f256787p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.safedeal.universal_delivery_type.shipping_competition.c> f256788q;

        /* compiled from: DaggerUniversalDeliveryTypeShippingCompetitionComponent.java */
        /* renamed from: com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.a$c$a, reason: collision with other inner class name */
        public static final class C7697a implements u<InterfaceC19564a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC42698a f256789a;

            public C7697a(InterfaceC42698a interfaceC42698a) {
                this.f256789a = interfaceC42698a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19564a interfaceC19564aVg = this.f256789a.Vg();
                t.c(interfaceC19564aVg);
                return interfaceC19564aVg;
            }
        }

        /* compiled from: DaggerUniversalDeliveryTypeShippingCompetitionComponent.java */
        public static final class b implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.c f256790a;

            public b(com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.c cVar) {
                this.f256790a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f256790a.El();
            }
        }

        /* compiled from: DaggerUniversalDeliveryTypeShippingCompetitionComponent.java */
        /* renamed from: com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.a$c$c, reason: collision with other inner class name */
        public static final class C7698c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f256791a;

            public C7698c(cv.b bVar) {
                this.f256791a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f256791a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerUniversalDeliveryTypeShippingCompetitionComponent.java */
        public static final class d implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f256792a;

            public d(cv.b bVar) {
                this.f256792a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f256792a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerUniversalDeliveryTypeShippingCompetitionComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.c f256793a;

            public e(com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.c cVar) {
                this.f256793a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f256793a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.c cVar, cv.b bVar, com.avito.android.safedeal.universal_delivery_type.di.j jVar, InterfaceC42698a interfaceC42698a, r rVar, UniversalDeliveryTypeContent.Tab.ShippingCompetition shippingCompetition, C7696a c7696a) {
            this.f256772a = cVar;
            this.f256773b = jVar;
            this.f256774c = new b(cVar);
            this.f256775d = new C7698c(bVar);
            u<com.avito.android.safedeal.universal_delivery_type.beduin.a> uVarD = dagger.internal.g.d(new g(new C7697a(interfaceC42698a)));
            this.f256777f = uVarD;
            u<Set<gj.f<?>>> uVarD2 = dagger.internal.g.d(new f(uVarD));
            this.f256778g = uVarD2;
            this.f256780i = dagger.internal.g.d(new com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.e(uVarD2, this.f256774c, this.f256775d, new d(bVar)));
            this.f256781j = dagger.internal.l.a(shippingCompetition);
            u<com.avito.android.safedeal.universal_delivery_type.shipping_competition.a> uVarD3 = dagger.internal.g.d(new h(this.f256780i));
            this.f256782k = uVarD3;
            this.f256783l = new com.avito.android.safedeal.universal_delivery_type.shipping_competition.g(this.f256780i, new com.avito.android.safedeal.universal_delivery_type.shipping_competition.mvi.h(new com.avito.android.safedeal.universal_delivery_type.shipping_competition.mvi.e(new com.avito.android.safedeal.universal_delivery_type.shipping_competition.domain.b(this.f256781j, uVarD3), this.f256780i, uVarD3, this.f256777f), com.avito.android.safedeal.universal_delivery_type.shipping_competition.mvi.j.a(), n.a()));
            u<H> uVarD4 = dagger.internal.g.d(new l(new e(cVar)));
            this.f256785n = uVarD4;
            this.f256786o = dagger.internal.g.d(new j(uVarD4));
            u<o> uVarD5 = dagger.internal.g.d(new k(this.f256785n));
            this.f256787p = uVarD5;
            this.f256788q = dagger.internal.g.d(new com.avito.android.safedeal.universal_delivery_type.shipping_competition.e(uVarD5, this.f256786o));
        }

        @Override // com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.b
        public final void a(UniversalDeliveryTypeShippingCompetitionFragment universalDeliveryTypeShippingCompetitionFragment) {
            com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.c cVar = this.f256772a;
            universalDeliveryTypeShippingCompetitionFragment.f256747o0 = cVar.sd();
            universalDeliveryTypeShippingCompetitionFragment.f256748p0 = this.f256783l;
            universalDeliveryTypeShippingCompetitionFragment.f256750r0 = cVar.Ad();
            com.avito.android.safedeal.universal_delivery_type.l performanceTracker = this.f256773b.getPerformanceTracker();
            t.c(performanceTracker);
            universalDeliveryTypeShippingCompetitionFragment.f256752t0 = performanceTracker;
            universalDeliveryTypeShippingCompetitionFragment.f256753u0 = this.f256788q.get();
            cVar.W();
        }
    }

    public static b.a a() {
        return new b();
    }
}
