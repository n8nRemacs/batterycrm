package Kw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKw/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f9687b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f9688c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9689d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Long f9690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f9691f;

    public b(@l Integer num, @k String str, long j12, @l Long l12) {
        this.f9687b = num;
        this.f9688c = str;
        this.f9689d = j12;
        this.f9690e = l12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num != null) {
            org.webrtc.h.i(num, "lid", linkedHashMap);
        }
        linkedHashMap.put("from_page", str);
        linkedHashMap.put("development_id", Long.valueOf(j12));
        if (l12 != null) {
            linkedHashMap.put("avito_prof_search_flat_id", Long.valueOf(l12.longValue()));
        }
        linkedHashMap.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f9691f = new ParametrizedClickStreamEvent(8493, 2, linkedHashMap, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f9687b, bVar.f9687b) && L.f(this.f9688c, bVar.f9688c) && this.f9689d == bVar.f9689d && L.f(this.f9690e, bVar.f9690e);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f9691f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f9691f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f9691f.f90248c;
    }

    public final int hashCode() {
        Integer num = this.f9687b;
        int iG2 = r.g(H.d((num == null ? 0 : num.hashCode()) * 31, 31, this.f9688c), 31, this.f9689d);
        Long l12 = this.f9690e;
        return iG2 + (l12 != null ? l12.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientFixationClickedEvent(locationId=");
        sb2.append(this.f9687b);
        sb2.append(", fromPage=");
        sb2.append(this.f9688c);
        sb2.append(", developmentId=");
        sb2.append(this.f9689d);
        sb2.append(", lotId=");
        return m.m(sb2, this.f9690e, ')');
    }
}
