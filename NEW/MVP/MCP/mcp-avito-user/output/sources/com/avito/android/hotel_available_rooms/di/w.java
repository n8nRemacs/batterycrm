package com.avito.android.hotel_available_rooms.di;

import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: HotelAvailableRoomsModule_ProvideHotelParamsFormatterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class w implements dagger.internal.h<SimpleDateFormat> {

    /* renamed from: a, reason: collision with root package name */
    public final s f162762a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f162763b;

    public w(s sVar, dagger.internal.u uVar) {
        this.f162762a = sVar;
        this.f162763b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Locale locale = (Locale) this.f162763b.get();
        this.f162762a.getClass();
        return new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, locale);
    }
}
