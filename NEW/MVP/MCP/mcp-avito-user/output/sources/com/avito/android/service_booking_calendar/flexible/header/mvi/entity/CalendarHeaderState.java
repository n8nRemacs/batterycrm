package com.avito.android.service_booking_calendar.flexible.header.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import com.avito.android.service_booking_calendar.domain.ToolbarAction;
import com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem;
import it0.InterfaceC42106a;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: CalendarHeaderState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "MODE", "b", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CalendarHeaderState extends q {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f276003r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final CalendarHeaderState f276004s;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<ToolbarAction> f276005b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final MODE f276006c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f276007d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f276008e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f276009f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final b f276010g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<WeekItem> f276011h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f276012i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Integer f276013j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final DayItem f276014k;

    /* renamed from: l, reason: collision with root package name */
    public final int f276015l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final DayItem f276016m;

    /* renamed from: n, reason: collision with root package name */
    public final int f276017n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final List<InterfaceC42106a> f276018o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f276019p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f276020q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CalendarHeaderState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState$MODE;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MODE {

        /* renamed from: b, reason: collision with root package name */
        public static final MODE f276021b;

        /* renamed from: c, reason: collision with root package name */
        public static final MODE f276022c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ MODE[] f276023d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f276024e;

        static {
            MODE mode = new MODE("WEEK", 0);
            f276021b = mode;
            MODE mode2 = new MODE("MONTH", 1);
            f276022c = mode2;
            MODE[] modeArr = {mode, mode2};
            f276023d = modeArr;
            f276024e = c.a(modeArr);
        }

        public MODE() {
            throw null;
        }

        public static MODE valueOf(String str) {
            return (MODE) Enum.valueOf(MODE.class, str);
        }

        public static MODE[] values() {
            return (MODE[]) f276023d.clone();
        }
    }

    /* compiled from: CalendarHeaderState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState$a;", "", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CalendarHeaderState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState$b$a;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState$b$b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: CalendarHeaderState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState$b$a;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState$b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f276025a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f276026b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f276027c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final Integer f276028d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final DeepLink f276029e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final String f276030f;

            public a(@l String str, @k String str2, @l String str3, @InterfaceC42150f @l Integer num, @l DeepLink deepLink, @l String str4) {
                super(null);
                this.f276025a = str;
                this.f276026b = str2;
                this.f276027c = str3;
                this.f276028d = num;
                this.f276029e = deepLink;
                this.f276030f = str4;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f276025a, aVar.f276025a) && L.f(this.f276026b, aVar.f276026b) && L.f(this.f276027c, aVar.f276027c) && L.f(this.f276028d, aVar.f276028d) && L.f(this.f276029e, aVar.f276029e) && L.f(this.f276030f, aVar.f276030f);
            }

            public final int hashCode() {
                String str = this.f276025a;
                int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f276026b);
                String str2 = this.f276027c;
                int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.f276028d;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                DeepLink deepLink = this.f276029e;
                int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                String str3 = this.f276030f;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ScheduleInfoPanelLoaded(title=");
                sb2.append(this.f276025a);
                sb2.append(", subtitle=");
                sb2.append(this.f276026b);
                sb2.append(", actionTitle=");
                sb2.append(this.f276027c);
                sb2.append(", actionStyleAttr=");
                sb2.append(this.f276028d);
                sb2.append(", uri=");
                sb2.append(this.f276029e);
                sb2.append(", breakTime=");
                return C22026a.c(sb2, this.f276030f, ')');
            }
        }

        /* compiled from: CalendarHeaderState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState$b$b;", "Lcom/avito/android/service_booking_calendar/flexible/header/mvi/entity/CalendarHeaderState$b;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState$b$b, reason: collision with other inner class name */
        public static final class C8188b extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C8188b f276031a = new C8188b();

            public C8188b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f276004s = new CalendarHeaderState(c42784z0, MODE.f276021b, false, true, null, b.C8188b.f276031a, c42784z0, null, null, null, 0, null, 0, c42784z0, false, false);
    }

    public CalendarHeaderState(@k List list, @k MODE mode, boolean z12, boolean z13, @l String str, @k b bVar, @k List list2, @l Integer num, @l Integer num2, @l DayItem dayItem, int i12, @l DayItem dayItem2, int i13, @k List list3, boolean z14, boolean z15) {
        this.f276005b = list;
        this.f276006c = mode;
        this.f276007d = z12;
        this.f276008e = z13;
        this.f276009f = str;
        this.f276010g = bVar;
        this.f276011h = list2;
        this.f276012i = num;
        this.f276013j = num2;
        this.f276014k = dayItem;
        this.f276015l = i12;
        this.f276016m = dayItem2;
        this.f276017n = i13;
        this.f276018o = list3;
        this.f276019p = z14;
        this.f276020q = z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CalendarHeaderState a(CalendarHeaderState calendarHeaderState, ArrayList arrayList, MODE mode, boolean z12, boolean z13, b bVar, List list, Integer num, Integer num2, DayItem dayItem, int i12, DayItem dayItem2, int i13, List list2, boolean z14, int i14) {
        calendarHeaderState.getClass();
        List list3 = (i14 & 2) != 0 ? calendarHeaderState.f276005b : arrayList;
        MODE mode2 = (i14 & 4) != 0 ? calendarHeaderState.f276006c : mode;
        boolean z15 = (i14 & 8) != 0 ? calendarHeaderState.f276007d : z12;
        boolean z16 = (i14 & 16) != 0 ? calendarHeaderState.f276008e : z13;
        String str = (i14 & 32) != 0 ? calendarHeaderState.f276009f : null;
        b bVar2 = (i14 & 64) != 0 ? calendarHeaderState.f276010g : bVar;
        List list4 = (i14 & 128) != 0 ? calendarHeaderState.f276011h : list;
        Integer num3 = (i14 & 256) != 0 ? calendarHeaderState.f276012i : num;
        Integer num4 = (i14 & 512) != 0 ? calendarHeaderState.f276013j : num2;
        DayItem dayItem3 = (i14 & 1024) != 0 ? calendarHeaderState.f276014k : dayItem;
        int i15 = (i14 & 2048) != 0 ? calendarHeaderState.f276015l : i12;
        DayItem dayItem4 = (i14 & 4096) != 0 ? calendarHeaderState.f276016m : dayItem2;
        int i16 = (i14 & 8192) != 0 ? calendarHeaderState.f276017n : i13;
        List list5 = (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? calendarHeaderState.f276018o : list2;
        boolean z17 = (32768 & i14) != 0 ? calendarHeaderState.f276019p : true;
        boolean z18 = (i14 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? calendarHeaderState.f276020q : z14;
        calendarHeaderState.getClass();
        return new CalendarHeaderState(list3, mode2, z15, z16, str, bVar2, list4, num3, num4, dayItem3, i15, dayItem4, i16, list5, z17, z18);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarHeaderState)) {
            return false;
        }
        CalendarHeaderState calendarHeaderState = (CalendarHeaderState) obj;
        calendarHeaderState.getClass();
        return L.f(null, null) && L.f(this.f276005b, calendarHeaderState.f276005b) && this.f276006c == calendarHeaderState.f276006c && this.f276007d == calendarHeaderState.f276007d && this.f276008e == calendarHeaderState.f276008e && L.f(this.f276009f, calendarHeaderState.f276009f) && L.f(this.f276010g, calendarHeaderState.f276010g) && L.f(this.f276011h, calendarHeaderState.f276011h) && L.f(this.f276012i, calendarHeaderState.f276012i) && L.f(this.f276013j, calendarHeaderState.f276013j) && L.f(this.f276014k, calendarHeaderState.f276014k) && this.f276015l == calendarHeaderState.f276015l && L.f(this.f276016m, calendarHeaderState.f276016m) && this.f276017n == calendarHeaderState.f276017n && L.f(this.f276018o, calendarHeaderState.f276018o) && this.f276019p == calendarHeaderState.f276019p && this.f276020q == calendarHeaderState.f276020q;
    }

    public final int hashCode() {
        int i12 = r.i(r.i((this.f276006c.hashCode() + (this.f276005b.hashCode() * 31)) * 31, 31, this.f276007d), 31, this.f276008e);
        String str = this.f276009f;
        int iE2 = H.e((this.f276010g.hashCode() + ((i12 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f276011h);
        Integer num = this.f276012i;
        int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f276013j;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        DayItem dayItem = this.f276014k;
        int iE3 = r.e(this.f276015l, (iHashCode2 + (dayItem == null ? 0 : dayItem.hashCode())) * 31, 31);
        DayItem dayItem2 = this.f276016m;
        return Boolean.hashCode(this.f276020q) + r.i(H.e(r.e(this.f276017n, (iE3 + (dayItem2 != null ? dayItem2.hashCode() : 0)) * 31, 31), 31, this.f276018o), 31, this.f276019p);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarHeaderState(title=null, actions=");
        sb2.append(this.f276005b);
        sb2.append(", mode=");
        sb2.append(this.f276006c);
        sb2.append(", isVisible=");
        sb2.append(this.f276007d);
        sb2.append(", isLoading=");
        sb2.append(this.f276008e);
        sb2.append(", error=");
        sb2.append(this.f276009f);
        sb2.append(", scheduleInfoPanel=");
        sb2.append(this.f276010g);
        sb2.append(", weeks=");
        sb2.append(this.f276011h);
        sb2.append(", scrollToWeekPosition=");
        sb2.append(this.f276012i);
        sb2.append(", scrollToMonthPosition=");
        sb2.append(this.f276013j);
        sb2.append(", selectedDay=");
        sb2.append(this.f276014k);
        sb2.append(", weeksCountInMonth=");
        sb2.append(this.f276015l);
        sb2.append(", todayDay=");
        sb2.append(this.f276016m);
        sb2.append(", todayDayIndex=");
        sb2.append(this.f276017n);
        sb2.append(", tooltips=");
        sb2.append(this.f276018o);
        sb2.append(", isTooltipsInitialized=");
        sb2.append(this.f276019p);
        sb2.append(", isInvalidated=");
        return r.x(sb2, this.f276020q, ')');
    }
}
