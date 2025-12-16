package com.avito.android.calendar_select.presentation.view.data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CalendarRangeAvailabilityChecker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/l;", "Lcom/avito/android/calendar_select/presentation/view/data/k;", "a", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<a> f113472a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final HashMap<LocalDate, a> f113473b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final HashSet<LocalDate> f113474c = new HashSet<>();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final HashMap<LocalDate, Map<LocalDate, Boolean>> f113475d = new HashMap<>();

    /* compiled from: CalendarRangeAvailabilityChecker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/l$a;", "", "a", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final C3328a f113476d = new C3328a(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LocalDate f113477a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f113478b;

        /* renamed from: c, reason: collision with root package name */
        public final int f113479c;

        /* compiled from: CalendarRangeAvailabilityChecker.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/l$a$a;", "", "<init>", "()V", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.calendar_select.presentation.view.data.l$a$a, reason: collision with other inner class name */
        public static final class C3328a {
            public /* synthetic */ C3328a(C42822w c42822w) {
                this();
            }

            public C3328a() {
            }
        }

        public a(@Y61.k LocalDate localDate, boolean z12, int i12) {
            this.f113477a = localDate;
            this.f113478b = z12;
            this.f113479c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f113477a, aVar.f113477a) && this.f113478b == aVar.f113478b && this.f113479c == aVar.f113479c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f113479c) + androidx.appcompat.app.r.i(this.f113477a.hashCode() * 31, 31, this.f113478b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CalendarRestriction(date=");
            sb2.append(this.f113477a);
            sb2.append(", available=");
            sb2.append(this.f113478b);
            sb2.append(", maxDuration=");
            return androidx.appcompat.app.r.t(sb2, this.f113479c, ')');
        }
    }

    public l(@Y61.k List<a> list) {
        boolean z12;
        this.f113472a = list;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            a aVar = (a) obj;
            LocalDate localDate = aVar.f113477a;
            this.f113473b.put(localDate, aVar);
            if (aVar.f113478b) {
                List<a> list2 = this.f113472a;
                int i14 = aVar.f113479c;
                List listX0 = C42745f0.x0(list2, new kotlin.ranges.l(i13, i12 + i14, 1));
                if ((listX0 instanceof Collection) && listX0.isEmpty()) {
                    z12 = true;
                    if (i14 > 0) {
                        this.f113474c.add(localDate);
                    }
                } else {
                    Iterator it = listX0.iterator();
                    while (it.hasNext()) {
                        if (!((a) it.next()).f113478b) {
                            z12 = false;
                            break;
                        }
                    }
                    z12 = true;
                    if (i14 > 0 && z12) {
                        this.f113474c.add(localDate);
                    }
                }
            }
            HashMap<LocalDate, Map<LocalDate, Boolean>> map = this.f113475d;
            HashMap map2 = new HashMap();
            boolean z13 = false;
            for (a aVar2 : this.f113472a) {
                if (z13 || aVar2.f113477a.isBefore(localDate)) {
                    map2.put(aVar2.f113477a, Boolean.FALSE);
                } else {
                    LocalDate localDate2 = aVar2.f113477a;
                    if (aVar2.f113478b) {
                        Object obj2 = Xl.b.f19053a;
                        map2.put(localDate2, Boolean.valueOf(((int) ChronoUnit.DAYS.between(localDate, localDate2)) > 0));
                    } else {
                        map2.put(localDate2, Boolean.FALSE);
                        z13 = true;
                    }
                }
            }
            map.put(localDate, map2);
            i12 = i13;
        }
    }
}
