package com.avito.android.service_booking_calendar.domain;

import Y61.k;
import Y61.l;
import com.avito.android.B2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_calendar.data.model.TimeSlot;
import com.avito.android.service_booking_calendar.domain.TimeSlotItem;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.m;
import kotlin.ranges.o;
import kotlin.ranges.s;
import kotlin.reflect.n;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: TimeSlotItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/d;", "Lcom/avito/android/service_booking_calendar/domain/c;", "a", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35863o4 f275549a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final B2 f275550b;

    /* compiled from: TimeSlotItemConverter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/d$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/service_booking_calendar/domain/d$a$a;", "Lcom/avito/android/service_booking_calendar/domain/d$a$b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: TimeSlotItemConverter.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/d$a$a;", "Lcom/avito/android/service_booking_calendar/domain/d$a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_booking_calendar.domain.d$a$a, reason: collision with other inner class name */
        public static final /* data */ class C8176a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final TimeSlot f275551a;

            public C8176a(@k TimeSlot timeSlot) {
                super(null);
                this.f275551a = timeSlot;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8176a) && L.f(this.f275551a, ((C8176a) obj).f275551a);
            }

            public final int hashCode() {
                return this.f275551a.hashCode();
            }

            @k
            public final String toString() {
                return "BusyTimeslot(timeslot=" + this.f275551a + ')';
            }
        }

        /* compiled from: TimeSlotItemConverter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/d$a$b;", "Lcom/avito/android/service_booking_calendar/domain/d$a;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f275552a = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TimeSlotItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f275553a;

        static {
            int[] iArr = new int[TimeSlot.ActiveTimeSlot.Status.values().length];
            try {
                iArr[TimeSlot.ActiveTimeSlot.Status.CONFIRMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeSlot.ActiveTimeSlot.Status.NEED_CONFIRMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeSlot.ActiveTimeSlot.Status.NEED_CONFIRMATION_BY_CLIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f275553a = iArr;
        }
    }

    @Inject
    public d(@k InterfaceC35863o4 interfaceC35863o4, @k B2 b22) {
        this.f275549a = interfaceC35863o4;
        this.f275550b = b22;
    }

    @Override // com.avito.android.service_booking_calendar.domain.c
    @k
    public final ArrayList a(@k List list, @k List list2) {
        long j12;
        long j13;
        B2 b22;
        B2 b23;
        B2 b24;
        o oVar;
        o oVar2;
        long j14 = 0;
        InterfaceC43030m interfaceC43030mC = C43033p.C(C43033p.u(e.f275554l, 0L), 96);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : interfaceC43030mC) {
            ((Number) obj).longValue();
            linkedHashMap.put(obj, a.b.f275552a);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            j12 = 1;
            j13 = Long.MIN_VALUE;
            b22 = this.f275550b;
            if (!zHasNext) {
                break;
            }
            TimeSlot.ActiveTimeSlot activeTimeSlot = (TimeSlot.ActiveTimeSlot) it.next();
            Long techBreak = activeTimeSlot.getTechBreak();
            b22.getClass();
            n<Object> nVar = B2.f67184X[13];
            Long l12 = ((Boolean) b22.f67221o.a().invoke()).booleanValue() ? techBreak : null;
            long duration = activeTimeSlot.getDuration() + activeTimeSlot.getTimeStart() + (l12 != null ? l12.longValue() : j14);
            long timeStart = activeTimeSlot.getTimeStart();
            if (duration <= Long.MIN_VALUE) {
                o.f406922f.getClass();
                oVar2 = o.f406923g;
            } else {
                oVar2 = new o(timeStart, duration - 1);
            }
            m mVarQ = s.q(oVar2);
            long j15 = mVarQ.f406917d;
            long j16 = mVarQ.f406915b;
            long j17 = mVarQ.f406916c;
            if ((j15 > j14 && j16 <= j17) || (j15 < j14 && j17 <= j16)) {
                while (true) {
                    if (((a) linkedHashMap2.get(Long.valueOf(j16))) instanceof a.b) {
                        linkedHashMap2.put(Long.valueOf(j16), new a.C8176a(activeTimeSlot));
                        Integer num = (Integer) linkedHashMap3.get(activeTimeSlot);
                        linkedHashMap3.put(activeTimeSlot, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                    }
                    if (j16 != j17) {
                        j16 += j15;
                    }
                }
            }
            j14 = 0;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            TimeSlot.a aVar = (TimeSlot.a) it2.next();
            long timeStart2 = aVar.getTimeStart();
            long duration2 = aVar.getDuration() + aVar.getTimeStart();
            if (duration2 <= j13) {
                o.f406922f.getClass();
                oVar = o.f406923g;
                b24 = b22;
            } else {
                b24 = b22;
                oVar = new o(timeStart2, duration2 - j12);
            }
            m mVarQ2 = s.q(oVar);
            long j18 = mVarQ2.f406917d;
            long j19 = mVarQ2.f406915b;
            long j22 = mVarQ2.f406916c;
            if ((j18 > 0 && j19 <= j22) || (j18 < 0 && j22 <= j19)) {
                boolean z12 = false;
                while (true) {
                    a aVar2 = (a) linkedHashMap2.get(Long.valueOf(j19));
                    if (aVar2 instanceof a.b) {
                        if (z12) {
                            aVar = new TimeSlot.a(j19, 900L);
                            z12 = false;
                        }
                        linkedHashMap2.put(Long.valueOf(j19), new a.C8176a(aVar));
                        Integer num2 = (Integer) linkedHashMap3.get(aVar);
                        linkedHashMap3.put(aVar, Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                    } else if (aVar2 instanceof a.C8176a) {
                        z12 = true;
                    }
                    if (j19 != j22) {
                        j19 += j18;
                    }
                }
            }
            b22 = b24;
            j12 = 1;
            j13 = Long.MIN_VALUE;
        }
        B2 b25 = b22;
        ArrayList arrayList = new ArrayList();
        TimeSlot timeSlot = null;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            a aVar3 = (a) entry.getValue();
            boolean z13 = aVar3 instanceof a.b;
            InterfaceC35863o4 interfaceC35863o4 = this.f275549a;
            if (z13) {
                arrayList.add(new TimeSlotItem.EmptyTimeSlotItem(interfaceC35863o4.a(), ((Number) entry.getKey()).longValue(), 1));
            } else {
                if (aVar3 instanceof a.C8176a) {
                    a.C8176a c8176a = (a.C8176a) aVar3;
                    boolean zF2 = L.f(timeSlot, c8176a.f275551a);
                    TimeSlot timeSlot2 = c8176a.f275551a;
                    if (zF2) {
                        b23 = b25;
                    } else if (timeSlot2 instanceof TimeSlot.ActiveTimeSlot) {
                        TimeSlot.ActiveTimeSlot activeTimeSlot2 = (TimeSlot.ActiveTimeSlot) timeSlot2;
                        String id2 = activeTimeSlot2.getId();
                        String statusText = activeTimeSlot2.getStatusText();
                        int duration3 = (int) (activeTimeSlot2.getDuration() / 900);
                        long timeStart3 = activeTimeSlot2.getTimeStart();
                        TimeSlot.ActiveTimeSlot.Status status = activeTimeSlot2.getStatus();
                        int i12 = status == null ? -1 : b.f275553a[status.ordinal()];
                        TimeSlotItem.BusyTimeSlotItem.Status status2 = i12 != 1 ? (i12 == 2 || i12 == 3) ? TimeSlotItem.BusyTimeSlotItem.Status.f275522e : TimeSlotItem.BusyTimeSlotItem.Status.f275520c : TimeSlotItem.BusyTimeSlotItem.Status.f275521d;
                        List<String> listE = activeTimeSlot2.e();
                        String totalAmount = activeTimeSlot2.getTotalAmount();
                        TimeSlot.ActiveTimeSlot.b contacts = activeTimeSlot2.getContacts();
                        String name = contacts != null ? contacts.getName() : null;
                        TimeSlot.ActiveTimeSlot.a action = activeTimeSlot2.getAction();
                        DeepLink uri = action != null ? action.getUri() : null;
                        Long techBreak2 = activeTimeSlot2.getTechBreak();
                        Integer numValueOf = Integer.valueOf((int) ((techBreak2 != null ? techBreak2.longValue() : 0L) / 900));
                        b25.getClass();
                        n<Object> nVar2 = B2.f67184X[13];
                        b23 = b25;
                        if (!((Boolean) b23.f67221o.a().invoke()).booleanValue()) {
                            numValueOf = null;
                        }
                        arrayList.add(new TimeSlotItem.BusyTimeSlotItem(id2, timeStart3, statusText, duration3, status2, listE, totalAmount, name, uri, numValueOf != null ? numValueOf.intValue() : 0));
                    } else {
                        b23 = b25;
                        if (timeSlot2 instanceof TimeSlot.a) {
                            String strA = interfaceC35863o4.a();
                            Integer num3 = (Integer) linkedHashMap3.get(timeSlot2);
                            arrayList.add(new TimeSlotItem.InactiveTimeSlotItem(strA, ((Number) entry.getKey()).longValue(), num3 != null ? num3.intValue() : 1));
                        }
                    }
                    timeSlot = timeSlot2;
                }
                b25 = b23;
            }
            b23 = b25;
            b25 = b23;
        }
        return arrayList;
    }
}
