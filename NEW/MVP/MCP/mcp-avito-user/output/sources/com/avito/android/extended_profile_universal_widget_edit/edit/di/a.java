package com.avito.android.extended_profile_universal_widget_edit.edit.di;

import Y41.l;
import Za0.InterfaceC19524a;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import com.avito.android.extended_profile_universal_widget_edit.edit.UniversalWidgetEditFragment;
import com.avito.android.extended_profile_universal_widget_edit.edit.di.b;
import com.avito.android.extended_profile_universal_widget_edit.edit.di.e;
import com.avito.android.extended_profile_universal_widget_edit.edit.m;
import com.avito.android.extended_profile_universal_widget_edit.edit.mvi.j;
import com.avito.android.extended_profile_universal_widget_edit.edit.mvi.o;
import com.avito.android.extended_profile_universal_widget_edit.edit.n;
import com.avito.android.photo_storage.k;
import com.avito.android.remote.D0;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import jb0.C42347b;
import jb0.C42348c;
import jb0.C42349d;
import w80.C49468b;

/* compiled from: DaggerUniversalWidgetEditComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerUniversalWidgetEditComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.extended_profile_universal_widget_edit.edit.di.b.a
        public final com.avito.android.extended_profile_universal_widget_edit.edit.di.b a(UniversalWidgetEditArguments universalWidgetEditArguments, C28478k c28478k, UniversalWidgetEditFragment universalWidgetEditFragment, Resources resources, l lVar, com.avito.android.extended_profile_universal_widget_edit.edit.di.c cVar, InterfaceC39417a interfaceC39417a) {
            universalWidgetEditArguments.getClass();
            interfaceC39417a.getClass();
            return new c(new C42347b(), cVar, interfaceC39417a, universalWidgetEditArguments, c28478k, universalWidgetEditFragment, resources, lVar, null);
        }
    }

    /* compiled from: DaggerUniversalWidgetEditComponent.java */
    public static final class c implements com.avito.android.extended_profile_universal_widget_edit.edit.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f153793a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.extended_profile_universal_widget_edit.edit.di.c f153794b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f153795c;

        /* renamed from: d, reason: collision with root package name */
        public final u<D0> f153796d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC19524a> f153797e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f153798f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Application> f153799g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Context> f153800h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.photo_picker.converter.b> f153801i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Gson> f153802j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.photo_picker.converter.f> f153803k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.photo_storage.f f153804l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.extended_profile_universal_widget_edit.edit.interactor.a> f153805m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.extended_profile_universal_widget_edit.edit.mvi.c f153806n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.extended_profile_ui_components.universal_widget.a> f153807o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.extended_profile_universal_widget_edit.f> f153808p;

        /* renamed from: q, reason: collision with root package name */
        public final o f153809q;

        /* renamed from: r, reason: collision with root package name */
        public final m f153810r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC28481c> f153811s;

        /* renamed from: t, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f153812t;

        /* compiled from: DaggerUniversalWidgetEditComponent.java */
        /* renamed from: com.avito.android.extended_profile_universal_widget_edit.edit.di.a$c$a, reason: collision with other inner class name */
        public static final class C4489a implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit.di.c f153813a;

            public C4489a(com.avito.android.extended_profile_universal_widget_edit.edit.di.c cVar) {
                this.f153813a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f153813a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerUniversalWidgetEditComponent.java */
        public static final class b implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit.di.c f153814a;

            public b(com.avito.android.extended_profile_universal_widget_edit.edit.di.c cVar) {
                this.f153814a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f153814a.g();
            }
        }

        /* compiled from: DaggerUniversalWidgetEditComponent.java */
        /* renamed from: com.avito.android.extended_profile_universal_widget_edit.edit.di.a$c$c, reason: collision with other inner class name */
        public static final class C4490c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit.di.c f153815a;

            public C4490c(com.avito.android.extended_profile_universal_widget_edit.edit.di.c cVar) {
                this.f153815a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f153815a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerUniversalWidgetEditComponent.java */
        public static final class d implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit.di.c f153816a;

            public d(com.avito.android.extended_profile_universal_widget_edit.edit.di.c cVar) {
                this.f153816a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f153816a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerUniversalWidgetEditComponent.java */
        public static final class e implements u<D0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit.di.c f153817a;

            public e(com.avito.android.extended_profile_universal_widget_edit.edit.di.c cVar) {
                this.f153817a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                D0 d0S2 = this.f153817a.S2();
                t.c(d0S2);
                return d0S2;
            }
        }

        /* compiled from: DaggerUniversalWidgetEditComponent.java */
        public static final class f implements u<InterfaceC19524a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit.di.c f153818a;

            public f(com.avito.android.extended_profile_universal_widget_edit.edit.di.c cVar) {
                this.f153818a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19524a interfaceC19524aV6 = this.f153818a.V6();
                t.c(interfaceC19524aV6);
                return interfaceC19524aV6;
            }
        }

        /* compiled from: DaggerUniversalWidgetEditComponent.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit.di.c f153819a;

            public g(com.avito.android.extended_profile_universal_widget_edit.edit.di.c cVar) {
                this.f153819a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f153819a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerUniversalWidgetEditComponent.java */
        public static final class h implements u<com.avito.android.extended_profile_universal_widget_edit.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.extended_profile_universal_widget_edit.edit.di.c f153820a;

            public h(com.avito.android.extended_profile_universal_widget_edit.edit.di.c cVar) {
                this.f153820a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f153820a.T4();
            }
        }

        public c() {
            throw null;
        }

        public c(C42347b c42347b, com.avito.android.extended_profile_universal_widget_edit.edit.di.c cVar, cv.b bVar, UniversalWidgetEditArguments universalWidgetEditArguments, C28478k c28478k, Fragment fragment, Resources resources, l lVar, C4488a c4488a) {
            this.f153793a = resources;
            this.f153794b = cVar;
            this.f153795c = dagger.internal.l.a(universalWidgetEditArguments);
            this.f153796d = new e(cVar);
            this.f153797e = new f(cVar);
            this.f153798f = new C4490c(cVar);
            this.f153799g = new C4489a(cVar);
            b bVar2 = new b(cVar);
            this.f153800h = bVar2;
            this.f153801i = B.a(new C42348c(c42347b, this.f153799g, k.a(bVar2)));
            this.f153803k = B.a(new C42349d(c42347b, this.f153801i, N70.d.a(new d(cVar))));
            this.f153804l = com.avito.android.photo_storage.f.a(this.f153800h);
            C49468b c49468bA = C49468b.a(this.f153804l, com.avito.android.photo_storage.h.a(this.f153800h));
            u<Context> uVar = this.f153800h;
            u<R0> uVar2 = this.f153798f;
            u<com.avito.android.extended_profile_universal_widget_edit.edit.interactor.a> uVarD = dagger.internal.g.d(new com.avito.android.extended_profile_universal_widget_edit.edit.interactor.g(this.f153796d, this.f153797e, uVar2, this.f153795c, this.f153803k, new com.avito.android.extended_profile_universal_widget_edit.edit.interactor.k(uVar, uVar2, c49468bA), c49468bA, com.avito.android.extended_profile_universal_widget_edit.l.a()));
            this.f153805m = uVarD;
            this.f153806n = new com.avito.android.extended_profile_universal_widget_edit.edit.mvi.c(this.f153795c, uVarD);
            u<com.avito.android.extended_profile_ui_components.universal_widget.a> uVarD2 = dagger.internal.g.d(e.a.f153822a);
            this.f153807o = uVarD2;
            this.f153809q = new o(this.f153795c, uVarD2, new h(cVar));
            this.f153810r = new m(new com.avito.android.extended_profile_universal_widget_edit.edit.mvi.h(this.f153806n, j.a(), this.f153809q, this.f153795c, com.avito.android.extended_profile_universal_widget_edit.edit.mvi.e.a()), this.f153805m);
            this.f153811s = new g(cVar);
            this.f153812t = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f153811s);
        }

        @Override // com.avito.android.extended_profile_universal_widget_edit.edit.di.b
        public final void a(UniversalWidgetEditFragment universalWidgetEditFragment) {
            universalWidgetEditFragment.f153777n0 = this.f153810r;
            universalWidgetEditFragment.f153779p0 = this.f153812t.get();
            universalWidgetEditFragment.f153780q0 = new n(this.f153793a);
            com.avito.android.util.text.a aVarE = this.f153794b.e();
            t.c(aVarE);
            universalWidgetEditFragment.f153781r0 = aVarE;
        }
    }

    public static b.a a() {
        return new b();
    }
}
