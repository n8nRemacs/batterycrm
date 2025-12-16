package Kw;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RealtyAgencySearchAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKw/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f9692b;

    public c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from_page", "prof_search");
        linkedHashMap.put("avito_prof_search_clientid", null);
        linkedHashMap.put("avito_prof_search_flat_id", 0L);
        linkedHashMap.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f9692b = new ParametrizedClickStreamEvent(14160, 3, linkedHashMap, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        ((c) obj).getClass();
        return L.f(null, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f9692b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f9692b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f9692b.f90248c;
    }

    public final int hashCode() {
        throw null;
    }

    @k
    public final String toString() {
        return "LotAddedToSelectionEvent(fromPage=prof_search, clientId=null, lotId=0)";
    }
}
