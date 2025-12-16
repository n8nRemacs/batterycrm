package com.avito.android.credits.web_logger;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: HomeCreditWebAnalyticsEventLogger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/credits/web_logger/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a, cc.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f129069b;

    public a(ParametrizedClickStreamEvent parametrizedClickStreamEvent) {
        this.f129069b = parametrizedClickStreamEvent;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83096b() {
        return this.f129069b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f129069b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83097c() {
        return this.f129069b.f90248c;
    }
}
