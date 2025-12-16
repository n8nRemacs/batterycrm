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

/* compiled from: SbcAutoDispatchToggleSwitchedEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOo0/h;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f12541b;

    public h(@Y61.l String str, @Y61.k String str2, long j12, long j13, @Y61.l Boolean bool, @Y61.k String str3, @Y61.k String str4) {
        this.f12541b = new ParametrizedClickStreamEvent(14013, 4, "Спецпредложения/Переключение тоггла в авторассылках (Mobile)", C35755b0.c(P0.g(new Q("uid", str != null ? C43066x.z0(str) : null), new Q("item_id", str2), new Q(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, str3), new Q("msg_sbc_id", Long.valueOf(j12)), new Q("sbc_from", str4), new Q("sbc_automatic_dispatch_toggle_value", bool), new Q("sbc_available_audience", Long.valueOf(j13)))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f12541b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f12541b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f12541b.f90248c;
    }
}
