package com.avito.android.soa_stat.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.soa_stat.di.b;
import com.avito.android.soa_stat.profile_settings.SoaStatProfileSettingsActivity;
import com.avito.android.soa_stat.profile_settings.l;
import com.avito.android.soa_stat.profile_settings.m;
import com.avito.android.soa_stat.profile_settings.mvi.p;
import com.avito.android.soa_stat.profile_settings.mvi.s;
import com.avito.android.soa_stat.profile_settings.mvi.w;
import com.avito.android.soa_stat.profile_settings.n;
import com.avito.android.soa_stat.profile_settings.view.d;
import com.avito.android.soa_stat.profile_settings.view.h;
import com.avito.android.soa_stat.profile_settings.view.i;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSoaStatProfileSettingsComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSoaStatProfileSettingsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.soa_stat.di.b.a
        public final com.avito.android.soa_stat.di.b a(r rVar, com.avito.android.soa_stat.di.c cVar) {
            return new c(cVar, rVar, null);
        }
    }

    /* compiled from: DaggerSoaStatProfileSettingsComponent.java */
    public static final class c implements com.avito.android.soa_stat.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.soa_stat.di.c f284039a;

        /* renamed from: b, reason: collision with root package name */
        public final u<C28478k> f284040b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f284041c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f284042d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC34401z0> f284043e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f284044f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f284045g;

        /* renamed from: h, reason: collision with root package name */
        public final l f284046h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f284047i;

        /* renamed from: j, reason: collision with root package name */
        public final l f284048j;

        /* compiled from: DaggerSoaStatProfileSettingsComponent.java */
        /* renamed from: com.avito.android.soa_stat.di.a$c$a, reason: collision with other inner class name */
        public static final class C8473a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.soa_stat.di.c f284049a;

            public C8473a(com.avito.android.soa_stat.di.c cVar) {
                this.f284049a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f284049a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSoaStatProfileSettingsComponent.java */
        public static final class b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.soa_stat.di.c f284050a;

            public b(com.avito.android.soa_stat.di.c cVar) {
                this.f284050a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f284050a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerSoaStatProfileSettingsComponent.java */
        /* renamed from: com.avito.android.soa_stat.di.a$c$c, reason: collision with other inner class name */
        public static final class C8474c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.soa_stat.di.c f284051a;

            public C8474c(com.avito.android.soa_stat.di.c cVar) {
                this.f284051a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f284051a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSoaStatProfileSettingsComponent.java */
        public static final class d implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.soa_stat.di.c f284052a;

            public d(com.avito.android.soa_stat.di.c cVar) {
                this.f284052a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0B = this.f284052a.B();
                t.c(interfaceC34401z0B);
                return interfaceC34401z0B;
            }
        }

        /* compiled from: DaggerSoaStatProfileSettingsComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.soa_stat.di.c f284053a;

            public e(com.avito.android.soa_stat.di.c cVar) {
                this.f284053a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f284053a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.soa_stat.di.c cVar, r rVar, C8472a c8472a) {
            this.f284039a = cVar;
            u<C28478k> uVarD = dagger.internal.g.d(new f(l.a(rVar)));
            this.f284040b = uVarD;
            this.f284042d = dagger.internal.g.d(new g(uVarD, new e(cVar)));
            d dVar = new d(cVar);
            C8474c c8474c = new C8474c(cVar);
            this.f284044f = c8474c;
            com.avito.android.soa_stat.profile_settings.domain.c cVar2 = new com.avito.android.soa_stat.profile_settings.domain.c(dVar, c8474c);
            C8473a c8473a = new C8473a(cVar);
            this.f284045g = c8473a;
            this.f284046h = l.a(new n(new m(new s(new p(cVar2, c8473a), w.a(), com.avito.android.soa_stat.profile_settings.mvi.u.a(), this.f284044f, this.f284042d))));
            this.f284048j = l.a(new i(new h(this.f284045g, this.f284042d, new b(cVar))));
        }

        @Override // com.avito.android.soa_stat.di.b
        public final void a(SoaStatProfileSettingsActivity soaStatProfileSettingsActivity) {
            com.avito.android.soa_stat.di.c cVar = this.f284039a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            soaStatProfileSettingsActivity.f284059m = interfaceC28373aA;
            soaStatProfileSettingsActivity.f284060n = this.f284042d.get();
            soaStatProfileSettingsActivity.f284061o = (l.a) this.f284046h.f393949a;
            soaStatProfileSettingsActivity.f284062p = (d.a) this.f284048j.f393949a;
            R0 r0C = cVar.c();
            t.c(r0C);
            soaStatProfileSettingsActivity.f284063q = r0C;
        }
    }

    public static b.a a() {
        return new b();
    }
}
