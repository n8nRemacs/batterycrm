package com.avito.android.service_booking_calendar.di;

import android.content.Context;
import android.content.Intent;
import com.avito.android.service_booking_calendar.ServiceBookingCalendarActivity;
import com.avito.android.service_booking_calendar.ServiceBookingCalendarActivityArg;
import com.avito.android.service_booking_calendar.r;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingCalendarIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/di/l;", "Lcom/avito/android/service_booking_calendar/r;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f275504a;

    @Inject
    public l(@Y61.k Context context) {
        this.f275504a = context;
    }

    @Override // com.avito.android.service_booking_calendar.r
    @Y61.k
    public final Intent a(@Y61.k ServiceBookingCalendarActivityArg serviceBookingCalendarActivityArg) {
        ServiceBookingCalendarActivity.f275240m.getClass();
        Intent intent = new Intent(this.f275504a, (Class<?>) ServiceBookingCalendarActivity.class);
        intent.putExtra("SERVICE_BOOKING_CALENDAR_ARGUMENT_EXTRA", serviceBookingCalendarActivityArg);
        return intent;
    }
}
