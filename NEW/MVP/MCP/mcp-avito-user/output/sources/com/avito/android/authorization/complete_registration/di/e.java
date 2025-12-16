package com.avito.android.authorization.complete_registration.di;

import android.app.Activity;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import com.avito.android.P;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.auth.C28643w;
import com.avito.android.authorization.auth.InterfaceC28641u;
import com.avito.android.authorization.complete_registration.CompleteRegistrationFragment;
import com.avito.android.authorization.complete_registration.di.a;
import com.avito.android.authorization.complete_registration.mvi.i;
import com.avito.android.authorization.complete_registration.mvi.n;
import com.avito.android.authorization.complete_registration.r;
import com.avito.android.credman.o;
import com.avito.android.di.module.C30065i;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.service.short_task.j;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import fg0.InterfaceC40419c;

/* compiled from: DaggerCompleteRegistrationComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class e {

    /* compiled from: DaggerCompleteRegistrationComponent.java */
    public static final class b implements com.avito.android.authorization.complete_registration.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.authorization.complete_registration.di.b f93414a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f93415b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f93416c;

        /* renamed from: d, reason: collision with root package name */
        public final u<C28478k> f93417d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f93418e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC34258d> f93419f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC27663a> f93420g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC40419c> f93421h;

        /* renamed from: i, reason: collision with root package name */
        public final u<j> f93422i;

        /* renamed from: j, reason: collision with root package name */
        public final u<P> f93423j;

        /* renamed from: k, reason: collision with root package name */
        public final u<o> f93424k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.authorization.complete_registration.mvi.f> f93425l;

        /* renamed from: m, reason: collision with root package name */
        public final l f93426m;

        /* renamed from: n, reason: collision with root package name */
        public final r f93427n;

        /* renamed from: o, reason: collision with root package name */
        public final l f93428o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.dialog.a> f93429p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC30274a> f93430q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28641u> f93431r;

        /* compiled from: DaggerCompleteRegistrationComponent.java */
        public static final class a implements u<InterfaceC27663a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.complete_registration.di.b f93432a;

            public a(com.avito.android.authorization.complete_registration.di.b bVar) {
                this.f93432a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC27663a interfaceC27663aW0 = this.f93432a.w0();
                t.c(interfaceC27663aW0);
                return interfaceC27663aW0;
            }
        }

        /* compiled from: DaggerCompleteRegistrationComponent.java */
        /* renamed from: com.avito.android.authorization.complete_registration.di.e$b$b, reason: collision with other inner class name */
        public static final class C2766b implements u<InterfaceC34258d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.complete_registration.di.b f93433a;

            public C2766b(com.avito.android.authorization.complete_registration.di.b bVar) {
                this.f93433a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34258d interfaceC34258dQ0 = this.f93433a.Q0();
                t.c(interfaceC34258dQ0);
                return interfaceC34258dQ0;
            }
        }

        /* compiled from: DaggerCompleteRegistrationComponent.java */
        public static final class c implements u<P> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.complete_registration.di.b f93434a;

            public c(com.avito.android.authorization.complete_registration.di.b bVar) {
                this.f93434a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f93434a.E();
            }
        }

        /* compiled from: DaggerCompleteRegistrationComponent.java */
        public static final class d implements u<o> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.complete_registration.di.b f93435a;

            public d(com.avito.android.authorization.complete_registration.di.b bVar) {
                this.f93435a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f93435a.P2();
            }
        }

        /* compiled from: DaggerCompleteRegistrationComponent.java */
        /* renamed from: com.avito.android.authorization.complete_registration.di.e$b$e, reason: collision with other inner class name */
        public static final class C2767e implements u<InterfaceC40419c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.complete_registration.di.b f93436a;

            public C2767e(com.avito.android.authorization.complete_registration.di.b bVar) {
                this.f93436a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC40419c interfaceC40419cYj = this.f93436a.Yj();
                t.c(interfaceC40419cYj);
                return interfaceC40419cYj;
            }
        }

        /* compiled from: DaggerCompleteRegistrationComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.complete_registration.di.b f93437a;

            public f(com.avito.android.authorization.complete_registration.di.b bVar) {
                this.f93437a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f93437a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerCompleteRegistrationComponent.java */
        public static final class g implements u<j> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.complete_registration.di.b f93438a;

            public g(com.avito.android.authorization.complete_registration.di.b bVar) {
                this.f93438a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                j jVarA2 = this.f93438a.A2();
                t.c(jVarA2);
                return jVarA2;
            }
        }

        public b(com.avito.android.authorization.complete_registration.di.b bVar, cv.b bVar2, Fragment fragment, Activity activity, com.avito.android.analytics.screens.r rVar, Resources resources, String str, String str2, a aVar) {
            this.f93414a = bVar;
            this.f93415b = bVar2;
            this.f93416c = new f(bVar);
            u<C28478k> uVarD = dagger.internal.g.d(new com.avito.android.authorization.complete_registration.di.d(l.a(rVar)));
            this.f93417d = uVarD;
            this.f93418e = dagger.internal.g.d(new C30065i(this.f93416c, uVarD));
            this.f93425l = dagger.internal.g.d(new i(new C2766b(bVar), new a(bVar), new C2767e(bVar), new Yd.c(new g(bVar)), new c(bVar), new d(bVar)));
            this.f93426m = l.a(str);
            this.f93427n = new r(new com.avito.android.authorization.complete_registration.mvi.e(new com.avito.android.authorization.complete_registration.mvi.b(this.f93426m, l.a(str2), this.f93425l), com.avito.android.authorization.complete_registration.mvi.l.a(), n.a(), this.f93418e));
            l lVarA = l.a(activity);
            this.f93428o = lVarA;
            u<com.avito.android.lib.deprecated_design.dialog.a> uVarA = B.a(new KU.b(lVarA));
            this.f93429p = uVarA;
            this.f93430q = B.a(new com.avito.android.dialog.o(uVarA, this.f93428o));
            this.f93431r = dagger.internal.g.d(new C28643w(l.a(resources)));
        }

        @Override // com.avito.android.authorization.complete_registration.di.a
        public final void a(CompleteRegistrationFragment completeRegistrationFragment) {
            com.avito.android.authorization.complete_registration.di.b bVar = this.f93414a;
            completeRegistrationFragment.f93387n0 = bVar.M5();
            completeRegistrationFragment.f93388o0 = this.f93418e.get();
            completeRegistrationFragment.f93389p0 = this.f93427n;
            completeRegistrationFragment.f93390q0 = this.f93430q.get();
            InterfaceC28373a interfaceC28373aA = bVar.a();
            t.c(interfaceC28373aA);
            completeRegistrationFragment.f93391r0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f93415b.u4();
            t.c(aVarU4);
            completeRegistrationFragment.f93392s0 = aVarU4;
            completeRegistrationFragment.f93393t0 = this.f93431r.get();
        }
    }

    /* compiled from: DaggerCompleteRegistrationComponent.java */
    public static final class c implements a.InterfaceC2765a {
        public c() {
        }

        @Override // com.avito.android.authorization.complete_registration.di.a.InterfaceC2765a
        public final com.avito.android.authorization.complete_registration.di.a a(com.avito.android.authorization.complete_registration.di.b bVar, CompleteRegistrationFragment completeRegistrationFragment, ActivityC22955m activityC22955m, com.avito.android.analytics.screens.r rVar, Resources resources, String str, String str2, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, completeRegistrationFragment, activityC22955m, rVar, resources, str, str2, null);
        }
    }

    public static a.InterfaceC2765a a() {
        return new c();
    }
}
