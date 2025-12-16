package As;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CreditCalculatorSubmitEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAs/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f643b = new com.avito.android.analytics.provider.clickstream.b(4498, 13);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.collections.builders.d f644c;

    public f(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, int i12, int i13, int i14, boolean z12, @Y61.l String str4) {
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        dVar.put("item_id", str2);
        dVar.put("broker_session", str3);
        dVar.put("target", z12 ? "app" : "form");
        if (str != null) {
            dVar.put("from_page", str);
        }
        ArrayList arrayList = new ArrayList();
        if (i12 > 0) {
            arrayList.add("\"amount\": " + i12);
        }
        if (i13 > 0) {
            arrayList.add("\"payment\": " + i13);
        }
        if (i14 > 0) {
            arrayList.add("\"term\": " + i14);
        }
        dVar.put("broker_calc_data", C42745f0.O(arrayList, ",", "{", "}", null, 56));
        if (str4 != null) {
            dVar.put("installments_plan", str4);
        }
        this.f644c = dVar.b();
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f643b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f644c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f643b.f90263c;
    }
}
