package VE0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: TravelOnboardingShownAnalyticsEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVE0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f17031b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f17032c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f17034e;

    public b(@l String str, @l String str2, long j12) {
        this.f17031b = str;
        this.f17032c = str2;
        this.f17033d = j12;
        this.f17034e = new ParametrizedClickStreamEvent(16156, 0, C35755b0.c(P0.g(new Q("uid", str), new Q("from_page", str2), new Q("str_onboarding_id", Long.valueOf(j12)))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f17031b, bVar.f17031b) && L.f(this.f17032c, bVar.f17032c) && this.f17033d == bVar.f17033d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f17034e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f17034e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f17034e.f90248c;
    }

    public final int hashCode() {
        String str = this.f17031b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17032c;
        return Long.hashCode(this.f17033d) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TravelOnboardingShownAnalyticsEvent(userId=");
        sb2.append(this.f17031b);
        sb2.append(", fromPage=");
        sb2.append(this.f17032c);
        sb2.append(", onboardingId=");
        return r.u(sb2, this.f17033d, ')');
    }
}
