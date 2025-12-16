package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import yc.C50213a;

/* compiled from: OpenPhotoPickerEvent.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/n0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cd0.n0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13277n0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2458b;

    public C13277n0(@Y61.k C50213a c50213a, @Y61.l String str) {
        LinkedHashMap linkedHashMapA = c50213a.a();
        if (str != null) {
            linkedHashMapA.put("target_page", str);
        }
        kotlin.G0 g02 = kotlin.G0.f406611a;
        this.f2458b = new ParametrizedClickStreamEvent(3491, 1, linkedHashMapA, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f2458b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2458b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f2458b.f90248c;
    }

    public /* synthetic */ C13277n0(C50213a c50213a, String str, int i12, C42822w c42822w) {
        this(c50213a, (i12 & 2) != 0 ? null : str);
    }
}
