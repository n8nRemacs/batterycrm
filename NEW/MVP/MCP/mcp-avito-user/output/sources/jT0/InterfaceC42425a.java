package jt0;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem;
import com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem;
import it0.C42108c;
import it0.InterfaceC42106a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarHeaderAction.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Ljt0/a;", "Lcom/avito/android/service_booking_calendar/flexible/d;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "Ljt0/a$a;", "Ljt0/a$b;", "Ljt0/a$c;", "Ljt0/a$d;", "Ljt0/a$e;", "Ljt0/a$f;", "Ljt0/a$g;", "Ljt0/a$h;", "Ljt0/a$i;", "Ljt0/a$j;", "Ljt0/a$k;", "Ljt0/a$l;", "Ljt0/a$m;", "Ljt0/a$n;", "Ljt0/a$o;", "Ljt0/a$p;", "Ljt0/a$q;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jt0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC42425a extends com.avito.android.service_booking_calendar.flexible.d {

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljt0/a$a;", "Ljt0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11587a implements InterfaceC42425a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final J.a f405868a;

        public C11587a(@Y61.k J.a aVar) {
            this.f405868a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11587a) && L.f(this.f405868a, ((C11587a) obj).f405868a);
        }

        public final int hashCode() {
            return this.f405868a.f90384a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "HideHeader(reason=" + this.f405868a + ')';
        }
    }

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljt0/a$b;", "Ljt0/a;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$b */
    public static final class b implements InterfaceC42425a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f405869a = new b();
    }

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljt0/a$c;", "Ljt0/a;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$c */
    public static final class c implements InterfaceC42425a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f405870a = new c();
    }

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljt0/a$d;", "Ljt0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$d */
    public static final /* data */ class d implements InterfaceC42425a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC42106a f405871a;

        public d(@Y61.k InterfaceC42106a interfaceC42106a) {
            this.f405871a = interfaceC42106a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f405871a, ((d) obj).f405871a);
        }

        public final int hashCode() {
            return this.f405871a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnClickOutOfTooltip(tooltip=" + this.f405871a + ')';
        }
    }

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljt0/a$e;", "Ljt0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$e */
    public static final /* data */ class e implements InterfaceC42425a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f405872a;

        public e(@Y61.k DeepLink deepLink) {
            this.f405872a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f405872a, ((e) obj).f405872a);
        }

        public final int hashCode() {
            return this.f405872a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnClickScheduleBtn(deepLink="), this.f405872a, ')');
        }
    }

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljt0/a$f;", "Ljt0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$f */
    public static final /* data */ class f implements InterfaceC42425a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final InterfaceC42106a f405873a;

        public f(@Y61.l InterfaceC42106a interfaceC42106a) {
            this.f405873a = interfaceC42106a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f405873a, ((f) obj).f405873a);
        }

        public final int hashCode() {
            InterfaceC42106a interfaceC42106a = this.f405873a;
            if (interfaceC42106a == null) {
                return 0;
            }
            return interfaceC42106a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnClickTitle(visibleTooltip=" + this.f405873a + ')';
        }
    }

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljt0/a$g;", "Ljt0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$g */
    public static final /* data */ class g implements InterfaceC42425a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f405874a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f405875b;

        public g(@Y61.k DeepLink deepLink, @Y61.k String str) {
            this.f405874a = deepLink;
            this.f405875b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f405874a, gVar.f405874a) && L.f(this.f405875b, gVar.f405875b);
        }

        public final int hashCode() {
            return this.f405875b.hashCode() + (this.f405874a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnClickToolbarBtn(deepLink=");
            sb2.append(this.f405874a);
            sb2.append(", type=");
            return C22026a.c(sb2, this.f405875b, ')');
        }
    }

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljt0/a$h;", "Ljt0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$h */
    public static final /* data */ class h implements InterfaceC42425a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC42106a f405876a;

        public h(@Y61.k InterfaceC42106a interfaceC42106a) {
            this.f405876a = interfaceC42106a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f405876a, ((h) obj).f405876a);
        }

        public final int hashCode() {
            return this.f405876a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnClickTooltipBtn(tooltip=" + this.f405876a + ')';
        }
    }

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljt0/a$i;", "Ljt0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$i */
    public static final /* data */ class i implements InterfaceC42425a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FlexibleCalendarDayItem f405877a;

        public i(@Y61.k FlexibleCalendarDayItem flexibleCalendarDayItem) {
            this.f405877a = flexibleCalendarDayItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f405877a, ((i) obj).f405877a);
        }

        public final int hashCode() {
            return this.f405877a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnDayClicked(selectedDay=" + this.f405877a + ')';
        }
    }

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljt0/a$j;", "Ljt0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$j */
    public static final /* data */ class j implements InterfaceC42425a {

        /* renamed from: a, reason: collision with root package name */
        public final int f405878a;

        public j(int i12) {
            this.f405878a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f405878a == ((j) obj).f405878a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f405878a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("OnMonthScrolledTo(scrollPosition="), this.f405878a, ')');
        }
    }

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljt0/a$k;", "Ljt0/a;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$k */
    public static final class k implements InterfaceC42425a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f405879a = new k();
    }

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljt0/a$l;", "Ljt0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$l */
    public static final /* data */ class l implements InterfaceC42425a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.service_booking_calendar.domain.b f405880a;

        public l(@Y61.k com.avito.android.service_booking_calendar.domain.b bVar) {
            this.f405880a = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f405880a, ((l) obj).f405880a);
        }

        public final int hashCode() {
            return this.f405880a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnUpdatedScheduleInfo(info=" + this.f405880a + ')';
        }
    }

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljt0/a$m;", "Ljt0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$m */
    public static final /* data */ class m implements InterfaceC42425a {

        /* renamed from: a, reason: collision with root package name */
        public final int f405881a;

        public m(int i12) {
            this.f405881a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f405881a == ((m) obj).f405881a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f405881a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("OnWeekScrolledTo(scrollPosition="), this.f405881a, ')');
        }
    }

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljt0/a$n;", "Ljt0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$n */
    public static final /* data */ class n implements InterfaceC42425a {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            ((n) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "OpenDeepLink(deepLink=null)";
        }
    }

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljt0/a$o;", "Ljt0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$o */
    public static final /* data */ class o implements InterfaceC42425a {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            ((o) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "ShowError(message=null)";
        }
    }

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljt0/a$p;", "Ljt0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$p */
    public static final /* data */ class p implements InterfaceC42425a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f405882a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<WeekItem> f405883b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final List<C42108c> f405884c;

        public p(@Y61.k ArrayList arrayList, @Y61.k List list, @Y61.k List list2) {
            this.f405882a = arrayList;
            this.f405883b = list;
            this.f405884c = list2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.f405882a.equals(pVar.f405882a) && L.f(this.f405883b, pVar.f405883b) && L.f(this.f405884c, pVar.f405884c);
        }

        public final int hashCode() {
            return this.f405884c.hashCode() + H.e(this.f405882a.hashCode() * 31, 31, this.f405883b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowHeader(toolbarActions=");
            sb2.append(this.f405882a);
            sb2.append(", weeks=");
            sb2.append(this.f405883b);
            sb2.append(", tooltips=");
            return H.p(sb2, this.f405884c, ')');
        }
    }

    /* compiled from: CalendarHeaderAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljt0/a$q;", "Ljt0/a;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.a$q */
    public static final class q implements InterfaceC42425a {
        static {
            new q();
        }
    }
}
