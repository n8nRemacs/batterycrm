package As;

import androidx.appcompat.app.r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.text.C43066x;

/* compiled from: CreditPartnerWebPageLoadedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAs/n;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f659b = new com.avito.android.analytics.provider.clickstream.b(5283, 3);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f660c;

    public n(int i12, int i13, int i14, @Y61.l String str, @Y61.k String str2, @Y61.k String str3) {
        Q q12 = new Q("item_id", str2);
        Q q13 = new Q("broker_session", str3);
        StringBuilder sbY = r.y(i12, i13, "\n            {\n                \"amount\": ", ",\n                \"payment\": ", ",\n                \"term\": ");
        sbY.append(i14);
        sbY.append("\n            }\n        ");
        LinkedHashMap linkedHashMapJ = P0.j(q12, q13, new Q("broker_calc_data", C43066x.E0(sbY.toString())));
        if (str != null) {
            linkedHashMapJ.put("from_page", str);
        }
        this.f660c = linkedHashMapJ;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f659b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f660c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f659b.f90263c;
    }
}
