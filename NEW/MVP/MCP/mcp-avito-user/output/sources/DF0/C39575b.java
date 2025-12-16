package dF0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.category_parameters.DateTimeParameterKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TravelPaymentDetailsShowEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdF0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_travel-payment-methods_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dF0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39575b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f393774b;

    public C39575b(@l Long l12, @k String str, @l String str2, @l String str3, @l String str4, @l String str5) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("from_page", str));
        if (str3 != null) {
            linkedHashMapJ.put("iid", str3);
        }
        if (str2 != null) {
            linkedHashMapJ.put("uid", str2);
        }
        if (str4 != null) {
            linkedHashMapJ.put("orderid_string", str4);
        }
        if (str5 != null) {
            linkedHashMapJ.put("banner_type", str5);
        }
        if (l12 != null) {
            linkedHashMapJ.put("mcid", l12);
        }
        G0 g02 = G0.f406611a;
        this.f393774b = new ParametrizedClickStreamEvent(14072, 3, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f393774b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f393774b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f393774b.f90248c;
    }

    public /* synthetic */ C39575b(String str, String str2, String str3, String str4, String str5, Long l12, int i12, C42822w c42822w) {
        this((i12 & 32) == 0 ? l12 : null, str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5);
    }
}
