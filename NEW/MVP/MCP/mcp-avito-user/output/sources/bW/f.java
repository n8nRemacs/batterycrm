package Bw;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealRoomAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBw/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f1804b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f1805c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f1806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f1807e;

    public f(@k String str, @k String str2, @k String str3) {
        this.f1804b = str;
        this.f1805c = str2;
        this.f1806d = str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from_page", str);
        linkedHashMap.put("avito_prof_search_clientid", str2);
        linkedHashMap.put("avito_pro_prof_search_deal_status", str3);
        linkedHashMap.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f1807e = new ParametrizedClickStreamEvent(9056, 5, linkedHashMap, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f1804b, fVar.f1804b) && L.f(this.f1805c, fVar.f1805c) && L.f(this.f1806d, fVar.f1806d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f1807e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f1807e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f1807e.f90248c;
    }

    public final int hashCode() {
        return this.f1806d.hashCode() + H.d(this.f1804b.hashCode() * 31, 31, this.f1805c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DealRoomShownEvent(fromPage=");
        sb2.append(this.f1804b);
        sb2.append(", clientId=");
        sb2.append(this.f1805c);
        sb2.append(", dealStatus=");
        return C22026a.c(sb2, this.f1806d, ')');
    }
}
