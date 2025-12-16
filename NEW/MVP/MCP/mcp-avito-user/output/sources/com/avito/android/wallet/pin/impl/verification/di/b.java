package com.avito.android.wallet.pin.impl.verification.di;

import android.app.Activity;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.wallet.pin.impl.verification.WalletPinVerificationActivity;
import com.avito.android.wallet.pin.impl.verification.di.c;
import com.avito.android.wallet.pin.impl.verification.mvi.component.A;
import com.avito.android.wallet.pin.impl.verification.mvi.component.C;
import com.avito.android.wallet.pin.impl.verification.mvi.component.i;
import com.avito.android.wallet.pin.impl.verification.mvi.component.w;
import com.avito.android.wallet.pin.impl.verification.mvi.component.y;
import com.avito.android.wallet.pin.impl.verification.mvi.q;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import gj.InterfaceC40691b;
import oP0.C44677b;

/* compiled from: DaggerWalletPinVerificationComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class b {

    /* compiled from: DaggerWalletPinVerificationComponent.java */
    /* renamed from: com.avito.android.wallet.pin.impl.verification.di.b$b, reason: collision with other inner class name */
    public static final class C10218b implements c.a {
        public C10218b() {
        }

        @Override // com.avito.android.wallet.pin.impl.verification.di.c.a
        public final com.avito.android.wallet.pin.impl.verification.di.c a(d dVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, String str, WalletPinVerificationActivity walletPinVerificationActivity) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, c28478k, str, walletPinVerificationActivity, null);
        }
    }

    /* compiled from: DaggerWalletPinVerificationComponent.java */
    public static final class c implements com.avito.android.wallet.pin.impl.verification.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.wallet.pin.impl.verification.di.d f329072a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.wallet.pin.impl.verification.remote.a> f329073b;

        /* renamed from: c, reason: collision with root package name */
        public final l f329074c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f329075d;

        /* renamed from: e, reason: collision with root package name */
        public final C44677b f329076e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f329077f;

        /* renamed from: g, reason: collision with root package name */
        public final u<gj.d> f329078g;

        /* renamed from: h, reason: collision with root package name */
        public final u<a.b> f329079h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f329080i;

        /* renamed from: j, reason: collision with root package name */
        public final l f329081j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f329082k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC40691b> f329083l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.wallet_biometry.f> f329084m;

        /* renamed from: n, reason: collision with root package name */
        public final i f329085n;

        /* renamed from: o, reason: collision with root package name */
        public final u<x> f329086o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.wallet.pin.impl.verification.mvi.component.g f329087p;

        /* renamed from: q, reason: collision with root package name */
        public final A f329088q;

        /* renamed from: r, reason: collision with root package name */
        public final q f329089r;

        /* compiled from: DaggerWalletPinVerificationComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.pin.impl.verification.di.d f329090a;

            public a(com.avito.android.wallet.pin.impl.verification.di.d dVar) {
                this.f329090a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f329090a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerWalletPinVerificationComponent.java */
        /* renamed from: com.avito.android.wallet.pin.impl.verification.di.b$c$b, reason: collision with other inner class name */
        public static final class C10219b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.pin.impl.verification.di.d f329091a;

            public C10219b(com.avito.android.wallet.pin.impl.verification.di.d dVar) {
                this.f329091a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f329091a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerWalletPinVerificationComponent.java */
        /* renamed from: com.avito.android.wallet.pin.impl.verification.di.b$c$c, reason: collision with other inner class name */
        public static final class C10220c implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.pin.impl.verification.di.d f329092a;

            public C10220c(com.avito.android.wallet.pin.impl.verification.di.d dVar) {
                this.f329092a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f329092a.El();
            }
        }

        /* compiled from: DaggerWalletPinVerificationComponent.java */
        public static final class d implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.pin.impl.verification.di.d f329093a;

            public d(com.avito.android.wallet.pin.impl.verification.di.d dVar) {
                this.f329093a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f329093a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerWalletPinVerificationComponent.java */
        public static final class e implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f329094a;

            public e(cv.b bVar) {
                this.f329094a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f329094a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerWalletPinVerificationComponent.java */
        public static final class f implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f329095a;

            public f(cv.b bVar) {
                this.f329095a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f329095a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerWalletPinVerificationComponent.java */
        public static final class g implements u<com.avito.android.wallet_biometry.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.pin.impl.verification.di.d f329096a;

            public g(com.avito.android.wallet.pin.impl.verification.di.d dVar) {
                this.f329096a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f329096a.Mf();
            }
        }

        /* compiled from: DaggerWalletPinVerificationComponent.java */
        public static final class h implements u<com.avito.android.wallet.pin.impl.verification.remote.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.pin.impl.verification.di.d f329097a;

            public h(com.avito.android.wallet.pin.impl.verification.di.d dVar) {
                this.f329097a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.wallet.pin.impl.verification.remote.a aVarQb = this.f329097a.qb();
                t.c(aVarQb);
                return aVarQb;
            }
        }

        public c(com.avito.android.wallet.pin.impl.verification.di.d dVar, cv.b bVar, C28478k c28478k, String str, Activity activity, a aVar) {
            this.f329072a = dVar;
            this.f329073b = new h(dVar);
            this.f329074c = l.a(str);
            this.f329076e = new C44677b(new a(dVar));
            this.f329077f = new e(bVar);
            this.f329078g = new C10220c(dVar);
            this.f329079h = new f(bVar);
            this.f329080i = new C10219b(dVar);
            l lVarA = l.a(c28478k);
            this.f329081j = lVarA;
            u<ScreenPerformanceTracker> uVarD = com.avito.android.actions_sheet.a.D(lVarA, this.f329080i);
            this.f329082k = uVarD;
            this.f329083l = dagger.internal.g.d(new com.avito.android.wallet.pin.impl.verification.di.f(this.f329081j, uVarD, this.f329078g, this.f329077f, this.f329079h));
            this.f329084m = new g(dVar);
            l lVarA2 = l.a(activity);
            u<com.avito.android.wallet.pin.impl.verification.remote.a> uVar = this.f329073b;
            l lVar = this.f329074c;
            C44677b c44677b = this.f329076e;
            u<com.avito.android.deeplink_handler.handler.composite.a> uVar2 = this.f329077f;
            u<InterfaceC40691b> uVar3 = this.f329083l;
            w wVar = new w(uVar, lVar, c44677b, uVar2, uVar3, this.f329084m, lVarA2);
            this.f329085n = new i(wVar);
            this.f329087p = new com.avito.android.wallet.pin.impl.verification.mvi.component.g(wVar, c44677b, uVar3, uVar2, new d(dVar));
            this.f329088q = new A(C.a());
            this.f329089r = new q(new com.avito.android.wallet.pin.impl.verification.mvi.component.l(this.f329085n, this.f329087p, y.a(), this.f329088q, this.f329082k));
        }

        @Override // com.avito.android.wallet.pin.impl.verification.di.c
        public final void a(WalletPinVerificationActivity walletPinVerificationActivity) {
            walletPinVerificationActivity.f329025m = this.f329089r;
            walletPinVerificationActivity.f329027o = this.f329082k.get();
            walletPinVerificationActivity.f329029q = this.f329083l.get();
            walletPinVerificationActivity.f329030r = this.f329072a.Ad();
        }
    }

    public static c.a a() {
        return new C10218b();
    }
}
