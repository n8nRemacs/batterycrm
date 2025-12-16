package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AddFeeToPriceToggleEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/q;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cd0.q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13282q implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2463b;

    public C13282q(@Y61.k kotlin.Q<String, String> q12, boolean z12) {
        this.f2463b = new ParametrizedClickStreamEvent(12983, 1, "Avito.Delivery / Подача / Вкл-выкл тоггла 'Включить комиссию за Авито Доставку в цену товара'", kotlin.collections.P0.g(q12, new kotlin.Q("is_turn_on", Boolean.valueOf(z12))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF222438b() {
        return this.f2463b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2463b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF222439c() {
        return this.f2463b.f90248c;
    }
}
