package SC;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DevelopmentsAdviceButtonClickEvent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSC/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f14841b;

    public e() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF6279b() {
        return this.f14841b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f14841b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF6280c() {
        return this.f14841b.f90248c;
    }

    public e(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? null : str;
        str2 = (i12 & 2) != 0 ? null : str2;
        str3 = (i12 & 4) != 0 ? null : str3;
        str4 = (i12 & 8) != 0 ? null : str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("lid", str);
        }
        if (str2 != null) {
            linkedHashMap.put("from_page", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("node_type", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("request_type", str4);
        }
        G0 g02 = G0.f406611a;
        this.f14841b = new ParametrizedClickStreamEvent(4219, 7, linkedHashMap, null, 8, null);
    }
}
