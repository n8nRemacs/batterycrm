package Bw;

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

/* compiled from: DealRoomAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBw/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bw.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C13193a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f1795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f1796c;

    public C13193a(@k String str) {
        this.f1795b = str;
        LinkedHashMap linkedHashMapW = AK.c.w("from_page", str);
        linkedHashMapW.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f1796c = new ParametrizedClickStreamEvent(9172, 2, linkedHashMapW, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13193a) && L.f(this.f1795b, ((C13193a) obj).f1795b);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f1796c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f1796c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f1796c.f90248c;
    }

    public final int hashCode() {
        return this.f1795b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("AccordionExpandingEvent(fromPage="), this.f1795b, ')');
    }
}
