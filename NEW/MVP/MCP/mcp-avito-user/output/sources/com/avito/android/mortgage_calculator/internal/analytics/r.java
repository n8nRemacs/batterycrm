package com.avito.android.mortgage_calculator.internal.analytics;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.mortgage_calculator.internal.mvi.entity.state.basis.CalculatorTabType;
import com.avito.android.util.C35755b0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: CalculatorAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/analytics/r;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r implements com.avito.android.analytics.provider.clickstream.a, cc.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f204305b;

    public r(@Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.l ArrayList arrayList, @Y61.k String str4, @Y61.k CalculatorTabType calculatorTabType, @Y61.k String str5, @Y61.l String str6) {
        this.f204305b = new ParametrizedClickStreamEvent(9595, 3, C35755b0.c(P0.g(new Q("iid", str), new Q("from_page", str2), new Q("mortgage_program_type", str3), new Q("mortgage_badges", arrayList), new Q("mortgage_calculator_property_type", str4), new Q("mortgage_calculator_calculation_type", calculatorTabType.f204624b), new Q("mortgage_program_card_type", str5), new Q("mortgage_critical_case", str6))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f204305b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f204305b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f204305b.f90248c;
    }
}
