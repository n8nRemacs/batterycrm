package mc;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VideoMuteClick.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmc/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mc.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44050c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414635b;

    public C44050c(@l String str, @l String str2, @l String str3, @l String str4, @l Boolean bool) {
        HashMap map = new HashMap();
        if (str != null) {
            map.put("iid", str);
        }
        if (str2 != null) {
            map.put("x", str2);
        }
        map.put("from_page", str3);
        if (str4 != null) {
            map.put("x_avl_hash", str4);
        }
        if (bool != null) {
            map.put("is_mute", bool);
        }
        G0 g02 = G0.f406611a;
        this.f414635b = new ParametrizedClickStreamEvent(10335, 2, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f414635b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414635b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f414635b.f90248c;
    }
}
