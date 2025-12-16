package VE0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: TravelOnboardingButtonClickAnalyticsEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVE0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f17026b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f17027c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17028d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f17029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f17030f;

    public a(long j12, @l String str, @l String str2, @k String str3) {
        this.f17026b = str;
        this.f17027c = str2;
        this.f17028d = j12;
        this.f17029e = str3;
        this.f17030f = new ParametrizedClickStreamEvent(16157, 0, C35755b0.c(P0.g(new Q("uid", str), new Q("from_page", str2), new Q("str_onboarding_id", Long.valueOf(j12)), new Q("action_type", str3))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f17026b, aVar.f17026b) && L.f(this.f17027c, aVar.f17027c) && this.f17028d == aVar.f17028d && L.f(this.f17029e, aVar.f17029e);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f17030f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f17030f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f17030f.f90248c;
    }

    public final int hashCode() {
        String str = this.f17026b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17027c;
        return this.f17029e.hashCode() + r.g((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f17028d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TravelOnboardingButtonClickAnalyticsEvent(userId=");
        sb2.append(this.f17026b);
        sb2.append(", fromPage=");
        sb2.append(this.f17027c);
        sb2.append(", onboardingId=");
        sb2.append(this.f17028d);
        sb2.append(", actionType=");
        return C22026a.c(sb2, this.f17029e, ')');
    }
}
