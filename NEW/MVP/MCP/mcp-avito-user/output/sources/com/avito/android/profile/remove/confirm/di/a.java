package com.avito.android.profile.remove.confirm.di;

import com.avito.android.account.E;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.profile.remove.ProfileRemoveActivity;
import com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics;
import com.avito.android.profile.remove.confirm.ProfileRemoveConfirmFragment;
import com.avito.android.profile.remove.confirm.di.b;
import com.avito.android.profile.remove.confirm.h;
import com.avito.android.profile.remove.confirm.j;
import com.avito.android.profile.remove.confirm.m;
import com.avito.android.profile.remove.o;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerProfileRemoveConfirmationComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerProfileRemoveConfirmationComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.profile.remove.confirm.di.b.a
        public final com.avito.android.profile.remove.confirm.di.b a(ProfileRemoveActivity profileRemoveActivity, com.avito.android.profile.remove.confirm.di.c cVar, r rVar) {
            return new c(cVar, profileRemoveActivity, rVar, null);
        }
    }

    /* compiled from: DaggerProfileRemoveConfirmationComponent.java */
    public static final class c implements com.avito.android.profile.remove.confirm.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.profile.remove.confirm.di.c f223820a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC34401z0> f223821b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC27663a> f223822c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f223823d;

        /* renamed from: e, reason: collision with root package name */
        public final u<E> f223824e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f223825f;

        /* renamed from: g, reason: collision with root package name */
        public final u<h> f223826g;

        /* renamed from: h, reason: collision with root package name */
        public final m f223827h;

        /* renamed from: i, reason: collision with root package name */
        public final l f223828i;

        /* renamed from: j, reason: collision with root package name */
        public final u<o> f223829j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.m> f223830k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f223831l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C28478k> f223832m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f223833n;

        /* compiled from: DaggerProfileRemoveConfirmationComponent.java */
        /* renamed from: com.avito.android.profile.remove.confirm.di.a$c$a, reason: collision with other inner class name */
        public static final class C6774a implements u<InterfaceC27663a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.confirm.di.c f223834a;

            public C6774a(com.avito.android.profile.remove.confirm.di.c cVar) {
                this.f223834a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC27663a interfaceC27663aW0 = this.f223834a.w0();
                t.c(interfaceC27663aW0);
                return interfaceC27663aW0;
            }
        }

        /* compiled from: DaggerProfileRemoveConfirmationComponent.java */
        public static final class b implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.confirm.di.c f223835a;

            public b(com.avito.android.profile.remove.confirm.di.c cVar) {
                this.f223835a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f223835a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerProfileRemoveConfirmationComponent.java */
        /* renamed from: com.avito.android.profile.remove.confirm.di.a$c$c, reason: collision with other inner class name */
        public static final class C6775c implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.confirm.di.c f223836a;

            public C6775c(com.avito.android.profile.remove.confirm.di.c cVar) {
                this.f223836a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f223836a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerProfileRemoveConfirmationComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.confirm.di.c f223837a;

            public d(com.avito.android.profile.remove.confirm.di.c cVar) {
                this.f223837a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f223837a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerProfileRemoveConfirmationComponent.java */
        public static final class e implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.confirm.di.c f223838a;

            public e(com.avito.android.profile.remove.confirm.di.c cVar) {
                this.f223838a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0B = this.f223838a.B();
                t.c(interfaceC34401z0B);
                return interfaceC34401z0B;
            }
        }

        /* compiled from: DaggerProfileRemoveConfirmationComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.confirm.di.c f223839a;

            public f(com.avito.android.profile.remove.confirm.di.c cVar) {
                this.f223839a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f223839a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.profile.remove.confirm.di.c cVar, ProfileRemoveActivity profileRemoveActivity, r rVar, C6773a c6773a) {
            this.f223820a = cVar;
            u<h> uVarD = dagger.internal.g.d(new j(new e(cVar), new C6774a(cVar), new H90.a(new C6775c(cVar), new b(cVar)), new d(cVar)));
            this.f223826g = uVarD;
            this.f223827h = new m(new com.avito.android.profile.remove.confirm.mvi.f(new com.avito.android.profile.remove.confirm.mvi.c(uVarD), com.avito.android.profile.remove.confirm.mvi.h.a(), com.avito.android.profile.remove.confirm.mvi.j.a()));
            l lVarA = l.a(profileRemoveActivity);
            this.f223828i = lVarA;
            this.f223829j = dagger.internal.g.d(new g(lVarA));
            this.f223830k = dagger.internal.g.d(new com.avito.android.profile.remove.confirm.di.f(this.f223828i));
            this.f223831l = new f(cVar);
            u<C28478k> uVarD2 = dagger.internal.g.d(new com.avito.android.profile.remove.confirm.di.e(l.a(rVar)));
            this.f223832m = uVarD2;
            this.f223833n = com.avito.android.advert.item.delivery_suggests.l.i(this.f223831l, uVarD2);
        }

        @Override // com.avito.android.profile.remove.confirm.di.b
        public final void a(ProfileRemoveConfirmFragment profileRemoveConfirmFragment) {
            profileRemoveConfirmFragment.f223787n0 = this.f223827h;
            com.avito.android.profile.remove.confirm.di.c cVar = this.f223820a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            E eI2 = cVar.i();
            t.c(eI2);
            profileRemoveConfirmFragment.f223789p0 = new ProfileRemoveAnalytics(eI2, interfaceC28373aA);
            profileRemoveConfirmFragment.f223790q0 = this.f223829j.get();
            profileRemoveConfirmFragment.f223791r0 = cVar.o();
            profileRemoveConfirmFragment.f223792s0 = this.f223830k.get();
            profileRemoveConfirmFragment.f223793t0 = this.f223833n.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
