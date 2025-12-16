package com.avito.android.wallet.pin.impl.settings.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import com.avito.android.wallet.pin.impl.settings.di.b;
import com.avito.android.wallet.pin.impl.settings.mvi.WalletSecuritySettingsActivity;
import com.avito.android.wallet.pin.impl.settings.mvi.component.h;
import com.avito.android.wallet.pin.impl.settings.mvi.component.j;
import com.avito.android.wallet.pin.impl.settings.mvi.component.m;
import com.avito.android.wallet.pin.impl.settings.mvi.component.o;
import com.avito.android.wallet.pin.impl.settings.mvi.component.s;
import com.avito.android.wallet.pin.impl.settings.mvi.q;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import mP0.InterfaceC43998a;

/* compiled from: DaggerWalletSecuritySettingsComponent.java */
@e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerWalletSecuritySettingsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.wallet.pin.impl.settings.di.b.a
        public final com.avito.android.wallet.pin.impl.settings.di.b a(com.avito.android.wallet.pin.impl.settings.di.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, String str) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, c28478k, str, null);
        }
    }

    /* compiled from: DaggerWalletSecuritySettingsComponent.java */
    public static final class c implements com.avito.android.wallet.pin.impl.settings.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC43998a> f328732a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.wallet_biometry.f> f328733b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f328734c;

        /* renamed from: d, reason: collision with root package name */
        public final j f328735d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f328736e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f328737f;

        /* renamed from: g, reason: collision with root package name */
        public final h f328738g;

        /* renamed from: h, reason: collision with root package name */
        public final s f328739h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f328740i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f328741j;

        /* renamed from: k, reason: collision with root package name */
        public final q f328742k;

        /* compiled from: DaggerWalletSecuritySettingsComponent.java */
        /* renamed from: com.avito.android.wallet.pin.impl.settings.di.a$c$a, reason: collision with other inner class name */
        public static final class C10200a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.pin.impl.settings.di.c f328743a;

            public C10200a(com.avito.android.wallet.pin.impl.settings.di.c cVar) {
                this.f328743a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f328743a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerWalletSecuritySettingsComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.pin.impl.settings.di.c f328744a;

            public b(com.avito.android.wallet.pin.impl.settings.di.c cVar) {
                this.f328744a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f328744a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerWalletSecuritySettingsComponent.java */
        /* renamed from: com.avito.android.wallet.pin.impl.settings.di.a$c$c, reason: collision with other inner class name */
        public static final class C10201c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f328745a;

            public C10201c(cv.b bVar) {
                this.f328745a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f328745a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerWalletSecuritySettingsComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.pin.impl.settings.di.c f328746a;

            public d(com.avito.android.wallet.pin.impl.settings.di.c cVar) {
                this.f328746a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f328746a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerWalletSecuritySettingsComponent.java */
        public static final class e implements u<com.avito.android.wallet_biometry.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.pin.impl.settings.di.c f328747a;

            public e(com.avito.android.wallet.pin.impl.settings.di.c cVar) {
                this.f328747a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f328747a.Mf();
            }
        }

        /* compiled from: DaggerWalletSecuritySettingsComponent.java */
        public static final class f implements u<InterfaceC43998a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.wallet.pin.impl.settings.di.c f328748a;

            public f(com.avito.android.wallet.pin.impl.settings.di.c cVar) {
                this.f328748a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC43998a interfaceC43998aTh = this.f328748a.Th();
                t.c(interfaceC43998aTh);
                return interfaceC43998aTh;
            }
        }

        public c(com.avito.android.wallet.pin.impl.settings.di.c cVar, cv.b bVar, C28478k c28478k, String str, C10199a c10199a) {
            this.f328732a = new f(cVar);
            o oVar = new o(l.a(str), this.f328732a);
            e eVar = new e(cVar);
            this.f328735d = new j(oVar, eVar, new d(cVar));
            this.f328738g = new h(oVar, eVar, new C10201c(bVar), new C10200a(cVar));
            this.f328739h = new s(com.avito.android.wallet.pin.impl.settings.mvi.component.u.a());
            this.f328740i = new b(cVar);
            this.f328741j = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f328740i);
            this.f328742k = new q(new m(this.f328735d, this.f328738g, com.avito.android.wallet.pin.impl.settings.mvi.component.q.a(), this.f328739h, this.f328741j));
        }

        @Override // com.avito.android.wallet.pin.impl.settings.di.b
        public final void a(WalletSecuritySettingsActivity walletSecuritySettingsActivity) {
            walletSecuritySettingsActivity.f328750m = this.f328742k;
            walletSecuritySettingsActivity.f328752o = this.f328741j.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
