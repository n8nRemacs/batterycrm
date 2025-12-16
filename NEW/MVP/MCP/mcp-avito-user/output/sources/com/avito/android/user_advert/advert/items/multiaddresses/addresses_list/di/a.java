package com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.di;

import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.MyAdvertAddressesListActivity;
import com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.di.d;
import com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.mvi.i;
import com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.mvi.m;
import com.avito.konveyor.adapter.j;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.u;
import java.util.Set;

/* compiled from: DaggerMyAdvertAddressesListComponent.java */
@e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerMyAdvertAddressesListComponent.java */
    public static final class b implements d.a {
        public b() {
        }

        @Override // com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.di.d.a
        public final d build() {
            return new c();
        }
    }

    /* compiled from: DaggerMyAdvertAddressesListComponent.java */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final m f309689a;

        /* renamed from: b, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f309690b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.item.c> f309691c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f309692d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f309693e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f309694f;

        /* renamed from: g, reason: collision with root package name */
        public final u<j> f309695g;

        @Override // com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.di.d
        public final void a(MyAdvertAddressesListActivity myAdvertAddressesListActivity) {
            myAdvertAddressesListActivity.f309678m = this.f309689a;
            myAdvertAddressesListActivity.f309680o = this.f309695g.get();
            myAdvertAddressesListActivity.f309681p = this.f309694f.get();
        }

        public c() {
            this.f309689a = new m(new i(com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.mvi.c.a(), com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.mvi.e.a()));
            this.f309690b = B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.item.c> uVarD = g.d(com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.item.e.a());
            this.f309691c = uVarD;
            this.f309692d = g.d(new com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.item.b(uVarD));
            A.b bVarA = A.a(1, 1);
            bVarA.f393938b.add(this.f309690b);
            bVarA.f393937a.add(this.f309692d);
            u<com.avito.konveyor.a> uVarK = l.k(bVarA.b());
            this.f309693e = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = l.h(uVarK);
            this.f309694f = uVarH;
            this.f309695g = g.d(new com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.di.c(uVarH, this.f309693e));
        }
    }

    public static d.a a() {
        return new b();
    }
}
