package com.avito.android.mortgage_calculator.internal.di;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.mortgage_calculator.MortgageCalculatorView;
import com.avito.android.mortgage_calculator.internal.T0;
import com.avito.android.mortgage_calculator.internal.di.b;
import com.avito.android.mortgage_calculator.internal.mvi.N;
import com.avito.android.mortgage_calculator.internal.mvi.Q;
import com.avito.android.mortgage_calculator.internal.mvi.T;
import com.avito.android.mortgage_calculator.internal.mvi.V;
import com.avito.android.mortgage_calculator.internal.mvi.mapper.m;
import com.avito.android.util.C35801g6;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import t10.InterfaceC48457a;

/* compiled from: DaggerMortgageCalculatorComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerMortgageCalculatorComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.mortgage_calculator.internal.di.b.a
        public final com.avito.android.mortgage_calculator.internal.di.b a(com.avito.android.mortgage_calculator.internal.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, null);
        }
    }

    /* compiled from: DaggerMortgageCalculatorComponent.java */
    public static final class c implements com.avito.android.mortgage_calculator.internal.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f204341a;

        /* renamed from: b, reason: collision with root package name */
        public final V f204342b = new V(com.avito.android.mortgage_calculator.internal.mvi.builder.c.a());

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.mortgage_calculator.internal.mvi.builder.f f204343c = new com.avito.android.mortgage_calculator.internal.mvi.builder.f(com.avito.android.mortgage_calculator.internal.mvi.builder.c.a());

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f204344d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Context> f204345e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.mortgage_calculator.internal.analytics.c f204346f;

        /* renamed from: g, reason: collision with root package name */
        public final u<R0> f204347g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC48457a> f204348h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.mortgage_calculator.internal.mvi.domain.d f204349i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.mortgage_calculator.internal.mvi.domain.f f204350j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.mortgage_calculator.data.a> f204351k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.mortgage_calculator.data.g> f204352l;

        /* renamed from: m, reason: collision with root package name */
        public final T0 f204353m;

        /* compiled from: DaggerMortgageCalculatorComponent.java */
        /* renamed from: com.avito.android.mortgage_calculator.internal.di.a$c$a, reason: collision with other inner class name */
        public static final class C6091a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mortgage_calculator.internal.di.c f204354a;

            public C6091a(com.avito.android.mortgage_calculator.internal.di.c cVar) {
                this.f204354a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f204354a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerMortgageCalculatorComponent.java */
        public static final class b implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mortgage_calculator.internal.di.c f204355a;

            public b(com.avito.android.mortgage_calculator.internal.di.c cVar) {
                this.f204355a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f204355a.g();
            }
        }

        /* compiled from: DaggerMortgageCalculatorComponent.java */
        /* renamed from: com.avito.android.mortgage_calculator.internal.di.a$c$c, reason: collision with other inner class name */
        public static final class C6092c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f204356a;

            public C6092c(cv.b bVar) {
                this.f204356a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f204356a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerMortgageCalculatorComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mortgage_calculator.internal.di.c f204357a;

            public d(com.avito.android.mortgage_calculator.internal.di.c cVar) {
                this.f204357a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f204357a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerMortgageCalculatorComponent.java */
        public static final class e implements u<InterfaceC48457a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mortgage_calculator.internal.di.c f204358a;

            public e(com.avito.android.mortgage_calculator.internal.di.c cVar) {
                this.f204358a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48457a interfaceC48457aVf = this.f204358a.vf();
                t.c(interfaceC48457aVf);
                return interfaceC48457aVf;
            }
        }

        /* compiled from: DaggerMortgageCalculatorComponent.java */
        public static final class f implements u<com.avito.android.mortgage_calculator.data.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mortgage_calculator.internal.di.c f204359a;

            public f(com.avito.android.mortgage_calculator.internal.di.c cVar) {
                this.f204359a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.mortgage_calculator.data.a aVarJe = this.f204359a.je();
                t.c(aVarJe);
                return aVarJe;
            }
        }

        /* compiled from: DaggerMortgageCalculatorComponent.java */
        public static final class g implements u<com.avito.android.mortgage_calculator.data.g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.mortgage_calculator.internal.di.c f204360a;

            public g(com.avito.android.mortgage_calculator.internal.di.c cVar) {
                this.f204360a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.mortgage_calculator.data.g gVarD8 = this.f204360a.D8();
                t.c(gVarD8);
                return gVarD8;
            }
        }

        public c(com.avito.android.mortgage_calculator.internal.di.c cVar, cv.b bVar, C6090a c6090a) {
            this.f204341a = new C6092c(bVar);
            this.f204346f = new com.avito.android.mortgage_calculator.internal.analytics.c(new C6091a(cVar), C35801g6.f318887a, new b(cVar));
            this.f204347g = new d(cVar);
            e eVar = new e(cVar);
            this.f204348h = eVar;
            this.f204349i = new com.avito.android.mortgage_calculator.internal.mvi.domain.d(eVar, com.avito.android.mortgage_calculator.internal.mvi.mapper.c.a(), this.f204347g);
            this.f204350j = new com.avito.android.mortgage_calculator.internal.mvi.domain.f(this.f204348h, m.a(), this.f204347g);
            this.f204351k = new f(cVar);
            this.f204352l = new g(cVar);
            this.f204353m = new T0(new Q(this.f204342b, new N(this.f204343c, com.avito.android.mortgage_calculator.internal.mvi.entity.e.a(), this.f204346f, this.f204347g, this.f204349i, this.f204350j, this.f204351k, this.f204352l), T.a(), this.f204343c));
        }

        @Override // com.avito.android.mortgage_calculator.internal.di.b
        public final void a(MortgageCalculatorView mortgageCalculatorView) {
            mortgageCalculatorView.deeplinkHandler = dagger.internal.g.a(this.f204341a);
            mortgageCalculatorView.viewModelProvider = this.f204353m;
        }
    }

    public static b.a a() {
        return new b();
    }
}
