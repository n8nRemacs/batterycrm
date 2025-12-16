package MI;

import Y61.k;
import Y61.l;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.hotel.model.HotelBookingInputItem;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.Collections;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: HotelBookingAnalyticsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMI/b;", "LMI/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f10545a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f10546b;

    @Inject
    public b(@k E e12, @k InterfaceC28373a interfaceC28373a) {
        this.f10545a = interfaceC28373a;
        this.f10546b = e12.a();
    }

    @Override // MI.a
    public final void a(@l String str, @k ParametrizedEvent parametrizedEvent) {
        if (str == null) {
            str = "";
        }
        Map mapSingletonMap = Collections.singletonMap("button_name", str);
        Map<String, Object> parameters = parametrizedEvent.getParameters();
        if (parameters == null) {
            parameters = P0.c();
        }
        this.f10545a.c(a0.a(ParametrizedEvent.copy$default(parametrizedEvent, 0, 0, P0.k(parameters, mapSingletonMap), 3, null)));
    }

    @Override // MI.a
    public final void b(@k String str) {
        this.f10545a.c(new NI.a(str, this.f10546b));
    }

    @Override // MI.a
    public final void c(@k HotelBookingInputItem hotelBookingInputItem) {
        ParametrizedEvent onChangeEvent = hotelBookingInputItem.getOnChangeEvent();
        if (onChangeEvent == null) {
            return;
        }
        String errorMessage = hotelBookingInputItem.getErrorMessage();
        Map mapSingletonMap = errorMessage != null ? Collections.singletonMap("validation_error", errorMessage) : null;
        Map<String, Object> parameters = onChangeEvent.getParameters();
        if (parameters == null) {
            parameters = P0.c();
        }
        if (mapSingletonMap == null) {
            mapSingletonMap = P0.c();
        }
        this.f10545a.c(a0.a(ParametrizedEvent.copy$default(onChangeEvent, 0, 0, P0.k(parameters, mapSingletonMap), 3, null)));
    }

    @Override // MI.a
    public final void q(@k ParametrizedEvent parametrizedEvent) {
        this.f10545a.c(a0.a(parametrizedEvent));
    }
}
