package com.avito.android.trx_promo_impl.status_screen.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.trx_promo_impl.di.l;
import com.avito.android.trx_promo_impl.status_screen.TrxPromoStatusFragment;
import com.avito.android.trx_promo_impl.status_screen.di.b;
import com.avito.android.trx_promo_impl.status_screen.mvi.k;
import com.avito.android.trx_promo_public.data.TrxPromoStatus;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTrxPromoStatusComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTrxPromoStatusComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.trx_promo_impl.status_screen.di.b.a
        public final com.avito.android.trx_promo_impl.status_screen.di.b a(l lVar, InterfaceC39417a interfaceC39417a, Screen screen, r rVar, String str, String str2, boolean z12, TrxPromoStatus trxPromoStatus) {
            interfaceC39417a.getClass();
            screen.getClass();
            str.getClass();
            return new c(lVar, interfaceC39417a, screen, rVar, str, str2, Boolean.valueOf(z12), trxPromoStatus, null);
        }
    }

    /* compiled from: DaggerTrxPromoStatusComponent.java */
    public static final class c implements com.avito.android.trx_promo_impl.status_screen.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f304410a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f304411b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f304412c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TF0.a> f304413d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f304414e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.trx_promo_impl.status_screen.domain.a> f304415f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.trx_promo_impl.status_screen.mvi.d f304416g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f304417h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.trx_promo_impl.status_screen.mvi.b f304418i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f304419j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f304420k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f304421l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f304422m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.trx_promo_impl.status_screen.i f304423n;

        /* compiled from: DaggerTrxPromoStatusComponent.java */
        /* renamed from: com.avito.android.trx_promo_impl.status_screen.di.a$c$a, reason: collision with other inner class name */
        public static final class C9346a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f304424a;

            public C9346a(l lVar) {
                this.f304424a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f304424a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerTrxPromoStatusComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final l f304425a;

            public b(l lVar) {
                this.f304425a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f304425a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTrxPromoStatusComponent.java */
        /* renamed from: com.avito.android.trx_promo_impl.status_screen.di.a$c$c, reason: collision with other inner class name */
        public static final class C9347c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final l f304426a;

            public C9347c(l lVar) {
                this.f304426a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f304426a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerTrxPromoStatusComponent.java */
        public static final class d implements u<TF0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f304427a;

            public d(l lVar) {
                this.f304427a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                TF0.a aVarBk = this.f304427a.Bk();
                t.c(aVarBk);
                return aVarBk;
            }
        }

        public c(l lVar, cv.b bVar, Screen screen, r rVar, String str, String str2, Boolean bool, TrxPromoStatus trxPromoStatus, C9345a c9345a) {
            this.f304410a = bVar;
            this.f304411b = dagger.internal.l.a(bool);
            this.f304412c = dagger.internal.l.a(trxPromoStatus);
            u<com.avito.android.trx_promo_impl.status_screen.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.trx_promo_impl.status_screen.domain.d(dagger.internal.l.a(str2), this.f304412c, new d(lVar), new b(lVar)));
            this.f304415f = uVarD;
            this.f304416g = new com.avito.android.trx_promo_impl.status_screen.mvi.d(uVarD);
            this.f304418i = new com.avito.android.trx_promo_impl.status_screen.mvi.b(uVarD, new C9346a(lVar));
            this.f304419j = new C9347c(lVar);
            this.f304420k = dagger.internal.l.a(screen);
            this.f304421l = dagger.internal.l.a(rVar);
            this.f304422m = dagger.internal.g.d(new com.avito.android.trx_promo_impl.di.c(this.f304420k, this.f304421l, dagger.internal.l.a(str), this.f304419j));
            this.f304423n = new com.avito.android.trx_promo_impl.status_screen.i(new com.avito.android.trx_promo_impl.status_screen.mvi.g(this.f304411b, this.f304412c, this.f304416g, this.f304418i, com.avito.android.trx_promo_impl.status_screen.mvi.i.a(), k.a(), this.f304422m));
        }

        @Override // com.avito.android.trx_promo_impl.status_screen.di.b
        public final void a(TrxPromoStatusFragment trxPromoStatusFragment) {
            trxPromoStatusFragment.f304372n0 = this.f304423n;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f304410a.u4();
            t.c(aVarU4);
            trxPromoStatusFragment.f304373o0 = aVarU4;
            trxPromoStatusFragment.f304374p0 = this.f304422m.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
