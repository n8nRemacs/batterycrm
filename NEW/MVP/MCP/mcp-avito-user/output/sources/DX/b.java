package Dx;

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

/* compiled from: VerificationStatusRefreshButtonClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDx/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f3568b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f3569c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f3571e;

    public b(@l String str, @k String str2, long j12) {
        this.f3568b = str;
        this.f3569c = str2;
        this.f3570d = j12;
        this.f3571e = new ParametrizedClickStreamEvent(13569, 1, C35755b0.c(P0.g(new Q("user_id", str), new Q("cookie_id", str2), new Q("event_time", Long.valueOf(j12)), new Q("business_platform", "3"), new Q("pagetype", "unknown_error"), new Q("button_name", "refresh"))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f3568b, bVar.f3568b) && L.f(this.f3569c, bVar.f3569c) && this.f3570d == bVar.f3570d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f3571e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f3571e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f3571e.f90248c;
    }

    public final int hashCode() {
        String str = this.f3568b;
        return ((((((Long.hashCode(this.f3570d) + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f3569c)) * 31) + 51) * 31) + 2038628819) * 31) + 1085444827;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationStatusRefreshButtonClickEvent(userId=");
        sb2.append(this.f3568b);
        sb2.append(", cookieId=");
        sb2.append(this.f3569c);
        sb2.append(", eventTime=");
        return AK.c.j(this.f3570d, ", businessPlatform=3, pageType=unknown_error, buttonName=refresh)", sb2);
    }
}
