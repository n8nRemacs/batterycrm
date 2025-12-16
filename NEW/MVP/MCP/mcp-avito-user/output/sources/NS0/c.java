package Ns0;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.events.SelectSheetEventType;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SelectSheetClickedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNs0/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f11785b;

    public c(@k SelectSheetEventType selectSheetEventType) {
        this.f11785b = new ParametrizedClickStreamEvent(9894, 1, Collections.singletonMap("from_page", selectSheetEventType.f274876b), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        return this.f11785b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f11785b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF11770c() {
        return this.f11785b.f90248c;
    }
}
