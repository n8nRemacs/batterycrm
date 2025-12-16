package com.avito.android.hotel_booking.di;

import com.avito.android.hotel.model.HotelBookingFormItem;
import com.avito.android.hotel.model.HotelBookingSelectItem;
import com.avito.android.hotel_booking.deserializers.HotelBookingItemTypeAdapter;
import com.avito.android.hotel_booking.deserializers.HotelBookingSelectItemValueTypeAdapter;
import com.avito.android.util.X5;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: HotelBookingJsonModule_ProvideTypeAdapterEntriesFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes13.dex */
public final class D implements dagger.internal.h<Set<X5>> {

    /* compiled from: HotelBookingJsonModule_ProvideTypeAdapterEntriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final D f163341a = new D();
    }

    public static D a() {
        return a.f163341a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        B.f163339a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(HotelBookingFormItem.class, new HotelBookingItemTypeAdapter()));
        linkedHashSet.add(new X5(HotelBookingSelectItem.Value.class, new HotelBookingSelectItemValueTypeAdapter()));
        return linkedHashSet;
    }
}
