package SI;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.hotel_booking.RadioItem;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: SelectRadioAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSI/b;", "LSI/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f14889a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f14889a = interfaceC28373a;
    }

    @Override // SI.a
    public final void a(@k ParametrizedEvent parametrizedEvent, @l RadioItem radioItem) {
        Map<String, Object> parameters = parametrizedEvent.getParameters();
        if (parameters == null) {
            parameters = P0.c();
        }
        Map<String, String> mapC = radioItem != null ? radioItem.c() : null;
        if (mapC == null) {
            mapC = P0.c();
        }
        this.f14889a.c(a0.a(ParametrizedEvent.copy$default(parametrizedEvent, 0, 0, P0.k(parameters, mapC), 3, null)));
    }
}
