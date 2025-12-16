package com.avito.android.mortgage.landing.analytics;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: LandingAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/analytics/s;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s implements com.avito.android.analytics.provider.clickstream.a, cc.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f199538b;

    public s(@Y61.k String str, double d12, int i12, int i13, boolean z12, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10, @Y61.l ArrayList arrayList, @Y61.l ArrayList arrayList2, @Y61.l ArrayList arrayList3, @Y61.k String str11, @Y61.l ArrayList arrayList4, @Y61.k String str12) {
        this.f199538b = new ParametrizedClickStreamEvent(9615, 4, "Mortgage / Калькулятор / клик на галку в Выборе банка", C35755b0.c(P0.g(new Q("mortgage_bank", str), new Q("interest_rate", Double.valueOf(d12)), new Q("payment_int", Integer.valueOf(i12)), new Q("income", Integer.valueOf(i13)), new Q("is_turn_on", Boolean.valueOf(z12)), new Q("mortgage_badges", str2), new Q("mortgage_base_rate", str3), new Q("mortgage_goal", str4), new Q("mortgage_region", str5), new Q("mortgage_cost", str6), new Q("mortgage_init_payment", str7), new Q("mortgage_loan_term", str8), new Q("mortgage_land_cost", str9), new Q("mortgage_house_cost", str10), new Q("mortgage_bank_list", arrayList), new Q("mortgage_payment_list", arrayList2), new Q("mortgage_rate_list", arrayList3), new Q("mortgage_bank_offers_num", Integer.valueOf(arrayList.size())), new Q("mortgage_badges_list", str11), new Q("mortgage_base_rates_list", arrayList4), new Q("from_page", str12))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f199538b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f199538b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f199538b.f90248c;
    }
}
