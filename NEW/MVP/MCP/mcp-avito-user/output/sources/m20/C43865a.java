package m20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationLeadAnalyticsEvents.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm20/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m20.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C43865a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f414269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414270c;

    public C43865a(@k String str) {
        this.f414269b = str;
        this.f414270c = new ParametrizedClickStreamEvent(9446, 6, P0.g(new Q("applicant_type", str), new Q("attr_title", "who_lead_application_continue")), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C43865a) && L.f(this.f414269b, ((C43865a) obj).f414269b);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f414270c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414270c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f414270c.f90248c;
    }

    public final int hashCode() {
        return this.f414269b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ApplicationLeadAcceptedEvent(lead="), this.f414269b, ')');
    }
}
