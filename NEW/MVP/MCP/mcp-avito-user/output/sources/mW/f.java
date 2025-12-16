package mW;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: LocationNotificationShownEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmW/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414551b;

    public f(@l String str, @l String str2, @l String str3, @k String str4) {
        HashMap map = new HashMap();
        if (str2 != null) {
            map.put("lid", str2);
        }
        if (str != null) {
            map.put(SearchParamsConverterKt.LOCATION_ID, str);
        }
        if (str3 != null) {
            map.put("geo_session", str3);
        }
        map.put("laas_tooltip_type", str4);
        G0 g02 = G0.f406611a;
        this.f414551b = new ParametrizedClickStreamEvent(4183, 1, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f414551b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414551b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f414551b.f90248c;
    }

    public /* synthetic */ f(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, str4);
    }
}
