package com.avito.android.developments_catalog.residential_complex_search.di;

import Y41.l;
import com.avito.android.developments_catalog.residential_complex_search.ResidentialComplexActivity;
import com.avito.android.developments_catalog.residential_complex_search.di.b;
import com.avito.android.developments_catalog.residential_complex_search.h;
import com.avito.android.developments_catalog.residential_complex_search.j;
import com.avito.android.developments_catalog.residential_complex_search.mvi.i;
import com.avito.android.developments_catalog.residential_complex_search.mvi.k;
import com.avito.android.developments_catalog.residential_complex_search.mvi.m;
import com.avito.android.util.R0;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import lx.InterfaceC43844a;
import tx.C48734a;

/* compiled from: DaggerResidentialComplexComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerResidentialComplexComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.developments_catalog.residential_complex_search.di.b.a
        public final com.avito.android.developments_catalog.residential_complex_search.di.b a(com.avito.android.developments_catalog.residential_complex_search.di.c cVar, C48734a c48734a, l<? super com.avito.android.developments_catalog.residential_complex_search.adapter.button.c, G0> lVar, l<? super com.avito.android.developments_catalog.residential_complex_search.adapter.title.c, G0> lVar2) {
            c48734a.getClass();
            return new c(cVar, c48734a, lVar, lVar2, null);
        }
    }

    /* compiled from: DaggerResidentialComplexComponent.java */
    public static final class c implements com.avito.android.developments_catalog.residential_complex_search.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC43844a> f139167a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f139168b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f139169c;

        /* renamed from: d, reason: collision with root package name */
        public final u<h> f139170d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.developments_catalog.residential_complex_search.mvi.d f139171e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.developments_catalog.residential_complex_search.mvi.b f139172f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.developments_catalog.residential_complex_search.e> f139173g;

        /* renamed from: h, reason: collision with root package name */
        public final m f139174h;

        /* renamed from: i, reason: collision with root package name */
        public final i f139175i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f139176j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.developments_catalog.residential_complex_search.adapter.title.d> f139177k;

        /* renamed from: l, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f139178l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.developments_catalog.residential_complex_search.adapter.button.d> f139179m;

        /* renamed from: n, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f139180n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f139181o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f139182p;

        /* compiled from: DaggerResidentialComplexComponent.java */
        /* renamed from: com.avito.android.developments_catalog.residential_complex_search.di.a$c$a, reason: collision with other inner class name */
        public static final class C4198a implements u<InterfaceC43844a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_catalog.residential_complex_search.di.c f139183a;

            public C4198a(com.avito.android.developments_catalog.residential_complex_search.di.c cVar) {
                this.f139183a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC43844a interfaceC43844aEd = this.f139183a.Ed();
                t.c(interfaceC43844aEd);
                return interfaceC43844aEd;
            }
        }

        /* compiled from: DaggerResidentialComplexComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.developments_catalog.residential_complex_search.di.c f139184a;

            public b(com.avito.android.developments_catalog.residential_complex_search.di.c cVar) {
                this.f139184a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f139184a.c();
                t.c(r0C);
                return r0C;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.developments_catalog.residential_complex_search.di.c cVar, C48734a c48734a, l lVar, l lVar2, C4197a c4197a) {
            this.f139167a = new C4198a(cVar);
            dagger.internal.l lVarA = dagger.internal.l.a(c48734a);
            this.f139168b = lVarA;
            u<h> uVarD = g.d(new j(lVarA, this.f139167a, new b(cVar)));
            this.f139170d = uVarD;
            this.f139171e = new com.avito.android.developments_catalog.residential_complex_search.mvi.d(uVarD);
            this.f139172f = new com.avito.android.developments_catalog.residential_complex_search.mvi.b(uVarD);
            u<com.avito.android.developments_catalog.residential_complex_search.e> uVarD2 = g.d(new com.avito.android.developments_catalog.residential_complex_search.g(this.f139168b));
            this.f139173g = uVarD2;
            this.f139174h = new m(uVarD2);
            this.f139175i = new i(new com.avito.android.developments_catalog.residential_complex_search.mvi.g(this.f139171e, this.f139172f, k.a(), this.f139174h));
            this.f139176j = B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<com.avito.android.developments_catalog.residential_complex_search.adapter.title.d> uVarD3 = g.d(new com.avito.android.developments_catalog.residential_complex_search.adapter.title.g(dagger.internal.l.a(lVar2)));
            this.f139177k = uVarD3;
            this.f139178l = g.d(new com.avito.android.developments_catalog.residential_complex_search.adapter.title.b(uVarD3));
            u<com.avito.android.developments_catalog.residential_complex_search.adapter.button.d> uVarD4 = g.d(new com.avito.android.developments_catalog.residential_complex_search.adapter.button.g(dagger.internal.l.a(lVar)));
            this.f139179m = uVarD4;
            this.f139180n = g.d(new com.avito.android.developments_catalog.residential_complex_search.adapter.button.b(uVarD4));
            A.b bVarA = A.a(2, 1);
            bVarA.f393938b.add(this.f139176j);
            u<TV0.b<?, ?>> uVar = this.f139178l;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f139180n);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f139181o = uVarK;
            this.f139182p = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
        }

        @Override // com.avito.android.developments_catalog.residential_complex_search.di.b
        public final void a(ResidentialComplexActivity residentialComplexActivity) {
            residentialComplexActivity.f139123m = this.f139175i;
            residentialComplexActivity.f139124n = this.f139182p.get();
            residentialComplexActivity.f139125o = this.f139181o.get();
            residentialComplexActivity.f139126p = this.f139177k.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
