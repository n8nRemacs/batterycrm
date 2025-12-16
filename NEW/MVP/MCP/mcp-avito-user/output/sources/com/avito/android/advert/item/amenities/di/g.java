package com.avito.android.advert.item.amenities.di;

import com.avito.android.advert.item.amenities.di.b;
import com.avito.android.advert.item.amenities.screen.AmenitiesBottomSheetDialog;
import dagger.internal.A;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerAmenitiesBottomSheetComponent.java */
@dagger.internal.e
/* loaded from: classes10.dex */
public final class g {

    /* compiled from: DaggerAmenitiesBottomSheetComponent.java */
    public static final class b implements com.avito.android.advert.item.amenities.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f72753a = dagger.internal.g.d(new com.avito.android.advert.item.amenities.screen.items.header.b(com.avito.android.advert.item.amenities.screen.items.header.d.a()));

        /* renamed from: b, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f72754b = dagger.internal.g.d(new com.avito.android.advert.item.amenities.screen.items.amenity_row.b(com.avito.android.advert.item.amenities.screen.items.amenity_row.d.a()));

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f72755c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f72756d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f72757e;

        public b(com.avito.android.advert.item.amenities.di.c cVar, a aVar) {
            A.b bVarA = A.a(2, 0);
            u<TV0.b<?, ?>> uVar = this.f72753a;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f72754b);
            u<com.avito.konveyor.a> uVarD = dagger.internal.g.d(new e(cVar, bVarA.b()));
            this.f72755c = uVarD;
            u<com.avito.konveyor.adapter.a> uVarD2 = dagger.internal.g.d(new d(cVar, uVarD));
            this.f72756d = uVarD2;
            this.f72757e = dagger.internal.g.d(new f(cVar, uVarD2, this.f72755c));
        }

        @Override // com.avito.android.advert.item.amenities.di.b
        public final void a(AmenitiesBottomSheetDialog amenitiesBottomSheetDialog) {
            amenitiesBottomSheetDialog.f72766h0 = this.f72757e.get();
            amenitiesBottomSheetDialog.f72767i0 = new com.avito.android.advert.item.amenities.screen.items.c(this.f72755c.get());
            amenitiesBottomSheetDialog.f72768j0 = new com.avito.android.advert.item.amenities.screen.items.a();
        }
    }

    /* compiled from: DaggerAmenitiesBottomSheetComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.advert.item.amenities.di.b.a
        public final com.avito.android.advert.item.amenities.di.b create() {
            return new b(new com.avito.android.advert.item.amenities.di.c(), null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
