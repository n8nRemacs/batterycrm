package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: DeliveryToggleEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/U;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public class U implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f2413b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2414c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2415d;

    public U(@Y61.k String str, int i12, int i13, @Y61.k kotlin.Q<String, String> q12, @Y61.l String str2, boolean z12) {
        this.f2413b = i12;
        this.f2414c = i13;
        this.f2415d = new ParametrizedClickStreamEvent(i12, i13, str, kotlin.collections.P0.g(q12, new kotlin.Q("uid", str2 == null ? "" : str2), new kotlin.Q("isdlvr", Boolean.valueOf(z12))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF2413b() {
        return this.f2413b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2415d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF2414c() {
        return this.f2414c;
    }
}
