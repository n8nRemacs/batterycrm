package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: VideoUploadEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/Q0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Q0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2410b;

    public Q0(@Y61.l Float f12, @Y61.l String str, @Y61.l Long l12, @Y61.l String str2, @Y61.k C50213a c50213a) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c50213a.a());
        if (f12 != null) {
            linkedHashMap.put("video_size", Float.valueOf(f12.floatValue()));
        }
        if (str != null) {
            linkedHashMap.put("videoid", str);
        }
        linkedHashMap.put("timestamp", Long.valueOf(l12.longValue()));
        if (str2 != null) {
            linkedHashMap.put("error_video", str2);
        }
        this.f2410b = new ParametrizedClickStreamEvent(6303, 8, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f2410b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2410b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f2410b.f90248c;
    }
}
