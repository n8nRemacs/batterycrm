package com.avito.android.screens.bbip_private.di;

import Zx.C19616a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.screens.bbip_private.BbipPrivateFragment;
import com.avito.android.screens.bbip_private.di.a;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import hh.InterfaceC40934b;
import ih.InterfaceC41399a;

/* compiled from: DaggerBbipPrivateComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class m {

    /* compiled from: DaggerBbipPrivateComponent.java */
    public static final class b implements com.avito.android.screens.bbip_private.di.a {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f260499A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f260500B;

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC40934b f260501a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f260502b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f260503c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC41399a> f260504d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f260505e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Gson> f260506f;

        /* renamed from: g, reason: collision with root package name */
        public final qp0.e f260507g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.screens.bbip_private.domain.a> f260508h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.screens.bbip_private.mvi.f f260509i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.screens.bbip_private.mvi.d f260510j;

        /* renamed from: k, reason: collision with root package name */
        public final u<C19616a> f260511k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.screens.bbip_private.mvi.m f260512l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f260513m;

        /* renamed from: n, reason: collision with root package name */
        public final u<C28478k> f260514n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f260515o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.screens.bbip_private.i f260516p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.l f260517q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.screens.bbip_private.ui.items.header.d> f260518r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f260519s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.screens.bbip_private.ui.items.header.c f260520t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.screens.bbip_private.ui.items.duration.e> f260521u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.screens.bbip_private.ui.items.duration.d f260522v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.screens.bbip_private.ui.items.budget.e> f260523w;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.screens.bbip_private.ui.items.budget.d f260524x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.screens.bbip_private.ui.items.budget_widget.e> f260525y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f260526z;

        /* compiled from: DaggerBbipPrivateComponent.java */
        public static final class a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f260527a;

            public a(InterfaceC40934b interfaceC40934b) {
                this.f260527a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f260527a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerBbipPrivateComponent.java */
        /* renamed from: com.avito.android.screens.bbip_private.di.m$b$b, reason: collision with other inner class name */
        public static final class C7808b implements u<InterfaceC41399a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f260528a;

            public C7808b(InterfaceC40934b interfaceC40934b) {
                this.f260528a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC41399a interfaceC41399aPc = this.f260528a.Pc();
                t.c(interfaceC41399aPc);
                return interfaceC41399aPc;
            }
        }

        /* compiled from: DaggerBbipPrivateComponent.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f260529a;

            public c(InterfaceC40934b interfaceC40934b) {
                this.f260529a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f260529a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerBbipPrivateComponent.java */
        public static final class d implements u<C19616a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f260530a;

            public d(InterfaceC40934b interfaceC40934b) {
                this.f260530a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f260530a.l1();
            }
        }

        /* compiled from: DaggerBbipPrivateComponent.java */
        public static final class e implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f260531a;

            public e(InterfaceC40934b interfaceC40934b) {
                this.f260531a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f260531a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerBbipPrivateComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40934b f260532a;

            public f(InterfaceC40934b interfaceC40934b) {
                this.f260532a = interfaceC40934b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f260532a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(InterfaceC40934b interfaceC40934b, cv.b bVar, r rVar, String str, String str2, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4, a aVar) {
            this.f260501a = interfaceC40934b;
            this.f260502b = bVar;
            this.f260503c = dagger.internal.l.a(str2);
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            C7808b c7808b = new C7808b(interfaceC40934b);
            c cVar = new c(interfaceC40934b);
            qp0.e eVar = new qp0.e(lVarA, new e(interfaceC40934b));
            this.f260507g = eVar;
            u<com.avito.android.screens.bbip_private.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.screens.bbip_private.domain.c(lVarA, c7808b, cVar, eVar));
            this.f260508h = uVarD;
            dagger.internal.l lVar5 = this.f260503c;
            this.f260509i = new com.avito.android.screens.bbip_private.mvi.f(lVar5, uVarD);
            qp0.e eVar2 = this.f260507g;
            this.f260510j = new com.avito.android.screens.bbip_private.mvi.d(lVar5, uVarD, eVar2);
            this.f260512l = new com.avito.android.screens.bbip_private.mvi.m(eVar2, new d(interfaceC40934b));
            this.f260513m = new f(interfaceC40934b);
            u<C28478k> uVarD2 = dagger.internal.g.d(new l(dagger.internal.l.a(rVar)));
            this.f260514n = uVarD2;
            this.f260515o = com.avito.android.advert.item.delivery_suggests.l.i(this.f260513m, uVarD2);
            this.f260516p = new com.avito.android.screens.bbip_private.i(new com.avito.android.screens.bbip_private.mvi.i(this.f260509i, this.f260510j, com.avito.android.screens.bbip_private.mvi.k.a(), this.f260512l, this.f260515o));
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar);
            this.f260517q = lVarA2;
            u<com.avito.android.screens.bbip_private.ui.items.header.d> uVarD3 = dagger.internal.g.d(new com.avito.android.screens.bbip_private.ui.items.header.g(lVarA2));
            this.f260518r = uVarD3;
            a aVar2 = new a(interfaceC40934b);
            this.f260519s = aVar2;
            this.f260520t = new com.avito.android.screens.bbip_private.ui.items.header.c(uVarD3, aVar2);
            u<com.avito.android.screens.bbip_private.ui.items.duration.e> uVarD4 = dagger.internal.g.d(new com.avito.android.screens.bbip_private.ui.items.duration.h(dagger.internal.l.a(lVar2)));
            this.f260521u = uVarD4;
            this.f260522v = new com.avito.android.screens.bbip_private.ui.items.duration.d(uVarD4);
            u<com.avito.android.screens.bbip_private.ui.items.budget.e> uVarD5 = dagger.internal.g.d(new com.avito.android.screens.bbip_private.ui.items.budget.h(dagger.internal.l.a(lVar3)));
            this.f260523w = uVarD5;
            this.f260524x = new com.avito.android.screens.bbip_private.ui.items.budget.d(uVarD5, this.f260519s);
            u<com.avito.android.screens.bbip_private.ui.items.budget_widget.e> uVarD6 = dagger.internal.g.d(new com.avito.android.screens.bbip_private.ui.items.budget_widget.i(dagger.internal.l.a(lVar4), this.f260517q));
            this.f260525y = uVarD6;
            u<com.avito.konveyor.a> uVarD7 = dagger.internal.g.d(new h(this.f260520t, this.f260522v, this.f260524x, new com.avito.android.screens.bbip_private.ui.items.budget_widget.d(uVarD6, this.f260519s)));
            this.f260526z = uVarD7;
            u<com.avito.konveyor.adapter.a> uVarD8 = dagger.internal.g.d(new g(uVarD7));
            this.f260499A = uVarD8;
            this.f260500B = dagger.internal.g.d(new j(uVarD8, this.f260526z));
        }

        @Override // com.avito.android.screens.bbip_private.di.a
        public final void a(BbipPrivateFragment bbipPrivateFragment) {
            bbipPrivateFragment.f260450n0 = this.f260516p;
            bbipPrivateFragment.f260451o0 = this.f260515o.get();
            bbipPrivateFragment.f260452p0 = this.f260500B.get();
            InterfaceC40934b interfaceC40934b = this.f260501a;
            InterfaceC28373a interfaceC28373aA = interfaceC40934b.a();
            t.c(interfaceC28373aA);
            bbipPrivateFragment.f260453q0 = interfaceC28373aA;
            com.avito.android.util.text.a aVarE = interfaceC40934b.e();
            t.c(aVarE);
            bbipPrivateFragment.f260454r0 = aVarE;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f260502b.u4();
            t.c(aVarU4);
            bbipPrivateFragment.f260455s0 = aVarU4;
            SK0.b bVarP = interfaceC40934b.p();
            t.c(bVarP);
            bbipPrivateFragment.f260456t0 = new ZK0.b(bVarP);
        }
    }

    /* compiled from: DaggerBbipPrivateComponent.java */
    public static final class c implements a.InterfaceC7807a {
        public c() {
        }

        @Override // com.avito.android.screens.bbip_private.di.a.InterfaceC7807a
        public final com.avito.android.screens.bbip_private.di.a a(InterfaceC40934b interfaceC40934b, InterfaceC39417a interfaceC39417a, r rVar, String str, String str2, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4) {
            interfaceC39417a.getClass();
            return new b(interfaceC40934b, interfaceC39417a, rVar, str, str2, lVar, lVar2, lVar3, lVar4, null);
        }
    }

    public static a.InterfaceC7807a a() {
        return new c();
    }
}
