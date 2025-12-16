package com.avito.android.cpx_promo.impl.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpx_promo.impl.CpxPromoFragment;
import com.avito.android.cpx_promo.impl.di.a;
import com.avito.android.cpx_promo.impl.h;
import com.avito.android.cpx_promo.impl.j;
import com.avito.android.cpx_promo.impl.mvi.m;
import com.avito.android.cpx_promo.impl.mvi.o;
import com.avito.android.cpx_promo.impl.mvi.v;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import gs.InterfaceC40725a;
import java.util.Locale;

/* compiled from: DaggerCpxPromoComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class i {

    /* compiled from: DaggerCpxPromoComponent.java */
    public static final class b implements com.avito.android.cpx_promo.impl.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f126951a;

        /* renamed from: b, reason: collision with root package name */
        public final l f126952b;

        /* renamed from: c, reason: collision with root package name */
        public final l f126953c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC40725a> f126954d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f126955e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f126956f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Locale> f126957g;

        /* renamed from: h, reason: collision with root package name */
        public final o f126958h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f126959i;

        /* renamed from: j, reason: collision with root package name */
        public final m f126960j;

        /* renamed from: k, reason: collision with root package name */
        public final v f126961k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f126962l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C28478k> f126963m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f126964n;

        /* renamed from: o, reason: collision with root package name */
        public final l f126965o;

        /* compiled from: DaggerCpxPromoComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo.impl.di.d f126966a;

            public a(com.avito.android.cpx_promo.impl.di.d dVar) {
                this.f126966a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f126966a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCpxPromoComponent.java */
        /* renamed from: com.avito.android.cpx_promo.impl.di.i$b$b, reason: collision with other inner class name */
        public static final class C3783b implements u<InterfaceC40725a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo.impl.di.d f126967a;

            public C3783b(com.avito.android.cpx_promo.impl.di.d dVar) {
                this.f126967a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC40725a interfaceC40725aN6 = this.f126967a.N6();
                t.c(interfaceC40725aN6);
                return interfaceC40725aN6;
            }
        }

        /* compiled from: DaggerCpxPromoComponent.java */
        public static final class c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f126968a;

            public c(cv.b bVar) {
                this.f126968a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f126968a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCpxPromoComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo.impl.di.d f126969a;

            public d(com.avito.android.cpx_promo.impl.di.d dVar) {
                this.f126969a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f126969a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCpxPromoComponent.java */
        public static final class e implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo.impl.di.d f126970a;

            public e(com.avito.android.cpx_promo.impl.di.d dVar) {
                this.f126970a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f126970a.locale();
            }
        }

        /* compiled from: DaggerCpxPromoComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo.impl.di.d f126971a;

            public f(com.avito.android.cpx_promo.impl.di.d dVar) {
                this.f126971a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f126971a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(g gVar, com.avito.android.cpx_promo.impl.di.d dVar, cv.b bVar, r rVar, String str, String str2, String str3, a aVar) {
            this.f126951a = bVar;
            this.f126952b = l.a(str);
            this.f126953c = l.a(str2);
            l lVarA = l.a(str3);
            C3783b c3783b = new C3783b(dVar);
            a aVar2 = new a(dVar);
            com.avito.android.cpx_promo.impl.interactor.g gVar2 = new com.avito.android.cpx_promo.impl.interactor.g(c3783b, aVar2);
            d dVar2 = new d(dVar);
            com.avito.android.cpx_promo.c cVar = new com.avito.android.cpx_promo.c(new e(dVar));
            fs.c cVar2 = new fs.c(cVar);
            l lVar = this.f126952b;
            l lVar2 = this.f126953c;
            this.f126958h = new o(lVar, lVar2, lVarA, gVar2, dVar2, cVar2, aVar2);
            this.f126960j = new m(lVar, lVar2, gVar2, dVar2, cVar2, new c(bVar), aVar2);
            this.f126961k = new v(cVar);
            this.f126962l = new f(dVar);
            u<C28478k> uVarD = dagger.internal.g.d(new h(gVar, l.a(rVar)));
            this.f126963m = uVarD;
            this.f126964n = com.avito.android.advert.item.delivery_suggests.l.i(this.f126962l, uVarD);
            this.f126965o = l.a(new j(new com.avito.android.cpx_promo.impl.i(new com.avito.android.cpx_promo.impl.mvi.r(this.f126958h, this.f126960j, com.avito.android.cpx_promo.impl.mvi.t.a(), this.f126961k, this.f126964n))));
        }

        @Override // com.avito.android.cpx_promo.impl.di.a
        public final void a(CpxPromoFragment cpxPromoFragment) {
            cpxPromoFragment.f126890n0 = (h.a) this.f126965o.f393949a;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f126951a.u4();
            t.c(aVarU4);
            cpxPromoFragment.f126892p0 = aVarU4;
            cpxPromoFragment.f126893q0 = this.f126964n.get();
        }
    }

    /* compiled from: DaggerCpxPromoComponent.java */
    public static final class c implements a.d {
        public c() {
        }

        @Override // com.avito.android.cpx_promo.impl.di.a.d
        public final com.avito.android.cpx_promo.impl.di.a a(d dVar, r rVar, InterfaceC39417a interfaceC39417a, String str, String str2, String str3) {
            interfaceC39417a.getClass();
            return new b(new g(), dVar, interfaceC39417a, rVar, str, str2, str3, null);
        }
    }

    public static a.d a() {
        return new c();
    }
}
