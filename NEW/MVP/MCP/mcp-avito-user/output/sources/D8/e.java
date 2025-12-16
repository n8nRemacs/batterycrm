package D8;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ShowIcebreakersEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD8/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2954b;

    public e(@k String str, @l String str2, @l String str3, @k String str4, int i12, @k ArrayList arrayList) {
        this.f2954b = new ParametrizedClickStreamEvent(4209, 3, P0.j(new Q("iid", str), new Q("cid", str2 == null ? "" : str2), new Q("mcid", str3 == null ? "" : str3), new Q("title", str4), new Q("position", Integer.valueOf(i12)), new Q("ice_breakers_ids", arrayList), new Q("s", "item")), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f2954b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f2954b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f2954b.f90248c;
    }
}
