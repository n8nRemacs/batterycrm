package com.avito.android.analytics;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: ParametrizedEvents.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_analytics_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a0 {
    @Y61.k
    public static final ParametrizedClickStreamEvent a(@Y61.k ParametrizedEvent parametrizedEvent) {
        int id2 = parametrizedEvent.getId();
        int version = parametrizedEvent.getVersion();
        Map<String, Object> parameters = parametrizedEvent.getParameters();
        if (parameters == null) {
            parameters = P0.c();
        }
        return new ParametrizedClickStreamEvent(id2, version, parameters, null, 8, null);
    }
}
