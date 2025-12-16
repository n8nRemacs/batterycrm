package M50;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ReAgentSetProfileNameClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LM50/m;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f10408b;

    public m(@Y61.k String str, boolean z12) {
        this.f10408b = new ParametrizedClickStreamEvent(16590, 2, P0.g(new Q("way_to_get_ap", str), new Q("ap_name_success", Boolean.valueOf(z12)), new Q("from_page", "landing"), new Q("business_platform", 3)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f10408b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f10408b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f10408b.f90248c;
    }
}
