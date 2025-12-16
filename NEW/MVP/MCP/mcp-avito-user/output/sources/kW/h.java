package Kw;

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

/* compiled from: RealtyAgencySearchAnalyticsEvents.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKw/h;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class h implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f9703b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f9704c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SearchType f9705d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9706e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f9707f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f9708g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9709h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f9710i;

    public h(@l Integer num, @k String str, @k SearchType searchType, boolean z12, @k String str2, @k String str3, int i12) {
        this.f9703b = num;
        this.f9704c = str;
        this.f9705d = searchType;
        this.f9706e = z12;
        this.f9707f = str2;
        this.f9708g = str3;
        this.f9709h = i12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num != null) {
            org.webrtc.h.i(num, "lid", linkedHashMap);
        }
        linkedHashMap.put("from_page", str);
        linkedHashMap.put("avito_pro_prof_search_search_type", searchType.f136335b);
        linkedHashMap.put("avito_pro_prof_search_is_hidden_commission", Boolean.valueOf(z12));
        linkedHashMap.put("avito_pro_prof_search_filters", str2);
        linkedHashMap.put("avito_pro_prof_sort_type", str3);
        linkedHashMap.put("avito_pro_prof_search_page_no", Integer.valueOf(i12));
        linkedHashMap.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f9710i = new ParametrizedClickStreamEvent(8484, 4, linkedHashMap, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f9703b, hVar.f9703b) && L.f(this.f9704c, hVar.f9704c) && this.f9705d == hVar.f9705d && this.f9706e == hVar.f9706e && L.f(this.f9707f, hVar.f9707f) && L.f(this.f9708g, hVar.f9708g) && this.f9709h == hVar.f9709h;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f9710i.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f9710i.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f9710i.f90248c;
    }

    public final int hashCode() {
        Integer num = this.f9703b;
        return Integer.hashCode(this.f9709h) + H.d(H.d(r.i((this.f9705d.hashCode() + H.d((num == null ? 0 : num.hashCode()) * 31, 31, this.f9704c)) * 31, 31, this.f9706e), 31, this.f9707f), 31, this.f9708g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchResultLoadedEvent(locationId=");
        sb2.append(this.f9703b);
        sb2.append(", fromPage=");
        sb2.append(this.f9704c);
        sb2.append(", searchType=");
        sb2.append(this.f9705d);
        sb2.append(", isHiddenCommission=");
        sb2.append(this.f9706e);
        sb2.append(", searchFilters=");
        sb2.append(this.f9707f);
        sb2.append(", sortType=");
        sb2.append(this.f9708g);
        sb2.append(", searchPageNumber=");
        return r.t(sb2, this.f9709h, ')');
    }
}
