package mc;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: VideoStartEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414637b;

    public e(@l String str, @l String str2, @l String str3, @l Integer num, @l String str4, @l Double d12, @l String str5) {
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
        if (str4 != null) {
            map.put("x", str4);
        }
        if (d12 != null) {
            map.put("video_duration", C43066x.a0(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d12.doubleValue())}, 1)), ",", ".", false));
        }
        if (str5 != null) {
            map.put("x_avl_hash", str5);
        }
        G0 g02 = G0.f406611a;
        this.f414637b = new ParametrizedClickStreamEvent(6304, 16, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f414637b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414637b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f414637b.f90248c;
    }

    public /* synthetic */ e(String str, String str2, String str3, Integer num, String str4, Double d12, String str5, int i12, C42822w c42822w) {
        this(str, str2, str3, num, str4, (i12 & 32) != 0 ? null : d12, (i12 & 64) != 0 ? null : str5);
    }
}
