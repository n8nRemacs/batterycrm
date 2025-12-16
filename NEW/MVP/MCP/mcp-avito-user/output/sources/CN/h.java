package CN;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: InlineFilterClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCN/h;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f2114b = new com.avito.android.analytics.provider.clickstream.b(4159, 2);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f2115c;

    public h(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5) {
        this.f2115c = P0.j(new Q("filter_name", str2), new Q("filter_id", str3), new Q("cid", str), new Q("user_key", str4 == null ? "" : str4), new Q("from_page", str5 == null ? "" : str5));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f2114b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2115c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f2114b.f90263c;
    }
}
