package com.avito.android.mortgage.landing.analytics;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: LandingAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/analytics/L;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class L implements com.avito.android.analytics.provider.clickstream.a, cc.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f199516b;

    public L(@Y61.l String str, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4, @Y61.l Integer num5, @Y61.l Integer num6, @Y61.k String str2) {
        this.f199516b = new ParametrizedClickStreamEvent(12314, 1, "Mortgage / Ипотечный лендинг / Показ баннера", C35755b0.c(P0.g(new Q("banner_id", "mortgage_exclusive_discount_promo"), new Q("mortgage_goal", str), new Q("mortgage_region", num), new Q("mortgage_cost", num2), new Q("mortgage_init_payment", num3), new Q("mortgage_loan_term", num4), new Q("mortgage_land_cost", num5), new Q("mortgage_house_cost", num6), new Q("from_page", str2))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f199516b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f199516b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f199516b.f90248c;
    }
}
