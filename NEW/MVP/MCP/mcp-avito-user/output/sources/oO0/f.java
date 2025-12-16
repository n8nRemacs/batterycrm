package Oo0;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.text.C43066x;

/* compiled from: SbcApplyDispatchNavigationToPaymentEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOo0/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f12539b;

    public f(@Y61.l String str, @Y61.k String str2, @Y61.l Long l12, @Y61.l Long l13, @Y61.l Long l14, @Y61.k String str3, @Y61.l Long l15, @Y61.k String str4, @Y61.l Long l16, @Y61.l Long l17, @Y61.k String str5) {
        this.f12539b = new ParametrizedClickStreamEvent(14385, 2, "Спецпредложения/ Переход к оплате\n", C35755b0.c(P0.g(new Q("uid", str != null ? C43066x.z0(str) : null), new Q("item_id", str2), new Q(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, str5), new Q("msg_sbc_id", l12), new Q("sbc_end_time", l14), new Q("sbc_from", str3), new Q("sbc_automatic_dispatch_budget", l15), new Q("sbc_automatic_dispatch_ttl", l13), new Q("sbc_offer_type", str4), new Q("sbc_discount_amount", l16), new Q("sbc_filter_buyers", l17))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f12539b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f12539b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f12539b.f90248c;
    }
}
