package com.avito.android.advert_amenities.di;

import com.avito.android.advert_amenities.AmenitiesBottomSheetDialog;
import com.avito.android.advert_amenities.amenity.h;
import com.avito.android.advert_amenities.di.a;
import dagger.internal.g;
import dagger.internal.u;

/* compiled from: DaggerAmenitiesBottomSheetDialogComponent.java */
@dagger.internal.e
/* loaded from: classes10.dex */
public final class f {

    /* compiled from: DaggerAmenitiesBottomSheetDialogComponent.java */
    public static final class b implements com.avito.android.advert_amenities.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.advert_amenities.amenity.f> f81156a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.advert_amenities.amenity.b f81157b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.advert_amenities.dialog.f> f81158c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f81159d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f81160e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f81161f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.advert_amenities.amenity.c> f81162g;

        public b(com.avito.android.advert_amenities.di.b bVar, a aVar) {
            u<com.avito.android.advert_amenities.amenity.f> uVarD = g.d(h.a());
            this.f81156a = uVarD;
            this.f81157b = new com.avito.android.advert_amenities.amenity.b(uVarD);
            u<com.avito.android.advert_amenities.dialog.f> uVarD2 = g.d(com.avito.android.advert_amenities.dialog.h.a());
            this.f81158c = uVarD2;
            u<com.avito.konveyor.a> uVarD3 = g.d(new d(bVar, this.f81157b, new com.avito.android.advert_amenities.dialog.e(uVarD2)));
            this.f81159d = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = g.d(new com.avito.android.advert_amenities.di.c(bVar, uVarD3));
            this.f81160e = uVarD4;
            this.f81161f = g.d(new e(bVar, uVarD4, this.f81159d));
            this.f81162g = g.d(com.avito.android.advert_amenities.amenity.e.a());
        }

        @Override // com.avito.android.advert_amenities.di.a
        public final void a(AmenitiesBottomSheetDialog amenitiesBottomSheetDialog) {
            amenitiesBottomSheetDialog.f81126h0 = this.f81161f.get();
            amenitiesBottomSheetDialog.f81127i0 = this.f81162g.get();
            amenitiesBottomSheetDialog.f81128j0 = this.f81158c.get();
        }
    }

    /* compiled from: DaggerAmenitiesBottomSheetDialogComponent.java */
    public static final class c implements a.InterfaceC2407a {
        public c() {
        }

        @Override // com.avito.android.advert_amenities.di.a.InterfaceC2407a
        public final com.avito.android.advert_amenities.di.a create() {
            return new b(new com.avito.android.advert_amenities.di.b(), null);
        }
    }

    public static a.InterfaceC2407a a() {
        return new c();
    }
}
