package xw;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealCabinetAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxw/h;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class h implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f442708b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f442709c;

    public h(@k String str) {
        this.f442708b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from_page", str);
        linkedHashMap.put("agent_flow_type", "PC");
        linkedHashMap.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f442709c = new ParametrizedClickStreamEvent(11209, 3, linkedHashMap, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && L.f(this.f442708b, ((h) obj).f442708b);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f442709c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f442709c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f442709c.f90248c;
    }

    public final int hashCode() {
        return this.f442708b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("MortgageToAgentLanding(fromPage="), this.f442708b, ')');
    }
}
