package g9;

import Y61.k;
import Y61.l;
import com.avito.android.advert_core.analytics.similars.ClickSimilarItemFavoritesAction;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.remote.model.AdvertDetails;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ClickSimilarItemFavoritesTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg9/a;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g9.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C40548a extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AdvertDetails f396351f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ClickSimilarItemFavoritesAction f396352g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f396353h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f396354i;

    public C40548a(@l TreeClickStreamParent treeClickStreamParent, @k AdvertDetails advertDetails, @k ClickSimilarItemFavoritesAction clickSimilarItemFavoritesAction, @k String str, @l String str2) {
        super(0L, treeClickStreamParent, 3200, 7);
        this.f396351f = advertDetails;
        this.f396352g = clickSimilarItemFavoritesAction;
        this.f396353h = str;
        this.f396354i = str2;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdvertDetails advertDetails = this.f396351f;
        j(linkedHashMap, "iid", advertDetails.getId());
        j(linkedHashMap, "cid", advertDetails.getCategoryId());
        j(linkedHashMap, "action", this.f396352g.name().toLowerCase());
        j(linkedHashMap, "rec_item_id", this.f396353h);
        j(linkedHashMap, "x", this.f396354i);
        return linkedHashMap;
    }
}
