package com.avito.android.realty_agency.inline_filters.location_suggest.di;

import Y41.l;
import com.avito.android.realty_agency.inline_filters.location_suggest.adapter.location_item.f;
import com.avito.android.realty_agency.inline_filters.location_suggest.di.b;
import com.avito.android.realty_agency.inline_filters.location_suggest.i;
import com.avito.android.realty_agency.inline_filters.location_suggest.mvi.g;
import com.avito.android.realty_agency.inline_filters.location_suggest.mvi.m;
import com.avito.android.realty_agency.inline_filters.location_suggest.mvi.o;
import com.avito.android.realty_agency.inline_filters.location_suggest.mvi.q;
import com.avito.konveyor.adapter.j;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import java.util.Set;
import ji0.InterfaceC42386a;
import kotlin.G0;
import ni0.InterfaceC44430a;

/* compiled from: DaggerLocationSuggestComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerLocationSuggestComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.realty_agency.inline_filters.location_suggest.di.b.a
        public final com.avito.android.realty_agency.inline_filters.location_suggest.di.b a(String str, com.avito.android.realty_agency.inline_filters.location_suggest.di.c cVar, l<? super InterfaceC42386a, G0> lVar) {
            return new c(cVar, str, lVar, null);
        }
    }

    /* compiled from: DaggerLocationSuggestComponent.java */
    public static final class c implements com.avito.android.realty_agency.inline_filters.location_suggest.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC44430a> f251659a;

        /* renamed from: b, reason: collision with root package name */
        public final i f251660b;

        /* renamed from: c, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f251661c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f251662d;

        /* renamed from: e, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f251663e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f251664f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f251665g;

        /* renamed from: h, reason: collision with root package name */
        public final u<j> f251666h;

        /* compiled from: DaggerLocationSuggestComponent.java */
        /* renamed from: com.avito.android.realty_agency.inline_filters.location_suggest.di.a$c$a, reason: collision with other inner class name */
        public static final class C7550a implements u<InterfaceC44430a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.realty_agency.inline_filters.location_suggest.di.c f251667a;

            public C7550a(com.avito.android.realty_agency.inline_filters.location_suggest.di.c cVar) {
                this.f251667a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44430a interfaceC44430aP7 = this.f251667a.p7();
                t.c(interfaceC44430aP7);
                return interfaceC44430aP7;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.realty_agency.inline_filters.location_suggest.di.c cVar, String str, l lVar, C7549a c7549a) {
            dagger.internal.l lVarB = dagger.internal.l.b(str);
            m mVar = new m(new C7550a(cVar));
            this.f251660b = new i(new com.avito.android.realty_agency.inline_filters.location_suggest.mvi.j(new g(lVarB, mVar), new com.avito.android.realty_agency.inline_filters.location_suggest.mvi.e(mVar), o.a(), q.a()));
            this.f251661c = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f251662d = dagger.internal.g.d(new com.avito.android.realty_agency.inline_filters.location_suggest.adapter.location_item.c(new f(dagger.internal.l.a(lVar))));
            this.f251663e = dagger.internal.g.d(new com.avito.android.realty_agency.blueprint.text_block.b(com.avito.android.realty_agency.blueprint.text_block.d.a()));
            A.b bVarA = A.a(2, 1);
            bVarA.f393938b.add(this.f251661c);
            u<TV0.b<?, ?>> uVar = this.f251662d;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f251663e);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f251664f = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f251665g = uVarH;
            this.f251666h = dagger.internal.g.d(new e(uVarH, this.f251664f));
        }

        @Override // com.avito.android.realty_agency.inline_filters.location_suggest.di.b
        public final void a(com.avito.android.realty_agency.inline_filters.location_suggest.a aVar) {
            aVar.f251631F = this.f251660b;
            aVar.f251633H = this.f251666h.get();
            aVar.f251634I = this.f251665g.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
