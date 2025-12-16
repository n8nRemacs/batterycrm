package Dx;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: VerificationStatusShowEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDx/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f3572b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f3573c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3574d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f3575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f3576f;

    public c(long j12, @l String str, @k String str2, @k String str3) {
        this.f3572b = str;
        this.f3573c = str2;
        this.f3574d = j12;
        this.f3575e = str3;
        this.f3576f = new ParametrizedClickStreamEvent(13575, 1, C35755b0.c(P0.g(new Q("user_id", str), new Q("cookie_id", str2), new Q("event_time", Long.valueOf(j12)), new Q("business_platform", "3"), new Q("verification_gosuslugi_status", str3))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f3572b, cVar.f3572b) && L.f(this.f3573c, cVar.f3573c) && this.f3574d == cVar.f3574d && L.f(this.f3575e, cVar.f3575e);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f3576f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f3576f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f3576f.f90248c;
    }

    public final int hashCode() {
        String str = this.f3572b;
        return this.f3575e.hashCode() + ((((Long.hashCode(this.f3574d) + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f3573c)) * 31) + 51) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationStatusShowEvent(userId=");
        sb2.append(this.f3572b);
        sb2.append(", cookieId=");
        sb2.append(this.f3573c);
        sb2.append(", eventTime=");
        sb2.append(this.f3574d);
        sb2.append(", businessPlatform=3, status=");
        return C22026a.c(sb2, this.f3575e, ')');
    }
}
