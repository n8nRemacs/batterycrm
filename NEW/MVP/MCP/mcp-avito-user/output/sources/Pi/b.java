package PI;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.Collections;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: EnterDataAnalyticsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPI/b;", "LPI/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f12949a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f12950b;

    @Inject
    public b(@k Context context, @k InterfaceC28373a interfaceC28373a) {
        this.f12949a = interfaceC28373a;
        this.f12950b = context;
    }

    @Override // PI.a
    public final void a(@k ParametrizedEvent parametrizedEvent, @l PrintableText printableText) {
        Map<String, Object> parameters = parametrizedEvent.getParameters();
        if (parameters == null) {
            parameters = P0.c();
        }
        Map mapSingletonMap = printableText != null ? Collections.singletonMap("validation_error", printableText.k0(this.f12950b)) : null;
        if (mapSingletonMap == null) {
            mapSingletonMap = P0.c();
        }
        this.f12949a.c(a0.a(ParametrizedEvent.copy$default(parametrizedEvent, 0, 0, P0.k(parameters, mapSingletonMap), 3, null)));
    }
}
