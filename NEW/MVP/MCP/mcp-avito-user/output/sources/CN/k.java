package CN;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: InlineFilterSelectEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCN/k;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f2118b = new com.avito.android.analytics.provider.clickstream.b(4196, 6);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f2119c;

    public k(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k List list, @Y61.k ArrayList arrayList, boolean z12, @Y61.l String str4, @Y61.l String str5) {
        this.f2119c = P0.j(new Q("filter_name", str2), new Q("filter_id", str3), new Q("cid", str), new Q("filter_value_names", list), new Q("filter_value_ids", arrayList), new Q("change_inline", Boolean.valueOf(z12)), new Q("user_key", str4 == null ? "" : str4), new Q("from_page", str5 == null ? "" : str5));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f2118b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2119c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f2118b.f90263c;
    }
}
