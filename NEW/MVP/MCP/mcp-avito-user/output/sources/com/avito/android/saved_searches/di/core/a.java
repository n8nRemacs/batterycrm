package com.avito.android.saved_searches.di.core;

import Bo0.b;
import Cd.D;
import Cd.F;
import Co0.InterfaceC13335b;
import Do0.C13427c;
import Do0.InterfaceC13425a;
import Fo0.InterfaceC13822a;
import Go0.InterfaceC13902a;
import Y41.l;
import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.view.C22977J;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.libs.saved_searches.domain.SavedSearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterImpl_Factory;
import com.avito.android.saved_searches.di.core.b;
import com.avito.android.saved_searches.presentation.core.SavedSearchDialogFragment;
import com.avito.android.saved_searches.presentation.main.SavedSearchMainFragment;
import com.avito.android.saved_searches.presentation.main.k;
import com.avito.android.saved_searches.presentation.main.mvi.o;
import com.avito.android.saved_searches.presentation.main.mvi.s;
import com.avito.android.saved_searches.presentation.main.mvi.v;
import com.avito.android.saved_searches.presentation.settings.SavedSearchSettingsFragment;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.q;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.G0;
import kotlinx.coroutines.T;

/* compiled from: DaggerSavedSearchCoreComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSavedSearchCoreComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.saved_searches.di.core.b.a
        public final com.avito.android.saved_searches.di.core.b a(SavedSearchParams savedSearchParams, SavedSearchDialogFragment savedSearchDialogFragment, i iVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, iVar, savedSearchParams, savedSearchDialogFragment, null);
        }
    }

    /* compiled from: DaggerSavedSearchCoreComponent.java */
    public static final class c implements com.avito.android.saved_searches.di.core.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<InterfaceC35863o4> f258284A;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.saved_searches.di.core.i f258285a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f258286b;

        /* renamed from: c, reason: collision with root package name */
        public final c f258287c = this;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f258288d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f258289e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC35845m2> f258290f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f258291g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.saved_searches.presentation.core.h> f258292h;

        /* renamed from: i, reason: collision with root package name */
        public final u<E> f258293i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28373a> f258294j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC13425a> f258295k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.saved_searches.presentation.core.c f258296l;

        /* renamed from: m, reason: collision with root package name */
        public final u<D> f258297m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.saved_searches.presentation.core.a> f258298n;

        /* renamed from: o, reason: collision with root package name */
        public final u<I30.d> f258299o;

        /* renamed from: p, reason: collision with root package name */
        public final u<TV.c> f258300p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC13902a> f258301q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.db.n> f258302r;

        /* renamed from: s, reason: collision with root package name */
        public final u<R0> f258303s;

        /* renamed from: t, reason: collision with root package name */
        public final u<SearchParamsConverter> f258304t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.libs.saved_searches.domain.a> f258305u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.saved_searches_core.b> f258306v;

        /* renamed from: w, reason: collision with root package name */
        public final u<InterfaceC28481c> f258307w;

        /* renamed from: x, reason: collision with root package name */
        public final u<Context> f258308x;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.saved_searches.presentation.core.g f258309y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f258310z;

        /* compiled from: DaggerSavedSearchCoreComponent.java */
        /* renamed from: com.avito.android.saved_searches.di.core.a$c$a, reason: collision with other inner class name */
        public static final class C7755a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.saved_searches.di.core.i f258311a;

            public C7755a(com.avito.android.saved_searches.di.core.i iVar) {
                this.f258311a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f258311a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerSavedSearchCoreComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.saved_searches.di.core.i f258312a;

            public b(com.avito.android.saved_searches.di.core.i iVar) {
                this.f258312a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f258312a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSavedSearchCoreComponent.java */
        /* renamed from: com.avito.android.saved_searches.di.core.a$c$c, reason: collision with other inner class name */
        public static final class C7756c implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.saved_searches.di.core.i f258313a;

            public C7756c(com.avito.android.saved_searches.di.core.i iVar) {
                this.f258313a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f258313a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerSavedSearchCoreComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.saved_searches.di.core.i f258314a;

            public d(com.avito.android.saved_searches.di.core.i iVar) {
                this.f258314a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f258314a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerSavedSearchCoreComponent.java */
        public static final class e implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.saved_searches.di.core.i f258315a;

            public e(com.avito.android.saved_searches.di.core.i iVar) {
                this.f258315a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f258315a.g();
            }
        }

        /* compiled from: DaggerSavedSearchCoreComponent.java */
        public static final class f implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f258316a;

            public f(cv.b bVar) {
                this.f258316a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f258316a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSavedSearchCoreComponent.java */
        public static final class g implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.saved_searches.di.core.i f258317a;

            public g(com.avito.android.saved_searches.di.core.i iVar) {
                this.f258317a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f258317a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSavedSearchCoreComponent.java */
        public static final class h implements u<InterfaceC35845m2> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.saved_searches.di.core.i f258318a;

            public h(com.avito.android.saved_searches.di.core.i iVar) {
                this.f258318a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f258318a.h();
            }
        }

        /* compiled from: DaggerSavedSearchCoreComponent.java */
        public static final class i implements u<I30.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.saved_searches.di.core.i f258319a;

            public i(com.avito.android.saved_searches.di.core.i iVar) {
                this.f258319a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f258319a.o1();
            }
        }

        /* compiled from: DaggerSavedSearchCoreComponent.java */
        public static final class j implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.saved_searches.di.core.i f258320a;

            public j(com.avito.android.saved_searches.di.core.i iVar) {
                this.f258320a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f258320a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerSavedSearchCoreComponent.java */
        public static final class k implements u<InterfaceC13902a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.saved_searches.di.core.i f258321a;

            public k(com.avito.android.saved_searches.di.core.i iVar) {
                this.f258321a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC13902a interfaceC13902aH3 = this.f258321a.H3();
                t.c(interfaceC13902aH3);
                return interfaceC13902aH3;
            }
        }

        /* compiled from: DaggerSavedSearchCoreComponent.java */
        public static final class l implements u<com.avito.android.saved_searches_core.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.saved_searches.di.core.i f258322a;

            public l(com.avito.android.saved_searches.di.core.i iVar) {
                this.f258322a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f258322a.ud();
            }
        }

        /* compiled from: DaggerSavedSearchCoreComponent.java */
        public static final class m implements u<TV.c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.saved_searches.di.core.i f258323a;

            public m(com.avito.android.saved_searches.di.core.i iVar) {
                this.f258323a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                TV.c cVarG2 = this.f258323a.G2();
                t.c(cVarG2);
                return cVarG2;
            }
        }

        /* compiled from: DaggerSavedSearchCoreComponent.java */
        public static final class n implements u<com.avito.android.db.n> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.saved_searches.di.core.i f258324a;

            public n(com.avito.android.saved_searches.di.core.i iVar) {
                this.f258324a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f258324a.g2();
            }
        }

        public c(cv.b bVar, com.avito.android.saved_searches.di.core.i iVar, SavedSearchParams savedSearchParams, DialogFragment dialogFragment, C7754a c7754a) {
            this.f258285a = iVar;
            this.f258286b = bVar;
            this.f258288d = new f(bVar);
            this.f258289e = dagger.internal.l.a(dialogFragment);
            this.f258290f = new h(iVar);
            dagger.internal.l lVarA = dagger.internal.l.a(savedSearchParams);
            this.f258291g = lVarA;
            this.f258292h = dagger.internal.g.d(new com.avito.android.saved_searches.presentation.core.j(this.f258289e, lVarA, this.f258288d, this.f258290f));
            this.f258293i = new C7755a(iVar);
            u<InterfaceC13425a> uVarD = dagger.internal.g.d(new C13427c(new b(iVar)));
            this.f258295k = uVarD;
            this.f258296l = new com.avito.android.saved_searches.presentation.core.c(this.f258291g, uVarD);
            q.b bVarA = q.a(1);
            bVarA.a(com.avito.android.saved_searches.presentation.core.b.class, this.f258296l);
            u<D> uVarA = B.a(new F(bVarA.b()));
            this.f258297m = uVarA;
            this.f258298n = dagger.internal.g.d(new com.avito.android.saved_searches.di.core.d(this.f258289e, uVarA));
            this.f258299o = new i(iVar);
            this.f258300p = new m(iVar);
            this.f258301q = new k(iVar);
            this.f258302r = new n(iVar);
            this.f258303s = new g(iVar);
            u<SearchParamsConverter> uVarD2 = dagger.internal.g.d(SearchParamsConverterImpl_Factory.create());
            this.f258304t = uVarD2;
            this.f258305u = dagger.internal.g.d(new com.avito.android.libs.saved_searches.domain.h(uVarD2, this.f258301q, this.f258302r, this.f258300p, this.f258303s));
            this.f258306v = new l(iVar);
            this.f258307w = new d(iVar);
            this.f258309y = new com.avito.android.saved_searches.presentation.core.g(new e(iVar));
            this.f258310z = new C7756c(iVar);
            this.f258284A = new j(iVar);
        }

        @Override // com.avito.android.saved_searches.di.core.b
        public final InterfaceC13335b.a a() {
            return new f(this.f258287c, null);
        }

        @Override // com.avito.android.saved_searches.di.core.b
        public final void b(SavedSearchDialogFragment savedSearchDialogFragment) {
            savedSearchDialogFragment.f258386h0 = this.f258292h.get();
            com.avito.android.saved_searches.di.core.i iVar = this.f258285a;
            TV.c cVarG2 = iVar.G2();
            t.c(cVarG2);
            savedSearchDialogFragment.f258387i0 = cVarG2;
            savedSearchDialogFragment.f258388j0 = new com.avito.android.saved_searches.presentation.core.f(iVar.g());
        }

        @Override // com.avito.android.saved_searches.di.core.b
        public final b.a c() {
            return new d(this.f258287c, null);
        }
    }

    /* compiled from: DaggerSavedSearchCoreComponent.java */
    public static final class d implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final c f258325a;

        public d(c cVar, C7754a c7754a) {
            this.f258325a = cVar;
        }

        @Override // Bo0.b.a
        public final Bo0.b a(C22977J c22977j, C28478k c28478k, l lVar) {
            return new e(this.f258325a, c22977j, c28478k, lVar, null);
        }
    }

    /* compiled from: DaggerSavedSearchCoreComponent.java */
    public static final class e implements Bo0.b {

        /* renamed from: a, reason: collision with root package name */
        public final c f258326a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.saved_searches.presentation.main.mvi.i f258327b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.saved_searches.presentation.main.mvi.l f258328c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f258329d;

        /* renamed from: e, reason: collision with root package name */
        public final s f258330e;

        /* renamed from: f, reason: collision with root package name */
        public final k f258331f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.f f258332g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.saved_searches.presentation.items.header.b f258333h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.saved_searches.presentation.items.skeletons.header_skeleton.b f258334i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f258335j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f258336k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.saved_searches.presentation.items.name.b f258337l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.saved_searches.presentation.items.skeletons.name_skeleton.b f258338m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.saved_searches.presentation.items.switcher.b f258339n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.saved_searches.presentation.items.banner.b f258340o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f258341p;

        /* renamed from: q, reason: collision with root package name */
        public final u<j> f258342q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f258343r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.b> f258344s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f258345t;

        public e() {
            throw null;
        }

        public e(c cVar, T t12, C28478k c28478k, l lVar, C7754a c7754a) {
            this.f258326a = cVar;
            u<E> uVar = cVar.f258293i;
            u<com.avito.android.saved_searches.presentation.core.a> uVar2 = cVar.f258298n;
            u<I30.d> uVar3 = cVar.f258299o;
            u<TV.c> uVar4 = cVar.f258300p;
            u<com.avito.android.libs.saved_searches.domain.a> uVar5 = cVar.f258305u;
            this.f258327b = new com.avito.android.saved_searches.presentation.main.mvi.i(uVar, uVar2, uVar3, uVar4, uVar5, cVar.f258306v);
            this.f258328c = new com.avito.android.saved_searches.presentation.main.mvi.l(cVar.f258291g, uVar5);
            this.f258329d = dagger.internal.g.d(new Bo0.h(dagger.internal.l.a(c28478k), cVar.f258307w));
            this.f258330e = new s(new v(cVar.f258309y));
            this.f258331f = new k(new o(this.f258327b, this.f258328c, com.avito.android.saved_searches.presentation.main.mvi.q.a(), this.f258329d, this.f258330e, cVar.f258291g));
            this.f258332g = new dagger.internal.f();
            this.f258333h = new com.avito.android.saved_searches.presentation.items.header.b(com.avito.android.saved_searches.presentation.items.header.d.a());
            this.f258334i = new com.avito.android.saved_searches.presentation.items.skeletons.header_skeleton.b(com.avito.android.saved_searches.presentation.items.skeletons.header_skeleton.d.a());
            this.f258335j = dagger.internal.l.a(t12);
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f258336k = lVarA;
            this.f258337l = new com.avito.android.saved_searches.presentation.items.name.b(cVar.f258310z, this.f258335j, lVarA, com.avito.android.saved_searches.presentation.items.name.d.a());
            this.f258338m = new com.avito.android.saved_searches.presentation.items.skeletons.name_skeleton.b(com.avito.android.saved_searches.presentation.items.skeletons.name_skeleton.d.a());
            com.avito.android.saved_searches.presentation.items.switcher.h hVar = new com.avito.android.saved_searches.presentation.items.switcher.h(com.avito.android.saved_searches.presentation.items.switcher.e.a());
            dagger.internal.l lVar2 = this.f258336k;
            this.f258339n = new com.avito.android.saved_searches.presentation.items.switcher.b(lVar2, hVar);
            this.f258340o = new com.avito.android.saved_searches.presentation.items.banner.b(lVar2, new com.avito.android.saved_searches.presentation.items.banner.d(lVar2));
            u<com.avito.konveyor.a> uVarD = dagger.internal.g.d(new Bo0.f(this.f258333h, this.f258334i, this.f258337l, this.f258338m, this.f258339n, this.f258340o, new com.avito.android.saved_searches.presentation.items.skeletons.settings_skeleton.b(com.avito.android.saved_searches.presentation.items.skeletons.settings_skeleton.d.a())));
            this.f258341p = uVarD;
            this.f258342q = dagger.internal.g.d(new Bo0.g(this.f258332g, uVarD));
            this.f258343r = dagger.internal.g.d(new Bo0.i(this.f258341p));
            u<com.avito.android.recycler.data_aware.b> uVarD2 = dagger.internal.g.d(com.avito.android.saved_searches.presentation.items.b.a());
            this.f258344s = uVarD2;
            u<com.avito.android.recycler.data_aware.e> uVarD3 = dagger.internal.g.d(new Bo0.e(uVarD2));
            this.f258345t = uVarD3;
            dagger.internal.f.a(this.f258332g, dagger.internal.g.d(new Bo0.d(uVarD3, this.f258342q, this.f258343r)));
        }

        @Override // Bo0.b
        public final void a(SavedSearchMainFragment savedSearchMainFragment) {
            savedSearchMainFragment.f258578n0 = this.f258331f;
            savedSearchMainFragment.f258580p0 = this.f258329d.get();
            savedSearchMainFragment.f258581q0 = (com.avito.konveyor.adapter.a) this.f258332g.get();
            savedSearchMainFragment.f258582r0 = this.f258342q.get();
            c cVar = this.f258326a;
            savedSearchMainFragment.f258583s0 = new com.avito.android.saved_searches.presentation.core.f(cVar.f258285a.g());
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = cVar.f258286b.u4();
            t.c(aVarU4);
            savedSearchMainFragment.f258584t0 = aVarU4;
            savedSearchMainFragment.f258585u0 = cVar.f258292h.get();
        }
    }

    /* compiled from: DaggerSavedSearchCoreComponent.java */
    public static final class f implements InterfaceC13335b.a {

        /* renamed from: a, reason: collision with root package name */
        public final c f258346a;

        public f(c cVar, C7754a c7754a) {
            this.f258346a = cVar;
        }

        @Override // Co0.InterfaceC13335b.a
        public final InterfaceC13335b a(C28478k c28478k, l<? super InterfaceC13822a, G0> lVar) {
            return new g(this.f258346a, c28478k, lVar, null);
        }
    }

    /* compiled from: DaggerSavedSearchCoreComponent.java */
    public static final class g implements InterfaceC13335b {

        /* renamed from: a, reason: collision with root package name */
        public final c f258347a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.saved_searches.presentation.settings.mvi.j f258348b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f258349c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.saved_searches.presentation.settings.g f258350d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.saved_searches.presentation.items.info.b f258351e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f258352f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f258353g;

        /* renamed from: h, reason: collision with root package name */
        public final u<j> f258354h;

        public g() {
            throw null;
        }

        public g(c cVar, C28478k c28478k, l lVar, C7754a c7754a) {
            this.f258347a = cVar;
            this.f258348b = new com.avito.android.saved_searches.presentation.settings.mvi.j(new com.avito.android.saved_searches.presentation.settings.mvi.l(cVar.f258284A));
            this.f258349c = dagger.internal.g.d(new Co0.g(dagger.internal.l.a(c28478k), cVar.f258307w));
            this.f258350d = new com.avito.android.saved_searches.presentation.settings.g(new com.avito.android.saved_searches.presentation.settings.mvi.f(com.avito.android.saved_searches.presentation.settings.mvi.c.a(), com.avito.android.saved_searches.presentation.settings.mvi.h.a(), this.f258348b, this.f258349c));
            this.f258351e = new com.avito.android.saved_searches.presentation.items.info.b(com.avito.android.saved_searches.presentation.items.info.d.a(), cVar.f258310z);
            u<com.avito.konveyor.a> uVarD = dagger.internal.g.d(new Co0.e(this.f258351e, new com.avito.android.saved_searches.presentation.items.chips.b(cVar.f258310z, new com.avito.android.saved_searches.presentation.items.chips.i(dagger.internal.l.a(lVar)))));
            this.f258352f = uVarD;
            u<com.avito.konveyor.adapter.a> uVarD2 = dagger.internal.g.d(new Co0.d(uVarD));
            this.f258353g = uVarD2;
            this.f258354h = dagger.internal.g.d(new Co0.f(uVarD2, this.f258352f));
        }

        @Override // Co0.InterfaceC13335b
        public final void a(SavedSearchSettingsFragment savedSearchSettingsFragment) {
            savedSearchSettingsFragment.f258725n0 = this.f258350d;
            savedSearchSettingsFragment.f258727p0 = this.f258349c.get();
            savedSearchSettingsFragment.f258728q0 = this.f258354h.get();
            savedSearchSettingsFragment.f258729r0 = this.f258353g.get();
            savedSearchSettingsFragment.f258730s0 = this.f258347a.f258292h.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
