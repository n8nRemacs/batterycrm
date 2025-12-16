package com.avito.android.edit_basic_info.di;

import Za0.InterfaceC19524a;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.di.module.C30060h5;
import com.avito.android.edit_basic_info.EditBasicInfoFragment;
import com.avito.android.edit_basic_info.di.b;
import com.avito.android.edit_basic_info.di.d;
import com.avito.android.edit_basic_info.model.EditBasicInfoArguments;
import com.avito.android.edit_basic_info.mvi.m;
import com.avito.android.edit_basic_info.t;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_storage.k;
import com.avito.android.profile_settings_basic.C33458c;
import com.avito.android.profile_settings_basic.C33464i;
import com.avito.android.profile_settings_basic.InterfaceC33456a;
import com.avito.android.profile_settings_basic.InterfaceC33460e;
import com.avito.android.remote.D0;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.u;
import jb0.C42347b;
import jb0.C42348c;
import jb0.C42349d;

/* compiled from: DaggerEditBasicInfoComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerEditBasicInfoComponent.java */
    public static final class b implements com.avito.android.edit_basic_info.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC29970g f146044a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC19524a> f146045b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f146046c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.edit_basic_info.interactor.c f146047d;

        /* renamed from: e, reason: collision with root package name */
        public final l f146048e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f146049f;

        /* renamed from: g, reason: collision with root package name */
        public final u<D0> f146050g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Application> f146051h;

        /* renamed from: i, reason: collision with root package name */
        public final u<Context> f146052i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.photo_picker.converter.b> f146053j;

        /* renamed from: k, reason: collision with root package name */
        public final u<Gson> f146054k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.photo_picker.converter.f> f146055l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC33456a> f146056m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC33460e> f146057n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC28373a> f146058o;

        /* renamed from: p, reason: collision with root package name */
        public final m f146059p;

        /* renamed from: q, reason: collision with root package name */
        public final t f146060q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28481c> f146061r;

        /* renamed from: s, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f146062s;

        /* renamed from: t, reason: collision with root package name */
        public final l f146063t;

        /* renamed from: u, reason: collision with root package name */
        public final u<PhotoPickerIntentFactory> f146064u;

        /* renamed from: v, reason: collision with root package name */
        public final l f146065v;

        /* renamed from: w, reason: collision with root package name */
        public final u<String> f146066w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.edit_basic_info.a> f146067x;

        /* compiled from: DaggerEditBasicInfoComponent.java */
        /* renamed from: com.avito.android.edit_basic_info.di.a$b$a, reason: collision with other inner class name */
        public static final class C4247a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146068a;

            public C4247a(InterfaceC29970g interfaceC29970g) {
                this.f146068a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f146068a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerEditBasicInfoComponent.java */
        /* renamed from: com.avito.android.edit_basic_info.di.a$b$b, reason: collision with other inner class name */
        public static final class C4248b implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146069a;

            public C4248b(InterfaceC29970g interfaceC29970g) {
                this.f146069a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f146069a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerEditBasicInfoComponent.java */
        public static final class c implements u<InterfaceC19524a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146070a;

            public c(InterfaceC29970g interfaceC29970g) {
                this.f146070a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19524a interfaceC19524aQf = this.f146070a.Qf();
                dagger.internal.t.c(interfaceC19524aQf);
                return interfaceC19524aQf;
            }
        }

        /* compiled from: DaggerEditBasicInfoComponent.java */
        public static final class d implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146071a;

            public d(InterfaceC29970g interfaceC29970g) {
                this.f146071a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f146071a.g();
            }
        }

        /* compiled from: DaggerEditBasicInfoComponent.java */
        public static final class e implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f146072a;

            public e(cv.b bVar) {
                this.f146072a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f146072a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerEditBasicInfoComponent.java */
        public static final class f implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146073a;

            public f(InterfaceC29970g interfaceC29970g) {
                this.f146073a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f146073a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerEditBasicInfoComponent.java */
        public static final class g implements u<D0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146074a;

            public g(InterfaceC29970g interfaceC29970g) {
                this.f146074a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                D0 d0B7 = this.f146074a.b7();
                dagger.internal.t.c(d0B7);
                return d0B7;
            }
        }

        /* compiled from: DaggerEditBasicInfoComponent.java */
        public static final class h implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146075a;

            public h(InterfaceC29970g interfaceC29970g) {
                this.f146075a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f146075a.s();
                dagger.internal.t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerEditBasicInfoComponent.java */
        public static final class i implements u<PhotoPickerIntentFactory> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146076a;

            public i(InterfaceC29970g interfaceC29970g) {
                this.f146076a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f146076a.X();
            }
        }

        /* compiled from: DaggerEditBasicInfoComponent.java */
        public static final class j implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146077a;

            public j(InterfaceC29970g interfaceC29970g) {
                this.f146077a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f146077a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(C42347b c42347b, InterfaceC29970g interfaceC29970g, cv.b bVar, EditBasicInfoArguments editBasicInfoArguments, C28478k c28478k, Fragment fragment, Y41.l lVar, C4246a c4246a) {
            this.f146044a = interfaceC29970g;
            c cVar = new c(interfaceC29970g);
            this.f146045b = cVar;
            f fVar = new f(interfaceC29970g);
            this.f146046c = fVar;
            this.f146047d = new com.avito.android.edit_basic_info.interactor.c(cVar, fVar);
            this.f146048e = l.a(editBasicInfoArguments);
            this.f146049f = new e(bVar);
            this.f146050g = new g(interfaceC29970g);
            this.f146051h = new C4248b(interfaceC29970g);
            this.f146053j = B.a(new C42348c(c42347b, this.f146051h, k.a(new d(interfaceC29970g))));
            this.f146055l = B.a(new C42349d(c42347b, this.f146053j, N70.d.a(new h(interfaceC29970g))));
            u<InterfaceC33456a> uVarD = dagger.internal.g.d(C33458c.a());
            this.f146056m = uVarD;
            u<InterfaceC33460e> uVarD2 = dagger.internal.g.d(new C33464i(this.f146050g, this.f146045b, this.f146046c, this.f146055l, uVarD));
            this.f146057n = uVarD2;
            C4247a c4247a = new C4247a(interfaceC29970g);
            com.avito.android.edit_basic_info.interactor.c cVar2 = this.f146047d;
            l lVar2 = this.f146048e;
            com.avito.android.edit_basic_info.mvi.d dVar = new com.avito.android.edit_basic_info.mvi.d(cVar2, lVar2, this.f146049f, uVarD2, c4247a);
            this.f146059p = new m(lVar2);
            this.f146060q = new t(new com.avito.android.edit_basic_info.mvi.i(dVar, com.avito.android.edit_basic_info.mvi.k.a(), this.f146059p, com.avito.android.edit_basic_info.mvi.f.a(), this.f146048e));
            this.f146061r = new j(interfaceC29970g);
            this.f146062s = dagger.internal.g.d(new C30060h5(this.f146061r, l.a(c28478k)));
            this.f146063t = l.a(fragment);
            this.f146064u = new i(interfaceC29970g);
            this.f146065v = l.a(lVar);
            u<String> uVarD3 = dagger.internal.g.d(d.a.f146079a);
            this.f146066w = uVarD3;
            this.f146067x = dagger.internal.g.d(new com.avito.android.edit_basic_info.d(this.f146063t, this.f146065v, uVarD3, this.f146064u));
        }

        @Override // com.avito.android.edit_basic_info.di.b
        public final void a(EditBasicInfoFragment editBasicInfoFragment) {
            editBasicInfoFragment.f146015n0 = this.f146060q;
            editBasicInfoFragment.f146017p0 = this.f146062s.get();
            editBasicInfoFragment.f146018q0 = this.f146067x.get();
            com.avito.android.util.text.a aVarE = this.f146044a.e();
            dagger.internal.t.c(aVarE);
            editBasicInfoFragment.f146019r0 = aVarE;
        }
    }

    /* compiled from: DaggerEditBasicInfoComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.edit_basic_info.di.b.a
        public final com.avito.android.edit_basic_info.di.b a(EditBasicInfoArguments editBasicInfoArguments, C28478k c28478k, EditBasicInfoFragment editBasicInfoFragment, Y41.l lVar, InterfaceC29970g interfaceC29970g, InterfaceC39417a interfaceC39417a) {
            editBasicInfoArguments.getClass();
            interfaceC39417a.getClass();
            return new b(new C42347b(), interfaceC29970g, interfaceC39417a, editBasicInfoArguments, c28478k, editBasicInfoFragment, lVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
