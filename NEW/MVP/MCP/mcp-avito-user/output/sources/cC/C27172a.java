package cc;

import Y61.k;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CrashlyticsDetectedCrashEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcc/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C27172a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f58037b = new com.avito.android.analytics.provider.clickstream.b(6435, 1);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, Object> f58038c;

    public C27172a(boolean z12) {
        this.f58038c = Collections.singletonMap("crash_detected_by_us", Boolean.valueOf(z12));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90262b() {
        return this.f58037b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f58038c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90263c() {
        return this.f58037b.f90263c;
    }
}
