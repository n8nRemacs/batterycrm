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

/* compiled from: VideoErrorEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmc/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mc.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44048a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414634b;

    public C44048a(@l String str, @l String str2, @l String str3, @l String str4, @l Integer num) {
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
        if (str4 != null) {
            map.put("error_details", str4);
        }
        if (num != null) {
            map.put("position", Integer.valueOf(num.intValue()));
        }
        G0 g02 = G0.f406611a;
        this.f414634b = new ParametrizedClickStreamEvent(6591, 1, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f414634b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414634b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f414634b.f90248c;
    }
}
