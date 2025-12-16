package com.avito.android.service_booking_common;

import com.avito.android.B2;
import com.avito.android.util.K;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;

/* compiled from: SbDateSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_common/h;", "Lcom/avito/android/service_booking_common/g;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final B2 f276565a;

    @Inject
    public h(@Y61.k B2 b22) {
        this.f276565a = b22;
    }

    @Override // com.avito.android.service_booking_common.g
    @Y61.k
    public final ArrayList a(@Y61.k String str, @Y61.k String str2) {
        Date dateB = b.b(str);
        Date dateB2 = b.b(str2);
        Calendar calendarA = b.a();
        calendarA.setTime(b.b(str));
        K.a(calendarA);
        Date time = calendarA.getTime();
        calendarA.setTime(b.b(str2));
        K.a(calendarA);
        Date time2 = calendarA.getTime();
        B2 b22 = this.f276565a;
        b22.getClass();
        kotlin.reflect.n<Object> nVar = B2.f67184X[22];
        if (((Boolean) b22.f67230x.a().invoke()).booleanValue() && L.f(time, time2)) {
            return C42745f0.e0(time);
        }
        int i12 = calendarA.get(2);
        int i13 = i12 == 11 ? 0 : i12 + 1;
        ArrayList arrayList = new ArrayList();
        if (dateB.compareTo(dateB2) < 0) {
            calendarA.setTime(time);
            calendarA.set(5, 1);
            while (calendarA.get(2) != i13) {
                int actualMaximum = calendarA.getActualMaximum(5);
                for (int i14 = 0; i14 < actualMaximum; i14++) {
                    if (s.n(time, time2).e(calendarA.getTime())) {
                        arrayList.add(calendarA.getTime());
                    }
                    if (calendarA.get(5) != calendarA.getActualMaximum(5)) {
                        calendarA.add(5, 1);
                    }
                }
                calendarA.set(5, 1);
                calendarA.add(2, 1);
            }
        }
        return arrayList;
    }
}
