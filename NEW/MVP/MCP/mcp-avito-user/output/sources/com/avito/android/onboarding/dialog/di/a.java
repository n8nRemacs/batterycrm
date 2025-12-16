package com.avito.android.onboarding.dialog.di;

import Nk0.InterfaceC14583a;
import Sm0.C15204c;
import Y41.l;
import android.content.res.Resources;
import com.avito.android.J0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.di.module.C30060h5;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.onboarding.dialog.OnboardingDialogFragment;
import com.avito.android.onboarding.dialog.di.h;
import com.avito.android.onboarding.dialog.interactor.k;
import com.avito.android.onboarding.dialog.interactor.m;
import com.avito.android.onboarding.dialog.mvi.o;
import com.avito.android.onboarding.dialog.mvi.q;
import com.avito.android.onboarding.dialog.mvi.s;
import com.avito.android.remote.InterfaceC34389t0;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import lI0.InterfaceC43640a;

/* compiled from: DaggerOnboardingDialogComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerOnboardingDialogComponent.java */
    public static final class b implements h.a {
        public b() {
        }

        @Override // com.avito.android.onboarding.dialog.di.h.a
        public final h a(String str, String str2, String str3, String str4, Resources resources, l lVar, C28478k c28478k, g gVar, InterfaceC39417a interfaceC39417a, InterfaceC30106l7 interfaceC30106l7) {
            interfaceC39417a.getClass();
            return new c(gVar, interfaceC39417a, interfaceC30106l7, str, str2, str3, str4, resources, lVar, c28478k, null);
        }
    }

    /* compiled from: DaggerOnboardingDialogComponent.java */
    public static final class c implements com.avito.android.onboarding.dialog.di.h {

        /* renamed from: A, reason: collision with root package name */
        public final u<E40.c> f208777A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f208778B;

        /* renamed from: C, reason: collision with root package name */
        public final u<D40.e> f208779C;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f208780a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.onboarding.dialog.di.g f208781b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f208782c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f208783d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f208784e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC34389t0> f208785f;

        /* renamed from: g, reason: collision with root package name */
        public final u<R0> f208786g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.onboarding.dialog.interactor.h> f208787h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.onboarding.dialog.mvi.l f208788i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28373a> f208789j;

        /* renamed from: k, reason: collision with root package name */
        public final u<A40.a> f208790k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC14583a> f208791l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.onboarding.dialog.interactor.a> f208792m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC43640a> f208793n;

        /* renamed from: o, reason: collision with root package name */
        public final C15204c f208794o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.onboarding.dialog.interactor.e> f208795p;

        /* renamed from: q, reason: collision with root package name */
        public final u<k> f208796q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.onboarding.dialog.mvi.j f208797r;

        /* renamed from: s, reason: collision with root package name */
        public final u<J0> f208798s;

        /* renamed from: t, reason: collision with root package name */
        public final s f208799t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC28481c> f208800u;

        /* renamed from: v, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f208801v;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.onboarding.dialog.f f208802w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.l f208803x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.onboarding.dialog.view.quiz.a> f208804y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.onboarding.dialog.view.carousel.f> f208805z;

        /* compiled from: DaggerOnboardingDialogComponent.java */
        /* renamed from: com.avito.android.onboarding.dialog.di.a$c$a, reason: collision with other inner class name */
        public static final class C6233a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.onboarding.dialog.di.g f208806a;

            public C6233a(com.avito.android.onboarding.dialog.di.g gVar) {
                this.f208806a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f208806a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerOnboardingDialogComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.onboarding.dialog.di.g f208807a;

            public b(com.avito.android.onboarding.dialog.di.g gVar) {
                this.f208807a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f208807a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerOnboardingDialogComponent.java */
        /* renamed from: com.avito.android.onboarding.dialog.di.a$c$c, reason: collision with other inner class name */
        public static final class C6234c implements u<InterfaceC14583a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.onboarding.dialog.di.g f208808a;

            public C6234c(com.avito.android.onboarding.dialog.di.g gVar) {
                this.f208808a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14583a interfaceC14583aDf = this.f208808a.Df();
                t.c(interfaceC14583aDf);
                return interfaceC14583aDf;
            }
        }

        /* compiled from: DaggerOnboardingDialogComponent.java */
        public static final class d implements u<J0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.onboarding.dialog.di.g f208809a;

            public d(com.avito.android.onboarding.dialog.di.g gVar) {
                this.f208809a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                J0 j0F0 = this.f208809a.f0();
                t.c(j0F0);
                return j0F0;
            }
        }

        /* compiled from: DaggerOnboardingDialogComponent.java */
        public static final class e implements u<InterfaceC34389t0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.onboarding.dialog.di.g f208810a;

            public e(com.avito.android.onboarding.dialog.di.g gVar) {
                this.f208810a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34389t0 interfaceC34389t0C4 = this.f208810a.c4();
                t.c(interfaceC34389t0C4);
                return interfaceC34389t0C4;
            }
        }

        /* compiled from: DaggerOnboardingDialogComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC30106l7 f208811a;

            public f(InterfaceC30106l7 interfaceC30106l7) {
                this.f208811a = interfaceC30106l7;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f208811a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerOnboardingDialogComponent.java */
        public static final class g implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.onboarding.dialog.di.g f208812a;

            public g(com.avito.android.onboarding.dialog.di.g gVar) {
                this.f208812a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarOd = this.f208812a.od();
                t.c(aVarOd);
                return aVarOd;
            }
        }

        /* compiled from: DaggerOnboardingDialogComponent.java */
        public static final class h implements u<InterfaceC43640a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.onboarding.dialog.di.g f208813a;

            public h(com.avito.android.onboarding.dialog.di.g gVar) {
                this.f208813a = gVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC43640a interfaceC43640aF3 = this.f208813a.f3();
                t.c(interfaceC43640aF3);
                return interfaceC43640aF3;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.onboarding.dialog.di.g gVar, cv.b bVar, InterfaceC30106l7 interfaceC30106l7, String str, String str2, String str3, String str4, Resources resources, l lVar, C28478k c28478k, C6232a c6232a) {
            this.f208780a = bVar;
            this.f208781b = gVar;
            this.f208782c = dagger.internal.l.b(str2);
            this.f208783d = dagger.internal.l.b(str);
            this.f208784e = dagger.internal.l.b(str4);
            e eVar = new e(gVar);
            this.f208785f = eVar;
            b bVar2 = new b(gVar);
            this.f208786g = bVar2;
            u<com.avito.android.onboarding.dialog.interactor.h> uVarD = dagger.internal.g.d(new com.avito.android.onboarding.dialog.interactor.j(eVar, bVar2));
            this.f208787h = uVarD;
            this.f208788i = new com.avito.android.onboarding.dialog.mvi.l(this.f208782c, this.f208783d, this.f208784e, uVarD);
            this.f208789j = new C6233a(gVar);
            this.f208790k = dagger.internal.g.d(new A40.c(dagger.internal.l.b(str3), this.f208789j));
            this.f208792m = dagger.internal.g.d(new com.avito.android.onboarding.dialog.interactor.c(new C6234c(gVar), this.f208786g));
            this.f208793n = new h(gVar);
            C15204c c15204c = new C15204c(dagger.internal.l.a(resources));
            this.f208794o = c15204c;
            this.f208795p = dagger.internal.g.d(new com.avito.android.onboarding.dialog.interactor.g(this.f208793n, c15204c, this.f208786g, this.f208790k));
            u<k> uVarD2 = dagger.internal.g.d(new m(this.f208782c, this.f208783d, this.f208785f, this.f208786g));
            this.f208796q = uVarD2;
            this.f208797r = new com.avito.android.onboarding.dialog.mvi.j(this.f208790k, this.f208792m, this.f208795p, uVarD2, this.f208794o);
            this.f208799t = new s(new d(gVar));
            this.f208800u = new f(interfaceC30106l7);
            this.f208801v = dagger.internal.g.d(new C30060h5(this.f208800u, dagger.internal.l.a(c28478k)));
            this.f208802w = new com.avito.android.onboarding.dialog.f(new o(this.f208788i, this.f208797r, q.a(), this.f208799t, this.f208801v));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f208803x = lVarA;
            this.f208804y = dagger.internal.g.d(new com.avito.android.onboarding.dialog.view.quiz.c(this.f208783d, lVarA, this.f208790k));
            this.f208805z = dagger.internal.g.d(new com.avito.android.onboarding.dialog.view.carousel.h(this.f208783d, this.f208790k));
            u<E40.c> uVarD3 = dagger.internal.g.d(new E40.e(this.f208783d, this.f208790k));
            this.f208777A = uVarD3;
            g gVar2 = new g(gVar);
            dagger.internal.l lVar2 = this.f208803x;
            this.f208779C = dagger.internal.g.d(new D40.g(this.f208804y, this.f208805z, uVarD3, new D40.c(lVar2, gVar2), gVar2, lVar2));
        }

        @Override // com.avito.android.onboarding.dialog.di.h
        public final void a(OnboardingDialogFragment onboardingDialogFragment) {
            onboardingDialogFragment.f208710h0 = this.f208802w;
            onboardingDialogFragment.f208712j0 = this.f208801v.get();
            onboardingDialogFragment.f208713k0 = this.f208790k.get();
            onboardingDialogFragment.f208714l0 = this.f208779C.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f208780a.u4();
            t.c(aVarU4);
            onboardingDialogFragment.f208715m0 = aVarU4;
            com.avito.android.onboarding.dialog.di.g gVar = this.f208781b;
            x xVarT = gVar.t();
            t.c(xVarT);
            onboardingDialogFragment.f208716n0 = xVarT;
            R0 r0C = gVar.c();
            t.c(r0C);
            onboardingDialogFragment.f208717o0 = r0C;
        }
    }

    public static h.a a() {
        return new b();
    }
}
