package CN;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: CategoryNodesSelectEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCN/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f2108b = new com.avito.android.analytics.provider.clickstream.b(5759, 1);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f2109c;

    public c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        this.f2109c = P0.j(new Q("cid", str), new Q("mcid", str2), new Q("filter_name", str3));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF6279b() {
        return this.f2108b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2109c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF6280c() {
        return this.f2108b.f90263c;
    }
}
