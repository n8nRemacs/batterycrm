package com.avito.android.mortgage.landing.list.items.offers.di;

import Y41.p;
import androidx.recyclerview.widget.C;
import com.avito.android.mortgage.landing.list.items.offers.di.b;
import com.avito.konveyor.adapter.h;
import com.avito.konveyor.adapter.j;
import dagger.internal.A;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.u;
import kotlin.G0;

/* compiled from: DaggerOffersViewComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerOffersViewComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.mortgage.landing.list.items.offers.di.b.a
        public final com.avito.android.mortgage.landing.list.items.offers.di.b a(p<? super String, ? super Boolean, G0> pVar) {
            return new c(pVar, null);
        }
    }

    /* compiled from: DaggerOffersViewComponent.java */
    public static final class c implements com.avito.android.mortgage.landing.list.items.offers.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final f f199805a;

        /* renamed from: b, reason: collision with root package name */
        public final u<C> f199806b;

        /* renamed from: c, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f199807c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f199808d;

        /* renamed from: e, reason: collision with root package name */
        public final u<h> f199809e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f199810f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f199811g;

        public c() {
            throw null;
        }

        public c(p pVar, C5904a c5904a) {
            f fVar = new f();
            this.f199805a = fVar;
            this.f199806b = g.d(new com.avito.android.mortgage.landing.di.g(fVar));
            this.f199807c = g.d(new com.avito.android.mortgage.landing.list.items.offers.offer.b(new com.avito.android.mortgage.landing.list.items.offers.offer.f(l.a(pVar))));
            A.b bVarA = A.a(1, 0);
            bVarA.f393937a.add(this.f199807c);
            u<com.avito.konveyor.a> uVarD = g.d(new com.avito.android.mortgage.landing.di.f(bVarA.b()));
            this.f199808d = uVarD;
            this.f199809e = g.d(new com.avito.android.mortgage.landing.di.d(uVarD));
            u<com.avito.android.recycler.data_aware.e> uVarD2 = g.d(new d(com.avito.android.mortgage.landing.list.items.offers.offer.payload.c.a()));
            this.f199810f = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = g.d(new com.avito.android.mortgage.landing.di.e(uVarD2, this.f199806b, this.f199809e));
            this.f199811g = uVarD3;
            f.a(this.f199805a, g.d(new com.avito.android.mortgage.landing.di.h(uVarD3, this.f199808d)));
        }

        @Override // com.avito.android.mortgage.landing.list.items.offers.di.b
        public final void a(com.avito.android.mortgage.landing.list.items.offers.l lVar) {
            lVar.f199836k = (j) this.f199805a.get();
            lVar.f199837l = this.f199811g.get();
            lVar.f199838m = new com.avito.android.mortgage.landing.list.items.offers.a();
        }
    }

    public static b.a a() {
        return new b();
    }
}
