package com.avito.android.service_booking_calendar.flexible.data.domain;

import Y41.l;
import Y61.k;
import com.avito.android.service_booking_calendar.data.model.Day;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayPlaceholderItem;
import com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem;
import com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;
import org.threeten.bp.q;

/* compiled from: WeekItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/domain/h;", "Lcom/avito/android/service_booking_calendar/flexible/data/domain/g;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_calendar.day.schedule.domain.a f275701a;

    /* compiled from: WeekItemConverter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/threeten/bp/f;", "it", "invoke", "(Lorg/threeten/bp/f;)Lorg/threeten/bp/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<org.threeten.bp.f, org.threeten.bp.f> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f275702l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final org.threeten.bp.f invoke(org.threeten.bp.f fVar) {
            return fVar.K(-1L);
        }
    }

    /* compiled from: WeekItemConverter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/threeten/bp/f;", "it", "Lcom/avito/android/service_booking_calendar/day/schedule/domain/DayPlaceholderItem;", "invoke", "(Lorg/threeten/bp/f;)Lcom/avito/android/service_booking_calendar/day/schedule/domain/DayPlaceholderItem;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<org.threeten.bp.f, DayPlaceholderItem> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final DayPlaceholderItem invoke(org.threeten.bp.f fVar) {
            org.threeten.bp.f fVar2 = fVar;
            h.this.getClass();
            return new DayPlaceholderItem(String.valueOf(fVar2.s(q.f422106g)), fVar2);
        }
    }

    /* compiled from: WeekItemConverter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/threeten/bp/f;", "it", "invoke", "(Lorg/threeten/bp/f;)Lorg/threeten/bp/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<org.threeten.bp.f, org.threeten.bp.f> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f275704l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final org.threeten.bp.f invoke(org.threeten.bp.f fVar) {
            return fVar.K(1L);
        }
    }

    /* compiled from: WeekItemConverter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/threeten/bp/f;", "it", "Lcom/avito/android/service_booking_calendar/day/schedule/domain/DayPlaceholderItem;", "invoke", "(Lorg/threeten/bp/f;)Lcom/avito/android/service_booking_calendar/day/schedule/domain/DayPlaceholderItem;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<org.threeten.bp.f, DayPlaceholderItem> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final DayPlaceholderItem invoke(org.threeten.bp.f fVar) {
            org.threeten.bp.f fVar2 = fVar;
            h.this.getClass();
            return new DayPlaceholderItem(String.valueOf(fVar2.s(q.f422106g)), fVar2);
        }
    }

    @Inject
    public h(@k com.avito.android.service_booking_calendar.day.schedule.domain.a aVar) {
        this.f275701a = aVar;
    }

    @Override // com.avito.android.service_booking_calendar.flexible.data.domain.g
    @k
    public final List<WeekItem> a(@k List<Day> list) {
        int i12;
        int i13;
        if (list.isEmpty()) {
            return C42784z0.f406748b;
        }
        List<Day> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f275701a.a((Day) it.next()));
        }
        ArrayList arrayListH0 = C42745f0.h0(C43033p.D(new o0(C43033p.C(C43033p.u(c.f275704l, ((DayItem) C42745f0.Q(arrayList)).f275353c.K(1L)), 7 - ((DayItem) C42745f0.Q(arrayList)).f275353c.f421948b.E().d()), new d())), C42745f0.h0(arrayList, C42745f0.k(C43033p.D(new o0(C43033p.C(C43033p.u(a.f275702l, ((DayItem) C42745f0.E(arrayList)).f275353c.K(-1L)), ((DayItem) C42745f0.E(arrayList)).f275353c.f421948b.E().d() - 1), new b())))));
        Iterator it2 = arrayListH0.iterator();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i12 = -1;
            if (!it2.hasNext()) {
                i15 = -1;
                break;
            }
            FlexibleCalendarDayItem flexibleCalendarDayItem = (FlexibleCalendarDayItem) it2.next();
            if ((flexibleCalendarDayItem instanceof DayItem) && ((DayItem) flexibleCalendarDayItem).f275356f) {
                break;
            }
            i15++;
        }
        Integer numValueOf = Integer.valueOf(i15);
        if (i15 == -1) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        FlexibleCalendarDayItem flexibleCalendarDayItem2 = (FlexibleCalendarDayItem) arrayListH0.get(iIntValue);
        int iD2 = flexibleCalendarDayItem2.getF275369c().f421948b.E().d() - 1;
        ArrayList arrayListR0 = C42745f0.R0(arrayListH0, 7, 7);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayListR0, 10));
        int i16 = 0;
        for (Object obj : arrayListR0) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                C42745f0.H0();
                throw null;
            }
            List list3 = (List) obj;
            Iterator it3 = list3.iterator();
            int i18 = i14;
            while (true) {
                if (!it3.hasNext()) {
                    i13 = i12;
                    break;
                }
                if (((FlexibleCalendarDayItem) it3.next()).getF275369c().f421948b.f421943d == 1) {
                    i13 = i18;
                    break;
                }
                i18++;
            }
            int i19 = i13 != i12 ? 1 : i14;
            int i22 = ((FlexibleCalendarDayItem) list3.get(6)).getF275369c().K(1L).f421948b.f421943d == 1 ? 1 : i14;
            boolean z12 = (i19 == 0 || ((FlexibleCalendarDayItem) list3.get(i14)).getF275369c().f421948b.f421943d == 1) ? false : true;
            WeekItem.WeekFlag[] weekFlagArr = WeekItem.WeekFlag.f275679b;
            Integer num = i19 == 0 ? null : 1;
            int iIntValue2 = num != null ? num.intValue() : 0;
            Integer num2 = i22 != 0 || z12 ? 2 : null;
            arrayList2.add(new WeekItem(((FlexibleCalendarDayItem) C42745f0.E(list3)).getF275369c().toString(), list3, i16 == iIntValue / 7 ? Integer.valueOf(iD2) : null, flexibleCalendarDayItem2.getF275369c().f421948b.f421942c, iIntValue2 | (num2 != null ? num2.intValue() : 0)));
            i16 = i17;
            i14 = 0;
            i12 = -1;
        }
        return arrayList2;
    }
}
