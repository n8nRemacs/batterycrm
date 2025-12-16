package com.avito.android.cpx_promo.v2.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpx_promo.v2.CpxPromoV2Fragment;
import com.avito.android.cpx_promo.v2.di.a;
import com.avito.android.cpx_promo.v2.mvi.o;
import com.avito.android.cpx_promo.v2.mvi.q;
import com.avito.android.cpx_promo.v2.mvi.v;
import com.avito.android.cpx_promo.v2.mvi.x;
import com.avito.android.cpx_promo.v2.r;
import com.avito.android.util.R0;
import cs.InterfaceC39404a;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import gs.InterfaceC40725a;
import java.util.Locale;
import ls.C43824c;

/* compiled from: DaggerCpxPromoV2Component.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class k {

    /* compiled from: DaggerCpxPromoV2Component.java */
    public static final class b implements com.avito.android.cpx_promo.v2.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f127427a;

        /* renamed from: b, reason: collision with root package name */
        public final l f127428b;

        /* renamed from: c, reason: collision with root package name */
        public final l f127429c;

        /* renamed from: d, reason: collision with root package name */
        public final l f127430d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC40725a> f127431e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC39404a> f127432f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f127433g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.cpx_promo.v2.domain.g f127434h;

        /* renamed from: i, reason: collision with root package name */
        public final u<R0> f127435i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Locale> f127436j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.cpx_promo.c f127437k;

        /* renamed from: l, reason: collision with root package name */
        public final q f127438l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f127439m;

        /* renamed from: n, reason: collision with root package name */
        public final o f127440n;

        /* renamed from: o, reason: collision with root package name */
        public final x f127441o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC28481c> f127442p;

        /* renamed from: q, reason: collision with root package name */
        public final u<C28478k> f127443q;

        /* renamed from: r, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f127444r;

        /* renamed from: s, reason: collision with root package name */
        public final r f127445s;

        /* compiled from: DaggerCpxPromoV2Component.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo.v2.di.f f127446a;

            public a(com.avito.android.cpx_promo.v2.di.f fVar) {
                this.f127446a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f127446a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCpxPromoV2Component.java */
        /* renamed from: com.avito.android.cpx_promo.v2.di.k$b$b, reason: collision with other inner class name */
        public static final class C3792b implements u<InterfaceC40725a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo.v2.di.f f127447a;

            public C3792b(com.avito.android.cpx_promo.v2.di.f fVar) {
                this.f127447a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC40725a interfaceC40725aN6 = this.f127447a.N6();
                t.c(interfaceC40725aN6);
                return interfaceC40725aN6;
            }
        }

        /* compiled from: DaggerCpxPromoV2Component.java */
        public static final class c implements u<InterfaceC39404a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo.v2.di.f f127448a;

            public c(com.avito.android.cpx_promo.v2.di.f fVar) {
                this.f127448a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39404a interfaceC39404aIg = this.f127448a.Ig();
                t.c(interfaceC39404aIg);
                return interfaceC39404aIg;
            }
        }

        /* compiled from: DaggerCpxPromoV2Component.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f127449a;

            public d(cv.b bVar) {
                this.f127449a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f127449a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCpxPromoV2Component.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo.v2.di.f f127450a;

            public e(com.avito.android.cpx_promo.v2.di.f fVar) {
                this.f127450a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f127450a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCpxPromoV2Component.java */
        public static final class f implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo.v2.di.f f127451a;

            public f(com.avito.android.cpx_promo.v2.di.f fVar) {
                this.f127451a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f127451a.locale();
            }
        }

        /* compiled from: DaggerCpxPromoV2Component.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo.v2.di.f f127452a;

            public g(com.avito.android.cpx_promo.v2.di.f fVar) {
                this.f127452a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f127452a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(i iVar, com.avito.android.cpx_promo.v2.di.f fVar, cv.b bVar, com.avito.android.analytics.screens.r rVar, String str, String str2, String str3, a aVar) {
            this.f127427a = bVar;
            this.f127428b = l.a(str);
            this.f127429c = l.a(str2);
            this.f127430d = l.a(str3);
            C3792b c3792b = new C3792b(fVar);
            c cVar = new c(fVar);
            a aVar2 = new a(fVar);
            this.f127433g = aVar2;
            this.f127434h = new com.avito.android.cpx_promo.v2.domain.g(c3792b, cVar, aVar2);
            this.f127435i = new e(fVar);
            com.avito.android.cpx_promo.c cVar2 = new com.avito.android.cpx_promo.c(new f(fVar));
            this.f127437k = cVar2;
            C43824c c43824c = new C43824c(cVar2, com.avito.android.cpx_promo.v2.b.a());
            l lVar = this.f127428b;
            l lVar2 = this.f127429c;
            l lVar3 = this.f127430d;
            com.avito.android.cpx_promo.v2.domain.g gVar = this.f127434h;
            u<R0> uVar = this.f127435i;
            u<InterfaceC28373a> uVar2 = this.f127433g;
            this.f127438l = new q(lVar, lVar2, lVar3, gVar, uVar, c43824c, uVar2);
            this.f127440n = new o(lVar, lVar2, gVar, uVar, c43824c, new d(bVar), uVar2);
            this.f127441o = new x(this.f127437k);
            this.f127442p = new g(fVar);
            u<C28478k> uVarD = dagger.internal.g.d(new j(iVar, l.a(rVar)));
            this.f127443q = uVarD;
            this.f127444r = com.avito.android.advert.item.delivery_suggests.l.i(this.f127442p, uVarD);
            this.f127445s = new r(new com.avito.android.cpx_promo.v2.mvi.t(this.f127438l, this.f127440n, v.a(), this.f127441o, this.f127444r));
        }

        @Override // com.avito.android.cpx_promo.v2.di.a
        public final void a(CpxPromoV2Fragment cpxPromoV2Fragment) {
            cpxPromoV2Fragment.f127347n0 = this.f127445s;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f127427a.u4();
            t.c(aVarU4);
            cpxPromoV2Fragment.f127349p0 = aVarU4;
            cpxPromoV2Fragment.f127350q0 = this.f127444r.get();
        }
    }

    /* compiled from: DaggerCpxPromoV2Component.java */
    public static final class c implements a.d {
        public c() {
        }

        @Override // com.avito.android.cpx_promo.v2.di.a.d
        public final com.avito.android.cpx_promo.v2.di.a a(f fVar, com.avito.android.analytics.screens.r rVar, InterfaceC39417a interfaceC39417a, String str, String str2, String str3) {
            interfaceC39417a.getClass();
            return new b(new i(), fVar, interfaceC39417a, rVar, str, str2, str3, null);
        }
    }

    public static a.d a() {
        return new c();
    }
}
