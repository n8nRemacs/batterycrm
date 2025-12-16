package Fs0;

import Y61.k;
import Y61.l;
import com.avito.android.service_booking.remote.result.ServiceBookingError;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingNavigationState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFs0/d;", "", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Map<String, Map<String, Set<Object>>> f6007a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ServiceBookingError f6008b;

    public d(@k Map<String, Map<String, Set<Object>>> map, @l ServiceBookingError serviceBookingError) {
        this.f6007a = map;
        this.f6008b = serviceBookingError;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f6007a, dVar.f6007a) && L.f(this.f6008b, dVar.f6008b);
    }

    public final int hashCode() {
        int iHashCode = this.f6007a.hashCode() * 31;
        ServiceBookingError serviceBookingError = this.f6008b;
        return iHashCode + (serviceBookingError == null ? 0 : serviceBookingError.hashCode());
    }

    @k
    public final String toString() {
        return "ServiceBookingNavigationState(steps=" + this.f6007a + ", lastStepCustomError=" + this.f6008b + ')';
    }
}
