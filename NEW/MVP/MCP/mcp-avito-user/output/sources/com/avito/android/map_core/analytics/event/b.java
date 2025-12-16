package com.avito.android.map_core.analytics.event;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ClearGeoFiltersEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/analytics/event/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f185609b;

    public b(@Y61.k SearchParams searchParams, @Y61.k String str) {
        HashMap map = new HashMap();
        List<String> directionId = searchParams.getDirectionId();
        if (directionId != null) {
            map.put("roads", directionId);
        }
        List<String> metroIds = searchParams.getMetroIds();
        if (metroIds != null) {
            map.put(MetroParameter.TYPE, metroIds);
        }
        List<String> districtId = searchParams.getDistrictId();
        if (districtId != null) {
            map.put("did", districtId);
        }
        map.put("x", str);
        G0 g02 = G0.f406611a;
        this.f185609b = new ParametrizedClickStreamEvent(4091, 0, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f185609b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f185609b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f185609b.f90248c;
    }
}
