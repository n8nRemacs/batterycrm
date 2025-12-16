package uw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.developments_agency_search.analytics.SearchType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.webrtc.h;

/* compiled from: BigFiltersAnalyticsEvents.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luw/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f440343b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SearchType f440344c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f440345d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f440346e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f440347f;

    /* renamed from: g, reason: collision with root package name */
    public final int f440348g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f440349h;

    public f(@l Integer num, @k SearchType searchType, boolean z12, @k String str, @k String str2, int i12) {
        this.f440343b = num;
        this.f440344c = searchType;
        this.f440345d = z12;
        this.f440346e = str;
        this.f440347f = str2;
        this.f440348g = i12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num != null) {
            h.i(num, "lid", linkedHashMap);
        }
        linkedHashMap.put("avito_pro_prof_search_search_type", searchType.f136335b);
        linkedHashMap.put("avito_pro_prof_search_is_hidden_commission", Boolean.valueOf(z12));
        linkedHashMap.put("avito_pro_prof_search_filters", str);
        linkedHashMap.put("avito_pro_prof_sort_type", str2);
        linkedHashMap.put("avito_pro_prof_search_page_no", Integer.valueOf(i12));
        linkedHashMap.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f440349h = new ParametrizedClickStreamEvent(8513, 3, linkedHashMap, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f440343b, fVar.f440343b) && this.f440344c == fVar.f440344c && this.f440345d == fVar.f440345d && L.f(this.f440346e, fVar.f440346e) && L.f(this.f440347f, fVar.f440347f) && this.f440348g == fVar.f440348g;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f440349h.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f440349h.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f440349h.f90248c;
    }

    public final int hashCode() {
        Integer num = this.f440343b;
        return Integer.hashCode(this.f440348g) + H.d(H.d(r.i((this.f440344c.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31, 31, this.f440345d), 31, this.f440346e), 31, this.f440347f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BigFiltersShownEvent(locationId=");
        sb2.append(this.f440343b);
        sb2.append(", searchType=");
        sb2.append(this.f440344c);
        sb2.append(", isHiddenCommission=");
        sb2.append(this.f440345d);
        sb2.append(", searchFilters=");
        sb2.append(this.f440346e);
        sb2.append(", sortType=");
        sb2.append(this.f440347f);
        sb2.append(", searchPageNumber=");
        return r.t(sb2, this.f440348g, ')');
    }
}
