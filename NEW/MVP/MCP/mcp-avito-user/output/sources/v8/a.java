package V8;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.builders.d;
import kotlin.jvm.internal.s0;

/* compiled from: SalesAdvertPromoBannerShownEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV8/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f16931b;

    public a(@k String str, @l String str2, @l String str3, boolean z12) {
        d dVar = new d();
        dVar.put("iid", str);
        dVar.put("type", z12 ? "with_price" : "no_price");
        if (str2 != null) {
            dVar.put("categoryId", str2);
        }
        if (str3 != null) {
            dVar.put("microCategoryId", str3);
        }
        G0 g02 = G0.f406611a;
        this.f16931b = new ParametrizedClickStreamEvent(16016, 1, dVar.b(), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF222438b() {
        return this.f16931b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f16931b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF222439c() {
        return this.f16931b.f90248c;
    }
}
