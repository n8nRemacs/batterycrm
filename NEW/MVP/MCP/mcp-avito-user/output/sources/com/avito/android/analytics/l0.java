package com.avito.android.analytics;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: StartDateSelectionEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/l0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f90227b;

    public l0(@Y61.k String str, @Y61.k String str2) {
        this.f90227b = new ParametrizedClickStreamEvent(5321, 0, P0.g(new kotlin.Q("iid", str), new kotlin.Q(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, str2)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f90227b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90227b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f90227b.f90248c;
    }
}
