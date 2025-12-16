package pC;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: RemoveFromFavoritesEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpC/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Map<String, String> f428265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f428266c;

    public d(@k String str, @k String str2, @l String str3, @l String str4, @l String str5, @l Map map, boolean z12) {
        this.f428265b = map;
        this.f428266c = new ParametrizedClickStreamEvent(3188, 15, P0.k(C35755b0.c(P0.j(new Q("is_auth", Boolean.valueOf(z12)), new Q("iid", str), new Q("s", str2), new Q("context", str3), new Q("x", C35800g5.b(new C35792f5(str3))), new Q("from_page", str4), new Q("from_space", str5))), map == null ? P0.c() : map), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f428266c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428266c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f428266c.f90248c;
    }
}
