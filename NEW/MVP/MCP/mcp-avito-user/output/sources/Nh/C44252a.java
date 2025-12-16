package nH;

import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ApplyAnalyticsEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnH/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nH.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44252a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414971b;

    public C44252a(@l Long l12, @l String str) {
        HashMap map = new HashMap();
        map.put("shift_id", Long.valueOf(l12.longValue()));
        if (str != null) {
            map.put("slot_id", str);
        }
        G0 g02 = G0.f406611a;
        this.f414971b = new ParametrizedClickStreamEvent(13631, 0, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f414971b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f414971b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f414971b.f90248c;
    }
}
