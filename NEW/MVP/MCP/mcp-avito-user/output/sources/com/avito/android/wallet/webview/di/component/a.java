package com.avito.android.wallet.webview.di.component;

import com.avito.android.H0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.wallet.webview.WalletWebViewActivity;
import com.avito.android.wallet.webview.di.component.c;
import com.avito.android.wallet.webview.j;
import com.avito.android.wallet.webview.mvi.components.g;
import com.avito.android.wallet.webview.mvi.components.i;
import com.avito.android.wallet.webview.mvi.components.k;
import com.avito.android.wallet.webview.w;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import wP0.C49550b;

/* compiled from: DaggerWalletWebViewComponent.java */
@e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerWalletWebViewComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.wallet.webview.di.component.c.a
        public final com.avito.android.wallet.webview.di.component.c a(d dVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, String str, j jVar, boolean z12) {
            interfaceC39417a.getClass();
            str.getClass();
            return new c(dVar, interfaceC39417a, c28478k, str, jVar, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerWalletWebViewComponent.java */
    public static final class c implements com.avito.android.wallet.webview.di.component.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.wallet.webview.di.component.d f329392a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f329393b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f329394c;

        /* renamed from: d, reason: collision with root package name */
        public final w f329395d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28481c> f329396e;

        /* renamed from: f, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f329397f;

        /* renamed from: g, reason: collision with root package name */
        public final u<B0> f329398g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f329399h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C> f329400i;

        /* renamed from: j, reason: collision with root package name */
        public final u<H0> f329401j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.e> f329402k;

        /* compiled from: DaggerWalletWebViewComponent.java */
        /* renamed from: com.avito.android.wallet.webview.di.component.a$c$a, reason: collision with other inner class name */
        public static final class C10230a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.webview.di.component.d f329403a;

            public C10230a(com.avito.android.wallet.webview.di.component.d dVar) {
                this.f329403a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f329403a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerWalletWebViewComponent.java */
        public static final class b implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.webview.di.component.d f329404a;

            public b(com.avito.android.wallet.webview.di.component.d dVar) {
                this.f329404a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f329404a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerWalletWebViewComponent.java */
        /* renamed from: com.avito.android.wallet.webview.di.component.a$c$c, reason: collision with other inner class name */
        public static final class C10231c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f329405a;

            public C10231c(cv.b bVar) {
                this.f329405a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f329405a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerWalletWebViewComponent.java */
        public static final class d implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.webview.di.component.d f329406a;

            public d(com.avito.android.wallet.webview.di.component.d dVar) {
                this.f329406a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0M = this.f329406a.M();
                t.c(h0M);
                return h0M;
            }
        }

        /* compiled from: DaggerWalletWebViewComponent.java */
        public static final class e implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.webview.di.component.d f329407a;

            public e(com.avito.android.wallet.webview.di.component.d dVar) {
                this.f329407a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f329407a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerWalletWebViewComponent.java */
        public static final class f implements u<B0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.webview.di.component.d f329408a;

            public f(com.avito.android.wallet.webview.di.component.d dVar) {
                this.f329408a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f329408a.s5();
            }
        }

        public c(com.avito.android.wallet.webview.di.component.d dVar, cv.b bVar, C28478k c28478k, String str, j jVar, Boolean bool, C10229a c10229a) {
            this.f329392a = dVar;
            this.f329393b = bVar;
            this.f329395d = new w(new g(new com.avito.android.wallet.webview.mvi.components.d(l.a(bool)), new com.avito.android.wallet.webview.mvi.components.b(new C10231c(bVar)), i.a(), k.a()));
            this.f329396e = new C10230a(dVar);
            this.f329397f = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f329396e);
            this.f329402k = dagger.internal.g.d(new C49550b(new f(dVar), new com.avito.android.cookie_provider.d(new e(dVar)), new b(dVar), new d(dVar)));
        }

        @Override // com.avito.android.wallet.webview.di.component.c
        public final void a(WalletWebViewActivity walletWebViewActivity) {
            walletWebViewActivity.f329350m = this.f329395d;
            walletWebViewActivity.f329352o = this.f329397f.get();
            walletWebViewActivity.f329353p = this.f329402k.get();
            walletWebViewActivity.f329354q = new com.avito.android.wallet.webview.l();
            com.avito.android.wallet.webview.di.component.d dVar = this.f329392a;
            InterfaceC35745a5 interfaceC35745a5D = dVar.d();
            t.c(interfaceC35745a5D);
            walletWebViewActivity.f329355r = interfaceC35745a5D;
            x xVarQ = dVar.q();
            t.c(xVarQ);
            walletWebViewActivity.f329356s = xVarQ;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f329393b.u4();
            t.c(aVarU4);
            walletWebViewActivity.f329357t = aVarU4;
            InterfaceC28373a interfaceC28373aA = dVar.a();
            t.c(interfaceC28373aA);
            walletWebViewActivity.f329358u = interfaceC28373aA;
        }
    }

    public static c.a a() {
        return new b();
    }
}
