package op;

import Y61.k;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ContractSignAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lop/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: op.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44836b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f420184b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, Object> f420185c;

    public C44836b(int i12, String str) {
        this.f420184b = i12;
        this.f420185c = Collections.singletonMap(CrashHianalyticsData.PROCESS_ID, str);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF420184b() {
        return this.f420184b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f420185c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    public final int getVersion() {
        return 1;
    }
}
