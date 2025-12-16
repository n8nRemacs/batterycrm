package com.avito.android.analytics.event;

import com.avito.android.analytics.event.MapType;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.PresentationType;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ShowSearchMapEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/Y0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Y0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f90005b;

    public Y0(@Y61.k PresentationType presentationType) {
        MapType mapType;
        MapType.f89961c.getClass();
        switch (MapType.a.C2670a.f89969a[presentationType.ordinal()]) {
            case 1:
                mapType = MapType.f89962d;
                break;
            case 2:
                mapType = MapType.f89963e;
                break;
            case 3:
                mapType = MapType.f89964f;
                break;
            case 4:
            case 5:
            case 6:
                mapType = MapType.f89965g;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f90005b = new ParametrizedClickStreamEvent(3571, 1, Collections.singletonMap("map_type", mapType.f89968b), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f90005b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90005b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f90005b.f90248c;
    }
}
