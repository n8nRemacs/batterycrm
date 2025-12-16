package com.avito.android.remote_toggles_fetcher.analytics;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ApplicationStateChangeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote_toggles_fetcher/analytics/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_remote-toggles-fetcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f254430b;

    public a(long j12, @k String str, boolean z12, boolean z13) {
        this.f254430b = new ParametrizedClickStreamEvent(10042, 2, P0.j(new Q("app_start_random_id", str), new Q("feature_toggle_timestamp", Long.valueOf(j12)), new Q("app_state", z12 ? "foreground" : BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND), new Q("is_screen_locked", Boolean.valueOf(z13))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f254430b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f254430b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f254430b.f90248c;
    }
}
