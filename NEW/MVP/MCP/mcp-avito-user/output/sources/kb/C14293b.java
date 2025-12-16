package Kb;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: NavBarClickedEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKb/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Kb.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14293b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f9535b;

    public C14293b(@k String str, @k String str2, @l Boolean bool) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("from_page", str), new Q("target_page", str2));
        if (bool != null) {
            linkedHashMapJ.put("is_new", bool);
        }
        G0 g02 = G0.f406611a;
        this.f9535b = new ParametrizedClickStreamEvent(17207, 3, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f9535b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f9535b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f9535b.f90248c;
    }
}
