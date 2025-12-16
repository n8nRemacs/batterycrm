package com.avito.android.service_booking_calendar.flexible.header.recycler;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayPlaceholderItem;
import com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem;
import com.avito.android.service_booking_calendar.flexible.header.view.DayOfWeekView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: WeekItemViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/recycler/j;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f276055c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f276056b;

    public j(@k View view) {
        super(view);
        List listU = C42745f0.U(Integer.valueOf(R.id.flexible_calendar_monday), Integer.valueOf(R.id.flexible_calendar_tuesday), Integer.valueOf(R.id.flexible_calendar_wednesday), Integer.valueOf(R.id.flexible_calendar_thursday), Integer.valueOf(R.id.flexible_calendar_friday), Integer.valueOf(R.id.flexible_calendar_saturday), Integer.valueOf(R.id.flexible_calendar_sunday));
        ArrayList arrayList = new ArrayList(C42745f0.q(listU, 10));
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            arrayList.add((DayOfWeekView) view.findViewById(((Number) it.next()).intValue()));
        }
        this.f276056b = arrayList;
    }

    public static void B80(DayOfWeekView dayOfWeekView, FlexibleCalendarDayItem flexibleCalendarDayItem, boolean z12, int i12) {
        boolean z13 = flexibleCalendarDayItem instanceof DayPlaceholderItem;
        int i13 = R.style.DayOfWeek_WorkDay;
        if (z13) {
            dayOfWeekView.setText("");
            dayOfWeekView.setDotVisibility(false);
            dayOfWeekView.setAppearance(R.style.DayOfWeek_WorkDay);
            return;
        }
        if (flexibleCalendarDayItem instanceof DayItem) {
            DayItem dayItem = (DayItem) flexibleCalendarDayItem;
            dayOfWeekView.setText(String.valueOf((int) dayItem.f275353c.f421948b.f421943d));
            DayItem.OrderStatus orderStatus = DayItem.OrderStatus.f275362b;
            DayItem.OrderStatus orderStatus2 = dayItem.f275354d;
            dayOfWeekView.setDotVisibility(orderStatus2 != orderStatus);
            dayOfWeekView.setDotColor(z12 ? R.attr.white : orderStatus2 == DayItem.OrderStatus.f275365e ? R.attr.orange800 : orderStatus2 == DayItem.OrderStatus.f275363c ? R.attr.gray36 : R.attr.black);
            if (z12) {
                i13 = R.style.DayOfWeek_Selected;
            } else {
                org.threeten.bp.f fVar = dayItem.f275353c;
                boolean z14 = dayItem.f275355e;
                if (z14 && fVar.f421948b.f421942c != i12) {
                    i13 = R.style.DayOfWeek_TodayInOtherMonth;
                } else if (fVar.f421948b.f421942c != i12) {
                    i13 = R.style.DayOfWeek_OtherMonth;
                } else {
                    DayItem.DayType dayType = dayItem.f275357g;
                    if (z14 && dayType == DayItem.DayType.f275358b) {
                        i13 = R.style.DayOfWeek_TodayDayOff;
                    } else if (z14) {
                        i13 = R.style.DayOfWeek_Today;
                    } else if (dayType == DayItem.DayType.f275358b) {
                        i13 = R.style.DayOfWeek_DayOff;
                    }
                }
            }
            dayOfWeekView.setAppearance(i13);
        }
    }
}
