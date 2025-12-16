package Me;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: CompositeBrokerAnalyticsImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMe/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f10940b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f10941c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f10942d;

    public f(@Y61.k String str, @Y61.l String str2) {
        this.f10940b = str;
        this.f10941c = str2;
        this.f10942d = new ParametrizedClickStreamEvent(11374, 0, C35755b0.c(P0.g(new Q("item_id", str), new Q("from_page", str2))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f10940b, fVar.f10940b) && L.f(this.f10941c, fVar.f10941c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f10942d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f10942d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f10942d.f90248c;
    }

    public final int hashCode() {
        int iHashCode = this.f10940b.hashCode() * 31;
        String str = this.f10941c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoLoansHowToGetCreditLinkClickedEvent(advertId=");
        sb2.append(this.f10940b);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f10941c, ')');
    }
}
