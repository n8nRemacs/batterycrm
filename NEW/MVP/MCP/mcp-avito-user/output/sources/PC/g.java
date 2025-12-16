package pc;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ScreenInitEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpc/g;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class g implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f428654b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f428655c;

    /* renamed from: d, reason: collision with root package name */
    public final long f428656d;

    /* renamed from: e, reason: collision with root package name */
    public final long f428657e;

    /* renamed from: f, reason: collision with root package name */
    public final long f428658f;

    /* renamed from: g, reason: collision with root package name */
    public final long f428659g;

    /* renamed from: h, reason: collision with root package name */
    public final long f428660h;

    /* renamed from: i, reason: collision with root package name */
    public final long f428661i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f428662j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f428663k;

    public g(long j12, long j13, long j14, long j15, long j16, long j17, @k String str, @k String str2, @k String str3) {
        this.f428654b = str;
        this.f428655c = str2;
        this.f428656d = j12;
        this.f428657e = j13;
        this.f428658f = j14;
        this.f428659g = j15;
        this.f428660h = j16;
        this.f428661i = j17;
        this.f428662j = str3;
        this.f428663k = new ParametrizedClickStreamEvent(3221, 14, P0.j(new Q("screen_name", str), new Q("screen_start_time", Long.valueOf(j12)), new Q("mobile_event_duration", Long.valueOf(j13)), new Q("span_end_time", Long.valueOf(j14)), new Q("screen_touch_time", Long.valueOf(j15)), new Q("latest_touch_time_before_span_start_time", Long.valueOf(j16)), new Q("app_startup_time", Long.valueOf(j17)), new Q("screen_random_id", str3), new Q("content_type", str2)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f428654b, gVar.f428654b) && L.f(this.f428655c, gVar.f428655c) && this.f428656d == gVar.f428656d && this.f428657e == gVar.f428657e && this.f428658f == gVar.f428658f && this.f428659g == gVar.f428659g && this.f428660h == gVar.f428660h && this.f428661i == gVar.f428661i && L.f(this.f428662j, gVar.f428662j);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        return this.f428663k.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428663k.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF11770c() {
        return this.f428663k.f90248c;
    }

    public final int hashCode() {
        return this.f428662j.hashCode() + r.g(r.g(r.g(r.g(r.g(r.g(H.d(this.f428654b.hashCode() * 31, 31, this.f428655c), 31, this.f428656d), 31, this.f428657e), 31, this.f428658f), 31, this.f428659g), 31, this.f428660h), 31, this.f428661i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenInitEvent(screenName=");
        sb2.append(this.f428654b);
        sb2.append(", contentType=");
        sb2.append(this.f428655c);
        sb2.append(", screenStartTime=");
        sb2.append(this.f428656d);
        sb2.append(", duration=");
        sb2.append(this.f428657e);
        sb2.append(", spanEndTime=");
        sb2.append(this.f428658f);
        sb2.append(", screenTouchTime=");
        sb2.append(this.f428659g);
        sb2.append(", latestTouchBeforeSpanStartTime=");
        sb2.append(this.f428660h);
        sb2.append(", appStartupTime=");
        sb2.append(this.f428661i);
        sb2.append(", screenRandomId=");
        return C22026a.c(sb2, this.f428662j, ')');
    }

    public /* synthetic */ g(String str, String str2, long j12, long j13, long j14, long j15, long j16, long j17, String str3, int i12, C42822w c42822w) {
        this(j12, j13, j14, (i12 & 32) != 0 ? 0L : j15, j16, j17, str, str2, str3);
    }
}
