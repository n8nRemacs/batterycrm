package Hw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.developments_agency_search.analytics.SearchFiltersSource;
import com.avito.android.developments_agency_search.analytics.SearchType;
import com.avito.android.developments_agency_search.screen.location_group.analytics.SearchFiltersAction;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHw/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hw.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C14042d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f7817b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f7818c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SearchType f7819d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7820e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f7821f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f7822g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7823h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SearchFiltersSource f7824i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SearchFiltersAction f7825j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f7826k;

    public C14042d(@l Integer num, @k String str, @k SearchType searchType, boolean z12, @k String str2, @k String str3, int i12, @k SearchFiltersSource searchFiltersSource, @k SearchFiltersAction searchFiltersAction) {
        this.f7817b = num;
        this.f7818c = str;
        this.f7819d = searchType;
        this.f7820e = z12;
        this.f7821f = str2;
        this.f7822g = str3;
        this.f7823h = i12;
        this.f7824i = searchFiltersSource;
        this.f7825j = searchFiltersAction;
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
        linkedHashMap.put("avito_pro_prof_search_filter_action", searchFiltersAction.f138074b);
        linkedHashMap.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f7826k = new ParametrizedClickStreamEvent(8515, 5, linkedHashMap, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14042d)) {
            return false;
        }
        C14042d c14042d = (C14042d) obj;
        return L.f(this.f7817b, c14042d.f7817b) && L.f(this.f7818c, c14042d.f7818c) && this.f7819d == c14042d.f7819d && this.f7820e == c14042d.f7820e && L.f(this.f7821f, c14042d.f7821f) && L.f(this.f7822g, c14042d.f7822g) && this.f7823h == c14042d.f7823h && this.f7824i == c14042d.f7824i && this.f7825j == c14042d.f7825j;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f7826k.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f7826k.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f7826k.f90248c;
    }

    public final int hashCode() {
        Integer num = this.f7817b;
        return this.f7825j.hashCode() + ((this.f7824i.hashCode() + r.e(this.f7823h, H.d(H.d(r.i((this.f7819d.hashCode() + H.d((num == null ? 0 : num.hashCode()) * 31, 31, this.f7818c)) * 31, 31, this.f7820e), 31, this.f7821f), 31, this.f7822g), 31)) * 31);
    }

    @k
    public final String toString() {
        return "LocationGroupScreenClosedEvent(locationId=" + this.f7817b + ", fromPage=" + this.f7818c + ", searchType=" + this.f7819d + ", isHiddenCommission=" + this.f7820e + ", searchFilters=" + this.f7821f + ", sortType=" + this.f7822g + ", searchPageNumber=" + this.f7823h + ", filtersSource=" + this.f7824i + ", filtersAction=" + this.f7825j + ')';
    }
}
