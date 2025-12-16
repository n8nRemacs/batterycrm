package com.avito.android.authorization.select_profile.social_login.di;

import Sm0.C15204c;
import android.app.Activity;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.SocialRegistrationSuggestsParams;
import com.avito.android.authorization.select_profile.adapter.SelectProfileField;
import com.avito.android.authorization.select_profile.social_login.SocialRegistrationSuggestsFragment;
import com.avito.android.authorization.select_profile.social_login.di.b;
import com.avito.android.authorization.select_profile.social_login.di.e;
import com.avito.android.authorization.select_profile.social_login.m;
import com.avito.android.di.module.C30065i;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.dialog.o;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;
import pe.C47066a;
import pe.C47067b;
import zz.C50648b;
import zz.C50650d;

/* compiled from: DaggerSocialRegistrationSuggestsComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class a {

    /* compiled from: DaggerSocialRegistrationSuggestsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.authorization.select_profile.social_login.di.b.a
        public final com.avito.android.authorization.select_profile.social_login.di.b a(ActivityC22955m activityC22955m, SocialRegistrationSuggestsParams socialRegistrationSuggestsParams, Resources resources, r rVar, Kundle kundle, com.avito.android.authorization.select_profile.social_login.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(new C47066a(), new com.avito.android.authorization.select_profile.adapter.text.di.b(), cVar, interfaceC39417a, activityC22955m, socialRegistrationSuggestsParams, resources, rVar, kundle, null);
        }
    }

    /* compiled from: DaggerSocialRegistrationSuggestsComponent.java */
    public static final class c implements com.avito.android.authorization.select_profile.social_login.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f94351a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.authorization.select_profile.social_login.di.c f94352b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC27663a> f94353c;

        /* renamed from: d, reason: collision with root package name */
        public final l f94354d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f94355e = B.a(com.avito.android.konveyor_adapter_module.d.a());

        /* renamed from: f, reason: collision with root package name */
        public final u<com.jakewharton.rxrelay3.c<SelectProfileField>> f94356f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.authorization.select_profile.adapter.profile.b> f94357g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f94358h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f94359i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.authorization.select_profile.adapter.text.b> f94360j;

        /* renamed from: k, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f94361k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f94362l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f94363m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC35745a5> f94364n;

        /* renamed from: o, reason: collision with root package name */
        public final C15204c f94365o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC35741a1> f94366p;

        /* renamed from: q, reason: collision with root package name */
        public final u<C50648b> f94367q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28373a> f94368r;

        /* renamed from: s, reason: collision with root package name */
        public final l f94369s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.dialog.a> f94370t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC30274a> f94371u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f94372v;

        /* renamed from: w, reason: collision with root package name */
        public final u<InterfaceC28481c> f94373w;

        /* renamed from: x, reason: collision with root package name */
        public final u<C28478k> f94374x;

        /* renamed from: y, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f94375y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.authorization.select_profile.social_login.d> f94376z;

        /* compiled from: DaggerSocialRegistrationSuggestsComponent.java */
        /* renamed from: com.avito.android.authorization.select_profile.social_login.di.a$c$a, reason: collision with other inner class name */
        public static final class C2799a implements u<InterfaceC27663a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.select_profile.social_login.di.c f94377a;

            public C2799a(com.avito.android.authorization.select_profile.social_login.di.c cVar) {
                this.f94377a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC27663a interfaceC27663aW0 = this.f94377a.w0();
                t.c(interfaceC27663aW0);
                return interfaceC27663aW0;
            }
        }

        /* compiled from: DaggerSocialRegistrationSuggestsComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.select_profile.social_login.di.c f94378a;

            public b(com.avito.android.authorization.select_profile.social_login.di.c cVar) {
                this.f94378a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f94378a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSocialRegistrationSuggestsComponent.java */
        /* renamed from: com.avito.android.authorization.select_profile.social_login.di.a$c$c, reason: collision with other inner class name */
        public static final class C2800c implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.select_profile.social_login.di.c f94379a;

            public C2800c(com.avito.android.authorization.select_profile.social_login.di.c cVar) {
                this.f94379a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f94379a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerSocialRegistrationSuggestsComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f94380a;

            public d(cv.b bVar) {
                this.f94380a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f94380a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSocialRegistrationSuggestsComponent.java */
        public static final class e implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.select_profile.social_login.di.c f94381a;

            public e(com.avito.android.authorization.select_profile.social_login.di.c cVar) {
                this.f94381a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f94381a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerSocialRegistrationSuggestsComponent.java */
        public static final class f implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.select_profile.social_login.di.c f94382a;

            public f(com.avito.android.authorization.select_profile.social_login.di.c cVar) {
                this.f94382a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f94382a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerSocialRegistrationSuggestsComponent.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.select_profile.social_login.di.c f94383a;

            public g(com.avito.android.authorization.select_profile.social_login.di.c cVar) {
                this.f94383a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f94383a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(C47066a c47066a, com.avito.android.authorization.select_profile.adapter.text.di.b bVar, com.avito.android.authorization.select_profile.social_login.di.c cVar, cv.b bVar2, Activity activity, SocialRegistrationSuggestsParams socialRegistrationSuggestsParams, Resources resources, r rVar, Kundle kundle, C2798a c2798a) {
            this.f94351a = bVar2;
            this.f94352b = cVar;
            this.f94353c = new C2799a(cVar);
            this.f94354d = l.a(socialRegistrationSuggestsParams);
            u<com.jakewharton.rxrelay3.c<SelectProfileField>> uVarD = dagger.internal.g.d(e.a.f94385a);
            this.f94356f = uVarD;
            u<com.avito.android.authorization.select_profile.adapter.profile.b> uVarD2 = dagger.internal.g.d(new pe.c(c47066a, uVarD));
            this.f94357g = uVarD2;
            this.f94358h = dagger.internal.g.d(new C47067b(c47066a, uVarD2));
            u<com.avito.android.authorization.select_profile.adapter.text.b> uVarD3 = dagger.internal.g.d(new com.avito.android.authorization.select_profile.adapter.text.di.d(bVar, new d(bVar2)));
            this.f94360j = uVarD3;
            this.f94361k = dagger.internal.g.d(new com.avito.android.authorization.select_profile.adapter.text.di.c(bVar, uVarD3));
            A.b bVarA = A.a(2, 1);
            bVarA.f393938b.add(this.f94355e);
            u<TV0.b<?, ?>> uVar = this.f94358h;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f94361k);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f94362l = uVarK;
            this.f94363m = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f94364n = new f(cVar);
            l lVarA = l.a(resources);
            this.f94365o = new C15204c(lVarA);
            this.f94367q = B.a(new C50650d(new e(cVar), lVarA));
            this.f94368r = new b(cVar);
            l lVarA2 = l.a(activity);
            this.f94369s = lVarA2;
            u<com.avito.android.lib.deprecated_design.dialog.a> uVarA = B.a(new KU.b(lVarA2));
            this.f94370t = uVarA;
            this.f94371u = B.a(new o(uVarA, this.f94369s));
            this.f94372v = new C2800c(cVar);
            this.f94373w = new g(cVar);
            u<C28478k> uVarD4 = dagger.internal.g.d(new com.avito.android.authorization.select_profile.social_login.di.f(l.a(rVar)));
            this.f94374x = uVarD4;
            this.f94375y = dagger.internal.g.d(new C30065i(this.f94373w, uVarD4));
            this.f94376z = dagger.internal.g.d(new m(this.f94353c, this.f94354d, this.f94363m, this.f94356f, this.f94364n, this.f94365o, this.f94367q, this.f94368r, this.f94371u, this.f94372v, this.f94375y, l.b(kundle)));
        }

        @Override // com.avito.android.authorization.select_profile.social_login.di.b
        public final void a(SocialRegistrationSuggestsFragment socialRegistrationSuggestsFragment) {
            socialRegistrationSuggestsFragment.f94343n0 = this.f94376z.get();
            socialRegistrationSuggestsFragment.f94344o0 = this.f94363m.get();
            socialRegistrationSuggestsFragment.f94345p0 = this.f94362l.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f94351a.u4();
            t.c(aVarU4);
            socialRegistrationSuggestsFragment.f94346q0 = aVarU4;
            com.avito.android.authorization.select_profile.social_login.di.c cVar = this.f94352b;
            socialRegistrationSuggestsFragment.f94347r0 = cVar.m1();
            socialRegistrationSuggestsFragment.f94348s0 = this.f94375y.get();
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            socialRegistrationSuggestsFragment.f94349t0 = interfaceC28373aA;
        }
    }

    public static b.a a() {
        return new b();
    }
}
