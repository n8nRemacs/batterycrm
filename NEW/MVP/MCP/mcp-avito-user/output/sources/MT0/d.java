package mt0;

import Y61.k;
import Y61.l;
import com.akita.compose.component.accordion.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalendarState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lmt0/d;", "", "a", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f414789c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final d f414790d = new d(C42784z0.f406748b, null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<com.avito.android.service_booking_calendar.a> f414791a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f414792b;

    /* compiled from: CalendarState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt0/d$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k List<? extends com.avito.android.service_booking_calendar.a> list, @l Integer num) {
        this.f414791a = list;
        this.f414792b = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f414791a, dVar.f414791a) && L.f(this.f414792b, dVar.f414792b);
    }

    public final int hashCode() {
        int iHashCode = this.f414791a.hashCode() * 31;
        Integer num = this.f414792b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarState(calendarItems=");
        sb2.append(this.f414791a);
        sb2.append(", scrollTo=");
        return s.j(sb2, this.f414792b, ')');
    }
}
