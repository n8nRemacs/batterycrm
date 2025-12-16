package VI;

import Y61.k;
import Y61.l;
import com.avito.android.hotel_booking.Value;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectSingleValueOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LVI/b;", "", "a", "b", "LVI/b$a;", "LVI/b$b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: SelectSingleValueOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVI/b$a;", "LVI/b;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f17052a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1590480925;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: SelectSingleValueOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVI/b$b;", "LVI/b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: VI.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1171b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Value f17053a;

        public C1171b(@k Value value) {
            this.f17053a = value;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1171b) && L.f(this.f17053a, ((C1171b) obj).f17053a);
        }

        public final int hashCode() {
            return this.f17053a.hashCode();
        }

        @k
        public final String toString() {
            return "CloseWithResult(selectedValue=" + this.f17053a + ')';
        }
    }
}
