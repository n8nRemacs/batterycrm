package Ew;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.webrtc.h;

/* compiled from: HelpCenterAnalyticsEvents.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEw/g;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class g implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f4410b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f4411c;

    public g(@l Integer num) {
        this.f4410b = num;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num != null) {
            h.i(num, "lid", linkedHashMap);
        }
        linkedHashMap.put("from_page", "prof_search");
        linkedHashMap.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f4411c = new ParametrizedClickStreamEvent(8508, 3, linkedHashMap, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return L.f(this.f4410b, ((g) obj).f4410b);
        }
        return false;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f4411c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f4411c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f4411c.f90248c;
    }

    public final int hashCode() {
        Integer num = this.f4410b;
        return ((num == null ? 0 : num.hashCode()) * 31) + 93387086;
    }

    @k
    public final String toString() {
        return "TariffCardItemClickedEvent(locationId=" + this.f4410b + ", fromPage=prof_search)";
    }
}
