package Zr;

import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.analytics.clickstream.events.ClickStreamCpxPromoEvent;
import com.avito.android.util.C35755b0;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ClickStreamManualBidLimitSaveClickEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZr/h;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClickStreamCpxPromoEvent f20522b;

    public h(@Y61.k String str, @Y61.l Long l12) {
        this.f20522b = new ClickStreamCpxPromoEvent(11945, 0, str, Boolean.FALSE, C35755b0.c(Collections.singletonMap("daily_limit", l12)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f20522b.f126799b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f20522b.f126799b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f20522b.f126799b.f90248c;
    }
}
