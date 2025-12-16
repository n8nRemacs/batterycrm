package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ShowMainPromoHeaderEvent.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/V0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class V0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f89990b;

    public V0(@Y61.l String str, @Y61.l String str2) {
        HashMap map = new HashMap();
        if (str != null) {
            map.put("target_page", str);
        }
        if (str2 != null) {
            map.put("attr_title", str2);
        }
        map.put("from_page", "main");
        kotlin.G0 g02 = kotlin.G0.f406611a;
        this.f89990b = new ParametrizedClickStreamEvent(11429, 1, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF6279b() {
        return this.f89990b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f89990b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF6280c() {
        return this.f89990b.f90248c;
    }
}
