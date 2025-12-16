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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/analytics/p;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p implements com.avito.android.analytics.provider.clickstream.a, cc.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f199535b;

    public p(@Y61.l String str, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4, @Y61.l Integer num5, @Y61.l Integer num6, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.k String str9) {
        this.f199535b = new ParametrizedClickStreamEvent(10781, 2, C35755b0.c(P0.g(new Q("mortgage_goal", str), new Q("mortgage_region", num), new Q("mortgage_cost", num2), new Q("mortgage_init_payment", num3), new Q("mortgage_loan_term", num4), new Q("mortgage_land_cost", num5), new Q("mortgage_house_cost", num6), new Q("mortgage_program_type", str2), new Q("mortgage_income_proof", str3), new Q("mortgage_age", str4), new Q("mortgage_last_exp", str5), new Q("mortgage_overall_exp", str6), new Q("mortgage_employment_type", str7), new Q("mortgage_business_age", str8), new Q("from_page", str9))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f199535b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f199535b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f199535b.f90248c;
    }
}
