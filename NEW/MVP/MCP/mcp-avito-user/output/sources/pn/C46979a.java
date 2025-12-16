package pN;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ImvSimilarAdvertsEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpN/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pN.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C46979a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f428507b;

    public C46979a(@l Long l12, @l Long l13, @k String str, @k String str2, long j12, boolean z12) {
        this.f428507b = new ParametrizedClickStreamEvent(6146, 3, C35755b0.c(P0.g(new Q("iid", l13), new Q("categoryid", l12), new Q("esid", str), new Q("from_page", str2), new Q("items_count", Long.valueOf(j12)), new Q("is_error", Boolean.valueOf(z12)))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f428507b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428507b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f428507b.f90248c;
    }
}
