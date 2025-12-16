package com.avito.android.verification.di.passport;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.A1;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.verification.di.passport.b;
import com.avito.android.verification.verification_passport.CyberityParams;
import com.avito.android.verification.verification_passport.VerificationPassportActivity;
import com.avito.android.verification.verification_passport.m;
import com.avito.android.verification.verification_passport.mvi.j;
import com.avito.android.verification.verification_passport.mvi.n;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPassportVerificationComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerPassportVerificationComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.verification.di.passport.b.a
        public final com.avito.android.verification.di.passport.b a(r rVar, CyberityParams cyberityParams, com.avito.android.verification.di.passport.c cVar) {
            return new c(cVar, rVar, cyberityParams, null);
        }
    }

    /* compiled from: DaggerPassportVerificationComponent.java */
    public static final class c implements com.avito.android.verification.di.passport.b {

        /* renamed from: a, reason: collision with root package name */
        public final CyberityParams f323805a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.verification.di.passport.c f323806b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f323807c;

        /* renamed from: d, reason: collision with root package name */
        public final l f323808d;

        /* renamed from: e, reason: collision with root package name */
        public final u<A1> f323809e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC35745a5> f323810f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.verification.verification_passport.b> f323811g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.verification.verification_passport.mvi.g f323812h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f323813i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f323814j;

        /* renamed from: k, reason: collision with root package name */
        public final m f323815k;

        /* compiled from: DaggerPassportVerificationComponent.java */
        /* renamed from: com.avito.android.verification.di.passport.a$c$a, reason: collision with other inner class name */
        public static final class C10022a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.passport.c f323816a;

            public C10022a(com.avito.android.verification.di.passport.c cVar) {
                this.f323816a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f323816a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPassportVerificationComponent.java */
        public static final class b implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.passport.c f323817a;

            public b(com.avito.android.verification.di.passport.c cVar) {
                this.f323817a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f323817a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerPassportVerificationComponent.java */
        /* renamed from: com.avito.android.verification.di.passport.a$c$c, reason: collision with other inner class name */
        public static final class C10023c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.passport.c f323818a;

            public C10023c(com.avito.android.verification.di.passport.c cVar) {
                this.f323818a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f323818a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerPassportVerificationComponent.java */
        public static final class d implements u<A1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.verification.di.passport.c f323819a;

            public d(com.avito.android.verification.di.passport.c cVar) {
                this.f323819a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                A1 a1S0 = this.f323819a.s0();
                t.c(a1S0);
                return a1S0;
            }
        }

        public c(com.avito.android.verification.di.passport.c cVar, r rVar, CyberityParams cyberityParams, C10021a c10021a) {
            this.f323805a = cyberityParams;
            this.f323806b = cVar;
            this.f323807c = new C10022a(cVar);
            this.f323808d = l.a(cyberityParams);
            u<com.avito.android.verification.verification_passport.b> uVarD = dagger.internal.g.d(new com.avito.android.verification.verification_passport.d(new d(cVar), new b(cVar)));
            this.f323811g = uVarD;
            this.f323812h = new com.avito.android.verification.verification_passport.mvi.g(this.f323808d, uVarD, this.f323807c);
            this.f323813i = new C10023c(cVar);
            this.f323814j = dagger.internal.g.d(new i(l.a(rVar), this.f323813i));
            this.f323815k = new m(new j(this.f323812h, com.avito.android.verification.verification_passport.mvi.l.a(), n.a(), this.f323814j));
        }

        @Override // com.avito.android.verification.di.passport.b
        public final void a(VerificationPassportActivity verificationPassportActivity) {
            verificationPassportActivity.f325678m = this.f323815k;
            verificationPassportActivity.f325680o = this.f323805a;
            C cJ2 = this.f323806b.j();
            t.c(cJ2);
            verificationPassportActivity.f325681p = cJ2;
            verificationPassportActivity.f325682q = this.f323814j.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
