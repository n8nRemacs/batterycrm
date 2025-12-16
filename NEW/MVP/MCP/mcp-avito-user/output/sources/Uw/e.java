package uw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luw/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f440336b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SearchType f440337c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f440338d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f440339e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f440340f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f440341g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f440342h;

    public e(@l Integer num, @k SearchType searchType, boolean z12, @k String str, @k String str2, @l Integer num2) {
        this.f440336b = num;
        this.f440337c = searchType;
        this.f440338d = z12;
        this.f440339e = str;
        this.f440340f = str2;
        this.f440341g = num2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num != null) {
            h.i(num, "lid", linkedHashMap);
        }
        linkedHashMap.put("avito_pro_prof_search_search_type", searchType.f136335b);
        linkedHashMap.put("avito_pro_prof_search_is_hidden_commission", Boolean.valueOf(z12));
        linkedHashMap.put("avito_pro_prof_search_filters", str);
        linkedHashMap.put("avito_pro_prof_sort_type", str2);
        linkedHashMap.put("avito_pro_prof_search_page_no", Integer.valueOf(num2.intValue()));
        linkedHashMap.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f440342h = new ParametrizedClickStreamEvent(8517, 3, linkedHashMap, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f440336b, eVar.f440336b) && this.f440337c == eVar.f440337c && this.f440338d == eVar.f440338d && L.f(this.f440339e, eVar.f440339e) && L.f(this.f440340f, eVar.f440340f) && L.f(this.f440341g, eVar.f440341g);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f440342h.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f440342h.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f440342h.f90248c;
    }

    public final int hashCode() {
        Integer num = this.f440336b;
        int iD2 = H.d(H.d(r.i((this.f440337c.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31, 31, this.f440338d), 31, this.f440339e), 31, this.f440340f);
        Integer num2 = this.f440341g;
        return iD2 + (num2 != null ? num2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BigFiltersApplyButtonClickedEvent(locationId=");
        sb2.append(this.f440336b);
        sb2.append(", searchType=");
        sb2.append(this.f440337c);
        sb2.append(", isHiddenCommission=");
        sb2.append(this.f440338d);
        sb2.append(", searchFilters=");
        sb2.append(this.f440339e);
        sb2.append(", sortType=");
        sb2.append(this.f440340f);
        sb2.append(", searchPageNumber=");
        return s.j(sb2, this.f440341g, ')');
    }
}
