package gt0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarContentOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lgt0/c;", "", "a", "b", "c", "d", "Lgt0/c$a;", "Lgt0/c$b;", "Lgt0/c$c;", "Lgt0/c$d;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gt0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC40735c {

    /* compiled from: CalendarContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgt0/c$a;", "Lgt0/c;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gt0.c$a */
    public static final class a implements InterfaceC40735c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f396915a = new a();
    }

    /* compiled from: CalendarContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgt0/c$b;", "Lgt0/c;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gt0.c$b */
    public static final /* data */ class b implements InterfaceC40735c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DayItem f396916a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f396917b;

        public b(@k DayItem dayItem, @l Integer num) {
            this.f396916a = dayItem;
            this.f396917b = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f396916a, bVar.f396916a) && L.f(this.f396917b, bVar.f396917b);
        }

        public final int hashCode() {
            int iHashCode = this.f396916a.hashCode() * 31;
            Integer num = this.f396917b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ForceUpdateSelectedDay(selectedDay=");
            sb2.append(this.f396916a);
            sb2.append(", scheduleScrollOffset=");
            return s.j(sb2, this.f396917b, ')');
        }
    }

    /* compiled from: CalendarContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgt0/c$c;", "Lgt0/c;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gt0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11234c implements InterfaceC40735c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f396918a;

        public C11234c(@k DeepLink deepLink) {
            this.f396918a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11234c) && L.f(this.f396918a, ((C11234c) obj).f396918a);
        }

        public final int hashCode() {
            return this.f396918a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("LaunchDeepLink(deepLink="), this.f396918a, ')');
        }
    }

    /* compiled from: CalendarContentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgt0/c$d;", "Lgt0/c;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gt0.c$d */
    public static final /* data */ class d implements InterfaceC40735c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396919a;

        public d(@k String str) {
            this.f396919a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f396919a, ((d) obj).f396919a);
        }

        public final int hashCode() {
            return this.f396919a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(message="), this.f396919a, ')');
        }
    }
}
