package M8;

import Y61.k;
import Y61.l;
import com.avito.android.advert_core.analytics.ownership_cost.OwnershipCostEventBlockType;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: OwnershipCostClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LM8/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f10411b;

    public a(@k String str, @l OwnershipCostEventBlockType ownershipCostEventBlockType, @l String str2, @l LinkedHashMap linkedHashMap) {
        this.f10411b = new ParametrizedClickStreamEvent(6956, 2, C35755b0.c(P0.j(new Q("item_id", str), new Q("block_type", ownershipCostEventBlockType.f82837b), new Q("action_value", str2), new Q("params", linkedHashMap))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f10411b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f10411b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f10411b.f90248c;
    }
}
