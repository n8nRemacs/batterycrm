package com.avito.android.edit_count_field.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.edit_count_field.EditCountFieldFragment;
import com.avito.android.edit_count_field.di.b;
import com.avito.android.edit_count_field.model.EditCountFieldArguments;
import com.avito.android.edit_count_field.mvi.g;
import com.avito.android.edit_count_field.mvi.i;
import com.avito.android.edit_count_field.mvi.k;
import com.avito.android.edit_count_field.q;
import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerEditCountFieldComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerEditCountFieldComponent.java */
    public static final class b implements com.avito.android.edit_count_field.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f146583a;

        /* renamed from: b, reason: collision with root package name */
        public final u<D0> f146584b;

        /* renamed from: c, reason: collision with root package name */
        public final u<Gson> f146585c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35863o4> f146586d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f146587e;

        /* renamed from: f, reason: collision with root package name */
        public final q f146588f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f146589g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f146590h;

        /* compiled from: DaggerEditCountFieldComponent.java */
        /* renamed from: com.avito.android.edit_count_field.di.a$b$a, reason: collision with other inner class name */
        public static final class C4260a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146591a;

            public C4260a(InterfaceC29970g interfaceC29970g) {
                this.f146591a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f146591a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerEditCountFieldComponent.java */
        /* renamed from: com.avito.android.edit_count_field.di.a$b$b, reason: collision with other inner class name */
        public static final class C4261b implements u<D0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146592a;

            public C4261b(InterfaceC29970g interfaceC29970g) {
                this.f146592a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                D0 d0B7 = this.f146592a.b7();
                t.c(d0B7);
                return d0B7;
            }
        }

        /* compiled from: DaggerEditCountFieldComponent.java */
        public static final class c implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146593a;

            public c(InterfaceC29970g interfaceC29970g) {
                this.f146593a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f146593a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerEditCountFieldComponent.java */
        public static final class d implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146594a;

            public d(InterfaceC29970g interfaceC29970g) {
                this.f146594a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f146594a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerEditCountFieldComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC29970g f146595a;

            public e(InterfaceC29970g interfaceC29970g) {
                this.f146595a = interfaceC29970g;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f146595a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(InterfaceC29970g interfaceC29970g, EditCountFieldArguments editCountFieldArguments, C28478k c28478k, C4259a c4259a) {
            l lVarA = l.a(editCountFieldArguments);
            this.f146583a = lVarA;
            this.f146588f = new q(new g(new com.avito.android.edit_count_field.mvi.d(new com.avito.android.edit_count_field.interactor.c(lVarA, new C4261b(interfaceC29970g), new c(interfaceC29970g), new d(interfaceC29970g), new C4260a(interfaceC29970g)), lVarA), i.a(), k.a(), this.f146583a));
            this.f146589g = new e(interfaceC29970g);
            this.f146590h = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f146589g);
        }

        @Override // com.avito.android.edit_count_field.di.b
        public final void a(EditCountFieldFragment editCountFieldFragment) {
            editCountFieldFragment.f146569n0 = this.f146588f;
            editCountFieldFragment.f146571p0 = this.f146590h.get();
        }
    }

    /* compiled from: DaggerEditCountFieldComponent.java */
    public static final class c implements b.InterfaceC4262b {
        public c() {
        }

        @Override // com.avito.android.edit_count_field.di.b.InterfaceC4262b
        public final com.avito.android.edit_count_field.di.b a(EditCountFieldArguments editCountFieldArguments, C28478k c28478k, InterfaceC29970g interfaceC29970g) {
            editCountFieldArguments.getClass();
            return new b(interfaceC29970g, editCountFieldArguments, c28478k, null);
        }
    }

    public static b.InterfaceC4262b a() {
        return new c();
    }
}
