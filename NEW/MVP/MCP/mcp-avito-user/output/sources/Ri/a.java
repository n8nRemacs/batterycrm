package RI;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.ButtonAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LRI/a;", "", "a", "b", "LRI/a$a;", "LRI/a$b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {

    /* compiled from: HotelBookingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRI/a$a;", "LRI/a;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: RI.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0947a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0947a f14263a = new C0947a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0947a);
        }

        public final int hashCode() {
            return 264391173;
        }

        @k
        public final String toString() {
            return "Available";
        }
    }

    /* compiled from: HotelBookingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/a$b;", "LRI/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f14264a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f14265b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ButtonAction f14266c;

        public b(@l String str, @l String str2, @l ButtonAction buttonAction) {
            this.f14264a = str;
            this.f14265b = str2;
            this.f14266c = buttonAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f14264a, bVar.f14264a) && L.f(this.f14265b, bVar.f14265b) && L.f(this.f14266c, bVar.f14266c);
        }

        public final int hashCode() {
            String str = this.f14264a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f14265b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ButtonAction buttonAction = this.f14266c;
            return iHashCode2 + (buttonAction != null ? buttonAction.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Unavailable(title=");
            sb2.append(this.f14264a);
            sb2.append(", subtitle=");
            sb2.append(this.f14265b);
            sb2.append(", button=");
            return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.f14266c, ')');
        }
    }
}
