package pc;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ScreenLocalLoadingEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpc/h;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class h implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f428664b;

    /* renamed from: c, reason: collision with root package name */
    public final long f428665c;

    /* renamed from: d, reason: collision with root package name */
    public final long f428666d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f428667e;

    /* renamed from: f, reason: collision with root package name */
    public final int f428668f;

    /* renamed from: g, reason: collision with root package name */
    public final long f428669g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f428670h;

    /* renamed from: i, reason: collision with root package name */
    public final long f428671i;

    /* renamed from: j, reason: collision with root package name */
    public final long f428672j;

    /* renamed from: k, reason: collision with root package name */
    public final long f428673k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f428674l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f428675m;

    public h(@k String str, long j12, long j13, @k String str2, int i12, long j14, @l String str3, long j15, long j16, long j17, @k String str4) {
        this.f428664b = str;
        this.f428665c = j12;
        this.f428666d = j13;
        this.f428667e = str2;
        this.f428668f = i12;
        this.f428669g = j14;
        this.f428670h = str3;
        this.f428671i = j15;
        this.f428672j = j16;
        this.f428673k = j17;
        this.f428674l = str4;
        LinkedHashMap linkedHashMapJ = P0.j(new Q("screen_name", str), new Q("screen_start_time", Long.valueOf(j12)), new Q("mobile_event_duration", Long.valueOf(j13)), new Q("content_type", str2), new Q("mobile_app_page_number", Integer.valueOf(i12)), new Q("span_end_time", Long.valueOf(j14)), new Q("screen_touch_time", Long.valueOf(j15)), new Q("latest_touch_time_before_span_start_time", Long.valueOf(j16)), new Q("app_startup_time", Long.valueOf(j17)), new Q("screen_random_id", str4));
        if (str3 != null) {
            linkedHashMapJ.put("exception_id", str3);
        }
        this.f428675m = new ParametrizedClickStreamEvent(3224, 10, linkedHashMapJ, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f428664b, hVar.f428664b) && this.f428665c == hVar.f428665c && this.f428666d == hVar.f428666d && L.f(this.f428667e, hVar.f428667e) && this.f428668f == hVar.f428668f && this.f428669g == hVar.f428669g && L.f(this.f428670h, hVar.f428670h) && this.f428671i == hVar.f428671i && this.f428672j == hVar.f428672j && this.f428673k == hVar.f428673k && L.f(this.f428674l, hVar.f428674l);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f428675m.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428675m.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f428675m.f90248c;
    }

    public final int hashCode() {
        int iG2 = r.g(r.e(this.f428668f, H.d(r.g(r.g(this.f428664b.hashCode() * 31, 31, this.f428665c), 31, this.f428666d), 31, this.f428667e), 31), 31, this.f428669g);
        String str = this.f428670h;
        return this.f428674l.hashCode() + r.g(r.g(r.g((iG2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f428671i), 31, this.f428672j), 31, this.f428673k);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenLocalLoadingEvent(screenName=");
        sb2.append(this.f428664b);
        sb2.append(", screenStartTime=");
        sb2.append(this.f428665c);
        sb2.append(", duration=");
        sb2.append(this.f428666d);
        sb2.append(", contentType=");
        sb2.append(this.f428667e);
        sb2.append(", page=");
        sb2.append(this.f428668f);
        sb2.append(", spanEndTime=");
        sb2.append(this.f428669g);
        sb2.append(", exception=");
        sb2.append(this.f428670h);
        sb2.append(", screenTouchTime=");
        sb2.append(this.f428671i);
        sb2.append(", latestTouchBeforeSpanStartTime=");
        sb2.append(this.f428672j);
        sb2.append(", appStartupTime=");
        sb2.append(this.f428673k);
        sb2.append(", screenRandomId=");
        return C22026a.c(sb2, this.f428674l, ')');
    }

    public /* synthetic */ h(String str, long j12, long j13, String str2, int i12, long j14, String str3, long j15, long j16, long j17, String str4, int i13, C42822w c42822w) {
        this(str, j12, j13, str2, i12, j14, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? 0L : j15, j16, j17, str4);
    }
}
