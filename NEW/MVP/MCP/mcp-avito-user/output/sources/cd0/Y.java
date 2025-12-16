package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ImeiScanResultReceivedEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/Y;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Y implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.Q<String, String> f2420b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2421c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2422d;

    public Y(@Y61.k kotlin.Q q12, boolean z12) {
        this.f2420b = q12;
        this.f2421c = z12;
        this.f2422d = new ParametrizedClickStreamEvent(6255, 4, kotlin.collections.P0.g(q12, new kotlin.Q("is_gallery_flg", Boolean.TRUE), new kotlin.Q("is_success_scan_flg", Boolean.valueOf(z12))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f2422d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2422d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f2422d.f90248c;
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.w(new StringBuilder("ImeiScanResultReceivedEvent(eventId = 6255, "), kotlin.collections.P0.g(this.f2420b, new kotlin.Q("is_gallery_flg", Boolean.TRUE), new kotlin.Q("is_success_scan_flg", Boolean.valueOf(this.f2421c))), ')');
    }
}
