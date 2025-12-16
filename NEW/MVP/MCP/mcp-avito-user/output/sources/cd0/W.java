package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.publish.analytics.events.AddressChoiceType;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: FirstAddressEditingEvent.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/W;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class W implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2418b;

    public W(@Y61.k String str, @Y61.l String str2, @Y61.k AddressChoiceType addressChoiceType) {
        HashMap mapG = org.webrtc.h.g("esid", str);
        if (str2 != null) {
            mapG.put("itemId", str2);
        }
        String str3 = addressChoiceType.f232219b;
        if (str3 != null) {
            mapG.put("item_add_address_choice_type", str3);
        }
        kotlin.G0 g02 = kotlin.G0.f406611a;
        this.f2418b = new ParametrizedClickStreamEvent(2350, 8, mapG, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f2418b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2418b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f2418b.f90248c;
    }
}
