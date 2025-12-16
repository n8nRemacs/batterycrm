package QI;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.hotel_booking.Group;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EnterDataOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LQI/b;", "", "a", "b", "LQI/b$a;", "LQI/b$b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: EnterDataOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQI/b$a;", "LQI/b;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f13661a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -525575288;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: EnterDataOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQI/b$b;", "LQI/b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: QI.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0897b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<Group> f13662a;

        public C0897b(@k List<Group> list) {
            this.f13662a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0897b) && L.f(this.f13662a, ((C0897b) obj).f13662a);
        }

        public final int hashCode() {
            return this.f13662a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("CloseWithResult(enteredGroups="), this.f13662a, ')');
        }
    }
}
