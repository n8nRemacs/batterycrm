package Hs0;

import Y61.k;
import Y61.l;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingMviStepCombinedState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHs0/b;", "", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ServiceBookingMviStepState f7798a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AbstractC40048c f7799b;

    public b(@k ServiceBookingMviStepState serviceBookingMviStepState, @l AbstractC40048c abstractC40048c) {
        this.f7798a = serviceBookingMviStepState;
        this.f7799b = abstractC40048c;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f7798a, bVar.f7798a) && L.f(this.f7799b, bVar.f7799b);
    }

    public final int hashCode() {
        int iHashCode = this.f7798a.hashCode() * 31;
        AbstractC40048c abstractC40048c = this.f7799b;
        return iHashCode + (abstractC40048c == null ? 0 : abstractC40048c.hashCode());
    }

    @k
    public final String toString() {
        return "ServiceBookingMviStepCombinedState(nativeState=" + this.f7798a + ", beduinState=" + this.f7799b + ')';
    }

    public /* synthetic */ b(ServiceBookingMviStepState serviceBookingMviStepState, AbstractC40048c abstractC40048c, int i12, C42822w c42822w) {
        this(serviceBookingMviStepState, (i12 & 2) != 0 ? null : abstractC40048c);
    }
}
