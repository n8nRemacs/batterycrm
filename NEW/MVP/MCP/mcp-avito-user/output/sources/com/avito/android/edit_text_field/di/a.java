package com.avito.android.edit_text_field.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.edit_text_field.C30337m;
import com.avito.android.edit_text_field.EditTextFieldFragment;
import com.avito.android.edit_text_field.InterfaceC30331g;
import com.avito.android.edit_text_field.di.b;
import com.avito.android.edit_text_field.o;
import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerEditTextFieldComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerEditTextFieldComponent.java */
    public static final class b implements com.avito.android.edit_text_field.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC29970g f146955a;

        /* renamed from: b, reason: collision with root package name */
        public final l f146956b;

        /* renamed from: c, reason: collision with root package name */
        public final u<D0> f146957c;

        /* renamed from: d, reason: collision with root package name */
        public final u<Gson> f146958d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC35863o4> f146959e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f146960f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f146961g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC30331g> f146962h;

        /* renamed from: i, reason: collision with root package name */
        public final u<gD.f> f146963i;

        /* renamed from: j, reason: collision with root package name */
        public final u<E> f146964j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28373a> f146965k;

        /* renamed from: l, reason: collision with root package name */
        public final o f146966l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f146967m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f146968n;

        /* compiled from: DaggerEditTextFieldComponent.java */
        /* renamed from: com.avito.android.edit_text_field.di.a$b$a, reason: collision with other inner class name */
        public static final class C4276a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146969a;

            public C4276a(InterfaceC29970g interfaceC29970g) {
                this.f146969a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f146969a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerEditTextFieldComponent.java */
        /* renamed from: com.avito.android.edit_text_field.di.a$b$b, reason: collision with other inner class name */
        public static final class C4277b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146970a;

            public C4277b(InterfaceC29970g interfaceC29970g) {
                this.f146970a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f146970a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerEditTextFieldComponent.java */
        public static final class c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f146971a;

            public c(cv.b bVar) {
                this.f146971a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f146971a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerEditTextFieldComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146972a;

            public d(InterfaceC29970g interfaceC29970g) {
                this.f146972a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f146972a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerEditTextFieldComponent.java */
        public static final class e implements u<D0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146973a;

            public e(InterfaceC29970g interfaceC29970g) {
                this.f146973a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                D0 d0B7 = this.f146973a.b7();
                t.c(d0B7);
                return d0B7;
            }
        }

        /* compiled from: DaggerEditTextFieldComponent.java */
        public static final class f implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146974a;

            public f(InterfaceC29970g interfaceC29970g) {
                this.f146974a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f146974a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerEditTextFieldComponent.java */
        public static final class g implements u<gD.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146975a;

            public g(InterfaceC29970g interfaceC29970g) {
                this.f146975a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f146975a.v1();
            }
        }

        /* compiled from: DaggerEditTextFieldComponent.java */
        public static final class h implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146976a;

            public h(InterfaceC29970g interfaceC29970g) {
                this.f146976a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f146976a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerEditTextFieldComponent.java */
        public static final class i implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146977a;

            public i(InterfaceC29970g interfaceC29970g) {
                this.f146977a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f146977a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(InterfaceC29970g interfaceC29970g, cv.b bVar, Fragment fragment, Resources resources, EditTextFieldFragment.Mode mode, C28478k c28478k, C4275a c4275a) {
            this.f146955a = interfaceC29970g;
            l lVarA = l.a(mode);
            this.f146956b = lVarA;
            u<InterfaceC30331g> uVarD = dagger.internal.g.d(new C30337m(lVarA, new e(interfaceC29970g), new f(interfaceC29970g), new h(interfaceC29970g), new d(interfaceC29970g), new c(bVar)));
            this.f146962h = uVarD;
            this.f146966l = new o(new com.avito.android.edit_text_field.mvi.e(new com.avito.android.edit_text_field.mvi.b(this.f146956b, uVarD, new g(interfaceC29970g), new C4276a(interfaceC29970g), new C4277b(interfaceC29970g)), com.avito.android.edit_text_field.mvi.g.a(), com.avito.android.edit_text_field.mvi.i.a()));
            this.f146967m = new i(interfaceC29970g);
            this.f146968n = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f146967m);
        }

        @Override // com.avito.android.edit_text_field.di.b
        public final void a(EditTextFieldFragment editTextFieldFragment) {
            editTextFieldFragment.f146887h0 = this.f146966l;
            com.avito.android.util.text.a aVarE = this.f146955a.e();
            t.c(aVarE);
            editTextFieldFragment.f146889j0 = aVarE;
            editTextFieldFragment.f146890k0 = this.f146968n.get();
        }
    }

    /* compiled from: DaggerEditTextFieldComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.edit_text_field.di.b.a
        public final com.avito.android.edit_text_field.di.b a(EditTextFieldFragment editTextFieldFragment, Resources resources, EditTextFieldFragment.Mode mode, C28478k c28478k, InterfaceC29970g interfaceC29970g, InterfaceC39417a interfaceC39417a) {
            mode.getClass();
            interfaceC39417a.getClass();
            return new b(interfaceC29970g, interfaceC39417a, editTextFieldFragment, resources, mode, c28478k, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
