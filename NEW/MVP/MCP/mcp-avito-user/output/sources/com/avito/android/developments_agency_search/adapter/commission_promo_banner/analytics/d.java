package com.avito.android.developments_agency_search.adapter.commission_promo_banner.analytics;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommissionPromoBannerAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/commission_promo_banner/analytics/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f136237b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f136238c;

    public d(@k String str) {
        this.f136237b = str;
        LinkedHashMap linkedHashMapW = AK.c.w("from_page", str);
        linkedHashMapW.put("avito_pro_prof_search_extra_info", (String) a.f136233a.getValue());
        linkedHashMapW.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f136238c = new ParametrizedClickStreamEvent(13325, 0, linkedHashMapW, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f136237b, ((d) obj).f136237b);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f136238c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f136238c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f136238c.f90248c;
    }

    public final int hashCode() {
        return this.f136237b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("CommissionPromoBannerItemClickedEvent(fromPage="), this.f136237b, ')');
    }
}
