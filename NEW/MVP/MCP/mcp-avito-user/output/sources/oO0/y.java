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

/* compiled from: SendDiscountAutoDispatchCreatedEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOo0/y;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class y implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f12559b;

    public y(@Y61.l String str, @Y61.k String str2, long j12, long j13, @Y61.l Long l12, long j14, long j15, long j16, long j17, @Y61.k String str3) {
        this.f12559b = new ParametrizedClickStreamEvent(13353, 6, "Спецпредложения/Успешное создание авторассылки (frontend)", C35755b0.c(P0.g(new Q("uid", str != null ? C43066x.z0(str) : null), new Q("item_id", C43066x.z0(str2)), new Q(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, str3), new Q("msg_sbc_audience", Long.valueOf(j12)), new Q("sbc_automatic_dispatch_id", Long.valueOf(j13)), new Q("sbc_automatic_dispatch_budget", Long.valueOf(j15)), new Q("sbc_automatic_dispatch_discount_value", l12), new Q("sbc_automatic_dispatch_stop_ts", Long.valueOf(j14)), new Q("sbc_automatic_dispatch_ttl", Long.valueOf(j17)), new Q("sbc_automatic_dispatch_budget_recommended", Long.valueOf(j16)))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f12559b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f12559b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f12559b.f90248c;
    }
}
