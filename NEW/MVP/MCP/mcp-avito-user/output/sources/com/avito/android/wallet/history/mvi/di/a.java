package com.avito.android.wallet.history.mvi.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.wallet.history.WalletHistoryActivity;
import com.avito.android.wallet.history.mvi.C36142g;
import com.avito.android.wallet.history.mvi.I;
import com.avito.android.wallet.history.mvi.components.j;
import com.avito.android.wallet.history.mvi.components.n;
import com.avito.android.wallet.history.mvi.components.p;
import com.avito.android.wallet.history.mvi.components.r;
import com.avito.android.wallet.history.mvi.di.c;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerWalletHistoryComponent.java */
@e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerWalletHistoryComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.wallet.history.mvi.di.c.a
        public final com.avito.android.wallet.history.mvi.di.c a(d dVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, String str) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, c28478k, str, null);
        }
    }

    /* compiled from: DaggerWalletHistoryComponent.java */
    public static final class c implements com.avito.android.wallet.history.mvi.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final u<IO0.a> f327621a;

        /* renamed from: b, reason: collision with root package name */
        public final u<DO0.a> f327622b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f327623c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.wallet.history.feature.a> f327624d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.wallet.history.mvi.components.g f327625e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f327626f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.wallet.history.mvi.components.e f327627g;

        /* renamed from: h, reason: collision with root package name */
        public final u<x> f327628h;

        /* renamed from: i, reason: collision with root package name */
        public final p f327629i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f327630j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f327631k;

        /* renamed from: l, reason: collision with root package name */
        public final I f327632l;

        /* compiled from: DaggerWalletHistoryComponent.java */
        /* renamed from: com.avito.android.wallet.history.mvi.di.a$c$a, reason: collision with other inner class name */
        public static final class C10155a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.history.mvi.di.d f327633a;

            public C10155a(com.avito.android.wallet.history.mvi.di.d dVar) {
                this.f327633a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f327633a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerWalletHistoryComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.history.mvi.di.d f327634a;

            public b(com.avito.android.wallet.history.mvi.di.d dVar) {
                this.f327634a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f327634a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerWalletHistoryComponent.java */
        /* renamed from: com.avito.android.wallet.history.mvi.di.a$c$c, reason: collision with other inner class name */
        public static final class C10156c implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.history.mvi.di.d f327635a;

            public C10156c(com.avito.android.wallet.history.mvi.di.d dVar) {
                this.f327635a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f327635a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerWalletHistoryComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f327636a;

            public d(cv.b bVar) {
                this.f327636a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f327636a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerWalletHistoryComponent.java */
        public static final class e implements u<DO0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.history.mvi.di.d f327637a;

            public e(com.avito.android.wallet.history.mvi.di.d dVar) {
                this.f327637a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                DO0.a aVarRj = this.f327637a.rj();
                t.c(aVarRj);
                return aVarRj;
            }
        }

        /* compiled from: DaggerWalletHistoryComponent.java */
        public static final class f implements u<com.avito.android.wallet.history.feature.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.history.mvi.di.d f327638a;

            public f(com.avito.android.wallet.history.mvi.di.d dVar) {
                this.f327638a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f327638a.Ol();
            }
        }

        /* compiled from: DaggerWalletHistoryComponent.java */
        public static final class g implements u<IO0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.history.mvi.di.d f327639a;

            public g(com.avito.android.wallet.history.mvi.di.d dVar) {
                this.f327639a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IO0.a aVarKj = this.f327639a.kj();
                t.c(aVarKj);
                return aVarKj;
            }
        }

        public c(com.avito.android.wallet.history.mvi.di.d dVar, cv.b bVar, C28478k c28478k, String str, C10154a c10154a) {
            this.f327621a = new g(dVar);
            this.f327622b = new e(dVar);
            this.f327623c = new C10155a(dVar);
            this.f327624d = new f(dVar);
            l lVarA = l.a(str);
            u<IO0.a> uVar = this.f327621a;
            u<DO0.a> uVar2 = this.f327622b;
            u<InterfaceC28373a> uVar3 = this.f327623c;
            C36142g c36142g = new C36142g(lVarA, uVar, uVar2, uVar3, this.f327624d);
            this.f327625e = new com.avito.android.wallet.history.mvi.components.g(c36142g);
            this.f327627g = new com.avito.android.wallet.history.mvi.components.e(c36142g, uVar3, new d(bVar));
            this.f327629i = new p(new com.avito.android.wallet.history.mvi.components.l(new C10156c(dVar)), r.a());
            this.f327630j = new b(dVar);
            this.f327631k = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f327630j);
            this.f327632l = new I(new j(this.f327625e, this.f327627g, n.a(), this.f327629i, this.f327631k));
        }

        @Override // com.avito.android.wallet.history.mvi.di.c
        public final void a(WalletHistoryActivity walletHistoryActivity) {
            walletHistoryActivity.f327506m = this.f327632l;
            walletHistoryActivity.f327508o = this.f327631k.get();
        }
    }

    public static c.a a() {
        return new b();
    }
}
