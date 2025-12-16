package L8;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: OptimalPriceWidgetShownEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LL8/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f9807b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f9808c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f9809d;

    public a(@k String str, @l String str2) {
        this.f9807b = str;
        this.f9808c = str2;
        LinkedHashMap linkedHashMapW = c.w("iid", str);
        if (str2 != null) {
            linkedHashMapW.put("x", str2);
        }
        G0 g02 = G0.f406611a;
        this.f9809d = new ParametrizedClickStreamEvent(15465, 2, "travel_optimal_price", linkedHashMapW);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f9807b, aVar.f9807b) && L.f(this.f9808c, aVar.f9808c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f9809d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f9809d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f9809d.f90248c;
    }

    public final int hashCode() {
        int iHashCode = this.f9807b.hashCode() * 31;
        String str = this.f9808c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OptimalPriceWidgetShownEvent(iid=");
        sb2.append(this.f9807b);
        sb2.append(", x=");
        return C22026a.c(sb2, this.f9808c, ')');
    }
}
