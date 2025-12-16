package m20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationLeadAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm20/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f414273b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f414274c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414275d;

    public e(@k String str, @l String str2) {
        this.f414273b = str;
        this.f414274c = str2;
        this.f414275d = new ParametrizedClickStreamEvent(14510, 2, C35755b0.c(P0.g(new Q("applicant_type", str), new Q("utm_source", str2))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f414273b, eVar.f414273b) && L.f(this.f414274c, eVar.f414274c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF5939c() {
        return this.f414275d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414275d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF5940d() {
        return this.f414275d.f90248c;
    }

    public final int hashCode() {
        int iHashCode = this.f414273b.hashCode() * 31;
        String str = this.f414274c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationLeadChangedEvent(lead=");
        sb2.append(this.f414273b);
        sb2.append(", utmSource=");
        return C22026a.c(sb2, this.f414274c, ')');
    }
}
