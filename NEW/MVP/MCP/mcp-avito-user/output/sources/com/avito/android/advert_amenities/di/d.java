package com.avito.android.advert_amenities.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AmenityBottomSheetDialogModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f81150a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert_amenities.amenity.b f81151b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.advert_amenities.dialog.e f81152c;

    public d(b bVar, com.avito.android.advert_amenities.amenity.b bVar2, com.avito.android.advert_amenities.dialog.e eVar) {
        this.f81150a = bVar;
        this.f81151b = bVar2;
        this.f81152c = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert_amenities.amenity.a aVar = (com.avito.android.advert_amenities.amenity.a) this.f81151b.get();
        com.avito.android.advert_amenities.dialog.d dVar = (com.avito.android.advert_amenities.dialog.d) this.f81152c.get();
        this.f81150a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(dVar);
        return c10493a.a();
    }
}
