package kj0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: NetworkSuccessRateEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkj0/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f406559b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f406560c;

    /* renamed from: d, reason: collision with root package name */
    public final int f406561d;

    /* renamed from: e, reason: collision with root package name */
    public final int f406562e;

    /* renamed from: f, reason: collision with root package name */
    public final int f406563f;

    /* renamed from: g, reason: collision with root package name */
    public final int f406564g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f406565h;

    public d(int i12, @k String str, @k String str2, int i13, int i14, int i15) {
        this.f406559b = str;
        this.f406560c = str2;
        this.f406561d = i12;
        this.f406562e = i13;
        this.f406563f = i14;
        this.f406564g = i15;
        this.f406565h = new ParametrizedClickStreamEvent(5888, 1, P0.g(new Q("successful_requests", str), new Q("failed_requests", str2), new Q("total_image_successful_requests", Integer.valueOf(i14)), new Q("total_image_failed_requests", Integer.valueOf(i15)), new Q("total_api_successful_requests", Integer.valueOf(i12)), new Q("total_api_failed_requests", Integer.valueOf(i13))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f406559b, dVar.f406559b) && L.f(this.f406560c, dVar.f406560c) && this.f406561d == dVar.f406561d && this.f406562e == dVar.f406562e && this.f406563f == dVar.f406563f && this.f406564g == dVar.f406564g;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f406565h.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f406565h.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f406565h.f90248c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f406564g) + r.e(this.f406563f, r.e(this.f406562e, r.e(this.f406561d, H.d(this.f406559b.hashCode() * 31, 31, this.f406560c), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkSuccessRateEvent(successfulUrls=");
        sb2.append(this.f406559b);
        sb2.append(", failedUrls=");
        sb2.append(this.f406560c);
        sb2.append(", successfulRequests=");
        sb2.append(this.f406561d);
        sb2.append(", failedRequests=");
        sb2.append(this.f406562e);
        sb2.append(", successfulImageRequests=");
        sb2.append(this.f406563f);
        sb2.append(", failedImageRequests=");
        return r.t(sb2, this.f406564g, ')');
    }
}
