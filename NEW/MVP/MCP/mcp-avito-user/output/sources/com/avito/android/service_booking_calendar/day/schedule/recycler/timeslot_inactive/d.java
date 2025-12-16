package com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_inactive;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.service_booking_calendar.domain.TimeSlotItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InactiveTimeSlotItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/recycler/timeslot_inactive/d;", "Lcom/avito/android/service_booking_calendar/day/schedule/recycler/timeslot_inactive/c;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        TimeSlotItem.InactiveTimeSlotItem inactiveTimeSlotItem = (TimeSlotItem.InactiveTimeSlotItem) aVar;
        int i13 = inactiveTimeSlotItem.f275531d;
        fVar.f275456f = i13;
        fVar.f275457g = inactiveTimeSlotItem.f275530c;
        View view = fVar.f275454d;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i13 * fVar.f275455e;
        view.setLayoutParams(layoutParams);
    }
}
