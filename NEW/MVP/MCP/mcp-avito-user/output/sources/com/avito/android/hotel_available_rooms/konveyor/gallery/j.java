package com.avito.android.hotel_available_rooms.konveyor.gallery;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HotelRoomGalleryPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f162947a;

    public j(Provider<k> provider) {
        this.f162947a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f162947a.get());
    }
}
