package pc;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ScreenFpsJankEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f428652b;

    public e(@k String str, int i12, int i13, double d12, double d13, int i14, @k String str2, @k String str3) {
        this.f428652b = new ParametrizedClickStreamEvent(6515, 9, P0.j(new Q("screen_name", str), new Q("jank_frames_count", Integer.valueOf(i12)), new Q("in_time_frames_count", Integer.valueOf(i13)), new Q("average_jank_frame_size", Double.valueOf(d12)), new Q("hitch_time_ratio", Double.valueOf(d13)), new Q("display_refrash_rate", Integer.valueOf(i14)), new Q("screen_fps_context", str2), new Q("screen_random_id", str3)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f428652b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428652b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f428652b.f90248c;
    }

    @k
    public final String toString() {
        return this.f428652b.f90249d.toString();
    }
}
