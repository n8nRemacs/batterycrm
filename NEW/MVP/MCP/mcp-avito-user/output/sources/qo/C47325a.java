package qO;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BuildRouteEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqO/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qO.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47325a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<String> f429264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f429265c;

    public C47325a(@k String str, @l List<String> list) {
        this.f429264b = list;
        HashMap map = new HashMap();
        if (list != null) {
            map.put("geo", list);
        }
        map.put("iid", str);
        G0 g02 = G0.f406611a;
        this.f429265c = new ParametrizedClickStreamEvent(5577, 1, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f429265c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f429265c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f429265c.f90248c;
    }

    public /* synthetic */ C47325a(String str, List list, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : list);
    }
}
