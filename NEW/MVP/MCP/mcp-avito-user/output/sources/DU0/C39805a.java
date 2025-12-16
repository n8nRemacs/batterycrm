package du0;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockActionData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlockData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldu0/a;", "", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: du0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C39805a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final ServiceBookingBlockActionData f394170a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f394171b;

    public C39805a(@l ServiceBookingBlockActionData serviceBookingBlockActionData, @k ArrayList arrayList) {
        this.f394170a = serviceBookingBlockActionData;
        this.f394171b = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39805a)) {
            return false;
        }
        C39805a c39805a = (C39805a) obj;
        return L.f(this.f394170a, c39805a.f394170a) && this.f394171b.equals(c39805a.f394171b);
    }

    public final int hashCode() {
        ServiceBookingBlockActionData serviceBookingBlockActionData = this.f394170a;
        return this.f394171b.hashCode() + ((serviceBookingBlockActionData == null ? 0 : serviceBookingBlockActionData.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingBlockData(action=");
        sb2.append(this.f394170a);
        sb2.append(", items=");
        return e.p(sb2, this.f394171b, ')');
    }
}
