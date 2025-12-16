package com.avito.android.safety.sessions.social_logout.di;

import android.content.res.Resources;
import com.avito.android.account.E;
import com.avito.android.account.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.InterfaceC34243a1;
import com.avito.android.safety.sessions.social_logout.SessionsSocialLogoutFragment;
import com.avito.android.safety.sessions.social_logout.di.b;
import com.avito.android.safety.sessions.social_logout.h;
import com.avito.android.safety.sessions.social_logout.i;
import com.avito.android.safety.sessions.social_logout.s;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSessionsSocialLogoutComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSessionsSocialLogoutComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.safety.sessions.social_logout.di.b.a
        public final com.avito.android.safety.sessions.social_logout.di.b a(com.avito.android.safety.sessions.social_logout.di.c cVar, Resources resources, i.b bVar, r rVar) {
            return new c(new d(), cVar, resources, bVar, rVar, null);
        }
    }

    /* compiled from: DaggerSessionsSocialLogoutComponent.java */
    public static final class c implements com.avito.android.safety.sessions.social_logout.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.safety.sessions.social_logout.di.c f258002a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC34243a1> f258003b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f258004c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35745a5> f258005d;

        /* renamed from: e, reason: collision with root package name */
        public final u<G> f258006e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.safety.sessions.social_logout.d> f258007f;

        /* renamed from: g, reason: collision with root package name */
        public final l f258008g;

        /* renamed from: h, reason: collision with root package name */
        public final u<s> f258009h;

        /* renamed from: i, reason: collision with root package name */
        public final u<E> f258010i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f258011j;

        /* renamed from: k, reason: collision with root package name */
        public final u<C28478k> f258012k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f258013l;

        /* renamed from: m, reason: collision with root package name */
        public final u<i> f258014m;

        /* compiled from: DaggerSessionsSocialLogoutComponent.java */
        /* renamed from: com.avito.android.safety.sessions.social_logout.di.a$c$a, reason: collision with other inner class name */
        public static final class C7745a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.sessions.social_logout.di.c f258015a;

            public C7745a(com.avito.android.safety.sessions.social_logout.di.c cVar) {
                this.f258015a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f258015a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerSessionsSocialLogoutComponent.java */
        public static final class b implements u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.sessions.social_logout.di.c f258016a;

            public b(com.avito.android.safety.sessions.social_logout.di.c cVar) {
                this.f258016a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                G gW2 = this.f258016a.w();
                t.c(gW2);
                return gW2;
            }
        }

        /* compiled from: DaggerSessionsSocialLogoutComponent.java */
        /* renamed from: com.avito.android.safety.sessions.social_logout.di.a$c$c, reason: collision with other inner class name */
        public static final class C7746c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.sessions.social_logout.di.c f258017a;

            public C7746c(com.avito.android.safety.sessions.social_logout.di.c cVar) {
                this.f258017a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f258017a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerSessionsSocialLogoutComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.sessions.social_logout.di.c f258018a;

            public d(com.avito.android.safety.sessions.social_logout.di.c cVar) {
                this.f258018a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f258018a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerSessionsSocialLogoutComponent.java */
        public static final class e implements u<InterfaceC34243a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.sessions.social_logout.di.c f258019a;

            public e(com.avito.android.safety.sessions.social_logout.di.c cVar) {
                this.f258019a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34243a1 interfaceC34243a1Pc = this.f258019a.pc();
                t.c(interfaceC34243a1Pc);
                return interfaceC34243a1Pc;
            }
        }

        /* compiled from: DaggerSessionsSocialLogoutComponent.java */
        public static final class f implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.sessions.social_logout.di.c f258020a;

            public f(com.avito.android.safety.sessions.social_logout.di.c cVar) {
                this.f258020a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f258020a.o();
            }
        }

        public c(com.avito.android.safety.sessions.social_logout.di.d dVar, com.avito.android.safety.sessions.social_logout.di.c cVar, Resources resources, i.b bVar, r rVar, C7744a c7744a) {
            this.f258002a = cVar;
            e eVar = new e(cVar);
            f fVar = new f(cVar);
            C7746c c7746c = new C7746c(cVar);
            this.f258005d = c7746c;
            this.f258007f = g.d(new h(eVar, fVar, c7746c, new b(cVar)));
            this.f258008g = l.a(bVar);
            this.f258009h = g.d(new com.avito.android.safety.sessions.social_logout.u(l.a(resources)));
            this.f258010i = new C7745a(cVar);
            this.f258011j = new d(cVar);
            u<C28478k> uVarD = g.d(new com.avito.android.safety.sessions.social_logout.di.e(dVar, l.a(rVar)));
            this.f258012k = uVarD;
            u<ScreenPerformanceTracker> uVarI = com.avito.android.advert.item.delivery_suggests.l.i(this.f258011j, uVarD);
            this.f258013l = uVarI;
            this.f258014m = g.d(new com.avito.android.safety.sessions.social_logout.r(this.f258008g, uVarI, this.f258007f, this.f258005d, this.f258009h, this.f258010i));
        }

        @Override // com.avito.android.safety.sessions.social_logout.di.b
        public final void a(SessionsSocialLogoutFragment sessionsSocialLogoutFragment) {
            sessionsSocialLogoutFragment.f257995n0 = this.f258014m.get();
            com.avito.android.safety.sessions.social_logout.di.c cVar = this.f258002a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            sessionsSocialLogoutFragment.f257996o0 = interfaceC28373aA;
            sessionsSocialLogoutFragment.f257997p0 = cVar.x();
            sessionsSocialLogoutFragment.f257998q0 = cVar.O();
            sessionsSocialLogoutFragment.f257999r0 = cVar.ia();
            sessionsSocialLogoutFragment.f258000s0 = this.f258013l.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
