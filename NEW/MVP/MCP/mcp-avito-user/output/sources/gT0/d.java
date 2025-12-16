package gt0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalendarContentState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lgt0/d;", "", "a", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f396920f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final d f396921g = new d(true, null, null, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f396922a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PrintableText f396923b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DayItem f396924c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f396925d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f396926e;

    /* compiled from: CalendarContentState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgt0/d$a;", "", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(boolean z12, @l PrintableText printableText, @l DayItem dayItem, @l Integer num, @l String str) {
        this.f396922a = z12;
        this.f396923b = printableText;
        this.f396924c = dayItem;
        this.f396925d = num;
        this.f396926e = str;
    }

    public static d a(d dVar, boolean z12, PrintableText printableText, DayItem dayItem, Integer num, String str, int i12) {
        if ((i12 & 1) != 0) {
            z12 = dVar.f396922a;
        }
        boolean z13 = z12;
        if ((i12 & 2) != 0) {
            printableText = dVar.f396923b;
        }
        PrintableText printableText2 = printableText;
        if ((i12 & 4) != 0) {
            dayItem = dVar.f396924c;
        }
        DayItem dayItem2 = dayItem;
        if ((i12 & 8) != 0) {
            num = dVar.f396925d;
        }
        Integer num2 = num;
        if ((i12 & 16) != 0) {
            str = dVar.f396926e;
        }
        dVar.getClass();
        return new d(z13, printableText2, dayItem2, num2, str);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f396922a == dVar.f396922a && L.f(this.f396923b, dVar.f396923b) && L.f(this.f396924c, dVar.f396924c) && L.f(this.f396925d, dVar.f396925d) && L.f(this.f396926e, dVar.f396926e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f396922a) * 31;
        PrintableText printableText = this.f396923b;
        int iHashCode2 = (iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31;
        DayItem dayItem = this.f396924c;
        int iHashCode3 = (iHashCode2 + (dayItem == null ? 0 : dayItem.hashCode())) * 31;
        Integer num = this.f396925d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f396926e;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarContentState(isLoading=");
        sb2.append(this.f396922a);
        sb2.append(", error=");
        sb2.append(this.f396923b);
        sb2.append(", selectedDay=");
        sb2.append(this.f396924c);
        sb2.append(", scheduleScrollOffset=");
        sb2.append(this.f396925d);
        sb2.append(", todayText=");
        return C22026a.c(sb2, this.f396926e, ')');
    }
}
