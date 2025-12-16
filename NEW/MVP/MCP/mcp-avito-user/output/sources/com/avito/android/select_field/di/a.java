package com.avito.android.select_field.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.remote.D0;
import com.avito.android.select_field.SelectFieldFragment;
import com.avito.android.select_field.di.b;
import com.avito.android.select_field.model.SelectFieldArguments;
import com.avito.android.select_field.mvi.g;
import com.avito.android.select_field.mvi.i;
import com.avito.android.select_field.mvi.k;
import com.avito.android.select_field.n;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSelectFieldComponent.java */
@e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSelectFieldComponent.java */
    public static final class b implements b.InterfaceC7968b {
        public b() {
        }

        @Override // com.avito.android.select_field.di.b.InterfaceC7968b
        public final com.avito.android.select_field.di.b a(SelectFieldArguments selectFieldArguments, C28478k c28478k, InterfaceC29970g interfaceC29970g) {
            selectFieldArguments.getClass();
            return new c(interfaceC29970g, selectFieldArguments, c28478k, null);
        }
    }

    /* compiled from: DaggerSelectFieldComponent.java */
    public static final class c implements com.avito.android.select_field.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f267137a;

        /* renamed from: b, reason: collision with root package name */
        public final u<D0> f267138b;

        /* renamed from: c, reason: collision with root package name */
        public final u<Gson> f267139c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35863o4> f267140d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f267141e;

        /* renamed from: f, reason: collision with root package name */
        public final n f267142f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f267143g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f267144h;

        /* compiled from: DaggerSelectFieldComponent.java */
        /* renamed from: com.avito.android.select_field.di.a$c$a, reason: collision with other inner class name */
        public static final class C7966a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f267145a;

            public C7966a(InterfaceC29970g interfaceC29970g) {
                this.f267145a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f267145a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSelectFieldComponent.java */
        public static final class b implements u<D0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f267146a;

            public b(InterfaceC29970g interfaceC29970g) {
                this.f267146a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                D0 d0B7 = this.f267146a.b7();
                t.c(d0B7);
                return d0B7;
            }
        }

        /* compiled from: DaggerSelectFieldComponent.java */
        /* renamed from: com.avito.android.select_field.di.a$c$c, reason: collision with other inner class name */
        public static final class C7967c implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f267147a;

            public C7967c(InterfaceC29970g interfaceC29970g) {
                this.f267147a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f267147a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerSelectFieldComponent.java */
        public static final class d implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f267148a;

            public d(InterfaceC29970g interfaceC29970g) {
                this.f267148a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f267148a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerSelectFieldComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f267149a;

            public e(InterfaceC29970g interfaceC29970g) {
                this.f267149a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f267149a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(InterfaceC29970g interfaceC29970g, SelectFieldArguments selectFieldArguments, C28478k c28478k, C7965a c7965a) {
            l lVarA = l.a(selectFieldArguments);
            this.f267137a = lVarA;
            this.f267142f = new n(new g(new com.avito.android.select_field.mvi.d(lVarA, new com.avito.android.select_field.interactor.c(lVarA, new b(interfaceC29970g), new C7967c(interfaceC29970g), new d(interfaceC29970g), new C7966a(interfaceC29970g))), i.a(), k.a(), this.f267137a));
            this.f267143g = new e(interfaceC29970g);
            this.f267144h = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f267143g);
        }

        @Override // com.avito.android.select_field.di.b
        public final void a(SelectFieldFragment selectFieldFragment) {
            selectFieldFragment.f267124n0 = this.f267142f;
            selectFieldFragment.f267125o0 = this.f267144h.get();
        }
    }

    public static b.InterfaceC7968b a() {
        return new b();
    }
}
