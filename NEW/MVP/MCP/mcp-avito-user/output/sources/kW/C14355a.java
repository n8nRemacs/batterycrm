package Kw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyAgencySearchAnalyticsEvents.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKw/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Kw.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C14355a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f9683b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9684c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f9686e;

    public C14355a(@l Integer num, long j12, long j13) {
        this.f9683b = num;
        this.f9684c = j12;
        this.f9685d = j13;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num != null) {
            org.webrtc.h.i(num, "lid", linkedHashMap);
        }
        linkedHashMap.put("from_page", "flat_snippet");
        linkedHashMap.put("development_id", Long.valueOf(j12));
        linkedHashMap.put("avito_prof_search_flat_id", Long.valueOf(j13));
        linkedHashMap.put("business_platform", 3);
        G0 g02 = G0.f406611a;
        this.f9686e = new ParametrizedClickStreamEvent(8496, 2, linkedHashMap, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14355a)) {
            return false;
        }
        C14355a c14355a = (C14355a) obj;
        return L.f(this.f9683b, c14355a.f9683b) && this.f9684c == c14355a.f9684c && this.f9685d == c14355a.f9685d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF327516b() {
        return this.f9686e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f9686e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF327517c() {
        return this.f9686e.f90248c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9685d) + r.g((((this.f9683b == null ? 0 : r0.hashCode()) * 31) - 1312354729) * 31, 31, this.f9684c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientBookingClickedEvent(locationId=");
        sb2.append(this.f9683b);
        sb2.append(", fromPage=flat_snippet, developmentId=");
        sb2.append(this.f9684c);
        sb2.append(", lotId=");
        return r.u(sb2, this.f9685d, ')');
    }
}
