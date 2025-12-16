package com.avito.android.remote_toggles_fetcher.analytics;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ToggleStateChangeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote_toggles_fetcher/analytics/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_remote-toggles-fetcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f254433b;

    public d(String str, long j12, String str2, boolean z12, String str3, int i12, C42822w c42822w) {
        this.f254433b = new ParametrizedClickStreamEvent(10041, 1, P0.j(new Q("app_start_random_id", str), new Q("feature_toggle_timestamp", Long.valueOf(j12)), new Q("toggle_state_change_type", (i12 & 16) != 0 ? "write-new-value" : str3), new Q("toggle_name", str2), new Q("toggle_value", String.valueOf(z12))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f254433b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f254433b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f254433b.f90248c;
    }
}
