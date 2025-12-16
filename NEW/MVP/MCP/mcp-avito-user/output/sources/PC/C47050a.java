package pc;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ContentLoadingNotFinishedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpc/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pc.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47050a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f428624b;

    public C47050a(@k String str, long j12, long j13, @k String str2, @k String str3, long j14, long j15, long j16, long j17, @k String str4, boolean z12, boolean z13) {
        this.f428624b = new ParametrizedClickStreamEvent(13867, 1, P0.j(new Q("screen_name", str), new Q("screen_start_time", Long.valueOf(j12)), new Q("mobile_event_duration", Long.valueOf(j13)), new Q("network_type", str2), new Q("content_type", str3), new Q("mobile_app_page_number", 0), new Q("span_end_time", Long.valueOf(j14)), new Q("screen_touch_time", Long.valueOf(j15)), new Q("latest_touch_time_before_span_start_time", Long.valueOf(j16)), new Q("app_startup_time", Long.valueOf(j17)), new Q("screen_random_id", str4), new Q("screen_is_frequent", Boolean.valueOf(z12)), new Q("frequent_screens_enabled", Boolean.valueOf(z13))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f428624b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428624b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f428624b.f90248c;
    }

    public /* synthetic */ C47050a(String str, long j12, long j13, String str2, String str3, long j14, long j15, long j16, long j17, String str4, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, j12, j13, str2, str3, j14, (i12 & 64) != 0 ? 0L : j15, j16, j17, str4, z12, z13);
    }
}
