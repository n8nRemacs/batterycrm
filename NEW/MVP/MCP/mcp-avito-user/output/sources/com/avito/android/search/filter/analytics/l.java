package com.avito.android.search.filter.analytics;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: SectionedFilterUsageEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/analytics/l;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f262657b;

    public l(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("filter_name", str));
        if (str2 != null) {
        }
        if (str3 != null) {
            linkedHashMapJ.put("lid", str3);
        }
        this.f262657b = new ParametrizedClickStreamEvent(4136, 1, "Пользовательские события / Фильтры / Использование секционного фильтра", linkedHashMapJ);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f262657b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f262657b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f262657b.f90248c;
    }
}
