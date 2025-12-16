package com.avito.android.user_advert.soa_with_price.di;

import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.user_advert.soa_with_price.E;
import com.avito.android.user_advert.soa_with_price.SoaWithPriceArguments;
import com.avito.android.user_advert.soa_with_price.SoaWithPriceSheetDialogFragment;
import com.avito.android.user_advert.soa_with_price.di.a;
import com.avito.android.user_advert.soa_with_price.k;
import com.avito.android.user_advert.soa_with_price.m;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerCloseReasonSheetDialogComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class h {

    /* compiled from: DaggerCloseReasonSheetDialogComponent.java */
    public static final class b implements a.InterfaceC9517a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.user_advert.soa_with_price.di.b f311892a;

        /* renamed from: b, reason: collision with root package name */
        public SoaWithPriceArguments f311893b;

        /* renamed from: c, reason: collision with root package name */
        public Resources f311894c;

        public b() {
        }

        @Override // com.avito.android.user_advert.soa_with_price.di.a.InterfaceC9517a
        public final a.InterfaceC9517a a(com.avito.android.user_advert.soa_with_price.di.b bVar) {
            this.f311892a = bVar;
            return this;
        }

        @Override // com.avito.android.user_advert.soa_with_price.di.a.InterfaceC9517a
        public final a.InterfaceC9517a b(Resources resources) {
            this.f311894c = resources;
            return this;
        }

        @Override // com.avito.android.user_advert.soa_with_price.di.a.InterfaceC9517a
        public final com.avito.android.user_advert.soa_with_price.di.a build() {
            t.a(com.avito.android.user_advert.soa_with_price.di.b.class, this.f311892a);
            t.a(SoaWithPriceArguments.class, this.f311893b);
            t.a(Resources.class, this.f311894c);
            return new c(this.f311892a, this.f311893b, this.f311894c, null);
        }

        @Override // com.avito.android.user_advert.soa_with_price.di.a.InterfaceC9517a
        public final a.InterfaceC9517a c(SoaWithPriceArguments soaWithPriceArguments) {
            this.f311893b = soaWithPriceArguments;
            return this;
        }
    }

    /* compiled from: DaggerCloseReasonSheetDialogComponent.java */
    public static final class c implements com.avito.android.user_advert.soa_with_price.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.user_advert.soa_with_price.di.b f311895a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.user_advert.soa_with_price.blueprint.d> f311896b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.user_advert.soa_with_price.blueprint.a> f311897c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f311898d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f311899e;

        /* renamed from: f, reason: collision with root package name */
        public final u<RecyclerView.Adapter<com.avito.konveyor.adapter.b>> f311900f;

        /* renamed from: g, reason: collision with root package name */
        public final l f311901g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC35745a5> f311902h;

        /* renamed from: i, reason: collision with root package name */
        public final u<k> f311903i;

        /* renamed from: j, reason: collision with root package name */
        public final u<E> f311904j;

        /* compiled from: DaggerCloseReasonSheetDialogComponent.java */
        public static final class a implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.user_advert.soa_with_price.di.b f311905a;

            public a(com.avito.android.user_advert.soa_with_price.di.b bVar) {
                this.f311905a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f311905a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(com.avito.android.user_advert.soa_with_price.di.b bVar, SoaWithPriceArguments soaWithPriceArguments, Resources resources, a aVar) {
            this.f311895a = bVar;
            u<com.avito.android.user_advert.soa_with_price.blueprint.d> uVarD = dagger.internal.g.d(com.avito.android.user_advert.soa_with_price.blueprint.g.a());
            this.f311896b = uVarD;
            u<com.avito.android.user_advert.soa_with_price.blueprint.a> uVarD2 = dagger.internal.g.d(new com.avito.android.user_advert.soa_with_price.blueprint.c(uVarD));
            this.f311897c = uVarD2;
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new e(uVarD2));
            this.f311898d = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new d(uVarD3));
            this.f311899e = uVarD4;
            this.f311900f = dagger.internal.g.d(new f(uVarD4, this.f311898d));
            this.f311901g = l.a(soaWithPriceArguments);
            this.f311902h = new a(bVar);
            u<k> uVarD5 = dagger.internal.g.d(new m(l.a(resources)));
            this.f311903i = uVarD5;
            this.f311904j = dagger.internal.g.d(new g(this.f311901g, uVarD5, this.f311902h));
        }

        @Override // com.avito.android.user_advert.soa_with_price.di.a
        public final void a(SoaWithPriceSheetDialogFragment soaWithPriceSheetDialogFragment) {
            soaWithPriceSheetDialogFragment.f311851h0 = this.f311899e.get();
            soaWithPriceSheetDialogFragment.f311852i0 = this.f311900f.get();
            soaWithPriceSheetDialogFragment.f311853j0 = this.f311896b.get();
            com.avito.android.user_advert.soa_with_price.di.b bVar = this.f311895a;
            InterfaceC35745a5 interfaceC35745a5D = bVar.d();
            t.c(interfaceC35745a5D);
            soaWithPriceSheetDialogFragment.f311854k0 = interfaceC35745a5D;
            com.avito.android.util.text.a aVarE = bVar.e();
            t.c(aVarE);
            soaWithPriceSheetDialogFragment.f311855l0 = aVarE;
            InterfaceC28373a interfaceC28373aA = bVar.a();
            t.c(interfaceC28373aA);
            soaWithPriceSheetDialogFragment.f311856m0 = interfaceC28373aA;
            soaWithPriceSheetDialogFragment.f311857n0 = this.f311904j.get();
            soaWithPriceSheetDialogFragment.f311858o0 = bVar.S7();
            soaWithPriceSheetDialogFragment.f311859p0 = bVar.G();
            soaWithPriceSheetDialogFragment.f311860q0 = bVar.K4();
        }
    }

    public static a.InterfaceC9517a a() {
        return new b();
    }
}
