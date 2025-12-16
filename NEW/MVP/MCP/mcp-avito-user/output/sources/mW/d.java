package mW;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: HomeRequestWithUserLocationEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmW/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<String> f414548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414549c;

    public d(@l String str, @l Integer num, @k List list, @l String str2) {
        this.f414548b = list;
        HashMap mapE = P0.e(new Q("geo", list));
        if (str != null) {
            mapE.put("lid", str);
        }
        if (str2 != null) {
            mapE.put("from_page", str2);
        }
        if (num != null) {
            mapE.put("coordinates_resolve_time", Integer.valueOf(num.intValue()));
        }
        G0 g02 = G0.f406611a;
        this.f414549c = new ParametrizedClickStreamEvent(3508, 3, mapE, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f414549c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414549c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f414549c.f90248c;
    }

    public /* synthetic */ d(List list, String str, String str2, Integer num, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? null : str, (i12 & 8) != 0 ? null : num, list, (i12 & 4) != 0 ? null : str2);
    }
}
