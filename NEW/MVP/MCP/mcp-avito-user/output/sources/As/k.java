package As;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: CreditFormPhoneConfirmationRequestedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAs/k;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f653b = new com.avito.android.analytics.provider.clickstream.b(5300, 2);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f654c;

    public k(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("item_id", str2), new Q("broker_session", str3));
        if (str4 != null) {
            linkedHashMapJ.put("broker_request_id", str4);
        }
        if (str != null) {
            linkedHashMapJ.put("from_page", str);
        }
        this.f654c = linkedHashMapJ;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f653b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f654c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f653b.f90263c;
    }
}
