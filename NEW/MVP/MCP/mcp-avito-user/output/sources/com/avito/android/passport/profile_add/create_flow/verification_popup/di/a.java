package com.avito.android.passport.profile_add.create_flow.verification_popup.di;

import Y41.l;
import androidx.view.S0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.verification_popup.VerificationPopupArguments;
import com.avito.android.passport.profile_add.create_flow.verification_popup.VerificationPopupFragment;
import com.avito.android.passport.profile_add.create_flow.verification_popup.di.b;
import com.avito.android.passport.profile_add.create_flow.verification_popup.j;
import com.avito.android.passport.profile_add.create_flow.verification_popup.mvi.h;
import com.avito.android.passport.profile_add.perf_const.VerificationPopupScreen;
import com.avito.android.util.architecture_components.D;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;
import kotlinx.coroutines.flow.Z1;

/* compiled from: DaggerVerificationPopupComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerVerificationPopupComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.passport.profile_add.create_flow.verification_popup.di.b.a
        public final com.avito.android.passport.profile_add.create_flow.verification_popup.di.b a(com.avito.android.passport.profile_add.di.a aVar, S0 s02, VerificationPopupArguments verificationPopupArguments, InterfaceC39417a interfaceC39417a, Z1 z12, Z1 z13, D d12, r rVar, VerificationPopupScreen verificationPopupScreen, l lVar) {
            verificationPopupArguments.getClass();
            interfaceC39417a.getClass();
            z12.getClass();
            z13.getClass();
            d12.getClass();
            verificationPopupScreen.getClass();
            return new c(aVar, interfaceC39417a, s02, verificationPopupArguments, z12, z13, d12, rVar, verificationPopupScreen, lVar, null);
        }
    }

    /* compiled from: DaggerVerificationPopupComponent.java */
    public static final class c implements com.avito.android.passport.profile_add.create_flow.verification_popup.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f212239a;

        /* renamed from: b, reason: collision with root package name */
        public final D<Navigation> f212240b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f212241c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f212242d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f212243e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f212244f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.create_flow.verification_popup.mvi.e f212245g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f212246h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f212247i;

        /* renamed from: j, reason: collision with root package name */
        public final u<C28478k> f212248j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f212249k;

        /* renamed from: l, reason: collision with root package name */
        public final j f212250l;

        /* compiled from: DaggerVerificationPopupComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.create_flow.verification_popup.di.a$c$a, reason: collision with other inner class name */
        public static final class C6344a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f212251a;

            public C6344a(com.avito.android.passport.profile_add.di.a aVar) {
                this.f212251a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f212251a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerVerificationPopupComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f212252a;

            public b(com.avito.android.passport.profile_add.di.a aVar) {
                this.f212252a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f212252a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.passport.profile_add.di.a aVar, cv.b bVar, S0 s02, VerificationPopupArguments verificationPopupArguments, Z1 z12, Z1 z13, D d12, r rVar, Screen screen, l lVar, C6343a c6343a) {
            this.f212239a = bVar;
            this.f212240b = d12;
            this.f212241c = new C6344a(aVar);
            this.f212242d = dagger.internal.l.a(z13);
            this.f212243e = dagger.internal.l.a(z12);
            dagger.internal.l lVarA = dagger.internal.l.a(verificationPopupArguments);
            this.f212244f = lVarA;
            this.f212245g = new com.avito.android.passport.profile_add.create_flow.verification_popup.mvi.e(new M50.c(this.f212241c, this.f212242d, this.f212243e, new d(lVarA)), lVarA);
            this.f212246h = new b(aVar);
            this.f212247i = dagger.internal.l.a(screen);
            u<C28478k> uVarD = g.d(new com.avito.android.passport.profile_add.di.d(dagger.internal.l.a(rVar), this.f212247i));
            this.f212248j = uVarD;
            this.f212249k = com.avito.android.advert.item.delivery_suggests.l.i(this.f212246h, uVarD);
            this.f212250l = new j(new h(this.f212245g, com.avito.android.passport.profile_add.create_flow.verification_popup.mvi.j.a(), com.avito.android.passport.profile_add.create_flow.verification_popup.mvi.l.a(), this.f212249k, this.f212244f));
        }

        @Override // com.avito.android.passport.profile_add.create_flow.verification_popup.di.b
        public final void a(VerificationPopupFragment verificationPopupFragment) {
            verificationPopupFragment.f212209n0 = this.f212250l;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f212239a.u4();
            t.c(aVarU4);
            verificationPopupFragment.f212211p0 = aVarU4;
            verificationPopupFragment.f212212q0 = this.f212240b;
            verificationPopupFragment.f212218w0 = this.f212249k.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
