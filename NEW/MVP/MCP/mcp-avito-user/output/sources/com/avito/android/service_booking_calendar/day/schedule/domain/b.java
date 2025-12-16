package com.avito.android.service_booking_calendar.day.schedule.domain;

import Y61.k;
import Y61.l;
import com.avito.android.service_booking_calendar.data.model.Day;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import javax.inject.Inject;
import kotlin.Metadata;
import org.threeten.bp.q;

/* compiled from: DayItemConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/domain/b;", "Lcom/avito/android/service_booking_calendar/day/schedule/domain/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.service_booking_calendar.day.schedule.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f275370a;

    /* compiled from: DayItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f275371a;

        static {
            int[] iArr = new int[Day.Type.values().length];
            try {
                iArr[Day.Type.WITH_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Day.Type.NEED_CONFIRMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Day.Type.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f275371a = iArr;
        }
    }

    @Inject
    public b(@l @com.avito.android.service_booking_calendar.flexible.di.b String str) {
        this.f275370a = str;
    }

    @Override // com.avito.android.service_booking_calendar.day.schedule.domain.a
    @k
    public final DayItem a(@k Day day) {
        String id2 = day.getId();
        if (id2 == null) {
            id2 = day.getTime();
        }
        String str = id2;
        org.threeten.bp.f fVarH = org.threeten.bp.f.H(Long.parseLong(day.getTime()), 0, q.f422106g);
        Day.Type type = day.getType();
        int i12 = type == null ? -1 : a.f275371a[type.ordinal()];
        DayItem.OrderStatus orderStatus = i12 != 1 ? i12 != 2 ? i12 != 3 ? DayItem.OrderStatus.f275362b : DayItem.OrderStatus.f275363c : DayItem.OrderStatus.f275365e : DayItem.OrderStatus.f275364d;
        boolean isToday = day.getIsToday();
        String str2 = this.f275370a;
        return new DayItem(str, fVarH, orderStatus, isToday, (str2 == null && day.getIsFocus()) || (str2 != null && str2.equals(day.getTime())), day.getIsDayOff() ? DayItem.DayType.f275358b : DayItem.DayType.f275359c);
    }
}
