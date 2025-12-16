package com.avito.android.hotel_available_rooms.di;

import com.avito.android.hotel_available_rooms.AvailableHotelRoomsDeeplink;
import lv.C43834a;

/* compiled from: AvailableHotelRoomsDeeplinkModule_ProvideExternalAppLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.hotel_available_rooms.di.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30775b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final II.b f162678a;

    public C30775b(II.b bVar) {
        this.f162678a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        II.b bVar = this.f162678a;
        C30774a.f162677a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AvailableHotelRoomsDeeplink.class, new II.e(), new C43834a.b.C11809b(bVar));
    }
}
