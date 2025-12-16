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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxw/i;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class i implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f442710b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f442711c;

    public i(@k String str) {
        this.f442710b = str;
        LinkedHashMap linkedHashMapW = AK.c.w("query", str);
        linkedHashMapW.put("avito_pro_prof_search_page_no", 1);
        linkedHashMapW.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f442711c = new ParametrizedClickStreamEvent(9055, 2, linkedHashMapW, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && L.f(this.f442710b, ((i) obj).f442710b);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f442711c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f442711c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f442711c.f90248c;
    }

    public final int hashCode() {
        return this.f442710b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("SearchBarQueryUpdatedEvent(searchQuery="), this.f442710b, ')');
    }
}
