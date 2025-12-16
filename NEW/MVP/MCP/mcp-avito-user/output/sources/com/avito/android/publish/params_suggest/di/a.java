package com.avito.android.publish.params_suggest.di;

import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.tracker.Z;
import com.avito.android.analytics.screens.tracker.b0;
import com.avito.android.publish.C0;
import com.avito.android.publish.params_suggest.ParamsSuggestionsFragment;
import com.avito.android.publish.params_suggest.di.b;
import com.avito.android.publish.params_suggest.m;
import com.avito.android.publish.step.request.suggest.SuggestRequestFragment;
import com.avito.android.publish.step.request.suggest.mvi.j;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import dl0.InterfaceC39749a;
import yc.C50213a;

/* compiled from: DaggerParamsSuggestionsComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerParamsSuggestionsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.publish.params_suggest.di.b.a
        public final com.avito.android.publish.params_suggest.di.b a(d dVar, int i12) {
            return new c(dVar, Integer.valueOf(i12), null);
        }
    }

    /* compiled from: DaggerParamsSuggestionsComponent.java */
    public static final class c implements com.avito.android.publish.params_suggest.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.params_suggest.di.d f238187a;

        /* renamed from: b, reason: collision with root package name */
        public final u<H0> f238188b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC39749a> f238189c;

        /* renamed from: d, reason: collision with root package name */
        public final u<Q1> f238190d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f238191e;

        /* renamed from: f, reason: collision with root package name */
        public final u<AttributesTreeConverter> f238192f;

        /* renamed from: g, reason: collision with root package name */
        public final u<CategoryParametersConverter> f238193g;

        /* renamed from: h, reason: collision with root package name */
        public final u<C50213a> f238194h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.publish.params_suggest.converter.a> f238195i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.publish.params_suggest.h> f238196j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.publish.params_suggest.a> f238197k;

        /* renamed from: l, reason: collision with root package name */
        public final u<D> f238198l;

        /* renamed from: m, reason: collision with root package name */
        public final u<Z> f238199m;

        /* renamed from: n, reason: collision with root package name */
        public final u<C0> f238200n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.publish.step.request.suggest.c f238201o;

        /* compiled from: DaggerParamsSuggestionsComponent.java */
        /* renamed from: com.avito.android.publish.params_suggest.di.a$c$a, reason: collision with other inner class name */
        public static final class C7156a implements u<AttributesTreeConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.params_suggest.di.d f238202a;

            public C7156a(com.avito.android.publish.params_suggest.di.d dVar) {
                this.f238202a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                AttributesTreeConverter attributesTreeConverterUe = this.f238202a.Ue();
                t.c(attributesTreeConverterUe);
                return attributesTreeConverterUe;
            }
        }

        /* compiled from: DaggerParamsSuggestionsComponent.java */
        public static final class b implements u<CategoryParametersConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.params_suggest.di.d f238203a;

            public b(com.avito.android.publish.params_suggest.di.d dVar) {
                this.f238203a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                CategoryParametersConverter categoryParametersConverterI = this.f238203a.I();
                t.c(categoryParametersConverterI);
                return categoryParametersConverterI;
            }
        }

        /* compiled from: DaggerParamsSuggestionsComponent.java */
        /* renamed from: com.avito.android.publish.params_suggest.di.a$c$c, reason: collision with other inner class name */
        public static final class C7157c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.params_suggest.di.d f238204a;

            public C7157c(com.avito.android.publish.params_suggest.di.d dVar) {
                this.f238204a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f238204a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerParamsSuggestionsComponent.java */
        public static final class d implements u<InterfaceC39749a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.params_suggest.di.d f238205a;

            public d(com.avito.android.publish.params_suggest.di.d dVar) {
                this.f238205a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39749a interfaceC39749aAh = this.f238205a.ah();
                t.c(interfaceC39749aAh);
                return interfaceC39749aAh;
            }
        }

        /* compiled from: DaggerParamsSuggestionsComponent.java */
        public static final class e implements u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.params_suggest.di.d f238206a;

            public e(com.avito.android.publish.params_suggest.di.d dVar) {
                this.f238206a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f238206a.D1();
                t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerParamsSuggestionsComponent.java */
        public static final class f implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.params_suggest.di.d f238207a;

            public f(com.avito.android.publish.params_suggest.di.d dVar) {
                this.f238207a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0I3 = this.f238207a.I3();
                t.c(h0I3);
                return h0I3;
            }
        }

        /* compiled from: DaggerParamsSuggestionsComponent.java */
        public static final class g implements u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.params_suggest.di.d f238208a;

            public g(com.avito.android.publish.params_suggest.di.d dVar) {
                this.f238208a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f238208a.z0();
            }
        }

        /* compiled from: DaggerParamsSuggestionsComponent.java */
        public static final class h implements u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.params_suggest.di.d f238209a;

            public h(com.avito.android.publish.params_suggest.di.d dVar) {
                this.f238209a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C0 c0U = this.f238209a.u();
                t.c(c0U);
                return c0U;
            }
        }

        /* compiled from: DaggerParamsSuggestionsComponent.java */
        public static final class i implements u<D> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.params_suggest.di.d f238210a;

            public i(com.avito.android.publish.params_suggest.di.d dVar) {
                this.f238210a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f238210a.N5();
            }
        }

        public c(com.avito.android.publish.params_suggest.di.d dVar, Integer num, C7155a c7155a) {
            this.f238187a = dVar;
            this.f238188b = new f(dVar);
            this.f238189c = new d(dVar);
            this.f238190d = new g(dVar);
            this.f238191e = new C7157c(dVar);
            this.f238192f = new C7156a(dVar);
            this.f238193g = new b(dVar);
            this.f238194h = new e(dVar);
            u<com.avito.android.publish.params_suggest.converter.a> uVarA = B.a(com.avito.android.publish.params_suggest.converter.b.a());
            this.f238195i = uVarA;
            this.f238196j = dagger.internal.g.d(new m(uVarA, this.f238188b, this.f238189c, this.f238190d, this.f238191e, this.f238192f, this.f238193g, this.f238194h));
            this.f238197k = dagger.internal.g.d(com.avito.android.publish.params_suggest.c.a());
            this.f238199m = dagger.internal.g.d(new b0(new i(dVar)));
            this.f238200n = new h(dVar);
            l lVarA = l.a(num);
            u<C0> uVar = this.f238200n;
            this.f238201o = new com.avito.android.publish.step.request.suggest.c(new com.avito.android.publish.step.request.suggest.mvi.h(new com.avito.android.publish.step.request.suggest.mvi.e(lVarA, uVar, this.f238196j, this.f238197k, this.f238191e), new com.avito.android.publish.step.request.suggest.mvi.c(uVar), j.a(), com.avito.android.publish.step.request.suggest.mvi.l.a()));
        }

        @Override // com.avito.android.publish.params_suggest.di.b
        public final void a(SuggestRequestFragment suggestRequestFragment) {
            suggestRequestFragment.f245453n0 = this.f238201o;
            InterfaceC28373a interfaceC28373aA = this.f238187a.a();
            t.c(interfaceC28373aA);
            suggestRequestFragment.f245455p0 = interfaceC28373aA;
        }

        @Override // com.avito.android.publish.params_suggest.di.b
        public final void b(ParamsSuggestionsFragment paramsSuggestionsFragment) {
            com.avito.android.publish.params_suggest.h hVar = this.f238196j.get();
            com.avito.android.publish.params_suggest.di.d dVar = this.f238187a;
            InterfaceC35745a5 interfaceC35745a5D = dVar.d();
            t.c(interfaceC35745a5D);
            C0 c0U = dVar.u();
            t.c(c0U);
            paramsSuggestionsFragment.f238175f0 = new com.avito.android.publish.params_suggest.u(hVar, interfaceC35745a5D, c0U, this.f238197k.get());
            InterfaceC28373a interfaceC28373aA = dVar.a();
            t.c(interfaceC28373aA);
            paramsSuggestionsFragment.f238176g0 = interfaceC28373aA;
            paramsSuggestionsFragment.f238177h0 = this.f238199m.get();
            C0 c0U2 = dVar.u();
            t.c(c0U2);
            paramsSuggestionsFragment.f238178i0 = c0U2;
        }
    }

    public static b.a a() {
        return new b();
    }
}
