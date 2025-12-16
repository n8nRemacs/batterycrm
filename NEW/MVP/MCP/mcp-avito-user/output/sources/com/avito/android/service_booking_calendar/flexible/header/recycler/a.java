package com.avito.android.service_booking_calendar.flexible.header.recycler;

import Y61.l;
import com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WeekItemContentComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/recycler/a;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.recycler.data_aware.b {
    @Inject
    public a() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF272437b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF272437b()) : null) || !(aVar instanceof WeekItem) || !(aVar2 instanceof WeekItem)) {
            return false;
        }
        WeekItem weekItem = (WeekItem) aVar;
        WeekItem weekItem2 = (WeekItem) aVar2;
        return weekItem.f275677e == weekItem2.f275677e && L.f(weekItem.f275676d, weekItem2.f275676d) && L.f(weekItem.f275675c, weekItem2.f275675c);
    }
}
