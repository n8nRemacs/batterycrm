package xI;

import Y61.k;
import com.avito.android.analytics.clickstream.C28376a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FakeAbConfigCheckEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxI/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xI.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49842a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f442322b;

    public C49842a(long j12) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (j12 != -1) {
            linkedHashMap.put("last_config_update", new C28376a().a(j12, TimeUnit.MILLISECONDS));
        }
        G0 g02 = G0.f406611a;
        this.f442322b = new ParametrizedClickStreamEvent(4108, 0, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        return this.f442322b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f442322b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF11770c() {
        return this.f442322b.f90248c;
    }
}
