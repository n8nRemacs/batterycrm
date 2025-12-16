package Zr;

import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.analytics.clickstream.events.ClickStreamCpxPromoEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClickStreamCpxPromoSliderEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZr/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClickStreamCpxPromoEvent f20519b;

    public e(int i12, int i13, @Y61.k String str, boolean z12, int i14, int i15, @Y61.k Map<String, ? extends Object> map) {
        this.f20519b = new ClickStreamCpxPromoEvent(i12, i13, str, Boolean.valueOf(z12), P0.k(map, P0.g(new Q("slider_position", Integer.valueOf(i14 + 1)), new Q("max_slider_position", Integer.valueOf(i15 + 1)))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83096b() {
        return this.f20519b.f126799b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f20519b.f126799b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83097c() {
        return this.f20519b.f126799b.f90248c;
    }

    public /* synthetic */ e(int i12, int i13, String str, boolean z12, int i14, int i15, Map map, int i16, C42822w c42822w) {
        this(i12, i13, str, z12, i14, i15, (i16 & 64) != 0 ? P0.c() : map);
    }
}
