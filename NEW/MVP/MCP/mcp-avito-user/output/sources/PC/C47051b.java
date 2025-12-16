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

/* compiled from: ScreenDIEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpc/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pc.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C47051b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f428625b;

    /* renamed from: c, reason: collision with root package name */
    public final long f428626c;

    /* renamed from: d, reason: collision with root package name */
    public final long f428627d;

    /* renamed from: e, reason: collision with root package name */
    public final long f428628e;

    /* renamed from: f, reason: collision with root package name */
    public final long f428629f;

    /* renamed from: g, reason: collision with root package name */
    public final long f428630g;

    /* renamed from: h, reason: collision with root package name */
    public final long f428631h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f428632i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f428633j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f428634k;

    public C47051b(long j12, long j13, long j14, long j15, long j16, long j17, @k String str, @k String str2, @k String str3) {
        this.f428625b = str;
        this.f428626c = j12;
        this.f428627d = j13;
        this.f428628e = j14;
        this.f428629f = j15;
        this.f428630g = j16;
        this.f428631h = j17;
        this.f428632i = str2;
        this.f428633j = str3;
        this.f428634k = new ParametrizedClickStreamEvent(3222, 14, P0.j(new Q("screen_name", str), new Q("screen_start_time", Long.valueOf(j12)), new Q("mobile_event_duration", Long.valueOf(j13)), new Q("span_end_time", Long.valueOf(j14)), new Q("screen_touch_time", Long.valueOf(j15)), new Q("latest_touch_time_before_span_start_time", Long.valueOf(j16)), new Q("app_startup_time", Long.valueOf(j17)), new Q("screen_random_id", str2), new Q("content_type", str3)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47051b)) {
            return false;
        }
        C47051b c47051b = (C47051b) obj;
        return L.f(this.f428625b, c47051b.f428625b) && this.f428626c == c47051b.f428626c && this.f428627d == c47051b.f428627d && this.f428628e == c47051b.f428628e && this.f428629f == c47051b.f428629f && this.f428630g == c47051b.f428630g && this.f428631h == c47051b.f428631h && L.f(this.f428632i, c47051b.f428632i) && L.f(this.f428633j, c47051b.f428633j);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f428634k.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428634k.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f428634k.f90248c;
    }

    public final int hashCode() {
        return this.f428633j.hashCode() + H.d(r.g(r.g(r.g(r.g(r.g(r.g(this.f428625b.hashCode() * 31, 31, this.f428626c), 31, this.f428627d), 31, this.f428628e), 31, this.f428629f), 31, this.f428630g), 31, this.f428631h), 31, this.f428632i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenDIEvent(screenName=");
        sb2.append(this.f428625b);
        sb2.append(", screenStartTime=");
        sb2.append(this.f428626c);
        sb2.append(", duration=");
        sb2.append(this.f428627d);
        sb2.append(", spanEndTime=");
        sb2.append(this.f428628e);
        sb2.append(", screenTouchTime=");
        sb2.append(this.f428629f);
        sb2.append(", latestTouchBeforeSpanStartTime=");
        sb2.append(this.f428630g);
        sb2.append(", appStartupTime=");
        sb2.append(this.f428631h);
        sb2.append(", screenRandomId=");
        sb2.append(this.f428632i);
        sb2.append(", contentType=");
        return C22026a.c(sb2, this.f428633j, ')');
    }

    public /* synthetic */ C47051b(String str, long j12, long j13, long j14, long j15, long j16, long j17, String str2, String str3, int i12, C42822w c42822w) {
        this(j12, j13, j14, (i12 & 16) != 0 ? 0L : j15, j16, j17, str, str2, str3);
    }
}
