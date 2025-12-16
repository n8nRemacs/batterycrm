package CN;

import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: InlineFiltersGeoOnboardingShownEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCN/n;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f2124b = new com.avito.android.analytics.provider.clickstream.b(9769, 1);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f2125c;

    public n(@Y61.l String str) {
        this.f2125c = C35755b0.c(P0.j(new Q("cid", str)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF222438b() {
        return this.f2124b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2125c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF222439c() {
        return this.f2124b.f90263c;
    }
}
