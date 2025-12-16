package Iy0;

import com.avito.android.remote.model.StrItemBookingSellerCalendarResponse;
import com.avito.android.str_calendar.common.models.DateRange;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SellerCalendarInfo.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_str-calendar_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {
    public static final ArrayList a(List list) {
        List<StrItemBookingSellerCalendarResponse.DateRange> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (StrItemBookingSellerCalendarResponse.DateRange dateRange : list2) {
            arrayList.add(new DateRange(wy0.b.c(dateRange.getStartDate()), wy0.b.c(dateRange.getEndDate())));
        }
        return arrayList;
    }

    public static final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (DateRange dateRange : C42745f0.B0(arrayList, new d())) {
            DateRange dateRange2 = (DateRange) C42745f0.S(arrayList2);
            if (dateRange2 != null) {
                Date date = dateRange.f286636b;
                Date date2 = dateRange2.f286637c;
                if (date.compareTo(date2) <= 0) {
                    Date date3 = dateRange.f286637c;
                    if (date2.compareTo(date3) < 0) {
                        arrayList2.set(arrayList2.size() - 1, new DateRange(dateRange2.f286636b, date3));
                    }
                }
            }
            arrayList2.add(dateRange);
        }
        return arrayList2;
    }
}
