package B7;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AmenitiesAndInteriorPhotosClickedEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB7/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-amenities_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f878b;

    public c(@l Map<String, ? extends Object> map, @l String str, @k String str2) {
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        if (map != null) {
            dVar.putAll(map);
        }
        if (str != null) {
            dVar.put("image_url", str);
        }
        dVar.put("business_platform", 3);
        dVar.put("from_block_name", str2);
        G0 g02 = G0.f406611a;
        this.f878b = new ParametrizedClickStreamEvent(16957, 2, dVar.b(), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF222438b() {
        return this.f878b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f878b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF222439c() {
        return this.f878b.f90248c;
    }
}
