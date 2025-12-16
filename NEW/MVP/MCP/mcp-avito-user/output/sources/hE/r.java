package he;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: TfaProblemReportedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhe/r;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class r implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f397310b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AutoRecoveryLink.Scenario f397311c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f397312d;

    public r(@Y61.k String str, @Y61.k AutoRecoveryLink.Scenario scenario) {
        this.f397310b = str;
        this.f397311c = scenario;
        this.f397312d = new ParametrizedClickStreamEvent(7202, 2, P0.g(new Q("s", str), new Q("problem_scenario_during_tfa_ahtihack", scenario.f133905b)), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.f397310b, rVar.f397310b) && this.f397311c == rVar.f397311c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f397312d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f397312d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f397312d.f90248c;
    }

    public final int hashCode() {
        return this.f397311c.hashCode() + (this.f397310b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "TfaProblemReportedEvent(src=" + this.f397310b + ", scenario=" + this.f397311c + ')';
    }
}
