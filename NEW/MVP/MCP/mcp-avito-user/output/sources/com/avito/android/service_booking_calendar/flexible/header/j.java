package com.avito.android.service_booking_calendar.flexible.header;

import Y61.k;
import com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: WeekExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_service-booking-calendar_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {
    public static final int a(int i12, int i13, @k List list) {
        int i14 = i12;
        while (true) {
            if (-1 >= i14) {
                return 0;
            }
            boolean z12 = i14 == i12 && ((WeekItem) list.get(i14)).f275675c.get(i13).getF275369c().f421948b.f421943d <= 7;
            boolean z13 = i14 != i12;
            if (((WeekItem) list.get(i14)).f() && (z12 || z13)) {
                return i14;
            }
            i14--;
        }
    }
}
