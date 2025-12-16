package Me;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: CompositeBrokerAnalyticsImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMe/h;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class h implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f10945b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f10946c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f10947d;

    public h(@Y61.k String str, @Y61.k String str2) {
        this.f10945b = str;
        this.f10946c = str2;
        this.f10947d = new ParametrizedClickStreamEvent(9651, 0, P0.g(new Q("item_id", str), new Q("from_page", str2)), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f10945b, hVar.f10945b) && L.f(this.f10946c, hVar.f10946c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f10947d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f10947d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f10947d.f90248c;
    }

    public final int hashCode() {
        return this.f10946c.hashCode() + (this.f10945b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoLoansShowEvent(advertId=");
        sb2.append(this.f10945b);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f10946c, ')');
    }
}
