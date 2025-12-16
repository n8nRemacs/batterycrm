package pc;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ScreenServerLoadingEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpc/i;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class i implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f428676b;

    /* renamed from: c, reason: collision with root package name */
    public final long f428677c;

    /* renamed from: d, reason: collision with root package name */
    public final long f428678d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f428679e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f428680f;

    /* renamed from: g, reason: collision with root package name */
    public final int f428681g;

    /* renamed from: h, reason: collision with root package name */
    public final long f428682h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f428683i;

    /* renamed from: j, reason: collision with root package name */
    public final long f428684j;

    /* renamed from: k, reason: collision with root package name */
    public final long f428685k;

    /* renamed from: l, reason: collision with root package name */
    public final long f428686l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f428687m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f428688n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f428689o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f428690p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f428691q;

    public i(@k String str, long j12, long j13, @k String str2, @k String str3, int i12, long j14, @l String str4, long j15, long j16, long j17, @k String str5, @l String str6, boolean z12, boolean z13) {
        this.f428676b = str;
        this.f428677c = j12;
        this.f428678d = j13;
        this.f428679e = str2;
        this.f428680f = str3;
        this.f428681g = i12;
        this.f428682h = j14;
        this.f428683i = str4;
        this.f428684j = j15;
        this.f428685k = j16;
        this.f428686l = j17;
        this.f428687m = str5;
        this.f428688n = str6;
        this.f428689o = z12;
        this.f428690p = z13;
        LinkedHashMap linkedHashMapJ = P0.j(new Q("screen_name", str), new Q("screen_start_time", Long.valueOf(j12)), new Q("mobile_event_duration", Long.valueOf(j13)), new Q("network_type", str2), new Q("content_type", str3), new Q("mobile_app_page_number", Integer.valueOf(i12)), new Q("span_end_time", Long.valueOf(j14)), new Q("screen_touch_time", Long.valueOf(j15)), new Q("latest_touch_time_before_span_start_time", Long.valueOf(j16)), new Q("app_startup_time", Long.valueOf(j17)), new Q("screen_random_id", str5), new Q("network_error_id", str6 == null ? "" : str6), new Q("screen_is_frequent", Boolean.valueOf(z12)), new Q("frequent_screens_enabled", Boolean.valueOf(z13)));
        if (str4 != null) {
            linkedHashMapJ.put("exception_id", str4);
        }
        G0 g02 = G0.f406611a;
        this.f428691q = new ParametrizedClickStreamEvent(3223, 13, linkedHashMapJ, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f428676b, iVar.f428676b) && this.f428677c == iVar.f428677c && this.f428678d == iVar.f428678d && L.f(this.f428679e, iVar.f428679e) && L.f(this.f428680f, iVar.f428680f) && this.f428681g == iVar.f428681g && this.f428682h == iVar.f428682h && L.f(this.f428683i, iVar.f428683i) && this.f428684j == iVar.f428684j && this.f428685k == iVar.f428685k && this.f428686l == iVar.f428686l && L.f(this.f428687m, iVar.f428687m) && L.f(this.f428688n, iVar.f428688n) && this.f428689o == iVar.f428689o && this.f428690p == iVar.f428690p;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f428691q.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428691q.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f428691q.f90248c;
    }

    public final int hashCode() {
        int iG2 = r.g(r.e(this.f428681g, H.d(H.d(r.g(r.g(this.f428676b.hashCode() * 31, 31, this.f428677c), 31, this.f428678d), 31, this.f428679e), 31, this.f428680f), 31), 31, this.f428682h);
        String str = this.f428683i;
        int iD2 = H.d(r.g(r.g(r.g((iG2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f428684j), 31, this.f428685k), 31, this.f428686l), 31, this.f428687m);
        String str2 = this.f428688n;
        return Boolean.hashCode(this.f428690p) + r.i((iD2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f428689o);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenServerLoadingEvent(screenName=");
        sb2.append(this.f428676b);
        sb2.append(", screenStartTime=");
        sb2.append(this.f428677c);
        sb2.append(", duration=");
        sb2.append(this.f428678d);
        sb2.append(", networkType=");
        sb2.append(this.f428679e);
        sb2.append(", contentType=");
        sb2.append(this.f428680f);
        sb2.append(", page=");
        sb2.append(this.f428681g);
        sb2.append(", spanEndTime=");
        sb2.append(this.f428682h);
        sb2.append(", exception=");
        sb2.append(this.f428683i);
        sb2.append(", screenTouchTime=");
        sb2.append(this.f428684j);
        sb2.append(", latestTouchBeforeSpanStartTime=");
        sb2.append(this.f428685k);
        sb2.append(", appStartupTime=");
        sb2.append(this.f428686l);
        sb2.append(", screenRandomId=");
        sb2.append(this.f428687m);
        sb2.append(", networkErrorId=");
        sb2.append(this.f428688n);
        sb2.append(", isScreenFrequent=");
        sb2.append(this.f428689o);
        sb2.append(", isFrequentScreensLoggingEnabled=");
        return r.x(sb2, this.f428690p, ')');
    }

    public /* synthetic */ i(String str, long j12, long j13, String str2, String str3, int i12, long j14, String str4, long j15, long j16, long j17, String str5, String str6, boolean z12, boolean z13, int i13, C42822w c42822w) {
        this(str, j12, j13, str2, str3, i12, j14, (i13 & 128) != 0 ? null : str4, (i13 & 256) != 0 ? 0L : j15, j16, j17, str5, (i13 & 4096) != 0 ? null : str6, z12, z13);
    }
}
