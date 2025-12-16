package com.avito.android.vas_planning_calendar.data;

import com.avito.android.planning.CalendarSelectionType;
import com.avito.android.util.K;
import com.avito.android.vas_planning_calendar.model.CalendarBookingRestriction;
import com.avito.android.vas_planning_calendar.model.DateRange;
import dM0.C39601a;
import fM0.C40316a;
import gM0.AbstractC40601a;
import gM0.C40602b;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PlanDataSourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_calendar/data/m;", "Lcom/avito/android/vas_planning_calendar/data/l;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Date f322620a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final DateRange f322621b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CalendarSelectionType f322622c;

    @Inject
    public m(@Y61.l @com.avito.android.vas_planning_calendar.di.d Date date, @Y61.l @com.avito.android.vas_planning_calendar.di.e DateRange dateRange, @Y61.k CalendarSelectionType calendarSelectionType) {
        this.f322620a = date;
        this.f322621b = dateRange;
        this.f322622c = calendarSelectionType;
    }

    @Override // com.avito.android.vas_planning_calendar.data.l
    @Y61.k
    public final f a(@Y61.k List list) {
        int i12;
        int i13;
        Date date = ((CalendarBookingRestriction) C42745f0.E(list)).f322669b;
        Date date2 = ((CalendarBookingRestriction) C42745f0.Q(list)).f322669b;
        h hVar = new h();
        ArrayList arrayList = new ArrayList();
        Calendar calendarA = C39601a.a();
        calendarA.setTime(date);
        K.a(calendarA);
        calendarA.set(5, 1);
        Calendar calendarA2 = C39601a.a();
        calendarA2.setTime(date);
        Calendar calendarA3 = C39601a.a();
        calendarA3.setTime(date2);
        int i14 = 2;
        int i15 = (calendarA3.get(2) + ((calendarA3.get(1) - calendarA2.get(1)) * 12)) - calendarA2.get(2);
        if (calendarA3.get(5) == calendarA3.getActualMaximum(5)) {
            i15++;
        }
        int i16 = 0;
        while (i16 < i15) {
            Date time = calendarA.getTime();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i17 = calendarA.get(7);
            switch (i17) {
                case 1:
                    i12 = 6;
                    break;
                case 2:
                    i12 = 0;
                    break;
                case 3:
                    i12 = 1;
                    break;
                case 4:
                    i12 = i14;
                    break;
                case 5:
                    i12 = 3;
                    break;
                case 6:
                    i12 = 4;
                    break;
                case 7:
                    i12 = 5;
                    break;
                default:
                    throw new IllegalArgumentException(AK.c.g(i17, "Wrong day of week: "));
            }
            for (int i18 = 0; i18 < i12; i18++) {
                arrayList3.add(new AbstractC40601a.C11206a(calendarA.getTime()));
            }
            arrayList2.addAll(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            int actualMaximum = calendarA.getActualMaximum(5);
            for (int i19 = 0; i19 < actualMaximum; i19++) {
                arrayList4.add(new AbstractC40601a.b(calendarA.getTime()));
                calendarA.add(5, 1);
            }
            arrayList2.addAll(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            int i22 = calendarA.get(7);
            switch (i22) {
                case 1:
                    i13 = 1;
                    break;
                case 2:
                    i13 = 0;
                    break;
                case 3:
                    i13 = 6;
                    break;
                case 4:
                    i13 = 5;
                    break;
                case 5:
                    i13 = 4;
                    break;
                case 6:
                    i13 = 3;
                    break;
                case 7:
                    i13 = 2;
                    break;
                default:
                    throw new IllegalArgumentException(AK.c.g(i22, "Wrong day of week: "));
            }
            for (int i23 = 0; i23 < i13; i23++) {
                arrayList5.add(new AbstractC40601a.C11206a(calendarA.getTime()));
            }
            arrayList2.addAll(arrayList5);
            arrayList.add(new C40602b(arrayList2, time));
            i16++;
            i14 = 2;
        }
        C40602b c40602b = (C40602b) C42745f0.S(arrayList);
        if (c40602b != null) {
            ArrayList arrayList6 = c40602b.f396473a;
            ArrayList arrayList7 = new ArrayList();
            for (int i24 = 0; i24 < 14; i24++) {
                arrayList7.add(new AbstractC40601a.C11206a(calendarA.getTime()));
            }
            arrayList6.addAll(arrayList7);
        }
        return new f(new C40316a(arrayList), new d(hVar), this.f322622c, this.f322620a, this.f322621b);
    }
}
