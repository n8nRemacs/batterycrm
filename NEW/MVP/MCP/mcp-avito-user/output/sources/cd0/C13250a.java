package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.publish.FromPage;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AddAddressButtonEvent.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cd0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13250a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2423b;

    public C13250a(@Y61.k String str, @Y61.l String str2, @Y61.k FromPage fromPage) {
        HashMap map = new HashMap();
        map.put("esid", str);
        if (str2 != null) {
            map.put("itemId", str2);
        }
        map.put("from_page", fromPage.name().toLowerCase(Locale.ROOT));
        kotlin.G0 g02 = kotlin.G0.f406611a;
        this.f2423b = new ParametrizedClickStreamEvent(12765, 2, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f2423b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2423b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f2423b.f90248c;
    }
}
