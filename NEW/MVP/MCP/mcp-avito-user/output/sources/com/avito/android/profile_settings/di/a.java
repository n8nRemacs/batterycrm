package com.avito.android.profile_settings.di;

import Eb0.C13470a;
import android.app.Application;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.edit_address.w;
import com.avito.android.edit_text_field.p;
import com.avito.android.profile_settings.ProfileSettingsMviFragment;
import com.avito.android.profile_settings.ProfileSettingsScreen;
import com.avito.android.profile_settings.TabItem;
import com.avito.android.profile_settings.di.b;
import com.avito.android.profile_settings.di.e;
import com.avito.android.profile_settings.di.i;
import com.avito.android.profile_settings.q;
import com.avito.android.profile_settings.s;
import com.avito.android.remote.D0;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerProfileSettingsComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerProfileSettingsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.profile_settings.di.b.a
        public final com.avito.android.profile_settings.di.b a(ProfileSettingsMviFragment profileSettingsMviFragment, Resources resources, r rVar, ProfileSettingsScreen profileSettingsScreen, ProfileSettingsMviFragment.Args args, InterfaceC29970g interfaceC29970g, InterfaceC39417a interfaceC39417a) {
            profileSettingsScreen.getClass();
            interfaceC39417a.getClass();
            return new c(interfaceC29970g, interfaceC39417a, profileSettingsMviFragment, resources, rVar, profileSettingsScreen, args, null);
        }
    }

    /* compiled from: DaggerProfileSettingsComponent.java */
    public static final class c implements com.avito.android.profile_settings.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<C28478k> f228387A;

        /* renamed from: B, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f228388B;

        /* renamed from: a, reason: collision with root package name */
        public final u<D0> f228389a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f228390b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.profile_settings.f> f228391c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.profile_settings.mvi.e f228392d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f228393e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.profile_settings.mvi.c f228394f;

        /* renamed from: g, reason: collision with root package name */
        public final u<E> f228395g;

        /* renamed from: h, reason: collision with root package name */
        public final l f228396h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28373a> f228397i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.profile_settings.mvi.l f228398j;

        /* renamed from: k, reason: collision with root package name */
        public final l f228399k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem>> f228400l;

        /* renamed from: m, reason: collision with root package name */
        public final l f228401m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.tab.adapter.c<TabItem>> f228402n;

        /* renamed from: o, reason: collision with root package name */
        public final u<C13470a> f228403o;

        /* renamed from: p, reason: collision with root package name */
        public final u<Boolean> f228404p;

        /* renamed from: q, reason: collision with root package name */
        public final u<Integer> f228405q;

        /* renamed from: r, reason: collision with root package name */
        public final u<p> f228406r;

        /* renamed from: s, reason: collision with root package name */
        public final u<Application> f228407s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.edit_address.a> f228408t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.edit_address.u> f228409u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.select_field.e> f228410v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.edit_count_field.d> f228411w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.edit_basic_info.h> f228412x;

        /* renamed from: y, reason: collision with root package name */
        public final u<InterfaceC28481c> f228413y;

        /* renamed from: z, reason: collision with root package name */
        public final l f228414z;

        /* compiled from: DaggerProfileSettingsComponent.java */
        /* renamed from: com.avito.android.profile_settings.di.a$c$a, reason: collision with other inner class name */
        public static final class C6945a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228415a;

            public C6945a(InterfaceC29970g interfaceC29970g) {
                this.f228415a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f228415a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerProfileSettingsComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228416a;

            public b(InterfaceC29970g interfaceC29970g) {
                this.f228416a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f228416a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerProfileSettingsComponent.java */
        /* renamed from: com.avito.android.profile_settings.di.a$c$c, reason: collision with other inner class name */
        public static final class C6946c implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228417a;

            public C6946c(InterfaceC29970g interfaceC29970g) {
                this.f228417a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f228417a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerProfileSettingsComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f228418a;

            public d(cv.b bVar) {
                this.f228418a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f228418a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerProfileSettingsComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228419a;

            public e(InterfaceC29970g interfaceC29970g) {
                this.f228419a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f228419a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerProfileSettingsComponent.java */
        public static final class f implements u<D0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228420a;

            public f(InterfaceC29970g interfaceC29970g) {
                this.f228420a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                D0 d0B7 = this.f228420a.b7();
                t.c(d0B7);
                return d0B7;
            }
        }

        /* compiled from: DaggerProfileSettingsComponent.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228421a;

            public g(InterfaceC29970g interfaceC29970g) {
                this.f228421a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f228421a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(InterfaceC29970g interfaceC29970g, cv.b bVar, Fragment fragment, Resources resources, r rVar, Screen screen, ProfileSettingsMviFragment.Args args, C6944a c6944a) {
            u<com.avito.android.profile_settings.f> uVarD = dagger.internal.g.d(new com.avito.android.profile_settings.h(new f(interfaceC29970g), new e(interfaceC29970g)));
            this.f228391c = uVarD;
            this.f228392d = new com.avito.android.profile_settings.mvi.e(uVarD);
            this.f228394f = new com.avito.android.profile_settings.mvi.c(uVarD, new d(bVar));
            this.f228395g = new C6945a(interfaceC29970g);
            l lVarA = l.a(args);
            this.f228396h = lVarA;
            this.f228398j = new com.avito.android.profile_settings.mvi.l(lVarA, this.f228395g, new b(interfaceC29970g));
            this.f228399k = l.a(new s(new com.avito.android.profile_settings.r(new com.avito.android.profile_settings.mvi.h(this.f228392d, this.f228394f, com.avito.android.profile_settings.mvi.j.a(), this.f228398j))));
            this.f228400l = dagger.internal.g.d(i.a.f228433a);
            l lVarA2 = l.a(fragment);
            this.f228401m = lVarA2;
            this.f228402n = dagger.internal.g.d(new h(lVarA2, this.f228400l));
            this.f228403o = dagger.internal.g.d(new com.avito.android.profile_settings.di.g(this.f228401m, this.f228396h, this.f228400l));
            this.f228404p = dagger.internal.g.d(new com.avito.android.profile_settings.di.f(l.a(resources)));
            u<Integer> uVarD2 = dagger.internal.g.d(e.a.f228426a);
            this.f228405q = uVarD2;
            this.f228406r = dagger.internal.g.d(new com.avito.android.profile_settings.di.d(this.f228401m, uVarD2, this.f228404p));
            u<com.avito.android.edit_address.a> uVarD3 = dagger.internal.g.d(new com.avito.android.edit_address.d(new C6946c(interfaceC29970g)));
            this.f228408t = uVarD3;
            this.f228409u = dagger.internal.g.d(new w(this.f228401m, uVarD3, this.f228405q));
            this.f228410v = dagger.internal.g.d(new com.avito.android.select_field.g(this.f228401m, this.f228405q));
            this.f228411w = dagger.internal.g.d(new com.avito.android.edit_count_field.f(this.f228401m, this.f228405q));
            this.f228412x = dagger.internal.g.d(new com.avito.android.edit_basic_info.j(this.f228401m, this.f228405q));
            this.f228413y = new g(interfaceC29970g);
            this.f228414z = l.a(screen);
            u<C28478k> uVarD4 = dagger.internal.g.d(new j(this.f228414z, l.a(rVar)));
            this.f228387A = uVarD4;
            this.f228388B = com.avito.android.advert.item.delivery_suggests.l.i(this.f228413y, uVarD4);
        }

        @Override // com.avito.android.profile_settings.di.b
        public final void a(ProfileSettingsMviFragment profileSettingsMviFragment) {
            profileSettingsMviFragment.f228364t0 = (q.a) this.f228399k.f393949a;
            profileSettingsMviFragment.f228366v0 = this.f228402n.get();
            profileSettingsMviFragment.f228367w0 = this.f228403o.get();
            profileSettingsMviFragment.f228368x0 = this.f228400l.get();
            profileSettingsMviFragment.f228369y0 = this.f228406r.get();
            profileSettingsMviFragment.f228370z0 = this.f228409u.get();
            profileSettingsMviFragment.f228359A0 = this.f228410v.get();
            profileSettingsMviFragment.f228360B0 = this.f228411w.get();
            profileSettingsMviFragment.f228361C0 = this.f228412x.get();
            profileSettingsMviFragment.f228362D0 = this.f228388B.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
