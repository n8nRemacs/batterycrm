package cc;

import Cz.C13376a;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.clickstream.W;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: NonFatalClickstreamEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcc/g;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f58046b = new com.avito.android.analytics.provider.clickstream.b(3457, 4);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f58047c;

    public g(@k Throwable th2, @l String str) {
        this.f58047c = P0.g(new Q("error_text", W.a(W.e(th2), str)), new Q(CrashHianalyticsData.STACK_TRACE, W.g(W.f(th2))), new Q("error_group", W.g(C13376a.a(th2))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f58046b.f90262b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f58047c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f58046b.f90263c;
    }
}
