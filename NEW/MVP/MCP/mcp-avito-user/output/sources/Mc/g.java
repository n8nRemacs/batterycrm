package mc;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.AdvertStatus;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.user_profile.SubscriptionStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: VideoStopEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmc/g;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414639b;

    public g(@l String str, @l String str2, @l String str3, @l Double d12, @l Double d13, @l Integer num, @l String str4, @k VideoStopReason videoStopReason, @l String str5) {
        String str6;
        HashMap map = new HashMap();
        if (str != null) {
            map.put(ContextActionHandler.Link.URL, str);
        }
        if (str2 != null) {
            map.put("iid", str2);
        }
        if (d13 != null) {
            map.put("playback_position", C43066x.a0(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d13.doubleValue())}, 1)), ",", ".", false));
        }
        if (str3 != null) {
            map.put("from_page", str3);
        }
        if (d12 != null) {
            map.put("video_duration", C43066x.a0(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d12.doubleValue())}, 1)), ",", ".", false));
        }
        if (str4 != null) {
            map.put("x", str4);
        }
        if (num != null) {
            map.put("position", Integer.valueOf(num.intValue()));
        }
        int iOrdinal = videoStopReason.ordinal();
        if (iOrdinal == 0) {
            str6 = "completed";
        } else if (iOrdinal == 1) {
            str6 = AdvertStatus.CLOSED;
        } else if (iOrdinal == 2) {
            str6 = "skipped";
        } else if (iOrdinal == 3) {
            str6 = SubscriptionStatus.PAUSED;
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str6 = "rewinded";
        }
        map.put("stop_reason", str6);
        if (str5 != null) {
            map.put("x_avl_hash", str5);
        }
        G0 g02 = G0.f406611a;
        this.f414639b = new ParametrizedClickStreamEvent(6305, 12, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f414639b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414639b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f414639b.f90248c;
    }

    public /* synthetic */ g(String str, String str2, String str3, Double d12, Double d13, Integer num, String str4, VideoStopReason videoStopReason, String str5, int i12, C42822w c42822w) {
        this(str, str2, str3, d12, d13, num, str4, videoStopReason, (i12 & 256) != 0 ? null : str5);
    }
}
