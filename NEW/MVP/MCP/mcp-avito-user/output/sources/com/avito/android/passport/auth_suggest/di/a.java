package com.avito.android.passport.auth_suggest.di;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.C31142p0;
import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31145r0;
import com.avito.android.lib.beduin_v2.feature.di.C31149t0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.di.C31153v0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.passport.auth_suggest.PassportAuthSuggestFragment;
import com.avito.android.passport.auth_suggest.PassportAuthSuggestOpenParams;
import com.avito.android.passport.auth_suggest.d;
import com.avito.android.passport.auth_suggest.di.b;
import com.avito.android.passport.auth_suggest.mvi.h;
import com.avito.android.passport.auth_suggest.mvi.j;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;

/* compiled from: DaggerPassportAuthSuggestComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerPassportAuthSuggestComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.passport.auth_suggest.di.b.a
        public final com.avito.android.passport.auth_suggest.di.b a(PassportAuthSuggestOpenParams passportAuthSuggestOpenParams, ScreenPerformanceTracker screenPerformanceTracker, C31138n0 c31138n0, com.avito.android.passport.auth_suggest.di.c cVar, InterfaceC39417a interfaceC39417a) {
            passportAuthSuggestOpenParams.getClass();
            screenPerformanceTracker.getClass();
            interfaceC39417a.getClass();
            return new c(c31138n0, cVar, interfaceC39417a, passportAuthSuggestOpenParams, screenPerformanceTracker, null);
        }
    }

    /* compiled from: DaggerPassportAuthSuggestComponent.java */
    public static final class c implements com.avito.android.passport.auth_suggest.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f210999a;

        /* renamed from: b, reason: collision with root package name */
        public final l f211000b;

        /* renamed from: c, reason: collision with root package name */
        public final u<I50.a> f211001c;

        /* renamed from: d, reason: collision with root package name */
        public final u<Set<String>> f211002d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.passport.auth_suggest.mvi.e f211003e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.passport.auth_suggest.mvi.c f211004f;

        /* renamed from: g, reason: collision with root package name */
        public final l f211005g;

        /* renamed from: h, reason: collision with root package name */
        public final h f211006h;

        /* renamed from: i, reason: collision with root package name */
        public final u<n.a> f211007i;

        /* renamed from: j, reason: collision with root package name */
        public final u<B> f211008j;

        /* renamed from: k, reason: collision with root package name */
        public final u<Set<FV0.h>> f211009k;

        /* renamed from: l, reason: collision with root package name */
        public final C31144q0 f211010l;

        /* renamed from: m, reason: collision with root package name */
        public final u<R0> f211011m;

        /* renamed from: n, reason: collision with root package name */
        public final d f211012n;

        /* compiled from: DaggerPassportAuthSuggestComponent.java */
        /* renamed from: com.avito.android.passport.auth_suggest.di.a$c$a, reason: collision with other inner class name */
        public static final class C6306a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.auth_suggest.di.c f211013a;

            public C6306a(com.avito.android.passport.auth_suggest.di.c cVar) {
                this.f211013a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f211013a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerPassportAuthSuggestComponent.java */
        public static final class b implements u<I50.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.auth_suggest.di.c f211014a;

            public b(com.avito.android.passport.auth_suggest.di.c cVar) {
                this.f211014a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                I50.a aVarX3 = this.f211014a.X3();
                t.c(aVarX3);
                return aVarX3;
            }
        }

        public c(C31138n0 c31138n0, com.avito.android.passport.auth_suggest.di.c cVar, cv.b bVar, PassportAuthSuggestOpenParams passportAuthSuggestOpenParams, ScreenPerformanceTracker screenPerformanceTracker, C6305a c6305a) {
            this.f210999a = bVar;
            this.f211000b = l.a(passportAuthSuggestOpenParams);
            this.f211001c = new b(cVar);
            u<Set<String>> uVarA = dagger.internal.B.a(C31149t0.a(c31138n0));
            this.f211002d = uVarA;
            l lVar = this.f211000b;
            u<I50.a> uVar = this.f211001c;
            this.f211003e = new com.avito.android.passport.auth_suggest.mvi.e(lVar, uVarA, uVar);
            this.f211004f = new com.avito.android.passport.auth_suggest.mvi.c(uVarA, uVar);
            this.f211005g = l.a(screenPerformanceTracker);
            this.f211006h = new h(this.f211003e, this.f211004f, j.a(), com.avito.android.passport.auth_suggest.mvi.l.a(), this.f211005g);
            this.f211007i = dagger.internal.B.a(C31142p0.a(c31138n0));
            this.f211008j = dagger.internal.B.a(C31145r0.a(c31138n0));
            this.f211009k = dagger.internal.B.a(C31153v0.a(c31138n0));
            this.f211010l = C31144q0.a(c31138n0);
            this.f211011m = new C6306a(cVar);
            this.f211012n = new d(this.f211006h, this.f211007i, this.f211008j, this.f211009k, this.f211010l, this.f211011m, C31151u0.a(c31138n0));
        }

        @Override // com.avito.android.passport.auth_suggest.di.b
        public final void a(PassportAuthSuggestFragment passportAuthSuggestFragment) {
            passportAuthSuggestFragment.f210916o0 = this.f211012n;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f210999a.u4();
            t.c(aVarU4);
            passportAuthSuggestFragment.f210917p0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
