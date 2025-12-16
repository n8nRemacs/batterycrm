package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AddFeeToPriceToggleEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/p;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cd0.p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13280p implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2461b;

    public C13280p(@Y61.k kotlin.Q<String, String> q12) {
        this.f2461b = new ParametrizedClickStreamEvent(12982, 1, "Avito.Delivery / Подача / Показ блока с предложением включить комиссию за Авито Доставку в цену товара", Collections.singletonMap(q12.f406619b, q12.f406620c));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f2461b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2461b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f2461b.f90248c;
    }
}
