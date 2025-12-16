package CN;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: GeoFilterApplyEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCN/g;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f2112b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f2113c;

    public g() {
        throw null;
    }

    public g(String str, String str2, List list, int i12, C42822w c42822w) {
        str2 = (i12 & 2) != 0 ? null : str2;
        this.f2112b = new com.avito.android.analytics.provider.clickstream.b(6556, 2);
        this.f2113c = P0.j(new Q("cid", str == null ? "" : str), new Q("mcid", str2 == null ? "" : str2), new Q("filter_value", list));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f2112b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2113c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f2112b.f90263c;
    }
}
