package com.avito.android.developments_agency_search.analytics;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.webrtc.h;

/* compiled from: AnalyticsEvents.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/analytics/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f136337b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f136338c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SearchType f136339d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f136340e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f136341f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f136342g;

    /* renamed from: h, reason: collision with root package name */
    public final int f136343h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f136344i;

    public e(@l Integer num, @k String str, @k SearchType searchType, boolean z12, @k String str2, @k String str3, int i12) {
        this.f136337b = num;
        this.f136338c = str;
        this.f136339d = searchType;
        this.f136340e = z12;
        this.f136341f = str2;
        this.f136342g = str3;
        this.f136343h = i12;
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
        linkedHashMap.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f136344i = new ParametrizedClickStreamEvent(8516, 2, linkedHashMap, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f136337b, eVar.f136337b) && L.f(this.f136338c, eVar.f136338c) && this.f136339d == eVar.f136339d && this.f136340e == eVar.f136340e && L.f(this.f136341f, eVar.f136341f) && L.f(this.f136342g, eVar.f136342g) && this.f136343h == eVar.f136343h;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f136344i.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f136344i.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f136344i.f90248c;
    }

    public final int hashCode() {
        Integer num = this.f136337b;
        return Integer.hashCode(this.f136343h) + H.d(H.d(r.i((this.f136339d.hashCode() + H.d((num == null ? 0 : num.hashCode()) * 31, 31, this.f136338c)) * 31, 31, this.f136340e), 31, this.f136341f), 31, this.f136342g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FiltersResetButtonClickedEvent(locationId=");
        sb2.append(this.f136337b);
        sb2.append(", fromPage=");
        sb2.append(this.f136338c);
        sb2.append(", searchType=");
        sb2.append(this.f136339d);
        sb2.append(", isHiddenCommission=");
        sb2.append(this.f136340e);
        sb2.append(", searchFilters=");
        sb2.append(this.f136341f);
        sb2.append(", sortType=");
        sb2.append(this.f136342g);
        sb2.append(", searchPageNumber=");
        return r.t(sb2, this.f136343h, ')');
    }
}
