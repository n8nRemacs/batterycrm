package tN0;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExposureParams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LtN0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_video-snippets-utils_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tN0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48583a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<String> f439234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f439235c;

    public C48583a(@k List<String> list) {
        this.f439234b = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("abs", String.valueOf(list));
        G0 g02 = G0.f406611a;
        this.f439235c = new ParametrizedClickStreamEvent(2587, 0, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        return this.f439235c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f439235c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19128c() {
        return this.f439235c.f90248c;
    }
}
