package Na;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: RecommendedAdvertHiddenEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNa/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-item-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Na.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14553a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f11603b = new b(3848, 6);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f11604c;

    public C14553a(@k String str, @l Integer num, @l String str2, @l Integer num2, @k String str3) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("iid", str), new Q("from_page", str3));
        if (str2 != null) {
            linkedHashMapJ.put("cid", str2);
        }
        if (num != null) {
            linkedHashMapJ.put("lid", num.toString());
        }
        if (num2 != null) {
            linkedHashMapJ.put("position", num2.toString());
        }
        this.f11604c = linkedHashMapJ;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f11603b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f11604c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f11603b.f90263c;
    }
}
