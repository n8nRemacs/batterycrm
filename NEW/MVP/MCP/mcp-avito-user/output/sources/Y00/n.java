package Y00;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: MortgageRootAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LY00/n;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements com.avito.android.analytics.provider.clickstream.a, cc.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f19237b;

    public n(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Float f12, @Y61.l Integer num4) {
        this.f19237b = new ParametrizedClickStreamEvent(16640, 3, C35755b0.c(P0.g(new Q("mortgage_request_id", str), new Q("current_mortgage_stage", str2), new Q("mortgage_bank", str3), new Q("mortgage_bank_decision_status", str4), new Q("mortgage_cost", num), new Q("mortgage_init_payment", num2), new Q("mortgage_payment_varchar_list", num3), new Q("mortgage_base_rate", f12), new Q("mortgage_loan_term", num4))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f19237b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f19237b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f19237b.f90248c;
    }
}
