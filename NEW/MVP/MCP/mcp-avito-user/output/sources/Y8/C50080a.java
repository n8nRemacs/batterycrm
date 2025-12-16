package y8;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.provider.clickstream.c;
import com.avito.android.remote.model.AdvertDetails;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: FlatsClickTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly8/a;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y8.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C50080a extends c {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AdvertDetails f442953f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f442954g;

    public C50080a(@l TreeClickStreamParent treeClickStreamParent, @k AdvertDetails advertDetails, @k String str) {
        super(0L, treeClickStreamParent, 3202, 4);
        this.f442953f = advertDetails;
        this.f442954g = str;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdvertDetails advertDetails = this.f442953f;
        j(linkedHashMap, "iid", advertDetails.getId());
        j(linkedHashMap, "cid", advertDetails.getCategoryId());
        j(linkedHashMap, "item_parameter_name", this.f442954g);
        return linkedHashMap;
    }
}
