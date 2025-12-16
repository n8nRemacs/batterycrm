package Hw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.developments_agency_search.analytics.SearchFiltersSource;
import com.avito.android.developments_agency_search.analytics.SearchType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.webrtc.h;

/* compiled from: LocationGroupAnalyticsEvents.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHw/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hw.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C14043e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f7827b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f7828c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SearchType f7829d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7830e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f7831f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f7832g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7833h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SearchFiltersSource f7834i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f7835j;

    public C14043e(@l Integer num, @k String str, @k SearchType searchType, boolean z12, @k String str2, @k String str3, int i12, @k SearchFiltersSource searchFiltersSource) {
        this.f7827b = num;
        this.f7828c = str;
        this.f7829d = searchType;
        this.f7830e = z12;
        this.f7831f = str2;
        this.f7832g = str3;
        this.f7833h = i12;
        this.f7834i = searchFiltersSource;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num != null) {
            h.i(num, "lid", linkedHashMap);
        }
        linkedHashMap.put("from_page", str);
        linkedHashMap.put("avito_pro_prof_search_search_type", searchType.f136335b);
        linkedHashMap.put("avito_pro_prof_search_is_hidden_commission", Boolean.valueOf(z12));
        linkedHashMap.put("avito_pro_prof_search_filters", str2);
        linkedHashMap.put("avito_pro_prof_sort_type", str3);
        linkedHashMap.put("avito_pro_prof_search_page_no", Integer.valueOf(i12));
        linkedHashMap.put("avito_pro_prof_search_filter_source", searchFiltersSource.f136330b);
        linkedHashMap.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f7835j = new ParametrizedClickStreamEvent(8514, 4, linkedHashMap, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14043e)) {
            return false;
        }
        C14043e c14043e = (C14043e) obj;
        return L.f(this.f7827b, c14043e.f7827b) && L.f(this.f7828c, c14043e.f7828c) && this.f7829d == c14043e.f7829d && this.f7830e == c14043e.f7830e && L.f(this.f7831f, c14043e.f7831f) && L.f(this.f7832g, c14043e.f7832g) && this.f7833h == c14043e.f7833h && this.f7834i == c14043e.f7834i;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f7835j.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f7835j.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f7835j.f90248c;
    }

    public final int hashCode() {
        Integer num = this.f7827b;
        return this.f7834i.hashCode() + r.e(this.f7833h, H.d(H.d(r.i((this.f7829d.hashCode() + H.d((num == null ? 0 : num.hashCode()) * 31, 31, this.f7828c)) * 31, 31, this.f7830e), 31, this.f7831f), 31, this.f7832g), 31);
    }

    @k
    public final String toString() {
        return "LocationGroupShownEvent(locationId=" + this.f7827b + ", fromPage=" + this.f7828c + ", searchType=" + this.f7829d + ", isHiddenCommission=" + this.f7830e + ", searchFilters=" + this.f7831f + ", sortType=" + this.f7832g + ", searchPageNumber=" + this.f7833h + ", filtersSource=" + this.f7834i + ')';
    }
}
