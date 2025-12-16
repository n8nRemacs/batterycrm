package Tt0;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.service_booking_settings.work_hours.analytics.events.FromPage;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: WorkHoursCloseEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTt0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tt0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15405a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f15964b;

    public C15405a(@k FromPage fromPage) {
        this.f15964b = new ParametrizedClickStreamEvent(7348, 1, Collections.singletonMap("from_page", fromPage), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        return this.f15964b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f15964b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF11770c() {
        return this.f15964b.f90248c;
    }
}
