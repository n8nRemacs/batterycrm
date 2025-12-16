package com.avito.android.extended_profile_universal_widget_edit.edit_block.di;

import Y41.l;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_image_edit.t;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockArguments;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockFragment;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.di.b;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.di.e;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.m;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.mvi.n;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.q;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_storage.k;
import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.u;
import jb0.C42347b;
import jb0.C42348c;
import jb0.C42349d;
import w80.C49468b;

/* compiled from: DaggerUniversalWidgetEditBlockComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerUniversalWidgetEditBlockComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.extended_profile_universal_widget_edit.edit_block.di.b.a
        public final com.avito.android.extended_profile_universal_widget_edit.edit_block.di.b a(UniversalWidgetEditBlockArguments universalWidgetEditBlockArguments, C28478k c28478k, UniversalWidgetEditBlockFragment universalWidgetEditBlockFragment, Resources resources, l lVar, com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c cVar, InterfaceC39417a interfaceC39417a) {
            universalWidgetEditBlockArguments.getClass();
            interfaceC39417a.getClass();
            return new c(new C42347b(), cVar, interfaceC39417a, universalWidgetEditBlockArguments, c28478k, universalWidgetEditBlockFragment, resources, lVar, null);
        }
    }

    /* compiled from: DaggerUniversalWidgetEditBlockComponent.java */
    public static final class c implements com.avito.android.extended_profile_universal_widget_edit.edit_block.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.l f154020a;

        /* renamed from: b, reason: collision with root package name */
        public final u<D0> f154021b;

        /* renamed from: c, reason: collision with root package name */
        public final u<Application> f154022c;

        /* renamed from: d, reason: collision with root package name */
        public final u<Context> f154023d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.photo_picker.converter.b> f154024e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Gson> f154025f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.photo_picker.converter.f> f154026g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.photo_cache.b> f154027h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.photo_storage.f f154028i;

        /* renamed from: j, reason: collision with root package name */
        public final C49468b f154029j;

        /* renamed from: k, reason: collision with root package name */
        public final u<R0> f154030k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC35863o4> f154031l;

        /* renamed from: m, reason: collision with root package name */
        public final u<String> f154032m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.profile_management_core.images.a> f154033n;

        /* renamed from: o, reason: collision with root package name */
        public final n f154034o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.extended_profile_universal_widget_edit.edit_block.l f154035p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC28481c> f154036q;

        /* renamed from: r, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f154037r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.l f154038s;

        /* renamed from: t, reason: collision with root package name */
        public final u<PhotoPickerIntentFactory> f154039t;

        /* renamed from: u, reason: collision with root package name */
        public final u<t> f154040u;

        /* renamed from: v, reason: collision with root package name */
        public final u<m> f154041v;

        /* compiled from: DaggerUniversalWidgetEditBlockComponent.java */
        /* renamed from: com.avito.android.extended_profile_universal_widget_edit.edit_block.di.a$c$a, reason: collision with other inner class name */
        public static final class C4499a implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c f154042a;

            public C4499a(com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c cVar) {
                this.f154042a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f154042a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerUniversalWidgetEditBlockComponent.java */
        public static final class b implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c f154043a;

            public b(com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c cVar) {
                this.f154043a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f154043a.g();
            }
        }

        /* compiled from: DaggerUniversalWidgetEditBlockComponent.java */
        /* renamed from: com.avito.android.extended_profile_universal_widget_edit.edit_block.di.a$c$c, reason: collision with other inner class name */
        public static final class C4500c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c f154044a;

            public C4500c(com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c cVar) {
                this.f154044a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f154044a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerUniversalWidgetEditBlockComponent.java */
        public static final class d implements u<t> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c f154045a;

            public d(com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c cVar) {
                this.f154045a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f154045a.u2();
            }
        }

        /* compiled from: DaggerUniversalWidgetEditBlockComponent.java */
        public static final class e implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c f154046a;

            public e(com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c cVar) {
                this.f154046a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f154046a.s();
                dagger.internal.t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerUniversalWidgetEditBlockComponent.java */
        public static final class f implements u<com.avito.android.photo_cache.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c f154047a;

            public f(com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c cVar) {
                this.f154047a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.photo_cache.b bVarF = this.f154047a.F();
                dagger.internal.t.c(bVarF);
                return bVarF;
            }
        }

        /* compiled from: DaggerUniversalWidgetEditBlockComponent.java */
        public static final class g implements u<PhotoPickerIntentFactory> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c f154048a;

            public g(com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c cVar) {
                this.f154048a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f154048a.X();
            }
        }

        /* compiled from: DaggerUniversalWidgetEditBlockComponent.java */
        public static final class h implements u<D0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c f154049a;

            public h(com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c cVar) {
                this.f154049a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                D0 d0S2 = this.f154049a.S2();
                dagger.internal.t.c(d0S2);
                return d0S2;
            }
        }

        /* compiled from: DaggerUniversalWidgetEditBlockComponent.java */
        public static final class i implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c f154050a;

            public i(com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c cVar) {
                this.f154050a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f154050a.m();
                dagger.internal.t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerUniversalWidgetEditBlockComponent.java */
        public static final class j implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c f154051a;

            public j(com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c cVar) {
                this.f154051a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f154051a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(C42347b c42347b, com.avito.android.extended_profile_universal_widget_edit.edit_block.di.c cVar, cv.b bVar, UniversalWidgetEditBlockArguments universalWidgetEditBlockArguments, C28478k c28478k, Fragment fragment, Resources resources, l lVar, C4498a c4498a) {
            this.f154020a = dagger.internal.l.a(universalWidgetEditBlockArguments);
            this.f154021b = new h(cVar);
            this.f154022c = new C4499a(cVar);
            b bVar2 = new b(cVar);
            this.f154023d = bVar2;
            this.f154024e = B.a(new C42348c(c42347b, this.f154022c, k.a(bVar2)));
            e eVar = new e(cVar);
            this.f154025f = eVar;
            this.f154026g = B.a(new C42349d(c42347b, this.f154024e, N70.d.a(eVar)));
            this.f154027h = new f(cVar);
            this.f154028i = com.avito.android.photo_storage.f.a(this.f154023d);
            this.f154029j = C49468b.a(this.f154028i, com.avito.android.photo_storage.h.a(this.f154023d));
            this.f154030k = new C4500c(cVar);
            this.f154031l = new i(cVar);
            u<String> uVarD = dagger.internal.g.d(e.a.f154053a);
            this.f154032m = uVarD;
            u<com.avito.android.profile_management_core.images.a> uVarD2 = dagger.internal.g.d(new com.avito.android.profile_management_core.images.m(uVarD, this.f154021b, this.f154026g, this.f154027h, this.f154029j, this.f154030k, this.f154031l, this.f154025f));
            this.f154033n = uVarD2;
            dagger.internal.l lVar2 = this.f154020a;
            com.avito.android.extended_profile_universal_widget_edit.edit_block.mvi.e eVar2 = new com.avito.android.extended_profile_universal_widget_edit.edit_block.mvi.e(lVar2, uVarD2);
            this.f154034o = new n(new com.avito.android.extended_profile_universal_widget_edit.edit_block.d(lVar2), lVar2);
            this.f154035p = new com.avito.android.extended_profile_universal_widget_edit.edit_block.l(new com.avito.android.extended_profile_universal_widget_edit.edit_block.mvi.j(eVar2, com.avito.android.extended_profile_universal_widget_edit.edit_block.mvi.l.a(), this.f154034o, this.f154020a, com.avito.android.extended_profile_universal_widget_edit.edit_block.mvi.g.a()));
            this.f154036q = new j(cVar);
            this.f154037r = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f154036q);
            this.f154038s = dagger.internal.l.a(fragment);
            this.f154039t = new g(cVar);
            this.f154040u = new d(cVar);
            this.f154041v = dagger.internal.g.d(new q(this.f154038s, dagger.internal.l.a(lVar), this.f154039t, this.f154040u, this.f154032m));
        }

        @Override // com.avito.android.extended_profile_universal_widget_edit.edit_block.di.b
        public final void a(UniversalWidgetEditBlockFragment universalWidgetEditBlockFragment) {
            universalWidgetEditBlockFragment.f153967n0 = this.f154035p;
            universalWidgetEditBlockFragment.f153969p0 = this.f154037r.get();
            universalWidgetEditBlockFragment.f153970q0 = this.f154041v.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
