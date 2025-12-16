package com.avito.android.virtual_deal_room_reference_category.reference_category.di;

import androidx.recyclerview.widget.C;
import com.avito.android.virtual_deal_room_reference_category.reference_category.ReferenceCategoryScrollableFragment;
import com.avito.android.virtual_deal_room_reference_category.reference_category.di.b;
import com.avito.android.virtual_deal_room_reference_category.reference_category.di.f;
import com.avito.konveyor.adapter.j;
import dagger.internal.A;
import dagger.internal.u;

/* compiled from: DaggerScrollableReferenceCategoryComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerScrollableReferenceCategoryComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.virtual_deal_room_reference_category.reference_category.di.b.a
        public final com.avito.android.virtual_deal_room_reference_category.reference_category.di.b create() {
            return new c();
        }
    }

    /* compiled from: DaggerScrollableReferenceCategoryComponent.java */
    public static final class c implements com.avito.android.virtual_deal_room_reference_category.reference_category.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.f f327237a;

        /* renamed from: b, reason: collision with root package name */
        public final u<C> f327238b;

        /* renamed from: c, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f327239c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f327240d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f327241e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f327242f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f327243g;

        @Override // com.avito.android.virtual_deal_room_reference_category.reference_category.di.b
        public final void a(ReferenceCategoryScrollableFragment referenceCategoryScrollableFragment) {
            referenceCategoryScrollableFragment.f327232n0 = (j) this.f327237a.get();
            referenceCategoryScrollableFragment.f327233o0 = this.f327243g.get();
        }

        public c() {
            dagger.internal.f fVar = new dagger.internal.f();
            this.f327237a = fVar;
            this.f327238b = dagger.internal.g.d(new h(fVar));
            this.f327239c = dagger.internal.g.d(new com.avito.android.virtual_deal_room_reference_category.reference_category.item.text.b(com.avito.android.virtual_deal_room_reference_category.reference_category.item.text.d.a()));
            A.b bVarA = A.a(1, 0);
            bVarA.f393937a.add(this.f327239c);
            u<com.avito.konveyor.a> uVarD = dagger.internal.g.d(new g(bVarA.b()));
            this.f327240d = uVarD;
            this.f327241e = dagger.internal.g.d(new d(uVarD));
            u<com.avito.android.recycler.data_aware.e> uVarD2 = dagger.internal.g.d(f.a.f327249a);
            this.f327242f = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new e(uVarD2, this.f327238b, this.f327241e));
            this.f327243g = uVarD3;
            dagger.internal.f.a(this.f327237a, dagger.internal.g.d(new i(uVarD3, this.f327240d)));
        }
    }

    public static b.a a() {
        return new b();
    }
}
