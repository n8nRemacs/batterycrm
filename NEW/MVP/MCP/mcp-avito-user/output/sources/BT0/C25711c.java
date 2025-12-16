package bt0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.service_booking_calendar.domain.TimeSlotItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DayScheduleState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lbt0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bt0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C25711c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f57523f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C25711c f57524g = new C25711c(true, null, null, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f57525b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f57526c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<TimeSlotItem> f57527d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final com.avito.android.service_booking_calendar.domain.b f57528e;

    /* compiled from: DayScheduleState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbt0/c$a;", "", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bt0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C25711c(boolean z12, @l String str, @l List<? extends TimeSlotItem> list, @l com.avito.android.service_booking_calendar.domain.b bVar) {
        this.f57525b = z12;
        this.f57526c = str;
        this.f57527d = list;
        this.f57528e = bVar;
    }

    public static C25711c a(C25711c c25711c, String str, int i12) {
        boolean z12 = (i12 & 1) != 0 ? c25711c.f57525b : false;
        if ((i12 & 2) != 0) {
            str = c25711c.f57526c;
        }
        List<TimeSlotItem> list = c25711c.f57527d;
        com.avito.android.service_booking_calendar.domain.b bVar = c25711c.f57528e;
        c25711c.getClass();
        return new C25711c(z12, str, list, bVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25711c)) {
            return false;
        }
        C25711c c25711c = (C25711c) obj;
        return this.f57525b == c25711c.f57525b && L.f(this.f57526c, c25711c.f57526c) && L.f(this.f57527d, c25711c.f57527d) && L.f(this.f57528e, c25711c.f57528e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f57525b) * 31;
        String str = this.f57526c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<TimeSlotItem> list = this.f57527d;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        com.avito.android.service_booking_calendar.domain.b bVar = this.f57528e;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "DayScheduleState(isLoading=" + this.f57525b + ", error=" + this.f57526c + ", timeSlots=" + this.f57527d + ", scheduleInfo=" + this.f57528e + ')';
    }
}
