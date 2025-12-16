package com.avito.android.publish.merge_pretend_premoderation.di;

import Cd.D;
import Cd.F;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.C0;
import com.avito.android.publish.merge_pretend_premoderation.MergePretendPremoderationFragment;
import com.avito.android.publish.merge_pretend_premoderation.di.b;
import com.avito.android.publish.merge_pretend_premoderation.j;
import com.avito.android.publish.merge_pretend_premoderation.n;
import com.avito.android.publish.premoderation.k;
import com.avito.android.publish.premoderation.m;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.u1;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.q;
import dagger.internal.t;
import dagger.internal.u;
import yc.C50213a;

/* compiled from: DaggerMergePretendPremoderationComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerMergePretendPremoderationComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.publish.merge_pretend_premoderation.di.b.a
        public final com.avito.android.publish.merge_pretend_premoderation.di.b a(S0 s02, com.avito.android.publish.merge_pretend_premoderation.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, s02, null);
        }
    }

    /* compiled from: DaggerMergePretendPremoderationComponent.java */
    public static final class c implements com.avito.android.publish.merge_pretend_premoderation.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final S0 f237402a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.publish.merge_pretend_premoderation.di.c f237403b;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f237404c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35745a5> f237405d;

        /* renamed from: e, reason: collision with root package name */
        public final u<u1> f237406e;

        /* renamed from: f, reason: collision with root package name */
        public final u<CategoryParametersConverter> f237407f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C50213a> f237408g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.publish.pretend.e> f237409h;

        /* renamed from: i, reason: collision with root package name */
        public final u<H0> f237410i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Q1> f237411j;

        /* renamed from: k, reason: collision with root package name */
        public final u<k> f237412k;

        /* renamed from: l, reason: collision with root package name */
        public final u<C0> f237413l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.publish.merge_pretend_premoderation.k f237414m;

        /* renamed from: n, reason: collision with root package name */
        public final u<D> f237415n;

        /* compiled from: DaggerMergePretendPremoderationComponent.java */
        /* renamed from: com.avito.android.publish.merge_pretend_premoderation.di.a$c$a, reason: collision with other inner class name */
        public static final class C7148a implements u<CategoryParametersConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.merge_pretend_premoderation.di.c f237416a;

            public C7148a(com.avito.android.publish.merge_pretend_premoderation.di.c cVar) {
                this.f237416a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                CategoryParametersConverter categoryParametersConverterI = this.f237416a.I();
                t.c(categoryParametersConverterI);
                return categoryParametersConverterI;
            }
        }

        /* compiled from: DaggerMergePretendPremoderationComponent.java */
        public static final class b implements u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.merge_pretend_premoderation.di.c f237417a;

            public b(com.avito.android.publish.merge_pretend_premoderation.di.c cVar) {
                this.f237417a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f237417a.D1();
                t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerMergePretendPremoderationComponent.java */
        /* renamed from: com.avito.android.publish.merge_pretend_premoderation.di.a$c$c, reason: collision with other inner class name */
        public static final class C7149c implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.merge_pretend_premoderation.di.c f237418a;

            public C7149c(com.avito.android.publish.merge_pretend_premoderation.di.c cVar) {
                this.f237418a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0I3 = this.f237418a.I3();
                t.c(h0I3);
                return h0I3;
            }
        }

        /* compiled from: DaggerMergePretendPremoderationComponent.java */
        public static final class d implements u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.merge_pretend_premoderation.di.c f237419a;

            public d(com.avito.android.publish.merge_pretend_premoderation.di.c cVar) {
                this.f237419a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f237419a.z0();
            }
        }

        /* compiled from: DaggerMergePretendPremoderationComponent.java */
        public static final class e implements u<C0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.merge_pretend_premoderation.di.c f237420a;

            public e(com.avito.android.publish.merge_pretend_premoderation.di.c cVar) {
                this.f237420a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C0 c0U = this.f237420a.u();
                t.c(c0U);
                return c0U;
            }
        }

        /* compiled from: DaggerMergePretendPremoderationComponent.java */
        public static final class f implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.merge_pretend_premoderation.di.c f237421a;

            public f(com.avito.android.publish.merge_pretend_premoderation.di.c cVar) {
                this.f237421a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f237421a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerMergePretendPremoderationComponent.java */
        public static final class g implements u<u1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.merge_pretend_premoderation.di.c f237422a;

            public g(com.avito.android.publish.merge_pretend_premoderation.di.c cVar) {
                this.f237422a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u1 u1VarEh = this.f237422a.Eh();
                t.c(u1VarEh);
                return u1VarEh;
            }
        }

        public c(com.avito.android.publish.merge_pretend_premoderation.di.c cVar, cv.b bVar, S0 s02, C7147a c7147a) {
            this.f237402a = s02;
            this.f237403b = cVar;
            this.f237404c = bVar;
            f fVar = new f(cVar);
            this.f237405d = fVar;
            g gVar = new g(cVar);
            C7148a c7148a = new C7148a(cVar);
            this.f237407f = c7148a;
            b bVar2 = new b(cVar);
            this.f237408g = bVar2;
            this.f237409h = dagger.internal.g.d(new com.avito.android.publish.pretend.g(gVar, fVar, c7148a, bVar2));
            u<k> uVarA = B.a(new m(new C7149c(cVar), this.f237405d, this.f237407f, this.f237408g, new d(cVar)));
            this.f237412k = uVarA;
            this.f237414m = new com.avito.android.publish.merge_pretend_premoderation.k(this.f237405d, this.f237409h, uVarA, new e(cVar), n.a());
            q.b bVarA = q.a(1);
            bVarA.a(j.class, this.f237414m);
            this.f237415n = B.a(new F(bVarA.b()));
        }

        @Override // com.avito.android.publish.merge_pretend_premoderation.di.b
        public final void a(MergePretendPremoderationFragment mergePretendPremoderationFragment) {
            D d12 = this.f237415n.get();
            com.avito.android.publish.merge_pretend_premoderation.di.d.f237423a.getClass();
            mergePretendPremoderationFragment.f237394n0 = (com.avito.android.publish.merge_pretend_premoderation.e) new P0(this.f237402a, d12, null, 4, null).a(j.class);
            com.avito.android.publish.merge_pretend_premoderation.di.c cVar = this.f237403b;
            mergePretendPremoderationFragment.f237395o0 = cVar.i1();
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            mergePretendPremoderationFragment.f237396p0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f237404c.u4();
            t.c(aVarU4);
            mergePretendPremoderationFragment.f237397q0 = aVarU4;
            t.c(cVar.u());
            mergePretendPremoderationFragment.f237398r0 = cVar.z0();
        }
    }

    public static b.a a() {
        return new b();
    }
}
