package mc;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VideoStartupTimeEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmc/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414638b;

    public f(@l String str, @l String str2, @l Integer num, @l String str3, @l Integer num2, @l Integer num3) {
        HashMap map = new HashMap();
        if (str != null) {
            map.put(ContextActionHandler.Link.URL, str);
        }
        if (str2 != null) {
            map.put("iid", str2);
        }
        if (str3 != null) {
            map.put("from_page", str3);
        }
        if (num != null) {
            map.put("position", Integer.valueOf(num.intValue()));
        }
        map.put("time_to_prepare_video", Integer.valueOf(num2.intValue()));
        map.put("time_to_display_video", Integer.valueOf(num3.intValue()));
        G0 g02 = G0.f406611a;
        this.f414638b = new ParametrizedClickStreamEvent(6588, 2, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f414638b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414638b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f414638b.f90248c;
    }
}
