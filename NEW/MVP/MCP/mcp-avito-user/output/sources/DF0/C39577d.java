package dF0;

import Y61.k;
import Y61.l;
import cc.e;
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

/* compiled from: TravelPaymentMethodsVisibleEvent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LdF0/d;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_travel-payment-methods_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dF0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39577d implements e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f393775b;

    public C39577d(@k String str, @l String str2, @l String str3, @l String str4) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("from_page", str));
        if (str3 != null) {
        }
        if (str2 != null) {
        }
        if (str4 != null) {
            linkedHashMapJ.put("payment_scenario", str4);
        }
        G0 g02 = G0.f406611a;
        this.f393775b = new ParametrizedClickStreamEvent(15396, 1, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f393775b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f393775b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f393775b.f90248c;
    }

    public /* synthetic */ C39577d(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME : str3, (i12 & 8) != 0 ? null : str4);
    }
}
