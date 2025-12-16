package com.avito.android.advert.item.fmp.calculator;

import com.avito.android.advert.item.fmp.banner.analytics.FMPSensitiveDataEvent;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.fmp.AnalyticsEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsFmpCalculatorPresenter.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j {
    public static final com.avito.android.analytics.provider.clickstream.a a(AnalyticsEvent analyticsEvent) {
        Map<String, Object> params = analyticsEvent.getParams();
        if (params == null) {
            params = P0.c();
        }
        Map<String, Object> map = params;
        return map.isEmpty() ? new com.avito.android.analytics.provider.clickstream.b((int) analyticsEvent.getId(), (int) analyticsEvent.getVersion()) : L.f(analyticsEvent.getHasSensitiveData(), Boolean.TRUE) ? new FMPSensitiveDataEvent((int) analyticsEvent.getId(), (int) analyticsEvent.getVersion(), map) : new ParametrizedClickStreamEvent((int) analyticsEvent.getId(), (int) analyticsEvent.getVersion(), map, null, 8, null);
    }
}
