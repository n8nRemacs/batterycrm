package com.avito.android.wallet.pin.impl.creation.di;

import android.app.Activity;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.wallet.pin.impl.creation.WalletPinCreationActivity;
import com.avito.android.wallet.pin.impl.creation.di.b;
import com.avito.android.wallet.pin.impl.creation.mvi.components.j;
import com.avito.android.wallet.pin.impl.creation.mvi.components.o;
import com.avito.android.wallet.pin.impl.creation.mvi.components.q;
import com.avito.android.wallet.pin.impl.creation.mvi.components.s;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import gP0.InterfaceC40610a;
import gj.InterfaceC40691b;

/* compiled from: DaggerWalletPinCreationComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerWalletPinCreationComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.wallet.pin.impl.creation.di.b.a
        public final com.avito.android.wallet.pin.impl.creation.di.b a(com.avito.android.wallet.pin.impl.creation.di.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, String str, WalletPinCreationActivity walletPinCreationActivity) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, c28478k, str, walletPinCreationActivity, null);
        }
    }

    /* compiled from: DaggerWalletPinCreationComponent.java */
    public static final class c implements com.avito.android.wallet.pin.impl.creation.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.wallet.pin.impl.creation.di.c f328480a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC40610a> f328481b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.wallet.pin.impl.creation.mvi.b f328482c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.wallet_biometry.f> f328483d;

        /* renamed from: e, reason: collision with root package name */
        public final l f328484e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f328485f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.wallet.pin.impl.creation.mvi.components.l f328486g;

        /* renamed from: h, reason: collision with root package name */
        public final u<gj.d> f328487h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f328488i;

        /* renamed from: j, reason: collision with root package name */
        public final u<a.b> f328489j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f328490k;

        /* renamed from: l, reason: collision with root package name */
        public final l f328491l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f328492m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC40691b> f328493n;

        /* renamed from: o, reason: collision with root package name */
        public final j f328494o;

        /* renamed from: p, reason: collision with root package name */
        public final s f328495p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.wallet.pin.impl.creation.mvi.u f328496q;

        /* compiled from: DaggerWalletPinCreationComponent.java */
        /* renamed from: com.avito.android.wallet.pin.impl.creation.di.a$c$a, reason: collision with other inner class name */
        public static final class C10192a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.pin.impl.creation.di.c f328497a;

            public C10192a(com.avito.android.wallet.pin.impl.creation.di.c cVar) {
                this.f328497a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f328497a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerWalletPinCreationComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.pin.impl.creation.di.c f328498a;

            public b(com.avito.android.wallet.pin.impl.creation.di.c cVar) {
                this.f328498a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f328498a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerWalletPinCreationComponent.java */
        /* renamed from: com.avito.android.wallet.pin.impl.creation.di.a$c$c, reason: collision with other inner class name */
        public static final class C10193c implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.pin.impl.creation.di.c f328499a;

            public C10193c(com.avito.android.wallet.pin.impl.creation.di.c cVar) {
                this.f328499a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f328499a.El();
            }
        }

        /* compiled from: DaggerWalletPinCreationComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f328500a;

            public d(cv.b bVar) {
                this.f328500a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f328500a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerWalletPinCreationComponent.java */
        public static final class e implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f328501a;

            public e(cv.b bVar) {
                this.f328501a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f328501a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        /* compiled from: DaggerWalletPinCreationComponent.java */
        public static final class f implements u<InterfaceC40610a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.pin.impl.creation.di.c f328502a;

            public f(com.avito.android.wallet.pin.impl.creation.di.c cVar) {
                this.f328502a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC40610a interfaceC40610aNi = this.f328502a.ni();
                t.c(interfaceC40610aNi);
                return interfaceC40610aNi;
            }
        }

        /* compiled from: DaggerWalletPinCreationComponent.java */
        public static final class g implements u<com.avito.android.wallet_biometry.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.pin.impl.creation.di.c f328503a;

            public g(com.avito.android.wallet.pin.impl.creation.di.c cVar) {
                this.f328503a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f328503a.Mf();
            }
        }

        public c(com.avito.android.wallet.pin.impl.creation.di.c cVar, cv.b bVar, C28478k c28478k, String str, Activity activity, C10191a c10191a) {
            this.f328480a = cVar;
            this.f328482c = new com.avito.android.wallet.pin.impl.creation.mvi.b(new f(cVar));
            this.f328483d = new g(cVar);
            l lVarA = l.a(str);
            this.f328484e = lVarA;
            C10192a c10192a = new C10192a(cVar);
            this.f328485f = c10192a;
            this.f328486g = new com.avito.android.wallet.pin.impl.creation.mvi.components.l(this.f328482c, this.f328483d, lVarA, c10192a);
            this.f328487h = new C10193c(cVar);
            this.f328488i = new d(bVar);
            this.f328489j = new e(bVar);
            this.f328490k = new b(cVar);
            l lVarA2 = l.a(c28478k);
            this.f328491l = lVarA2;
            u<ScreenPerformanceTracker> uVarD = com.avito.android.actions_sheet.a.D(lVarA2, this.f328490k);
            this.f328492m = uVarD;
            this.f328493n = dagger.internal.g.d(new com.avito.android.wallet.pin.impl.creation.di.e(this.f328491l, uVarD, this.f328487h, this.f328488i, this.f328489j));
            this.f328494o = new j(this.f328482c, this.f328484e, this.f328485f, this.f328493n, this.f328483d, this.f328488i, l.a(activity));
            this.f328495p = new s(com.avito.android.wallet.pin.impl.creation.mvi.components.u.a());
            this.f328496q = new com.avito.android.wallet.pin.impl.creation.mvi.u(new o(this.f328486g, this.f328494o, q.a(), this.f328495p, this.f328492m));
        }

        @Override // com.avito.android.wallet.pin.impl.creation.di.b
        public final void a(WalletPinCreationActivity walletPinCreationActivity) {
            walletPinCreationActivity.f328433m = this.f328496q;
            walletPinCreationActivity.f328435o = this.f328492m.get();
            walletPinCreationActivity.f328437q = this.f328493n.get();
            walletPinCreationActivity.f328438r = this.f328480a.Ad();
        }
    }

    public static b.a a() {
        return new b();
    }
}
