package pc;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.analytics.C34244a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ScreenDataDrawingEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpc/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pc.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C47052c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f428635b;

    /* renamed from: c, reason: collision with root package name */
    public final long f428636c;

    /* renamed from: d, reason: collision with root package name */
    public final long f428637d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f428638e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f428639f;

    /* renamed from: g, reason: collision with root package name */
    public final int f428640g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final C34244a f428641h;

    /* renamed from: i, reason: collision with root package name */
    public final long f428642i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f428643j;

    /* renamed from: k, reason: collision with root package name */
    public final long f428644k;

    /* renamed from: l, reason: collision with root package name */
    public final long f428645l;

    /* renamed from: m, reason: collision with root package name */
    public final long f428646m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final String f428647n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f428648o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f428649p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f428650q;

    public C47052c(@k String str, long j12, long j13, @k String str2, @k String str3, int i12, @l C34244a c34244a, long j14, @l String str4, long j15, long j16, long j17, @k String str5, boolean z12, boolean z13) {
        this.f428635b = str;
        this.f428636c = j12;
        this.f428637d = j13;
        this.f428638e = str2;
        this.f428639f = str3;
        this.f428640g = i12;
        this.f428641h = c34244a;
        this.f428642i = j14;
        this.f428643j = str4;
        this.f428644k = j15;
        this.f428645l = j16;
        this.f428646m = j17;
        this.f428647n = str5;
        this.f428648o = z12;
        this.f428649p = z13;
        Q q12 = new Q("screen_name", str);
        Q q13 = new Q("screen_start_time", Long.valueOf(j12));
        Q q14 = new Q("mobile_event_duration", Long.valueOf(j13));
        Q q15 = new Q("network_type", str2);
        Q q16 = new Q("content_type", str3);
        Q q17 = new Q("mobile_app_page_number", Integer.valueOf(i12));
        Q q18 = new Q("span_end_time", Long.valueOf(j14));
        Q q19 = new Q("screen_touch_time", Long.valueOf(j15));
        Q q22 = new Q("latest_touch_time_before_span_start_time", Long.valueOf(j16));
        Q q23 = new Q("app_startup_time", Long.valueOf(j17));
        Q q24 = new Q("screen_random_id", str5);
        String str6 = c34244a != null ? c34244a.f253102a : null;
        LinkedHashMap linkedHashMapJ = P0.j(q12, q13, q14, q15, q16, q17, q18, q19, q22, q23, q24, new Q("network_error_id", str6 == null ? "" : str6), new Q("screen_is_frequent", Boolean.valueOf(z12)), new Q("frequent_screens_enabled", Boolean.valueOf(z13)));
        if (str4 != null) {
            linkedHashMapJ.put("exception_id", str4);
            linkedHashMapJ.put("new_exception_id", "unknown-error");
        }
        G0 g02 = G0.f406611a;
        this.f428650q = new ParametrizedClickStreamEvent(3226, 16, linkedHashMapJ, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47052c)) {
            return false;
        }
        C47052c c47052c = (C47052c) obj;
        return L.f(this.f428635b, c47052c.f428635b) && this.f428636c == c47052c.f428636c && this.f428637d == c47052c.f428637d && L.f(this.f428638e, c47052c.f428638e) && L.f(this.f428639f, c47052c.f428639f) && this.f428640g == c47052c.f428640g && L.f(this.f428641h, c47052c.f428641h) && this.f428642i == c47052c.f428642i && L.f(this.f428643j, c47052c.f428643j) && this.f428644k == c47052c.f428644k && this.f428645l == c47052c.f428645l && this.f428646m == c47052c.f428646m && L.f(this.f428647n, c47052c.f428647n) && this.f428648o == c47052c.f428648o && this.f428649p == c47052c.f428649p;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f428650q.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428650q.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f428650q.f90248c;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f428640g, H.d(H.d(r.g(r.g(this.f428635b.hashCode() * 31, 31, this.f428636c), 31, this.f428637d), 31, this.f428638e), 31, this.f428639f), 31);
        C34244a c34244a = this.f428641h;
        int iG2 = r.g((iE2 + (c34244a == null ? 0 : c34244a.hashCode())) * 31, 31, this.f428642i);
        String str = this.f428643j;
        return Boolean.hashCode(this.f428649p) + r.i(H.d(r.g(r.g(r.g((iG2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f428644k), 31, this.f428645l), 31, this.f428646m), 31, this.f428647n), 31, this.f428648o);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenDataDrawingEvent(screenName=");
        sb2.append(this.f428635b);
        sb2.append(", screenStartTime=");
        sb2.append(this.f428636c);
        sb2.append(", duration=");
        sb2.append(this.f428637d);
        sb2.append(", networkType=");
        sb2.append(this.f428638e);
        sb2.append(", contentType=");
        sb2.append(this.f428639f);
        sb2.append(", page=");
        sb2.append(this.f428640g);
        sb2.append(", networkErrorId=");
        sb2.append(this.f428641h);
        sb2.append(", spanEndTime=");
        sb2.append(this.f428642i);
        sb2.append(", exception=");
        sb2.append(this.f428643j);
        sb2.append(", screenTouchTime=");
        sb2.append(this.f428644k);
        sb2.append(", latestTouchBeforeSpanStartTime=");
        sb2.append(this.f428645l);
        sb2.append(", appStartupTime=");
        sb2.append(this.f428646m);
        sb2.append(", screenRandomId=");
        sb2.append(this.f428647n);
        sb2.append(", isScreenFrequent=");
        sb2.append(this.f428648o);
        sb2.append(", isFrequentScreensLoggingEnabled=");
        return r.x(sb2, this.f428649p, ')');
    }

    public /* synthetic */ C47052c(String str, long j12, long j13, String str2, String str3, int i12, C34244a c34244a, long j14, String str4, long j15, long j16, long j17, String str5, boolean z12, boolean z13, int i13, C42822w c42822w) {
        this(str, j12, j13, str2, str3, i12, (i13 & 64) != 0 ? null : c34244a, j14, (i13 & 256) != 0 ? null : str4, (i13 & 512) != 0 ? 0L : j15, j16, j17, str5, z12, z13);
    }
}
