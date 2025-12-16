package m40;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.offlinization.analytics.events.OfflineModeAction;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: TurnOfflineModeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm40/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414305b;

    public e(@k OfflineModeAction offlineModeAction) {
        this.f414305b = new ParametrizedClickStreamEvent(11549, 1, "TurnOfflineEvent", Collections.singletonMap("offline_mode_action", offlineModeAction.f208512b));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        return this.f414305b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414305b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF11770c() {
        return this.f414305b.f90248c;
    }
}
