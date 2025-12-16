package TI;

import Y61.k;
import Y61.l;
import com.avito.android.hotel_booking.RadioItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectRadioOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LTI/b;", "", "a", "b", "LTI/b$a;", "LTI/b$b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: SelectRadioOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTI/b$a;", "LTI/b;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f15517a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 420513566;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: SelectRadioOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTI/b$b;", "LTI/b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: TI.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1056b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final RadioItem f15518a;

        public C1056b(@k RadioItem radioItem) {
            this.f15518a = radioItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1056b) && L.f(this.f15518a, ((C1056b) obj).f15518a);
        }

        public final int hashCode() {
            return this.f15518a.hashCode();
        }

        @k
        public final String toString() {
            return "CloseWithResult(selectedItem=" + this.f15518a + ')';
        }
    }
}
