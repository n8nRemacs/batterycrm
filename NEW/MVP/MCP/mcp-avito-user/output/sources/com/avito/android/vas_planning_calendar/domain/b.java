package com.avito.android.vas_planning_calendar.domain;

import Y61.k;
import com.avito.android.util.P2;
import com.avito.android.vas_planning_calendar.model.CalendarBookingRestriction;
import dM0.C39601a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import java.util.ArrayList;
import java.util.Calendar;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PlanCalendarInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_planning_calendar/domain/b;", "Lcom/avito/android/vas_planning_calendar/domain/a;", "<init>", "()V", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.vas_planning_calendar.domain.a
    @k
    public final C41998x0 a() {
        Calendar calendarA = C39601a.a();
        Calendar calendarA2 = C39601a.a();
        calendarA2.add(2, 7);
        ArrayList arrayList = new ArrayList();
        while (calendarA.getTimeInMillis() < calendarA2.getTimeInMillis()) {
            arrayList.add(new CalendarBookingRestriction(calendarA.getTime(), true, 1));
            calendarA.add(5, 1);
        }
        return z.c0(new P2.b(C42745f0.M0(arrayList)));
    }
}
