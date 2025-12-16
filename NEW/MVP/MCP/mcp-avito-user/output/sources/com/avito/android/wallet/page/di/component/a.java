package com.avito.android.wallet.page.di.component;

import aP0.InterfaceC19802a;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.wallet.page.WalletPageActivity;
import com.avito.android.wallet.page.di.component.d;
import com.avito.android.wallet.page.mvi.component.n;
import com.avito.android.wallet.page.mvi.component.p;
import com.avito.android.wallet.page.mvi.component.s;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerWalletPageComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerWalletPageComponent.java */
    public static final class b implements d.a {
        public b() {
        }

        @Override // com.avito.android.wallet.page.di.component.d.a
        public final d a(e eVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, String str, boolean z12) {
            interfaceC39417a.getClass();
            return new c(eVar, interfaceC39417a, c28478k, str, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerWalletPageComponent.java */
    public static final class c implements com.avito.android.wallet.page.di.component.d {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.wallet.page.di.component.e f327792a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC19802a> f327793b;

        /* renamed from: c, reason: collision with root package name */
        public final u<NO0.a> f327794c;

        /* renamed from: d, reason: collision with root package name */
        public final l f327795d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f327796e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.wallet.page.mvi.component.i f327797f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f327798g;

        /* renamed from: h, reason: collision with root package name */
        public final u<x> f327799h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC36134w1> f327800i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.wallet.page.c> f327801j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.beduin.ui.universal.h> f327802k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.wallet.page.mvi.component.g f327803l;

        /* renamed from: m, reason: collision with root package name */
        public final p f327804m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28481c> f327805n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f327806o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.wallet.page.mvi.i f327807p;

        /* compiled from: DaggerWalletPageComponent.java */
        /* renamed from: com.avito.android.wallet.page.di.component.a$c$a, reason: collision with other inner class name */
        public static final class C10163a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327808a;

            public C10163a(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327808a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f327808a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerWalletPageComponent.java */
        public static final class b implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327809a;

            public b(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327809a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f327809a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerWalletPageComponent.java */
        /* renamed from: com.avito.android.wallet.page.di.component.a$c$c, reason: collision with other inner class name */
        public static final class C10164c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f327810a;

            public C10164c(cv.b bVar) {
                this.f327810a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f327810a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerWalletPageComponent.java */
        public static final class d implements u<InterfaceC36134w1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327811a;

            public d(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327811a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f327811a.G1();
            }
        }

        /* compiled from: DaggerWalletPageComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327812a;

            public e(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327812a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f327812a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerWalletPageComponent.java */
        public static final class f implements u<com.avito.android.beduin.ui.universal.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327813a;

            public f(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327813a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f327813a.Gl();
            }
        }

        /* compiled from: DaggerWalletPageComponent.java */
        public static final class g implements u<InterfaceC19802a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327814a;

            public g(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327814a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19802a interfaceC19802aMg = this.f327814a.mg();
                t.c(interfaceC19802aMg);
                return interfaceC19802aMg;
            }
        }

        /* compiled from: DaggerWalletPageComponent.java */
        public static final class h implements u<NO0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327815a;

            public h(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327815a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                NO0.a aVarCd = this.f327815a.cd();
                t.c(aVarCd);
                return aVarCd;
            }
        }

        /* compiled from: DaggerWalletPageComponent.java */
        public static final class i implements u<com.avito.android.wallet.page.c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.page.di.component.e f327816a;

            public i(com.avito.android.wallet.page.di.component.e eVar) {
                this.f327816a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f327816a.l3();
            }
        }

        public c(com.avito.android.wallet.page.di.component.e eVar, cv.b bVar, C28478k c28478k, String str, Boolean bool, C10162a c10162a) {
            this.f327792a = eVar;
            this.f327793b = new g(eVar);
            this.f327794c = new h(eVar);
            this.f327795d = l.b(str);
            com.avito.android.wallet.page.mvi.b bVar2 = new com.avito.android.wallet.page.mvi.b(this.f327795d, l.a(bool), this.f327793b, this.f327794c);
            C10163a c10163a = new C10163a(eVar);
            this.f327797f = new com.avito.android.wallet.page.mvi.component.i(bVar2, c10163a);
            C10164c c10164c = new C10164c(bVar);
            b bVar3 = new b(eVar);
            this.f327803l = new com.avito.android.wallet.page.mvi.component.g(c10164c, bVar3, bVar2, c10163a, new d(eVar), new i(eVar), new f(eVar));
            this.f327804m = new p(new s(bVar3));
            this.f327805n = new e(eVar);
            this.f327806o = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f327805n);
            this.f327807p = new com.avito.android.wallet.page.mvi.i(new com.avito.android.wallet.page.mvi.component.l(this.f327797f, this.f327803l, n.a(), this.f327804m, this.f327806o));
        }

        @Override // com.avito.android.wallet.page.di.component.d
        public final void a(WalletPageActivity walletPageActivity) {
            walletPageActivity.f327738m = this.f327807p;
            walletPageActivity.f327740o = this.f327806o.get();
            com.avito.android.util.text.a aVarE = this.f327792a.e();
            t.c(aVarE);
            walletPageActivity.f327741p = aVarE;
        }
    }

    public static d.a a() {
        return new b();
    }
}
