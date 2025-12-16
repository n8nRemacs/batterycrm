package com.avito.android.service_booking_calendar.data.model;

import Y61.k;
import com.avito.android.service_booking_calendar.data.model.TimeSlot;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ServiceBookingDayScheduleResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/avito/android/service_booking_calendar/data/model/a;", "", "", "Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$ActiveTimeSlot;", "params", "Lcom/avito/android/service_booking_calendar/data/model/TimeSlot$a;", "inactiveTime", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "b", "()Ljava/util/List;", "a", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    @c("inactiveTime")
    @k
    private final List<TimeSlot.a> inactiveTime;

    @c("params")
    @k
    private final List<TimeSlot.ActiveTimeSlot> params;

    public a(@k List<TimeSlot.ActiveTimeSlot> list, @k List<TimeSlot.a> list2) {
        this.params = list;
        this.inactiveTime = list2;
    }

    @k
    public final List<TimeSlot.a> a() {
        return this.inactiveTime;
    }

    @k
    public final List<TimeSlot.ActiveTimeSlot> b() {
        return this.params;
    }
}
