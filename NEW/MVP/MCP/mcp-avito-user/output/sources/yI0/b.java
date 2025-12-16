package Yi0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: SelfEmploymentRedirectRefreshButtonClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYi0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f19628b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f19629c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f19631e;

    public b(@l String str, @k String str2, long j12) {
        this.f19628b = str;
        this.f19629c = str2;
        this.f19630d = j12;
        this.f19631e = new ParametrizedClickStreamEvent(13569, 1, C35755b0.c(P0.g(new Q("user_id", str), new Q("cookie_id", str2), new Q("event_time", Long.valueOf(j12)), new Q("business_platform", "3"), new Q("pagetype", "unknown_error"), new Q("button_name", "refresh"))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f19628b, bVar.f19628b) && L.f(this.f19629c, bVar.f19629c) && this.f19630d == bVar.f19630d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f19631e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f19631e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f19631e.f90248c;
    }

    public final int hashCode() {
        String str = this.f19628b;
        return ((((((Long.hashCode(this.f19630d) + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f19629c)) * 31) + 51) * 31) + 2038628819) * 31) + 1085444827;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelfEmploymentRedirectRefreshButtonClickEvent(userId=");
        sb2.append(this.f19628b);
        sb2.append(", cookieId=");
        sb2.append(this.f19629c);
        sb2.append(", eventTime=");
        return AK.c.j(this.f19630d, ", businessPlatform=3, pageType=unknown_error, buttonName=refresh)", sb2);
    }
}
