package pY;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: MasterPlanAnalyticsEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpY/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pY.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47030a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f428594b;

    public C47030a(@k String str, @k String str2, @l String str3, @l String str4, @k String str5) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("catalog_jk_source", str5);
        linkedHashMap.put("development_id", str);
        linkedHashMap.put("catalog_jk_action", str2);
        if (str3 != null) {
            linkedHashMap.put("korpus_id", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("rooms_number_id", str4);
        }
        G0 g02 = G0.f406611a;
        this.f428594b = new ParametrizedClickStreamEvent(9974, 1, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f428594b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428594b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f428594b.f90248c;
    }

    public /* synthetic */ C47030a(String str, String str2, String str3, String str4, String str5, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, str5);
    }
}
