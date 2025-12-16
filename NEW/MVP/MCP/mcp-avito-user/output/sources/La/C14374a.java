package La;

import Y61.l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: AdvertActionsMenuOpenEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLa/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-item-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: La.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14374a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f9997b = new com.avito.android.analytics.provider.clickstream.b(3847, 4);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f9998c;

    public C14374a(@Y61.k String str, @l String str2, @l Integer num) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("iid", str));
        if (str2 != null) {
            linkedHashMapJ.put("cid", str2);
        }
        linkedHashMapJ.put("position", num.toString());
        this.f9998c = linkedHashMapJ;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f9997b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f9998c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f9997b.f90263c;
    }
}
