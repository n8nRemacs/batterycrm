package pc;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.w0;

/* compiled from: ScreenImageServerLoadingEvent.kt */
@s0
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lpc/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "", "screenName", "networkType", "contentType", "", "width", "height", "", "duration", "imageType", "imageUrl", "imageSize", "imageError", "networkErrorId", "", "imageStatus", "cdnCacheHeaders", "Lkotlin/w0;", "diagCodesMask", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/w0;Lkotlin/jvm/internal/w;)V", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f428653b;

    public /* synthetic */ f(String str, String str2, String str3, int i12, int i13, long j12, String str4, String str5, long j13, String str6, String str7, boolean z12, String str8, w0 w0Var, int i14, C42822w c42822w) {
        this(str, str2, str3, (i14 & 8) != 0 ? 0 : i12, (i14 & 16) != 0 ? 0 : i13, j12, str4, str5, j13, (i14 & 512) != 0 ? null : str6, (i14 & 1024) != 0 ? null : str7, z12, (i14 & 4096) != 0 ? null : str8, (i14 & 8192) != 0 ? null : w0Var, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f428653b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428653b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f428653b.f90248c;
    }

    public f(String str, String str2, String str3, int i12, int i13, long j12, String str4, String str5, long j13, String str6, String str7, boolean z12, String str8, w0 w0Var, C42822w c42822w) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("network_type", str2), new Q("screen_name", str), new Q("content_type", str3), new Q("image_type", str4), new Q("image_load_time_delta", Long.valueOf(j12)), new Q("image_url", str5), new Q("image_status", Boolean.valueOf(z12)));
        if (i12 != 0) {
            linkedHashMapJ.put("width", Integer.valueOf(i12));
            G0 g02 = G0.f406611a;
        }
        if (i13 != 0) {
            linkedHashMapJ.put("height", Integer.valueOf(i13));
            G0 g03 = G0.f406611a;
        }
        if (str6 != null) {
            linkedHashMapJ.put("image_error", str6);
        }
        if (str7 != null) {
            linkedHashMapJ.put("network_error_id", str7);
        }
        if (str8 != null) {
            linkedHashMapJ.put("cdn_cache_response_headers", str8);
        }
        if (w0Var != null) {
            linkedHashMapJ.put("backend_error_codes_for_image_load", w0Var);
        }
        if (j13 != 0) {
            linkedHashMapJ.put("image_size_in_bytes", Long.valueOf(j13));
        }
        G0 g04 = G0.f406611a;
        this.f428653b = new ParametrizedClickStreamEvent(4205, 11, linkedHashMapJ, null, 8, null);
    }
}
