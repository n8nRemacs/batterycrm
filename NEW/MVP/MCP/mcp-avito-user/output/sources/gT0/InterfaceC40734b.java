package gt0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarContentInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lgt0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "Lgt0/b$a;", "Lgt0/b$b;", "Lgt0/b$c;", "Lgt0/b$d;", "Lgt0/b$e;", "Lgt0/b$f;", "Lgt0/b$g;", "Lgt0/b$h;", "Lgt0/b$i;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gt0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC40734b {

    /* compiled from: CalendarContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgt0/b$a;", "Lgt0/b;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gt0.b$a */
    public static final class a implements InterfaceC40734b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f396905a = new a();
    }

    /* compiled from: CalendarContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgt0/b$b;", "Lgt0/b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gt0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11233b implements InterfaceC40734b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DayItem f396906a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f396907b;

        public C11233b(@k DayItem dayItem, @l Integer num) {
            this.f396906a = dayItem;
            this.f396907b = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11233b)) {
                return false;
            }
            C11233b c11233b = (C11233b) obj;
            return L.f(this.f396906a, c11233b.f396906a) && L.f(this.f396907b, c11233b.f396907b);
        }

        public final int hashCode() {
            int iHashCode = this.f396906a.hashCode() * 31;
            Integer num = this.f396907b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InvalidateContent(selectedDay=");
            sb2.append(this.f396906a);
            sb2.append(", scheduleScrollOffset=");
            return s.j(sb2, this.f396907b, ')');
        }
    }

    /* compiled from: CalendarContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgt0/b$c;", "Lgt0/b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gt0.b$c */
    public static final /* data */ class c implements InterfaceC40734b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f396908a;

        public c(@k DeepLink deepLink) {
            this.f396908a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f396908a, ((c) obj).f396908a);
        }

        public final int hashCode() {
            return this.f396908a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("LaunchDeepLink(deepLink="), this.f396908a, ')');
        }
    }

    /* compiled from: CalendarContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgt0/b$d;", "Lgt0/b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gt0.b$d */
    public static final /* data */ class d implements InterfaceC40734b {

        /* renamed from: a, reason: collision with root package name */
        public final int f396909a;

        public d(int i12) {
            this.f396909a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f396909a == ((d) obj).f396909a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f396909a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollSchedule(scrollOffset="), this.f396909a, ')');
        }
    }

    /* compiled from: CalendarContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgt0/b$e;", "Lgt0/b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gt0.b$e */
    public static final /* data */ class e implements InterfaceC40734b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DayItem f396910a;

        public e(@k DayItem dayItem) {
            this.f396910a = dayItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f396910a, ((e) obj).f396910a);
        }

        public final int hashCode() {
            return this.f396910a.hashCode();
        }

        @k
        public final String toString() {
            return "SelectDay(selectedDay=" + this.f396910a + ')';
        }
    }

    /* compiled from: CalendarContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgt0/b$f;", "Lgt0/b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gt0.b$f */
    public static final /* data */ class f implements InterfaceC40734b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f396911a;

        public f(@k PrintableText printableText) {
            this.f396911a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f396911a, ((f) obj).f396911a);
        }

        public final int hashCode() {
            return this.f396911a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowError(message="), this.f396911a, ')');
        }
    }

    /* compiled from: CalendarContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgt0/b$g;", "Lgt0/b;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gt0.b$g */
    public static final class g implements InterfaceC40734b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f396912a = new g();
    }

    /* compiled from: CalendarContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgt0/b$h;", "Lgt0/b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gt0.b$h */
    public static final /* data */ class h implements InterfaceC40734b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396913a;

        public h(@k String str) {
            this.f396913a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f396913a, ((h) obj).f396913a);
        }

        public final int hashCode() {
            return this.f396913a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowScheduleForDay(todayTitle="), this.f396913a, ')');
        }
    }

    /* compiled from: CalendarContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgt0/b$i;", "Lgt0/b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gt0.b$i */
    public static final /* data */ class i implements InterfaceC40734b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396914a;

        public i(@k String str) {
            this.f396914a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f396914a, ((i) obj).f396914a);
        }

        public final int hashCode() {
            return this.f396914a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(message="), this.f396914a, ')');
        }
    }
}
