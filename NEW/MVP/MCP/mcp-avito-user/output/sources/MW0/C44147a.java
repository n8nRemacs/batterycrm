package mw0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StrSoftBookingPromoCodesApplyEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmw0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mw0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44147a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414829b;

    public C44147a(@l String str, @k String str2, boolean z12, @l String str3) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("delivery_promocode", str2), new Q("delivery_promocode_result", Boolean.valueOf(z12)));
        if (str != null) {
            linkedHashMapJ.put("iid", str);
        }
        if (str3 != null) {
            linkedHashMapJ.put("delivery_promocode_error_msg", str3);
        }
        G0 g02 = G0.f406611a;
        this.f414829b = new ParametrizedClickStreamEvent(10663, 1, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f414829b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414829b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f414829b.f90248c;
    }

    public /* synthetic */ C44147a(String str, String str2, boolean z12, String str3, int i12, C42822w c42822w) {
        this(str, str2, z12, (i12 & 8) != 0 ? null : str3);
    }
}
