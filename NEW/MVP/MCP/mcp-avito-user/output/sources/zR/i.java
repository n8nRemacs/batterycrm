package Zr;

import androidx.compose.runtime.internal.P;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ClickStreamManualBidPriceSaveClickEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZr/i;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f20523b;

    public i(long j12, @Y61.k String str, int i12, int i13) {
        this.f20523b = new e(11952, 0, str, false, i12, i13, Collections.singletonMap("price", Long.valueOf(j12)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83096b() {
        return this.f20523b.getF83096b();
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f20523b.getParams();
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83097c() {
        return this.f20523b.getF83097c();
    }
}
