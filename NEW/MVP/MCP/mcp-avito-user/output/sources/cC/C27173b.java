package cc;

import Y61.k;
import com.avito.android.analytics.clickstream.W;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: DetectedAnrClickstreamEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcc/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C27173b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f58039b = new com.avito.android.analytics.provider.clickstream.b(7274, 2);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, Object> f58040c;

    public C27173b(@k Throwable th2) {
        this.f58040c = Collections.singletonMap(CrashHianalyticsData.STACK_TRACE, W.g(W.f(th2)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83096b() {
        return this.f58039b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f58040c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83097c() {
        return this.f58039b.f90263c;
    }
}
