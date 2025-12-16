package Zr;

import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.analytics.clickstream.events.ClickStreamCpxPromoEvent;
import com.huawei.hms.common.data.DataBufferUtils;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ClickStreamPageViewEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZr/k;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClickStreamCpxPromoEvent f20525b;

    public k(@Y61.k String str, boolean z12, @Y61.k String str2) {
        this.f20525b = new ClickStreamCpxPromoEvent(11081, 3, str, Boolean.valueOf(z12), Collections.singletonMap(DataBufferUtils.PREV_PAGE, str2));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f20525b.f126799b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f20525b.f126799b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f20525b.f126799b.f90248c;
    }
}
