package xw;

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

/* compiled from: DealCabinetAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxw/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xw.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C50009a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f442695b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f442696c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f442697d;

    public C50009a(@k String str, @k String str2) {
        this.f442695b = str;
        this.f442696c = str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from_page", str);
        linkedHashMap.put("avito_pro_prof_search_deal_status", str2);
        linkedHashMap.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f442697d = new ParametrizedClickStreamEvent(11919, 0, linkedHashMap, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50009a)) {
            return false;
        }
        C50009a c50009a = (C50009a) obj;
        return L.f(this.f442695b, c50009a.f442695b) && L.f(this.f442696c, c50009a.f442696c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f442697d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f442697d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f442697d.f90248c;
    }

    public final int hashCode() {
        return this.f442696c.hashCode() + (this.f442695b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientListFilterSelectEvent(fromPage=");
        sb2.append(this.f442695b);
        sb2.append(", dealStatus=");
        return C22026a.c(sb2, this.f442696c, ')');
    }
}
