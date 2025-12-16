package kp0;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ScreenFlowLinkNotOpenedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_screen-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kp0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43484a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f413227b;

    public C43484a(int i12, @k String str) {
        this.f413227b = new ParametrizedClickStreamEvent(7593, 1, P0.g(new Q("deeplink_path", str), new Q("deeplink_version", Integer.valueOf(i12))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f413227b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f413227b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f413227b.f90248c;
    }
}
