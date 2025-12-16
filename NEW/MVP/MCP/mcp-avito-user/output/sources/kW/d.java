package Kw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyAgencySearchAnalyticsEvents.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKw/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f9693b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9694c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f9696e;

    public d(@l Integer num, long j12, boolean z12) {
        this.f9693b = num;
        this.f9694c = j12;
        this.f9695d = z12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num != null) {
            org.webrtc.h.i(num, "lid", linkedHashMap);
        }
        linkedHashMap.put("business_platform", 3);
        linkedHashMap.put("development_id", Long.valueOf(j12));
        linkedHashMap.put("avito_pro_prof_search_is_hidden_commission", Boolean.valueOf(z12));
        G0 g02 = G0.f406611a;
        this.f9696e = new ParametrizedClickStreamEvent(10318, 3, linkedHashMap, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f9693b, dVar.f9693b) && this.f9694c == dVar.f9694c && this.f9695d == dVar.f9695d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF327516b() {
        return this.f9696e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f9696e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF327517c() {
        return this.f9696e.f90248c;
    }

    public final int hashCode() {
        Integer num = this.f9693b;
        return Boolean.hashCode(this.f9695d) + r.g((num == null ? 0 : num.hashCode()) * 31, 31, this.f9694c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MapPinClickedEvent(locationId=");
        sb2.append(this.f9693b);
        sb2.append(", developmentId=");
        sb2.append(this.f9694c);
        sb2.append(", isHiddenCommission=");
        return r.x(sb2, this.f9695d, ')');
    }
}
