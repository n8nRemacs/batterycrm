package com.avito.android.hotel_available_rooms.di;

import java.util.Locale;

/* compiled from: HotelAvailableRoomsModule_ProvideHotelLocaleFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class v implements dagger.internal.h<Locale> {

    /* renamed from: a, reason: collision with root package name */
    public final s f162761a;

    public v(s sVar) {
        this.f162761a = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f162761a.getClass();
        return Locale.forLanguageTag("ru");
    }
}
