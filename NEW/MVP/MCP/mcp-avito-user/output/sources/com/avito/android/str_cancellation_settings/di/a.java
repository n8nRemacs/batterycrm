package com.avito.android.str_cancellation_settings.di;

import Oy0.InterfaceC14756a;
import Sy0.InterfaceC15270a;
import Y41.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_cancellation_settings.StrCancellationSettingsFragment;
import com.avito.android.str_cancellation_settings.di.b;
import com.avito.android.str_cancellation_settings.domain.n;
import com.avito.android.str_cancellation_settings.mvi.j;
import com.avito.android.str_cancellation_settings.mvi.q;
import com.avito.android.str_cancellation_settings.p;
import com.avito.android.util.R0;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.G0;

/* compiled from: DaggerStrCancellationSettingsComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrCancellationSettingsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.str_cancellation_settings.di.b.a
        public final com.avito.android.str_cancellation_settings.di.b a(f fVar, r rVar, l<? super InterfaceC15270a, G0> lVar, long j12, String str, String str2, String str3) {
            return new c(new com.avito.android.str_cancellation_settings.di.c(), fVar, rVar, lVar, Long.valueOf(j12), str, str2, str3, null);
        }
    }

    /* compiled from: DaggerStrCancellationSettingsComponent.java */
    public static final class c implements com.avito.android.str_cancellation_settings.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<R0> f288302a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC14756a> f288303b;

        /* renamed from: c, reason: collision with root package name */
        public final n f288304c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f288305d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.a> f288306e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.str_cancellation_settings.domain.c f288307f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f288308g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f288309h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f288310i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.str_cancellation_settings.mvi.g f288311j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.str_cancellation_settings.mvi.e f288312k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.str_cancellation_settings.mvi.n f288313l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f288314m;

        /* renamed from: n, reason: collision with root package name */
        public final u<C28478k> f288315n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f288316o;

        /* renamed from: p, reason: collision with root package name */
        public final p f288317p;

        /* compiled from: DaggerStrCancellationSettingsComponent.java */
        /* renamed from: com.avito.android.str_cancellation_settings.di.a$c$a, reason: collision with other inner class name */
        public static final class C8665a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final f f288318a;

            public C8665a(f fVar) {
                this.f288318a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f288318a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerStrCancellationSettingsComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final f f288319a;

            public b(f fVar) {
                this.f288319a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f288319a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerStrCancellationSettingsComponent.java */
        /* renamed from: com.avito.android.str_cancellation_settings.di.a$c$c, reason: collision with other inner class name */
        public static final class C8666c implements u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final f f288320a;

            public C8666c(f fVar) {
                this.f288320a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarV = this.f288320a.v();
                t.c(aVarV);
                return aVarV;
            }
        }

        /* compiled from: DaggerStrCancellationSettingsComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final f f288321a;

            public d(f fVar) {
                this.f288321a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f288321a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerStrCancellationSettingsComponent.java */
        public static final class e implements u<InterfaceC14756a> {

            /* renamed from: a, reason: collision with root package name */
            public final f f288322a;

            public e(f fVar) {
                this.f288322a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14756a interfaceC14756aDh = this.f288322a.dh();
                t.c(interfaceC14756aDh);
                return interfaceC14756aDh;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.str_cancellation_settings.di.c cVar, f fVar, r rVar, l lVar, Long l12, String str, String str2, String str3, C8664a c8664a) {
            this.f288304c = new n(new d(fVar), new e(fVar));
            this.f288307f = new com.avito.android.str_cancellation_settings.domain.c(new C8665a(fVar), new C8666c(fVar));
            this.f288308g = dagger.internal.l.a(l12);
            this.f288309h = dagger.internal.l.b(str);
            this.f288310i = dagger.internal.l.b(str2);
            dagger.internal.l lVarB = dagger.internal.l.b(str3);
            n nVar = this.f288304c;
            this.f288311j = new com.avito.android.str_cancellation_settings.mvi.g(nVar, this.f288307f, this.f288308g, this.f288309h, this.f288310i, lVarB);
            this.f288312k = new com.avito.android.str_cancellation_settings.mvi.e(nVar, com.avito.android.str_cancellation_settings.domain.r.a(), this.f288307f);
            this.f288313l = new com.avito.android.str_cancellation_settings.mvi.n(q.a());
            this.f288314m = new b(fVar);
            u<C28478k> uVarD = dagger.internal.g.d(new com.avito.android.str_cancellation_settings.di.d(cVar, dagger.internal.l.a(rVar)));
            this.f288315n = uVarD;
            this.f288316o = dagger.internal.g.d(new com.avito.android.str_cancellation_settings.di.e(cVar, this.f288314m, uVarD));
            this.f288317p = new p(new j(this.f288311j, this.f288312k, com.avito.android.str_cancellation_settings.mvi.l.a(), this.f288313l, this.f288316o));
        }

        @Override // com.avito.android.str_cancellation_settings.di.b
        public final void a(StrCancellationSettingsFragment strCancellationSettingsFragment) {
            strCancellationSettingsFragment.f288112h0 = this.f288317p;
            strCancellationSettingsFragment.f288114j0 = this.f288316o.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
