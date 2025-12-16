package com.avito.android.service_booking_calendar.flexible.header.recycler;

import Y61.k;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem;
import com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem;
import com.avito.android.service_booking_calendar.flexible.header.view.DayOfWeekView;
import com.avito.android.util.L3;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: WeekItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/recycler/h;", "Lcom/avito/android/service_booking_calendar/flexible/header/recycler/f;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f276052b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f276053c;

    @Inject
    public h() {
        e2 e2VarB = f2.b(0, 1, BufferOverflow.f410778c, 1);
        this.f276052b = e2VarB;
        this.f276053c = e2VarB;
    }

    @Override // com.avito.android.service_booking_calendar.flexible.header.recycler.f
    @k
    public final InterfaceC43160i<FlexibleCalendarDayItem> L0() {
        return this.f276053c;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((j) eVar, (WeekItem) aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        Boolean bool;
        j jVar = (j) eVar;
        WeekItem weekItem = (WeekItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof c) {
                obj = obj2;
            }
        }
        if (!(obj instanceof c)) {
            obj = null;
        }
        c cVar = (c) obj;
        if (cVar == null) {
            k(jVar, weekItem);
            return;
        }
        int i13 = 0;
        for (Object obj3 : cVar.f276045a) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            L3 l32 = (L3) obj3;
            if (l32.f318649a && (bool = (Boolean) l32.f318650b) != null) {
                j.B80((DayOfWeekView) jVar.f276056b.get(i13), weekItem.f275675c.get(i13), bool.booleanValue(), weekItem.f275677e);
            }
            i13 = i14;
        }
    }

    public final void k(@k j jVar, @k WeekItem weekItem) {
        List<FlexibleCalendarDayItem> list = weekItem.f275675c;
        Integer num = weekItem.f275676d;
        FlexibleCalendarDayItem flexibleCalendarDayItem = num != null ? list.get(num.intValue()) : null;
        DayItem dayItem = flexibleCalendarDayItem instanceof DayItem ? (DayItem) flexibleCalendarDayItem : null;
        g gVar = new g(this);
        Iterator it = jVar.f276056b.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            DayOfWeekView dayOfWeekView = (DayOfWeekView) next;
            j.B80(dayOfWeekView, list.get(i12), L.f(list.get(i12), dayItem), weekItem.f275677e);
            dayOfWeekView.setOnClickListener(new C(gVar, weekItem, i12, 19));
            i12 = i13;
        }
    }
}
