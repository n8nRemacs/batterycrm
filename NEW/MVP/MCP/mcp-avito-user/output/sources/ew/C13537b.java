package Ew;

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

/* compiled from: HelpCenterAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEw/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ew.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C13537b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f4402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f4403c;

    public C13537b(@k String str) {
        this.f4402b = str;
        LinkedHashMap linkedHashMapW = AK.c.w("from_page", "regional_expert");
        linkedHashMapW.put("business_platform", 3);
        linkedHashMapW.put("avito_pro_prof_search_extra_info", str);
        G0 g02 = G0.f406611a;
        this.f4403c = new ParametrizedClickStreamEvent(13910, 1, linkedHashMapW, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13537b)) {
            return false;
        }
        C13537b c13537b = (C13537b) obj;
        c13537b.getClass();
        return L.f(this.f4402b, c13537b.f4402b);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f4403c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f4403c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f4403c.f90248c;
    }

    public final int hashCode() {
        return this.f4402b.hashCode() + 1174549750;
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("CallRegionalManagerButtonClickedEvent(fromPage=regional_expert, managerName="), this.f4402b, ')');
    }
}
