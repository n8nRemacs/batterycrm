package As;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CreditCalculatorRenderEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAs/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f641b = new com.avito.android.analytics.provider.clickstream.b(4496, 6);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.collections.builders.d f642c;

    public e(@Y61.l String str, @Y61.k String str2, @Y61.l String str3, @Y61.k String str4) {
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        dVar.put("item_id", str2);
        dVar.put("broker_session", str4);
        if (str3 != null) {
        }
        if (str != null) {
            dVar.put("from_page", str);
        }
        this.f642c = dVar.b();
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f641b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, String> getParams() {
        return this.f642c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f641b.f90263c;
    }
}
