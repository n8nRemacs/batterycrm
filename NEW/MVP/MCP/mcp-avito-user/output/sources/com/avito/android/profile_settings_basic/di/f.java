package com.avito.android.profile_settings_basic.di;

import Hb0.C13949c;
import Hb0.InterfaceC13947a;
import Y41.l;
import Za0.InterfaceC19524a;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.profile_settings_basic.A;
import com.avito.android.profile_settings_basic.BasicProfileSettingsFragment;
import com.avito.android.profile_settings_basic.BasicProfileSettingsScreen;
import com.avito.android.profile_settings_basic.C33458c;
import com.avito.android.profile_settings_basic.C33464i;
import com.avito.android.profile_settings_basic.D;
import com.avito.android.profile_settings_basic.H;
import com.avito.android.profile_settings_basic.InterfaceC33456a;
import com.avito.android.profile_settings_basic.InterfaceC33460e;
import com.avito.android.profile_settings_basic.J;
import com.avito.android.profile_settings_basic.di.a;
import com.avito.android.profile_settings_basic.di.e;
import com.avito.android.profile_settings_basic.mvi.q;
import com.avito.android.profile_settings_basic.mvi.y;
import com.avito.android.profile_settings_basic.s;
import com.avito.android.profile_settings_basic.z;
import com.avito.android.remote.A1;
import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;
import jb0.C42347b;
import jb0.C42348c;
import jb0.C42349d;
import w80.C49468b;

/* compiled from: DaggerBasicProfileSettingsComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class f {

    /* compiled from: DaggerBasicProfileSettingsComponent.java */
    public static final class b implements com.avito.android.profile_settings_basic.di.a {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.l f228745A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.android.profile_settings_basic.adapter.setting_item.c> f228746B;

        /* renamed from: C, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f228747C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.profile_settings_basic.adapter.section_header.d> f228748D;

        /* renamed from: E, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f228749E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.android.profile_settings_basic.adapter.verification_item.c> f228750F;

        /* renamed from: G, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f228751G;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.android.profile_settings_basic.adapter.badge_bar.c> f228752H;

        /* renamed from: I, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f228753I;

        /* renamed from: J, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f228754J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.android.profile_settings_basic.adapter.error_item.c> f228755K;

        /* renamed from: L, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f228756L;

        /* renamed from: M, reason: collision with root package name */
        public final u<AK0.l> f228757M;

        /* renamed from: N, reason: collision with root package name */
        public final u<InterfaceC13947a> f228758N;

        /* renamed from: O, reason: collision with root package name */
        public final u<com.avito.android.profile_settings_basic.adapter.basic_info.c> f228759O;

        /* renamed from: P, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f228760P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f228761Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f228762R;

        /* renamed from: S, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f228763S;

        /* renamed from: T, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f228764T;

        /* renamed from: U, reason: collision with root package name */
        public final u<PhotoPickerIntentFactory> f228765U;

        /* renamed from: V, reason: collision with root package name */
        public final u<A> f228766V;

        /* renamed from: W, reason: collision with root package name */
        public final u<InterfaceC28481c> f228767W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.l f228768X;

        /* renamed from: Y, reason: collision with root package name */
        public final u<C28478k> f228769Y;

        /* renamed from: Z, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f228770Z;

        /* renamed from: a, reason: collision with root package name */
        public final u<D0> f228771a;

        /* renamed from: b, reason: collision with root package name */
        public final u<A1> f228772b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC33456a> f228773c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.profile_settings_basic.l> f228774d;

        /* renamed from: e, reason: collision with root package name */
        public final u<H> f228775e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f228776f;

        /* renamed from: g, reason: collision with root package name */
        public final u<s> f228777g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.profile_settings_basic.mvi.n f228778h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC19524a> f228779i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Application> f228780j;

        /* renamed from: k, reason: collision with root package name */
        public final u<Context> f228781k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.photo_picker.converter.b> f228782l;

        /* renamed from: m, reason: collision with root package name */
        public final u<Gson> f228783m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.photo_picker.converter.f> f228784n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC33460e> f228785o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC28373a> f228786p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f228787q;

        /* renamed from: r, reason: collision with root package name */
        public final q f228788r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.b> f228789s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.photo_storage.f f228790t;

        /* renamed from: u, reason: collision with root package name */
        public final C49468b f228791u;

        /* renamed from: v, reason: collision with root package name */
        public final u<InterfaceC35863o4> f228792v;

        /* renamed from: w, reason: collision with root package name */
        public final u<String> f228793w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.profile_management_core.images.a> f228794x;

        /* renamed from: y, reason: collision with root package name */
        public final z f228795y;

        /* renamed from: z, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f228796z;

        /* compiled from: DaggerBasicProfileSettingsComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228797a;

            public a(InterfaceC29970g interfaceC29970g) {
                this.f228797a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f228797a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerBasicProfileSettingsComponent.java */
        /* renamed from: com.avito.android.profile_settings_basic.di.f$b$b, reason: collision with other inner class name */
        public static final class C6962b implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228798a;

            public C6962b(InterfaceC29970g interfaceC29970g) {
                this.f228798a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f228798a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerBasicProfileSettingsComponent.java */
        public static final class c implements u<InterfaceC19524a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228799a;

            public c(InterfaceC29970g interfaceC29970g) {
                this.f228799a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19524a interfaceC19524aQf = this.f228799a.Qf();
                t.c(interfaceC19524aQf);
                return interfaceC19524aQf;
            }
        }

        /* compiled from: DaggerBasicProfileSettingsComponent.java */
        public static final class d implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228800a;

            public d(InterfaceC29970g interfaceC29970g) {
                this.f228800a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f228800a.g();
            }
        }

        /* compiled from: DaggerBasicProfileSettingsComponent.java */
        public static final class e implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f228801a;

            public e(cv.b bVar) {
                this.f228801a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f228801a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerBasicProfileSettingsComponent.java */
        /* renamed from: com.avito.android.profile_settings_basic.di.f$b$f, reason: collision with other inner class name */
        public static final class C6963f implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228802a;

            public C6963f(InterfaceC29970g interfaceC29970g) {
                this.f228802a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f228802a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerBasicProfileSettingsComponent.java */
        public static final class g implements u<D0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228803a;

            public g(InterfaceC29970g interfaceC29970g) {
                this.f228803a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                D0 d0B7 = this.f228803a.b7();
                t.c(d0B7);
                return d0B7;
            }
        }

        /* compiled from: DaggerBasicProfileSettingsComponent.java */
        public static final class h implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228804a;

            public h(InterfaceC29970g interfaceC29970g) {
                this.f228804a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f228804a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerBasicProfileSettingsComponent.java */
        public static final class i implements u<com.avito.android.photo_cache.b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228805a;

            public i(InterfaceC29970g interfaceC29970g) {
                this.f228805a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.photo_cache.b bVarF = this.f228805a.F();
                t.c(bVarF);
                return bVarF;
            }
        }

        /* compiled from: DaggerBasicProfileSettingsComponent.java */
        public static final class j implements u<PhotoPickerIntentFactory> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228806a;

            public j(InterfaceC29970g interfaceC29970g) {
                this.f228806a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f228806a.X();
            }
        }

        /* compiled from: DaggerBasicProfileSettingsComponent.java */
        public static final class k implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228807a;

            public k(InterfaceC29970g interfaceC29970g) {
                this.f228807a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f228807a.r();
            }
        }

        /* compiled from: DaggerBasicProfileSettingsComponent.java */
        public static final class l implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228808a;

            public l(InterfaceC29970g interfaceC29970g) {
                this.f228808a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f228808a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerBasicProfileSettingsComponent.java */
        public static final class m implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228809a;

            public m(InterfaceC29970g interfaceC29970g) {
                this.f228809a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f228809a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerBasicProfileSettingsComponent.java */
        public static final class n implements u<A1> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f228810a;

            public n(InterfaceC29970g interfaceC29970g) {
                this.f228810a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                A1 a1S0 = this.f228810a.s0();
                t.c(a1S0);
                return a1S0;
            }
        }

        public b() {
            throw null;
        }

        public b(C42347b c42347b, InterfaceC29970g interfaceC29970g, cv.b bVar, Fragment fragment, Resources resources, Y41.l lVar, r rVar, Screen screen, String str, FragmentManager fragmentManager, a aVar) {
            this.f228771a = new g(interfaceC29970g);
            this.f228772b = new n(interfaceC29970g);
            u<InterfaceC33456a> uVarD = dagger.internal.g.d(C33458c.a());
            this.f228773c = uVarD;
            u<com.avito.android.profile_settings_basic.l> uVarD2 = dagger.internal.g.d(new com.avito.android.profile_settings_basic.n(uVarD));
            this.f228774d = uVarD2;
            this.f228775e = dagger.internal.g.d(new J(uVarD2));
            this.f228776f = new C6963f(interfaceC29970g);
            u<s> uVarD3 = dagger.internal.g.d(new com.avito.android.profile_settings_basic.u(dagger.internal.l.b(str), this.f228771a, this.f228772b, this.f228775e, this.f228776f));
            this.f228777g = uVarD3;
            this.f228778h = new com.avito.android.profile_settings_basic.mvi.n(uVarD3);
            this.f228779i = new c(interfaceC29970g);
            this.f228780j = new C6962b(interfaceC29970g);
            d dVar = new d(interfaceC29970g);
            this.f228781k = dVar;
            this.f228782l = B.a(new C42348c(c42347b, this.f228780j, com.avito.android.photo_storage.k.a(dVar)));
            h hVar = new h(interfaceC29970g);
            this.f228783m = hVar;
            u<com.avito.android.photo_picker.converter.f> uVarA = B.a(new C42349d(c42347b, this.f228782l, N70.d.a(hVar)));
            this.f228784n = uVarA;
            u<InterfaceC33460e> uVarD4 = dagger.internal.g.d(new C33464i(this.f228771a, this.f228779i, this.f228776f, uVarA, this.f228773c));
            this.f228785o = uVarD4;
            a aVar2 = new a(interfaceC29970g);
            this.f228786p = aVar2;
            e eVar = new e(bVar);
            this.f228787q = eVar;
            this.f228788r = new q(this.f228778h, new com.avito.android.profile_settings_basic.mvi.l(uVarD4, this.f228777g, aVar2, eVar), com.avito.android.profile_settings_basic.mvi.s.a(), y.a());
            this.f228789s = new i(interfaceC29970g);
            this.f228790t = com.avito.android.photo_storage.f.a(this.f228781k);
            this.f228791u = C49468b.a(this.f228790t, com.avito.android.photo_storage.h.a(this.f228781k));
            this.f228792v = new l(interfaceC29970g);
            u<String> uVarD5 = dagger.internal.g.d(e.a.f228744a);
            this.f228793w = uVarD5;
            u<com.avito.android.profile_management_core.images.a> uVarD6 = dagger.internal.g.d(new com.avito.android.profile_management_core.images.m(uVarD5, this.f228771a, this.f228784n, this.f228789s, this.f228791u, this.f228776f, this.f228792v, this.f228783m));
            this.f228794x = uVarD6;
            this.f228795y = new z(this.f228788r, uVarD6, this.f228787q);
            this.f228796z = B.a(com.avito.android.konveyor_adapter_module.d.a());
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f228745A = lVarA;
            u<com.avito.android.profile_settings_basic.adapter.setting_item.c> uVarD7 = dagger.internal.g.d(new com.avito.android.profile_settings_basic.adapter.setting_item.f(lVarA));
            this.f228746B = uVarD7;
            this.f228747C = dagger.internal.g.d(new com.avito.android.profile_settings_basic.adapter.setting_item.b(uVarD7));
            u<com.avito.android.profile_settings_basic.adapter.section_header.d> uVarD8 = dagger.internal.g.d(com.avito.android.profile_settings_basic.adapter.section_header.f.a());
            this.f228748D = uVarD8;
            this.f228749E = dagger.internal.g.d(new com.avito.android.profile_settings_basic.adapter.section_header.b(uVarD8));
            u<com.avito.android.profile_settings_basic.adapter.verification_item.c> uVarD9 = dagger.internal.g.d(new com.avito.android.profile_settings_basic.adapter.verification_item.f(this.f228745A));
            this.f228750F = uVarD9;
            this.f228751G = dagger.internal.g.d(new com.avito.android.profile_settings_basic.adapter.verification_item.b(uVarD9));
            u<com.avito.android.profile_settings_basic.adapter.badge_bar.c> uVarD10 = dagger.internal.g.d(new com.avito.android.profile_settings_basic.adapter.badge_bar.f(this.f228745A));
            this.f228752H = uVarD10;
            this.f228753I = dagger.internal.g.d(new com.avito.android.profile_settings_basic.adapter.badge_bar.b(uVarD10));
            this.f228754J = dagger.internal.g.d(new com.avito.android.profile_settings_basic.adapter.progress_item.b(com.avito.android.profile_settings_basic.adapter.progress_item.d.a()));
            u<com.avito.android.profile_settings_basic.adapter.error_item.c> uVarD11 = dagger.internal.g.d(new com.avito.android.profile_settings_basic.adapter.error_item.f(this.f228745A));
            this.f228755K = uVarD11;
            this.f228756L = dagger.internal.g.d(new com.avito.android.profile_settings_basic.adapter.error_item.b(uVarD11));
            u<InterfaceC13947a> uVarD12 = dagger.internal.g.d(new C13949c(new k(interfaceC29970g)));
            this.f228758N = uVarD12;
            u<com.avito.android.profile_settings_basic.adapter.basic_info.c> uVarD13 = dagger.internal.g.d(new com.avito.android.profile_settings_basic.adapter.basic_info.j(this.f228745A, uVarD12, this.f228786p));
            this.f228759O = uVarD13;
            this.f228760P = dagger.internal.g.d(new com.avito.android.profile_settings_basic.adapter.basic_info.b(uVarD13));
            this.f228761Q = dagger.internal.g.d(new com.avito.android.profile_settings_basic.adapter.basic_info.l(this.f228759O));
            A.b bVarA = dagger.internal.A.a(8, 1);
            bVarA.f393938b.add(this.f228796z);
            u<TV0.b<?, ?>> uVar = this.f228747C;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f228749E);
            list.add(this.f228751G);
            list.add(this.f228753I);
            list.add(this.f228754J);
            list.add(this.f228756L);
            list.add(this.f228760P);
            list.add(this.f228761Q);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f228762R = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f228763S = uVarH;
            this.f228764T = dagger.internal.g.d(new com.avito.android.profile_settings_basic.di.c(uVarH, this.f228762R));
            this.f228766V = dagger.internal.g.d(new D(dagger.internal.l.a(fragment), this.f228745A, new j(interfaceC29970g), this.f228793w));
            this.f228767W = new m(interfaceC29970g);
            this.f228768X = dagger.internal.l.a(screen);
            u<C28478k> uVarD14 = dagger.internal.g.d(new com.avito.android.profile_settings_basic.di.d(this.f228768X, dagger.internal.l.a(rVar)));
            this.f228769Y = uVarD14;
            this.f228770Z = com.avito.android.advert.item.delivery_suggests.l.i(this.f228767W, uVarD14);
        }

        @Override // com.avito.android.profile_settings_basic.di.a
        public final void a(BasicProfileSettingsFragment basicProfileSettingsFragment) {
            basicProfileSettingsFragment.f228516t0 = this.f228795y;
            basicProfileSettingsFragment.f228517u0 = this.f228764T.get();
            basicProfileSettingsFragment.f228518v0 = this.f228766V.get();
            basicProfileSettingsFragment.f228519w0 = this.f228770Z.get();
        }
    }

    /* compiled from: DaggerBasicProfileSettingsComponent.java */
    public static final class c implements a.InterfaceC6961a {
        public c() {
        }

        @Override // com.avito.android.profile_settings_basic.di.a.InterfaceC6961a
        public final com.avito.android.profile_settings_basic.di.a a(BasicProfileSettingsFragment basicProfileSettingsFragment, Resources resources, l lVar, r rVar, BasicProfileSettingsScreen basicProfileSettingsScreen, String str, FragmentManager fragmentManager, InterfaceC29970g interfaceC29970g, InterfaceC39417a interfaceC39417a) {
            basicProfileSettingsScreen.getClass();
            interfaceC39417a.getClass();
            return new b(new C42347b(), interfaceC29970g, interfaceC39417a, basicProfileSettingsFragment, resources, lVar, rVar, basicProfileSettingsScreen, str, fragmentManager, null);
        }
    }

    public static a.InterfaceC6961a a() {
        return new c();
    }
}
