package com.avito.android.early_access.di;

import Lx.C14449d;
import Lx.InterfaceC14447b;
import Nx.InterfaceC14620a;
import Qx.InterfaceC14946b;
import android.content.Context;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.early_access.D;
import com.avito.android.early_access.EarlyAccessDialog;
import com.avito.android.early_access.di.b;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.early_access.mvi.C30293j;
import com.avito.android.early_access.mvi.C30298o;
import com.avito.android.early_access.mvi.C30303u;
import com.avito.android.early_access.mvi.C30306x;
import com.avito.android.early_access.mvi.C30308z;
import com.avito.android.early_access.mvi.InterfaceC30301s;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import gk0.InterfaceC40698a;

/* compiled from: DaggerEarlyAccessComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerEarlyAccessComponent.java */
    public static final class b implements com.avito.android.early_access.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f145279a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.early_access.di.c f145280b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f145281c;

        /* renamed from: d, reason: collision with root package name */
        public final u<C28478k> f145282d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f145283e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f145284f;

        /* renamed from: g, reason: collision with root package name */
        public final u<E> f145285g;

        /* renamed from: h, reason: collision with root package name */
        public final l f145286h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC14447b> f145287i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC40698a> f145288j;

        /* renamed from: k, reason: collision with root package name */
        public final u<R0> f145289k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC30301s> f145290l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f145291m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.early_access.u> f145292n;

        /* renamed from: o, reason: collision with root package name */
        public final C30298o f145293o;

        /* renamed from: p, reason: collision with root package name */
        public final u<SK0.b> f145294p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC14946b> f145295q;

        /* renamed from: r, reason: collision with root package name */
        public final C30293j f145296r;

        /* renamed from: s, reason: collision with root package name */
        public final u<Context> f145297s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC14620a> f145298t;

        /* renamed from: u, reason: collision with root package name */
        public final C30308z f145299u;

        /* renamed from: v, reason: collision with root package name */
        public final D f145300v;

        /* compiled from: DaggerEarlyAccessComponent.java */
        /* renamed from: com.avito.android.early_access.di.a$b$a, reason: collision with other inner class name */
        public static final class C4225a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.early_access.di.c f145301a;

            public C4225a(com.avito.android.early_access.di.c cVar) {
                this.f145301a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f145301a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerEarlyAccessComponent.java */
        /* renamed from: com.avito.android.early_access.di.a$b$b, reason: collision with other inner class name */
        public static final class C4226b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.early_access.di.c f145302a;

            public C4226b(com.avito.android.early_access.di.c cVar) {
                this.f145302a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f145302a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerEarlyAccessComponent.java */
        public static final class c implements u<SK0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.early_access.di.c f145303a;

            public c(com.avito.android.early_access.di.c cVar) {
                this.f145303a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SK0.b bVarP = this.f145303a.p();
                t.c(bVarP);
                return bVarP;
            }
        }

        /* compiled from: DaggerEarlyAccessComponent.java */
        public static final class d implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.early_access.di.c f145304a;

            public d(com.avito.android.early_access.di.c cVar) {
                this.f145304a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f145304a.g();
            }
        }

        /* compiled from: DaggerEarlyAccessComponent.java */
        public static final class e implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f145305a;

            public e(cv.b bVar) {
                this.f145305a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f145305a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerEarlyAccessComponent.java */
        public static final class f implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.early_access.di.c f145306a;

            public f(com.avito.android.early_access.di.c cVar) {
                this.f145306a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f145306a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerEarlyAccessComponent.java */
        public static final class g implements u<InterfaceC40698a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.early_access.di.c f145307a;

            public g(com.avito.android.early_access.di.c cVar) {
                this.f145307a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC40698a interfaceC40698aUk = this.f145307a.uk();
                t.c(interfaceC40698aUk);
                return interfaceC40698aUk;
            }
        }

        /* compiled from: DaggerEarlyAccessComponent.java */
        public static final class h implements u<com.avito.android.early_access.u> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.early_access.di.c f145308a;

            public h(com.avito.android.early_access.di.c cVar) {
                this.f145308a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.early_access.u uVarHb = this.f145308a.Hb();
                t.c(uVarHb);
                return uVarHb;
            }
        }

        /* compiled from: DaggerEarlyAccessComponent.java */
        public static final class i implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f145309a;

            public i(InterfaceC30106l7 interfaceC30106l7) {
                this.f145309a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f145309a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.early_access.di.c cVar, InterfaceC30106l7 interfaceC30106l7, cv.b bVar, r rVar, ReEarlyAccessData reEarlyAccessData, Y41.l lVar, C4224a c4224a) {
            this.f145279a = bVar;
            this.f145280b = cVar;
            this.f145281c = new i(interfaceC30106l7);
            u<C28478k> uVarD = dagger.internal.g.d(new com.avito.android.early_access.di.i(l.a(rVar)));
            this.f145282d = uVarD;
            this.f145283e = com.avito.android.advert.item.delivery_suggests.l.i(this.f145281c, uVarD);
            this.f145284f = new C4226b(cVar);
            this.f145285g = new C4225a(cVar);
            l lVarA = l.a(reEarlyAccessData);
            this.f145286h = lVarA;
            this.f145287i = dagger.internal.g.d(new C14449d(lVarA, this.f145284f, this.f145285g));
            u<InterfaceC30301s> uVarD2 = dagger.internal.g.d(new C30303u(this.f145286h, new g(cVar), new f(cVar)));
            this.f145290l = uVarD2;
            this.f145293o = new C30298o(uVarD2, new e(bVar), new h(cVar));
            u<InterfaceC14946b> uVarD3 = dagger.internal.g.d(new Qx.d(new c(cVar)));
            this.f145295q = uVarD3;
            this.f145296r = new C30293j(this.f145286h, uVarD3, this.f145287i, this.f145290l);
            u<InterfaceC14620a> uVarD4 = dagger.internal.g.d(new Nx.c(new d(cVar)));
            this.f145298t = uVarD4;
            this.f145299u = new C30308z(uVarD4);
            this.f145300v = new D(new com.avito.android.early_access.mvi.r(this.f145293o, this.f145296r, C30306x.a(), this.f145299u, this.f145283e, this.f145286h));
        }

        @Override // com.avito.android.early_access.di.b
        public final void a(EarlyAccessDialog earlyAccessDialog) {
            earlyAccessDialog.f145056h0 = this.f145283e.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f145279a.u4();
            t.c(aVarU4);
            earlyAccessDialog.f145057i0 = aVarU4;
            com.avito.android.early_access.di.c cVar = this.f145280b;
            x xVarT = cVar.t();
            t.c(xVarT);
            earlyAccessDialog.f145058j0 = xVarT;
            earlyAccessDialog.f145059k0 = cVar.M0();
            earlyAccessDialog.f145060l0 = this.f145287i.get();
            earlyAccessDialog.f145061m0 = this.f145300v;
        }
    }

    /* compiled from: DaggerEarlyAccessComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.early_access.di.b.a
        public final com.avito.android.early_access.di.b a(com.avito.android.early_access.di.c cVar, InterfaceC30106l7 interfaceC30106l7, InterfaceC39417a interfaceC39417a, r rVar, ReEarlyAccessData reEarlyAccessData, Y41.l lVar) {
            interfaceC39417a.getClass();
            reEarlyAccessData.getClass();
            return new b(cVar, interfaceC30106l7, interfaceC39417a, rVar, reEarlyAccessData, lVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
