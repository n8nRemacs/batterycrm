package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.publish.analytics.events.AddressChoiceType;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import yc.C50213a;

/* compiled from: AddAddressEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cd0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13252b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2425b;

    public C13252b(@Y61.k C50213a c50213a, @Y61.k AddressChoiceType addressChoiceType, @Y61.k AddressParameter.Value value) {
        kotlin.G0 g02;
        LinkedHashMap linkedHashMapJ = kotlin.collections.P0.j(new kotlin.Q("geo", C42745f0.U(Double.valueOf(value.getLat()), Double.valueOf(value.getLng()))));
        String str = c50213a.f443213e;
        if (str != null) {
            linkedHashMapJ.put("iid", str);
            g02 = kotlin.G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            linkedHashMapJ.put("esid", c50213a.b());
        }
        String text = value.getText();
        if (text != null) {
            linkedHashMapJ.put("addr", text);
        }
        String str2 = addressChoiceType.f232219b;
        if (str2 != null) {
            linkedHashMapJ.put("item_add_address_choice_type", str2);
        }
        this.f2425b = new ParametrizedClickStreamEvent(5764, 1, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f2425b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2425b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f2425b.f90248c;
    }
}
