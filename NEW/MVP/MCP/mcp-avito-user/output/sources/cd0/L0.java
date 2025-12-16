package Cd0;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: UniversalMarketValueDescriptionClicked.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/L0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class L0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f2402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2403c;

    public L0(@Y61.l String str) {
        this.f2402b = str;
        this.f2403c = new ParametrizedClickStreamEvent(5280, 0, C35755b0.c(Collections.singletonMap("iid", str)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f2403c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2403c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f2403c.f90248c;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        androidx.appcompat.app.r.C(L0.class, sb2, "(itemId = ");
        return C22026a.c(sb2, this.f2402b, ')');
    }
}
