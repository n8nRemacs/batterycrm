package mW;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: LocationNotificationActionEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmW/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414550b;

    public e(@l String str, @k String str2, @l String str3, @k String str4) {
        HashMap mapE = P0.e(new Q("laas_tooltip_answer", str2), new Q("laas_tooltip_type", str4));
        if (str != null) {
            mapE.put("geo_session", str);
        }
        if (str3 != null) {
            mapE.put("lid", str3);
        }
        G0 g02 = G0.f406611a;
        this.f414550b = new ParametrizedClickStreamEvent(4184, 3, mapE, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f414550b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414550b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f414550b.f90248c;
    }

    public /* synthetic */ e(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, str2, str3, str4);
    }
}
