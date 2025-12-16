package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ContactsScreenOpenEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/G;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class G implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.Q<String, String> f2391b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2392c;

    public G(@Y61.k kotlin.Q<String, String> q12) {
        this.f2391b = q12;
        this.f2392c = new ParametrizedClickStreamEvent(2460, 2, Collections.singletonMap(q12.f406619b, q12.f406620c), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f2392c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2392c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f2392c.f90248c;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        androidx.appcompat.app.r.C(G.class, sb2, "(advertIdParam = ");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.i(sb2, this.f2391b, ')');
    }
}
