package pc;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: ScreenFirstImageDrawingEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpc/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pc.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47053d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f428651b;

    public C47053d(@k String str, @k String str2, @k String str3, long j12, long j13, long j14, long j15, @k String str4, @l String str5, @l String str6, boolean z12, int i12, int i13, long j16, @l String str7) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("network_type", str2), new Q("screen_name", str), new Q("content_type", str3), new Q("app_startup_time", Long.valueOf(j14)), new Q("screen_start_time", Long.valueOf(j15)), new Q("image_url", str4), new Q("image_status", Boolean.valueOf(z12)), new Q("image_draw_time", Long.valueOf(j16)));
        if (i12 != 0) {
            linkedHashMapJ.put("width", Integer.valueOf(i12));
            G0 g02 = G0.f406611a;
        }
        if (i13 != 0) {
            linkedHashMapJ.put("height", Integer.valueOf(i13));
            G0 g03 = G0.f406611a;
        }
        if (j12 != 0) {
            linkedHashMapJ.put("screen_touch_time", Long.valueOf(j12));
            G0 g04 = G0.f406611a;
        }
        if (j13 != 0) {
            linkedHashMapJ.put("latest_touch_time_before_span_start_time", Long.valueOf(j13));
            G0 g05 = G0.f406611a;
        }
        if (str5 != null) {
            linkedHashMapJ.put("image_error", str5);
        }
        G0 g06 = G0.f406611a;
        if (str6 != null) {
            linkedHashMapJ.put("network_error_id", str6);
        }
        if (str7 != null) {
            linkedHashMapJ.put("cdn_cache_response_headers", str7);
        }
        this.f428651b = new ParametrizedClickStreamEvent(4204, 13, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f428651b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428651b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f428651b.f90248c;
    }

    public /* synthetic */ C47053d(String str, String str2, String str3, long j12, long j13, long j14, long j15, String str4, String str5, String str6, boolean z12, int i12, int i13, long j16, String str7, int i14, C42822w c42822w) {
        this(str, str2, str3, (i14 & 8) != 0 ? 0L : j12, j13, j14, j15, str4, (i14 & 256) != 0 ? null : str5, (i14 & 512) != 0 ? null : str6, z12, (i14 & 2048) != 0 ? 0 : i12, (i14 & 4096) != 0 ? 0 : i13, j16, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str7);
    }
}
