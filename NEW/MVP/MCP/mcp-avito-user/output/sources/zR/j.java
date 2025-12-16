package Zr;

import androidx.compose.runtime.internal.P;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ClickStreamManualBidPriceSliderInputEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZr/j;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f20524b;

    public j(long j12, @Y61.k String str, int i12, int i13) {
        this.f20524b = new e(11091, 5, str, false, i12, i13, Collections.singletonMap("price", Long.valueOf(j12)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83096b() {
        return this.f20524b.getF83096b();
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f20524b.getParams();
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83097c() {
        return this.f20524b.getF83097c();
    }
}
