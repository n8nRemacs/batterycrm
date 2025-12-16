package com.avito.android.extended_profile_selection_create.image.di;

import Y41.l;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_image_edit.t;
import com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageConfig;
import com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageFragment;
import com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageScreen;
import com.avito.android.extended_profile_selection_create.image.di.b;
import com.avito.android.extended_profile_selection_create.image.di.e;
import com.avito.android.extended_profile_selection_create.image.mvi.o;
import com.avito.android.extended_profile_selection_create.image.n;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.profile_management_core.images.m;
import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.B;
import dagger.internal.u;
import jb0.C42347b;
import jb0.C42348c;
import jb0.C42349d;
import kotlinx.coroutines.flow.Z1;
import w80.C49468b;

/* compiled from: DaggerExtendedProfileSetSelectionImageComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerExtendedProfileSetSelectionImageComponent.java */
    public static final class b implements com.avito.android.extended_profile_selection_create.image.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<PhotoPickerIntentFactory> f151680A;

        /* renamed from: B, reason: collision with root package name */
        public final u<t> f151681B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.extended_profile_selection_create.image.g> f151682C;

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.l f151683a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f151684b;

        /* renamed from: c, reason: collision with root package name */
        public final u<D0> f151685c;

        /* renamed from: d, reason: collision with root package name */
        public final u<Gson> f151686d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f151687e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.extended_profile_selection_create.image.f f151688f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Application> f151689g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Context> f151690h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.photo_picker.converter.b> f151691i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.photo_picker.converter.f> f151692j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.b> f151693k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.photo_storage.f f151694l;

        /* renamed from: m, reason: collision with root package name */
        public final C49468b f151695m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC35863o4> f151696n;

        /* renamed from: o, reason: collision with root package name */
        public final u<String> f151697o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.profile_management_core.images.a> f151698p;

        /* renamed from: q, reason: collision with root package name */
        public final u<E> f151699q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28373a> f151700r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.extended_profile_selection_create.image.mvi.f f151701s;

        /* renamed from: t, reason: collision with root package name */
        public final o f151702t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC28481c> f151703u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.l f151704v;

        /* renamed from: w, reason: collision with root package name */
        public final u<C28478k> f151705w;

        /* renamed from: x, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f151706x;

        /* renamed from: y, reason: collision with root package name */
        public final n f151707y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.l f151708z;

        /* compiled from: DaggerExtendedProfileSetSelectionImageComponent.java */
        /* renamed from: com.avito.android.extended_profile_selection_create.image.di.a$b$a, reason: collision with other inner class name */
        public static final class C4436a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151709a;

            public C4436a(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151709a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f151709a.i();
                dagger.internal.t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerExtendedProfileSetSelectionImageComponent.java */
        /* renamed from: com.avito.android.extended_profile_selection_create.image.di.a$b$b, reason: collision with other inner class name */
        public static final class C4437b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151710a;

            public C4437b(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151710a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f151710a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerExtendedProfileSetSelectionImageComponent.java */
        public static final class c implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151711a;

            public c(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151711a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f151711a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerExtendedProfileSetSelectionImageComponent.java */
        public static final class d implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151712a;

            public d(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151712a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f151712a.g();
            }
        }

        /* compiled from: DaggerExtendedProfileSetSelectionImageComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151713a;

            public e(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151713a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f151713a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerExtendedProfileSetSelectionImageComponent.java */
        public static final class f implements u<t> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151714a;

            public f(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151714a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f151714a.u2();
            }
        }

        /* compiled from: DaggerExtendedProfileSetSelectionImageComponent.java */
        public static final class g implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151715a;

            public g(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151715a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f151715a.s();
                dagger.internal.t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerExtendedProfileSetSelectionImageComponent.java */
        public static final class h implements u<com.avito.android.photo_cache.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151716a;

            public h(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151716a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.photo_cache.b bVarF = this.f151716a.F();
                dagger.internal.t.c(bVarF);
                return bVarF;
            }
        }

        /* compiled from: DaggerExtendedProfileSetSelectionImageComponent.java */
        public static final class i implements u<PhotoPickerIntentFactory> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151717a;

            public i(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151717a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f151717a.X();
            }
        }

        /* compiled from: DaggerExtendedProfileSetSelectionImageComponent.java */
        public static final class j implements u<D0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151718a;

            public j(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151718a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                D0 d0S2 = this.f151718a.S2();
                dagger.internal.t.c(d0S2);
                return d0S2;
            }
        }

        /* compiled from: DaggerExtendedProfileSetSelectionImageComponent.java */
        public static final class k implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151719a;

            public k(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151719a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f151719a.m();
                dagger.internal.t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerExtendedProfileSetSelectionImageComponent.java */
        public static final class l implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_selection_create.select.di.c f151720a;

            public l(com.avito.android.extended_profile_selection_create.select.di.c cVar) {
                this.f151720a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f151720a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(C42347b c42347b, com.avito.android.extended_profile_selection_create.select.di.c cVar, Fragment fragment, Resources resources, ExtendedProfileSetSelectionImageConfig extendedProfileSetSelectionImageConfig, Z1 z12, r rVar, Screen screen, InterfaceC22983P interfaceC22983P, Y41.l lVar, C4435a c4435a) {
            this.f151683a = dagger.internal.l.a(resources);
            dagger.internal.l lVarA = dagger.internal.l.a(extendedProfileSetSelectionImageConfig);
            this.f151684b = lVarA;
            j jVar = new j(cVar);
            this.f151685c = jVar;
            g gVar = new g(cVar);
            this.f151686d = gVar;
            e eVar = new e(cVar);
            this.f151687e = eVar;
            this.f151688f = new com.avito.android.extended_profile_selection_create.image.f(lVarA, jVar, gVar, eVar);
            this.f151689g = new c(cVar);
            d dVar = new d(cVar);
            this.f151690h = dVar;
            this.f151691i = B.a(new C42348c(c42347b, this.f151689g, com.avito.android.photo_storage.k.a(dVar)));
            this.f151692j = B.a(new C42349d(c42347b, this.f151691i, N70.d.a(this.f151686d)));
            this.f151693k = new h(cVar);
            this.f151694l = com.avito.android.photo_storage.f.a(this.f151690h);
            this.f151695m = C49468b.a(this.f151694l, com.avito.android.photo_storage.h.a(this.f151690h));
            this.f151696n = new k(cVar);
            u<String> uVarD = dagger.internal.g.d(e.a.f151724a);
            this.f151697o = uVarD;
            u<com.avito.android.profile_management_core.images.a> uVarD2 = dagger.internal.g.d(new m(uVarD, this.f151685c, this.f151692j, this.f151693k, this.f151695m, this.f151687e, this.f151696n, this.f151686d));
            this.f151698p = uVarD2;
            this.f151701s = new com.avito.android.extended_profile_selection_create.image.mvi.f(this.f151683a, this.f151684b, this.f151688f, uVarD2, new C4436a(cVar), new C4437b(cVar));
            this.f151702t = new o(this.f151684b, dagger.internal.l.a(z12));
            this.f151703u = new l(cVar);
            this.f151704v = dagger.internal.l.a(screen);
            u<C28478k> uVarD3 = dagger.internal.g.d(new com.avito.android.extended_profile_selection_create.image.di.d(this.f151704v, dagger.internal.l.a(rVar)));
            this.f151705w = uVarD3;
            this.f151706x = com.avito.android.advert.item.delivery_suggests.l.i(this.f151703u, uVarD3);
            this.f151707y = new n(new com.avito.android.extended_profile_selection_create.image.mvi.k(com.avito.android.extended_profile_selection_create.image.mvi.h.a(), this.f151701s, com.avito.android.extended_profile_selection_create.image.mvi.m.a(), this.f151702t, this.f151706x));
            this.f151708z = dagger.internal.l.a(fragment);
            this.f151680A = new i(cVar);
            this.f151681B = new f(cVar);
            this.f151682C = dagger.internal.g.d(new com.avito.android.extended_profile_selection_create.image.k(this.f151708z, dagger.internal.l.a(lVar), this.f151680A, this.f151681B, this.f151697o));
        }

        @Override // com.avito.android.extended_profile_selection_create.image.di.b
        public final void a(ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment) {
            extendedProfileSetSelectionImageFragment.f151640n0 = this.f151707y;
            extendedProfileSetSelectionImageFragment.f151642p0 = this.f151706x.get();
            extendedProfileSetSelectionImageFragment.f151643q0 = this.f151682C.get();
        }
    }

    /* compiled from: DaggerExtendedProfileSetSelectionImageComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.extended_profile_selection_create.image.di.b.a
        public final com.avito.android.extended_profile_selection_create.image.di.b a(ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment, Resources resources, ExtendedProfileSetSelectionImageConfig extendedProfileSetSelectionImageConfig, Z1 z12, com.avito.android.extended_profile_selection_create.select.di.c cVar, r rVar, ExtendedProfileSetSelectionImageScreen extendedProfileSetSelectionImageScreen, ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment2, l lVar) {
            extendedProfileSetSelectionImageConfig.getClass();
            z12.getClass();
            extendedProfileSetSelectionImageScreen.getClass();
            return new b(new C42347b(), cVar, extendedProfileSetSelectionImageFragment, resources, extendedProfileSetSelectionImageConfig, z12, rVar, extendedProfileSetSelectionImageScreen, extendedProfileSetSelectionImageFragment2, lVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
