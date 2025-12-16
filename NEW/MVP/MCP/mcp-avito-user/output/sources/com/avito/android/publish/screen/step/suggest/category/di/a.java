package com.avito.android.publish.screen.step.suggest.category.di;

import Jj.C14204c;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.S0;
import com.avito.android.publish.details.U0;
import com.avito.android.publish.screen.step.suggest.category.SuggestCategoryFragment;
import com.avito.android.publish.screen.step.suggest.category.di.b;
import com.avito.android.publish.screen.step.suggest.category.di.i;
import com.avito.android.publish.screen.step.suggest.category.di.l;
import com.avito.android.publish.screen.step.suggest.category.mvi.n;
import com.avito.android.publish.screen.step.suggest.category.mvi.p;
import com.avito.android.publish.screen.step.suggest.category.mvi.r;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.R0;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;
import xe0.C49932c;
import yc.C50213a;

/* compiled from: DaggerSuggestCategoryComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerSuggestCategoryComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.publish.screen.step.suggest.category.di.b.a
        public final com.avito.android.publish.screen.step.suggest.category.di.b a(com.avito.android.publish.screen.step.suggest.category.di.c cVar, int i12) {
            return new c(cVar, Integer.valueOf(i12), null);
        }
    }

    /* compiled from: DaggerSuggestCategoryComponent.java */
    public static final class c implements com.avito.android.publish.screen.step.suggest.category.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f242291A;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.screen.step.suggest.category.di.c f242292a;

        /* renamed from: b, reason: collision with root package name */
        public final u<C0> f242293b;

        /* renamed from: c, reason: collision with root package name */
        public final u<H0> f242294c;

        /* renamed from: d, reason: collision with root package name */
        public final u<C50213a> f242295d;

        /* renamed from: e, reason: collision with root package name */
        public final u<CategoryParametersConverter> f242296e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Q1> f242297f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.publish.screen.step.suggest.category.data.e> f242298g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f242299h;

        /* renamed from: i, reason: collision with root package name */
        public final u<S0> f242300i;

        /* renamed from: j, reason: collision with root package name */
        public final u<SharedPreferences> f242301j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.publish.items.e> f242302k;

        /* renamed from: l, reason: collision with root package name */
        public final u<R0> f242303l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.publish.screen.step.suggest.category.data.a> f242304m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC33535v> f242305n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.publish.screen.step.suggest.category.e f242306o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.wizard.d> f242307p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.wizard.a> f242308q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.checkable.d> f242309r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.checkable.a> f242310s;

        /* renamed from: t, reason: collision with root package name */
        public final u<AK0.l> f242311t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f242312u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.header.e> f242313v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.header.b> f242314w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f242315x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f242316y;

        /* renamed from: z, reason: collision with root package name */
        public final u<RecyclerView.Adapter<?>> f242317z;

        /* compiled from: DaggerSuggestCategoryComponent.java */
        /* renamed from: com.avito.android.publish.screen.step.suggest.category.di.a$c$a, reason: collision with other inner class name */
        public static final class C7261a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.suggest.category.di.c f242318a;

            public C7261a(com.avito.android.publish.screen.step.suggest.category.di.c cVar) {
                this.f242318a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f242318a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerSuggestCategoryComponent.java */
        public static final class b implements u<CategoryParametersConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.suggest.category.di.c f242319a;

            public b(com.avito.android.publish.screen.step.suggest.category.di.c cVar) {
                this.f242319a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                CategoryParametersConverter categoryParametersConverterI = this.f242319a.I();
                t.c(categoryParametersConverterI);
                return categoryParametersConverterI;
            }
        }

        /* compiled from: DaggerSuggestCategoryComponent.java */
        /* renamed from: com.avito.android.publish.screen.step.suggest.category.di.a$c$c, reason: collision with other inner class name */
        public static final class C7262c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.suggest.category.di.c f242320a;

            public C7262c(com.avito.android.publish.screen.step.suggest.category.di.c cVar) {
                this.f242320a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f242320a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSuggestCategoryComponent.java */
        public static final class d implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.suggest.category.di.c f242321a;

            public d(com.avito.android.publish.screen.step.suggest.category.di.c cVar) {
                this.f242321a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f242321a.r();
            }
        }

        /* compiled from: DaggerSuggestCategoryComponent.java */
        public static final class e implements u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.suggest.category.di.c f242322a;

            public e(com.avito.android.publish.screen.step.suggest.category.di.c cVar) {
                this.f242322a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f242322a.D1();
                t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerSuggestCategoryComponent.java */
        public static final class f implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.suggest.category.di.c f242323a;

            public f(com.avito.android.publish.screen.step.suggest.category.di.c cVar) {
                this.f242323a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0I3 = this.f242323a.I3();
                t.c(h0I3);
                return h0I3;
            }
        }

        /* compiled from: DaggerSuggestCategoryComponent.java */
        public static final class g implements u<InterfaceC33535v> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.suggest.category.di.c f242324a;

            public g(com.avito.android.publish.screen.step.suggest.category.di.c cVar) {
                this.f242324a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f242324a.P();
            }
        }

        /* compiled from: DaggerSuggestCategoryComponent.java */
        public static final class h implements u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.suggest.category.di.c f242325a;

            public h(com.avito.android.publish.screen.step.suggest.category.di.c cVar) {
                this.f242325a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f242325a.z0();
            }
        }

        /* compiled from: DaggerSuggestCategoryComponent.java */
        public static final class i implements u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.suggest.category.di.c f242326a;

            public i(com.avito.android.publish.screen.step.suggest.category.di.c cVar) {
                this.f242326a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C0 c0U = this.f242326a.u();
                t.c(c0U);
                return c0U;
            }
        }

        /* compiled from: DaggerSuggestCategoryComponent.java */
        public static final class j implements u<SharedPreferences> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.screen.step.suggest.category.di.c f242327a;

            public j(com.avito.android.publish.screen.step.suggest.category.di.c cVar) {
                this.f242327a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SharedPreferences sharedPreferencesR1 = this.f242327a.R1();
                t.c(sharedPreferencesR1);
                return sharedPreferencesR1;
            }
        }

        public c(com.avito.android.publish.screen.step.suggest.category.di.c cVar, Integer num, C7260a c7260a) {
            this.f242292a = cVar;
            this.f242293b = new i(cVar);
            f fVar = new f(cVar);
            e eVar = new e(cVar);
            b bVar = new b(cVar);
            h hVar = new h(cVar);
            this.f242297f = hVar;
            this.f242298g = dagger.internal.g.d(new com.avito.android.publish.screen.step.suggest.category.data.g(fVar, eVar, bVar, hVar));
            dagger.internal.l lVarA = dagger.internal.l.a(num);
            this.f242299h = lVarA;
            u<S0> uVarD = dagger.internal.g.d(new U0(lVarA, this.f242293b));
            this.f242300i = uVarD;
            u<com.avito.android.publish.items.e> uVarD2 = dagger.internal.g.d(new com.avito.android.publish.items.g(uVarD, new C49932c(new j(cVar))));
            this.f242302k = uVarD2;
            C7262c c7262c = new C7262c(cVar);
            u<com.avito.android.publish.screen.step.suggest.category.data.a> uVarD3 = dagger.internal.g.d(new com.avito.android.publish.screen.step.suggest.category.data.c(this.f242299h, uVarD2, this.f242293b, this.f242298g, c7262c, this.f242297f));
            this.f242304m = uVarD3;
            com.avito.android.publish.screen.step.suggest.category.mvi.k kVar = new com.avito.android.publish.screen.step.suggest.category.mvi.k(uVarD3);
            g gVar = new g(cVar);
            this.f242306o = new com.avito.android.publish.screen.step.suggest.category.e(new n(kVar, new com.avito.android.publish.screen.step.suggest.category.mvi.i(this.f242299h, uVarD3, this.f242293b, gVar), p.a(), r.a()));
            u<com.avito.android.blueprints.publish.wizard.d> uVarD4 = dagger.internal.g.d(l.a.f242339a);
            this.f242307p = uVarD4;
            this.f242308q = dagger.internal.g.d(new com.avito.android.publish.screen.step.suggest.category.di.g(uVarD4));
            u<com.avito.android.blueprints.publish.checkable.d> uVarD5 = dagger.internal.g.d(i.a.f242334a);
            this.f242309r = uVarD5;
            this.f242310s = dagger.internal.g.d(new com.avito.android.publish.screen.step.suggest.category.di.h(uVarD5));
            u<com.avito.android.blueprints.publish.header.e> uVarD6 = dagger.internal.g.d(new com.avito.android.blueprints.publish.header.i(new C14204c(new d(cVar)), new C7261a(cVar)));
            this.f242313v = uVarD6;
            u<com.avito.android.blueprints.publish.header.b> uVarD7 = dagger.internal.g.d(new com.avito.android.blueprints.publish.header.d(uVarD6, this.f242297f));
            this.f242314w = uVarD7;
            u<com.avito.konveyor.a> uVarD8 = dagger.internal.g.d(new com.avito.android.publish.screen.step.suggest.category.di.j(uVarD7, this.f242308q, this.f242310s));
            this.f242315x = uVarD8;
            u<com.avito.konveyor.adapter.a> uVarD9 = dagger.internal.g.d(new com.avito.android.publish.screen.step.suggest.category.di.f(uVarD8));
            this.f242316y = uVarD9;
            this.f242317z = dagger.internal.g.d(new com.avito.android.publish.screen.step.suggest.category.di.e(uVarD9, this.f242315x));
            this.f242291A = dagger.internal.g.d(new k(this.f242307p));
        }

        @Override // com.avito.android.publish.screen.step.suggest.category.di.b
        public final void a(SuggestCategoryFragment suggestCategoryFragment) {
            suggestCategoryFragment.f242222n0 = this.f242306o;
            com.avito.android.publish.screen.step.suggest.category.di.c cVar = this.f242292a;
            C0 c0U = cVar.u();
            t.c(c0U);
            suggestCategoryFragment.f242224p0 = c0U;
            suggestCategoryFragment.f242225q0 = this.f242317z.get();
            suggestCategoryFragment.f242226r0 = this.f242316y.get();
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            suggestCategoryFragment.f242227s0 = interfaceC28373aA;
            suggestCategoryFragment.f242228t0 = this.f242291A.get();
            suggestCategoryFragment.f242229u0 = cVar.z0();
        }
    }

    public static b.a a() {
        return new b();
    }
}
