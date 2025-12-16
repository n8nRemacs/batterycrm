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

/* compiled from: VerificationStatusPrimaryButtonClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDx/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dx.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C13456a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f3562b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f3563c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3564d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f3565e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f3566f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f3567g;

    public C13456a(@l String str, @k String str2, long j12, @k String str3, @k String str4) {
        this.f3562b = str;
        this.f3563c = str2;
        this.f3564d = j12;
        this.f3565e = str3;
        this.f3566f = str4;
        this.f3567g = new ParametrizedClickStreamEvent(13569, 1, C35755b0.c(P0.g(new Q("user_id", str), new Q("cookie_id", str2), new Q("event_time", Long.valueOf(j12)), new Q("business_platform", "3"), new Q("pagetype", str3), new Q("button_name", str4))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13456a)) {
            return false;
        }
        C13456a c13456a = (C13456a) obj;
        return L.f(this.f3562b, c13456a.f3562b) && L.f(this.f3563c, c13456a.f3563c) && this.f3564d == c13456a.f3564d && L.f(this.f3565e, c13456a.f3565e) && L.f(this.f3566f, c13456a.f3566f);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f3567g.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f3567g.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f3567g.f90248c;
    }

    public final int hashCode() {
        String str = this.f3562b;
        return this.f3566f.hashCode() + H.d((((Long.hashCode(this.f3564d) + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f3563c)) * 31) + 51) * 31, 31, this.f3565e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationStatusPrimaryButtonClickEvent(userId=");
        sb2.append(this.f3562b);
        sb2.append(", cookieId=");
        sb2.append(this.f3563c);
        sb2.append(", eventTime=");
        sb2.append(this.f3564d);
        sb2.append(", businessPlatform=3, pageType=");
        sb2.append(this.f3565e);
        sb2.append(", buttonName=");
        return C22026a.c(sb2, this.f3566f, ')');
    }
}
