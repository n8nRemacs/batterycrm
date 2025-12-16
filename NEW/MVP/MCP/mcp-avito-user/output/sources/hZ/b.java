package Hz;

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

/* compiled from: EsiaRedirectPrimaryButtonClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHz/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f7852b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f7853c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f7855e;

    public b(@l String str, @k String str2, long j12) {
        this.f7852b = str;
        this.f7853c = str2;
        this.f7854d = j12;
        this.f7855e = new ParametrizedClickStreamEvent(13566, 1, C35755b0.c(P0.g(new Q("user_id", str), new Q("cookie_id", str2), new Q("event_time", Long.valueOf(j12)), new Q("business_platform", "3"))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f7852b, bVar.f7852b) && L.f(this.f7853c, bVar.f7853c) && this.f7854d == bVar.f7854d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f7855e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f7855e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f7855e.f90248c;
    }

    public final int hashCode() {
        String str = this.f7852b;
        return ((Long.hashCode(this.f7854d) + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f7853c)) * 31) + 51;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EsiaRedirectPrimaryButtonClickEvent(userId=");
        sb2.append(this.f7852b);
        sb2.append(", cookieId=");
        sb2.append(this.f7853c);
        sb2.append(", eventTime=");
        return AK.c.j(this.f7854d, ", businessPlatform=3)", sb2);
    }
}
