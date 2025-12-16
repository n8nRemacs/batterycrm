package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: DeliveryReturnPolicyToggleEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/P;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class P implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2408b;

    public P(@Y61.l String str, @Y61.k kotlin.Q<String, String> q12, boolean z12) {
        this.f2408b = new ParametrizedClickStreamEvent(7395, 5, kotlin.collections.P0.g(q12, new kotlin.Q("uid", str == null ? "" : str), new kotlin.Q("ida", Boolean.valueOf(z12)), new kotlin.Q("business_platform", "3")), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f2408b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2408b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f2408b.f90248c;
    }
}
