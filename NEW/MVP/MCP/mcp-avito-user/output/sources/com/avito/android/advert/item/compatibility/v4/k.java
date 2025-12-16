package com.avito.android.advert.item.compatibility.v4;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: GarageCompatibilityV4Analytics.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v4/k;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class k implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f74554b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f74555c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f74556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f74557e;

    public k(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        this.f74554b = str;
        this.f74555c = str2;
        this.f74556d = str3;
        this.f74557e = new ParametrizedClickStreamEvent(15805, 0, P0.g(new Q("item_id", str), new Q("landing_action", "compatibilities_view"), new Q("spareparts_compatibilities_title", str2), new Q("spareparts_compatibilities_subtitle", str3)), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f74554b, kVar.f74554b) && L.f(this.f74555c, kVar.f74555c) && L.f(this.f74556d, kVar.f74556d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f74557e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f74557e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f74557e.f90248c;
    }

    public final int hashCode() {
        return this.f74556d.hashCode() + H.d(this.f74554b.hashCode() * 31, 31, this.f74555c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GarageCompatibilityV4ShownEvent(advertId=");
        sb2.append(this.f74554b);
        sb2.append(", compatibilitiesTitle=");
        sb2.append(this.f74555c);
        sb2.append(", compatibilitiesSubtitle=");
        return C22026a.c(sb2, this.f74556d, ')');
    }
}
