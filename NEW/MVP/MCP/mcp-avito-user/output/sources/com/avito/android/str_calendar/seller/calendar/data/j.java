package com.avito.android.str_calendar.seller.calendar.data;

import Iy0.InterfaceC14175a;
import androidx.compose.runtime.internal.P;
import com.avito.android.str_calendar.common.models.DateRange;
import com.avito.android.util.K;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: StrSellerCalendarMonthsBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/data/j;", "Lcom/avito/android/str_calendar/seller/calendar/data/i;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f287539a;

    @Inject
    public j(@Y61.k m mVar) {
        this.f287539a = mVar;
    }

    public static ArrayList b(int i12, Calendar calendar) {
        kotlin.ranges.l lVarR = s.r(0, i12);
        ArrayList arrayList = new ArrayList(C42745f0.q(lVarR, 10));
        kotlin.ranges.k it = lVarR.iterator();
        while (it.f406910d) {
            it.a();
            arrayList.add(new InterfaceC14175a.C0496a(calendar.getTime()));
        }
        return arrayList;
    }

    @Override // com.avito.android.str_calendar.seller.calendar.data.i
    @Y61.k
    public final ArrayList a(@Y61.k DateRange dateRange) {
        int i12;
        int i13;
        m mVar = this.f287539a;
        Calendar calendarA = mVar.a();
        Date date = dateRange.f286636b;
        calendarA.setTime(date);
        K.a(calendarA);
        calendarA.set(5, 1);
        Calendar calendarA2 = mVar.a();
        calendarA2.setTime(date);
        Calendar calendarA3 = mVar.a();
        calendarA3.setTime(dateRange.f286637c);
        int i14 = 2;
        int i15 = ((calendarA3.get(1) - calendarA2.get(1)) * 12) + (calendarA3.get(2) - calendarA2.get(2));
        if (calendarA3.get(5) == calendarA3.getActualMaximum(5)) {
            i15++;
        }
        int i16 = 0;
        kotlin.ranges.l lVarR = s.r(0, i15);
        int i17 = 10;
        ArrayList arrayList = new ArrayList(C42745f0.q(lVarR, 10));
        kotlin.ranges.k it = lVarR.iterator();
        while (it.f406910d) {
            it.a();
            Date time = calendarA.getTime();
            int i18 = calendarA.get(7);
            switch (i18) {
                case 1:
                    i12 = 6;
                    break;
                case 2:
                    i12 = i16;
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
                    throw new IllegalArgumentException(AK.c.g(i18, "Wrong day of week: "));
            }
            ArrayList arrayListB = b(i12, calendarA);
            kotlin.ranges.l lVarR2 = s.r(i16, calendarA.getActualMaximum(5));
            ArrayList arrayList2 = new ArrayList(C42745f0.q(lVarR2, i17));
            kotlin.ranges.k it2 = lVarR2.iterator();
            while (it2.f406910d) {
                it2.a();
                InterfaceC14175a.b bVar = new InterfaceC14175a.b(calendarA.getTime());
                calendarA.add(5, 1);
                arrayList2.add(bVar);
            }
            int i19 = calendarA.get(7);
            switch (i19) {
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
                    throw new IllegalArgumentException(AK.c.g(i19, "Wrong day of week: "));
            }
            arrayList.add(new Iy0.b(C42745f0.h0(b(i13, calendarA), C42745f0.h0(arrayList2, arrayListB)), time));
            i16 = 0;
            i14 = 2;
            i17 = 10;
        }
        return arrayList;
    }
}
