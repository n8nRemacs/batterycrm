package com.avito.android.hotel_available_rooms.konveyor.gallery;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lE.C43624b;

/* compiled from: HotelRoomGalleryBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final j f162935a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.hotel_available_rooms.di.m f162936b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C43624b> f162937c;

    public c(j jVar, com.avito.android.hotel_available_rooms.di.m mVar, Provider provider) {
        this.f162935a = jVar;
        this.f162936b = mVar;
        this.f162937c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((i) this.f162935a.get(), this.f162936b, this.f162937c.get());
    }
}
