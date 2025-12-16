package IG0;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: UpdateSourceEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIG0/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_update-source_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f8060b;

    public d(@k String str, @k String str2, @k String str3) {
        this.f8060b = new ParametrizedClickStreamEvent(13274, 1, P0.g(new Q("app_version", str3), new Q("app_version_code", str2), new Q("update_source", str)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f8060b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f8060b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f8060b.f90248c;
    }
}
