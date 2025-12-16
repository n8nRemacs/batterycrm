package com.avito.android.realty_agency.inline_filters.district.di;

import Y41.l;
import com.avito.android.realty_agency.inline_filters.district.di.b;
import com.avito.android.realty_agency.inline_filters.district.mvi.h;
import com.avito.android.realty_agency.inline_filters.district.mvi.j;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerDistrictFilterDialogComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerDistrictFilterDialogComponent.java */
    public static final class b implements com.avito.android.realty_agency.inline_filters.district.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.realty_agency.inline_filters.district.g f251574a;

        /* renamed from: b, reason: collision with root package name */
        public final g f251575b;

        /* renamed from: c, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f251576c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f251577d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f251578e;

        public b() {
            throw null;
        }

        public b(List list, l lVar, C7547a c7547a) {
            this.f251574a = new com.avito.android.realty_agency.inline_filters.district.g(new h(new com.avito.android.realty_agency.inline_filters.district.mvi.e(dagger.internal.l.a(list)), com.avito.android.realty_agency.inline_filters.district.mvi.c.a(), j.a(), com.avito.android.realty_agency.inline_filters.district.mvi.l.a()));
            this.f251575b = new g(new f(dagger.internal.l.a(lVar)));
            this.f251576c = B.a(com.avito.android.konveyor_adapter_module.d.a());
            A.b bVarA = A.a(1, 1);
            bVarA.f393937a.add(this.f251575b);
            bVarA.f393938b.add(this.f251576c);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f251577d = uVarK;
            this.f251578e = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
        }

        @Override // com.avito.android.realty_agency.inline_filters.district.di.b
        public final void a(com.avito.android.realty_agency.inline_filters.district.a aVar) {
            aVar.f251562f = this.f251574a;
            com.avito.konveyor.adapter.a aVar2 = this.f251578e.get();
            com.avito.konveyor.a aVar3 = this.f251577d.get();
            d.f251580a.getClass();
            aVar.f251564h = new com.avito.konveyor.adapter.j(aVar2, aVar3);
            aVar.f251565i = this.f251578e.get();
        }
    }

    /* compiled from: DaggerDistrictFilterDialogComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.realty_agency.inline_filters.district.di.b.a
        public final com.avito.android.realty_agency.inline_filters.district.di.b a(l lVar, ArrayList arrayList) {
            return new b(arrayList, lVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
