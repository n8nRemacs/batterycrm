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

/* compiled from: SbcVasFlowDoNotApplyDiscountClickEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOo0/x;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class x implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f12558b;

    public x(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, @Y61.l Long l12, long j12, boolean z12, @Y61.k String str4) {
        this.f12558b = new ParametrizedClickStreamEvent(14382, 2, "Спецпредложения/ Нажатие на кнопку \"Не подключать\" рассылку в vas флоу\n", C35755b0.c(P0.g(new Q("uid", str != null ? C43066x.z0(str) : null), new Q("iid", str2), new Q("item_id", str3), new Q(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, str4), new Q("msg_sbc_id", l12), new Q("sbc_available_audience", Long.valueOf(j12)), new Q("finish_vas_flow", Boolean.valueOf(z12)))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f12558b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f12558b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f12558b.f90248c;
    }
}
