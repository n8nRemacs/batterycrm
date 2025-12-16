package hu0;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.service_booking_utils.events.FromPageType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: SbShowNumberClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhu0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hu0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41168b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f398288b;

    public C41168b(@k String str, @k FromPageType fromPageType) {
        this.f398288b = new ParametrizedClickStreamEvent(16552, 1, P0.g(new Q("orderid", str), new Q("from_page", fromPageType.f278336b)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f398288b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f398288b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f398288b.f90248c;
    }
}
