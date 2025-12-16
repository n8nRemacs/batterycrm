package hu0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.service_booking_utils.events.FromPageType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: SbShowNumberErrorEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhu0/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hu0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C41169c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f398289b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FromPageType f398290c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f398291d;

    public C41169c(@k String str, @k FromPageType fromPageType) {
        this.f398289b = str;
        this.f398290c = fromPageType;
        this.f398291d = new ParametrizedClickStreamEvent(16612, 1, P0.g(new Q("orderid", str), new Q("from_page", fromPageType.f278336b)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41169c)) {
            return false;
        }
        C41169c c41169c = (C41169c) obj;
        return L.f(this.f398289b, c41169c.f398289b) && this.f398290c == c41169c.f398290c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f398291d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f398291d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f398291d.f90248c;
    }

    public final int hashCode() {
        return this.f398290c.hashCode() + (this.f398289b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "SbShowNumberErrorEvent(orderId=" + this.f398289b + ", fromPage=" + this.f398290c + ')';
    }
}
