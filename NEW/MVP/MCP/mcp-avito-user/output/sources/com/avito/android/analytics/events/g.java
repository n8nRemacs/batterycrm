package com.avito.android.analytics.events;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import u3.C48781e;

/* compiled from: ExposureEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/events/g;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class g implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u3.m f90158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f90159c;

    public g(@Y61.k u3.m mVar) {
        this.f90158b = mVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C48781e c48781e = mVar.f439748a;
        if (c48781e != null && c48781e.getClientExposure()) {
            linkedHashMap.put("abs", "[" + mVar.f439748a.getAbToken() + ']');
        }
        G0 g02 = G0.f406611a;
        this.f90159c = new ParametrizedClickStreamEvent(2587, 0, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f90159c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90159c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f90159c.f90248c;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExposureEvent(2587) -> abs [");
        C48781e c48781e = this.f90158b.f439748a;
        return C22026a.c(sb2, c48781e != null ? c48781e.getAbToken() : null, ']');
    }
}
