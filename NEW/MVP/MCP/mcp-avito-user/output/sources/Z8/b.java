package Z8;

import Y61.k;
import Y61.l;
import com.avito.android.advert_core.sellerprofile.ShowSellersProfileSource;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.provider.clickstream.c;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ShowSellersProfileTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ8/b;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b extends c {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AdvertDetails f19926f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ShowSellersProfileSource f19927g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f19928h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f19929i;

    public b(@l TreeClickStreamParent treeClickStreamParent, @k AdvertDetails advertDetails, @k ShowSellersProfileSource showSellersProfileSource, @l String str, @l String str2) {
        super(0L, treeClickStreamParent, 3205, 9);
        this.f19926f = advertDetails;
        this.f19927g = showSellersProfileSource;
        this.f19928h = str;
        this.f19929i = str2;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdvertDetails advertDetails = this.f19926f;
        j(linkedHashMap, "iid", advertDetails.getId());
        j(linkedHashMap, "cid", advertDetails.getCategoryId());
        j(linkedHashMap, "from_block", Integer.valueOf(this.f19927g.f84289b));
        j(linkedHashMap, "x", C35800g5.b(new C35792f5(this.f19928h)));
        j(linkedHashMap, "from_space", this.f19929i);
        return linkedHashMap;
    }
}
