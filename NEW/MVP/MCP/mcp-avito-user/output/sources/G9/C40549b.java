package g9;

import Y61.k;
import Y61.l;
import com.avito.android.advert_core.analytics.AdvertDetailsStyleAnalytics;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.remote.model.AdvertDetails;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ClickSimilarItemTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg9/b;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g9.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C40549b extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AdvertDetails f396355f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f396356g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f396357h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final AdvertDetailsStyleAnalytics f396358i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f396359j;

    public C40549b(@l TreeClickStreamParent treeClickStreamParent, @k AdvertDetails advertDetails, @k String str, @l String str2, @k AdvertDetailsStyleAnalytics advertDetailsStyleAnalytics, @l String str3) {
        super(0L, treeClickStreamParent, 3199, 7);
        this.f396355f = advertDetails;
        this.f396356g = str;
        this.f396357h = str2;
        this.f396358i = advertDetailsStyleAnalytics;
        this.f396359j = str3;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdvertDetails advertDetails = this.f396355f;
        j(linkedHashMap, "iid", advertDetails.getId());
        j(linkedHashMap, "cid", advertDetails.getCategoryId());
        j(linkedHashMap, "rec_item_id", this.f396356g);
        j(linkedHashMap, "x", this.f396357h);
        j(linkedHashMap, "from_block", Integer.valueOf(this.f396358i.f82780b));
        j(linkedHashMap, "from_space", this.f396359j);
        return linkedHashMap;
    }
}
