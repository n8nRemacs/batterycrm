package com.avito.android.historical_suggests.suggest.di;

import com.avito.android.historical_suggests.suggest.di.b;
import com.avito.android.historical_suggests.suggest.interactor.n;
import com.avito.android.historical_suggests.suggest.o;
import com.avito.android.historical_suggests.suggest.usecase.f;
import com.avito.android.historical_suggests.suggest.usecase.g;
import com.avito.android.historical_suggests.suggest.usecase.i;
import com.avito.android.historical_suggests.suggest.usecase.k;
import com.avito.android.util.R0;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import nF.C44245a;
import pI.InterfaceC46962a;
import rI.InterfaceC47549a;

/* compiled from: DaggerHistoricalSuggestsComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerHistoricalSuggestsComponent.java */
    public static final class b implements b.InterfaceC4747b {
        public b() {
        }

        @Override // com.avito.android.historical_suggests.suggest.di.b.InterfaceC4747b
        public final com.avito.android.historical_suggests.suggest.di.b a(com.avito.android.historical_suggests.suggest.di.c cVar) {
            return new c(cVar, null);
        }
    }

    /* compiled from: DaggerHistoricalSuggestsComponent.java */
    public static final class c implements com.avito.android.historical_suggests.suggest.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC46962a> f161978a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC47549a> f161979b;

        /* renamed from: c, reason: collision with root package name */
        public final u<C44245a> f161980c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.historical_suggests.features.a> f161981d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f161982e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.historical_suggests.suggest.usecase.c> f161983f;

        /* renamed from: g, reason: collision with root package name */
        public final u<f> f161984g;

        /* renamed from: h, reason: collision with root package name */
        public final u<i> f161985h;

        /* renamed from: i, reason: collision with root package name */
        public final o f161986i;

        /* compiled from: DaggerHistoricalSuggestsComponent.java */
        /* renamed from: com.avito.android.historical_suggests.suggest.di.a$c$a, reason: collision with other inner class name */
        public static final class C4745a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.historical_suggests.suggest.di.c f161987a;

            public C4745a(com.avito.android.historical_suggests.suggest.di.c cVar) {
                this.f161987a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f161987a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerHistoricalSuggestsComponent.java */
        public static final class b implements u<InterfaceC47549a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.historical_suggests.suggest.di.c f161988a;

            public b(com.avito.android.historical_suggests.suggest.di.c cVar) {
                this.f161988a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC47549a interfaceC47549aJh = this.f161988a.jh();
                t.c(interfaceC47549aJh);
                return interfaceC47549aJh;
            }
        }

        /* compiled from: DaggerHistoricalSuggestsComponent.java */
        /* renamed from: com.avito.android.historical_suggests.suggest.di.a$c$c, reason: collision with other inner class name */
        public static final class C4746c implements u<C44245a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.historical_suggests.suggest.di.c f161989a;

            public C4746c(com.avito.android.historical_suggests.suggest.di.c cVar) {
                this.f161989a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161989a.R0();
            }
        }

        /* compiled from: DaggerHistoricalSuggestsComponent.java */
        public static final class d implements u<com.avito.android.historical_suggests.features.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.historical_suggests.suggest.di.c f161990a;

            public d(com.avito.android.historical_suggests.suggest.di.c cVar) {
                this.f161990a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161990a.Rl();
            }
        }

        /* compiled from: DaggerHistoricalSuggestsComponent.java */
        public static final class e implements u<InterfaceC46962a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.historical_suggests.suggest.di.c f161991a;

            public e(com.avito.android.historical_suggests.suggest.di.c cVar) {
                this.f161991a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC46962a interfaceC46962aJm = this.f161991a.Jm();
                t.c(interfaceC46962aJm);
                return interfaceC46962aJm;
            }
        }

        public c(com.avito.android.historical_suggests.suggest.di.c cVar, C4744a c4744a) {
            this.f161978a = new e(cVar);
            this.f161979b = new b(cVar);
            this.f161980c = new C4746c(cVar);
            this.f161981d = new d(cVar);
            u<com.avito.android.historical_suggests.suggest.usecase.c> uVarA = B.a(new com.avito.android.historical_suggests.suggest.usecase.d(new C4745a(cVar)));
            this.f161983f = uVarA;
            u<f> uVarA2 = B.a(new g(uVarA, this.f161978a));
            this.f161984g = uVarA2;
            u<i> uVarA3 = B.a(new k(uVarA2, this.f161983f));
            this.f161985h = uVarA3;
            u<InterfaceC46962a> uVar = this.f161978a;
            u<InterfaceC47549a> uVar2 = this.f161979b;
            u<C44245a> uVar3 = this.f161980c;
            u<com.avito.android.historical_suggests.features.a> uVar4 = this.f161981d;
            this.f161986i = new o(new com.avito.android.historical_suggests.suggest.mvi.g(new com.avito.android.historical_suggests.suggest.mvi.d(new n(uVarA3, uVar, uVar2, uVar3, uVar4, this.f161984g), uVarA3), new com.avito.android.historical_suggests.suggest.mvi.i(uVar4), com.avito.android.historical_suggests.suggest.mvi.k.a()));
        }

        @Override // com.avito.android.historical_suggests.suggest.di.b
        public final void a(com.avito.android.historical_suggests.suggest.k kVar) {
            kVar.viewModelProvider = this.f161986i;
        }
    }

    public static b.InterfaceC4747b a() {
        return new b();
    }
}
