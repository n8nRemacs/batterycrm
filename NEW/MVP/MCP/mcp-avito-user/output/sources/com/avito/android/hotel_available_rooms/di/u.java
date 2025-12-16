package com.avito.android.hotel_available_rooms.di;

import android.content.Context;
import com.avito.android.R;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: HotelAvailableRoomsModule_ProvideHotelFilterMonthNamesFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class u implements dagger.internal.h<Map<Integer, String>> {

    /* renamed from: a, reason: collision with root package name */
    public final s f162759a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Context> f162760b;

    public u(s sVar, Provider<Context> provider) {
        this.f162759a = sVar;
        this.f162760b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = this.f162760b.get();
        this.f162759a.getClass();
        return P0.g(new Q(0, context.getString(R.string.hotel_available_rooms_month_jan)), new Q(1, context.getString(R.string.hotel_available_rooms_month_feb)), new Q(2, context.getString(R.string.hotel_available_rooms_month_mar)), new Q(3, context.getString(R.string.hotel_available_rooms_month_apr)), new Q(4, context.getString(R.string.hotel_available_rooms_month_may)), new Q(5, context.getString(R.string.hotel_available_rooms_month_jun)), new Q(6, context.getString(R.string.hotel_available_rooms_month_jul)), new Q(7, context.getString(R.string.hotel_available_rooms_month_aug)), new Q(8, context.getString(R.string.hotel_available_rooms_month_sep)), new Q(9, context.getString(R.string.hotel_available_rooms_month_oct)), new Q(10, context.getString(R.string.hotel_available_rooms_month_nov)), new Q(11, context.getString(R.string.hotel_available_rooms_month_dec)));
    }
}
