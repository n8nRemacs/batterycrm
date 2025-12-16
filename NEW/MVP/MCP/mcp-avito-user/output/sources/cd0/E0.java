package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: PublishVerticalClickEventV4.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/E0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class E0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2389b;

    public E0(@Y61.l String str, @Y61.l List<Integer> list, @Y61.k String str2, @Y61.l String str3) {
        this.f2389b = new ParametrizedClickStreamEvent(2078, 4, kotlin.collections.P0.g(new kotlin.Q("cid", str == null ? "" : str), new kotlin.Q("esid", str2), new kotlin.Q("categories", list == null ? C42784z0.f406748b : list), new kotlin.Q("infm_raw_params", str3 == null ? "" : str3)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f2389b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2389b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f2389b.f90248c;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        androidx.appcompat.app.r.C(E0.class, sb2, " with params: ");
        sb2.append(this.f2389b.f90249d);
        return sb2.toString();
    }
}
