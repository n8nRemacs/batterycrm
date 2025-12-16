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

/* compiled from: SelfEmploymentRedirectPrimaryButtonClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYi0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yi0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C18268a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f19624b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f19625c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f19627e;

    public C18268a(@l String str, @k String str2, long j12) {
        this.f19624b = str;
        this.f19625c = str2;
        this.f19626d = j12;
        this.f19627e = new ParametrizedClickStreamEvent(13572, 1, C35755b0.c(P0.g(new Q("user_id", str), new Q("cookie_id", str2), new Q("event_time", Long.valueOf(j12)), new Q("business_platform", "3"), new Q("pagetype", "first_try_self_employment_verify"))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18268a)) {
            return false;
        }
        C18268a c18268a = (C18268a) obj;
        return L.f(this.f19624b, c18268a.f19624b) && L.f(this.f19625c, c18268a.f19625c) && this.f19626d == c18268a.f19626d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f19627e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f19627e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f19627e.f90248c;
    }

    public final int hashCode() {
        return ((((Long.hashCode(this.f19626d) + H.d((this.f19624b == null ? 0 : r0.hashCode()) * 31, 31, this.f19625c)) * 31) + 51) * 31) - 168726548;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelfEmploymentRedirectPrimaryButtonClickEvent(userId=");
        sb2.append(this.f19624b);
        sb2.append(", cookieId=");
        sb2.append(this.f19625c);
        sb2.append(", eventTime=");
        return AK.c.j(this.f19626d, ", businessPlatform=3, pageType=first_try_self_employment_verify)", sb2);
    }
}
