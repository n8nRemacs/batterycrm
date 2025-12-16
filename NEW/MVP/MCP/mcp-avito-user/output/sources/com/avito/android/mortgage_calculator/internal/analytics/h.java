package com.avito.android.mortgage_calculator.internal.analytics;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.mortgage_calculator.internal.mvi.entity.state.basis.CalculatorTabType;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: CalculatorAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/analytics/h;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f204295b;

    public h(@Y61.l String str, @Y61.l String str2, long j12, @Y61.k String str3, @Y61.k CalculatorTabType calculatorTabType) {
        this.f204295b = new ParametrizedClickStreamEvent(10305, 2, C35755b0.c(P0.g(new Q("iid", str), new Q("from_page", str2), new Q("mortgage_house_cost", Long.valueOf(j12)), new Q("mortgage_calculator_property_type", str3), new Q("mortgage_calculator_calculation_type", calculatorTabType.f204624b))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF327516b() {
        return this.f204295b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f204295b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF327517c() {
        return this.f204295b.f90248c;
    }
}
