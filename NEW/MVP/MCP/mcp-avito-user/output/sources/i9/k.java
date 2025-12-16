package i9;

import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.AdjustParameters;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ShowAdvertTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li9/k;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AdvertDetails f398390f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f398391g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final ScreenSource f398392h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Boolean f398393i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f398394j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f398395k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f398396l;

    public k(long j12, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.k AdvertDetails advertDetails, @Y61.l String str, @Y61.l ScreenSource screenSource, @Y61.l Boolean bool, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        super(j12, treeClickStreamParent, 2649, 17);
        this.f398390f = advertDetails;
        this.f398391g = str;
        this.f398392h = screenSource;
        this.f398393i = bool;
        this.f398394j = str2;
        this.f398395k = str3;
        this.f398396l = str4;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @Y61.k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdvertDetails advertDetails = this.f398390f;
        j(linkedHashMap, "cid", advertDetails.getCategoryId());
        j(linkedHashMap, "oc", Boolean.valueOf(advertDetails.isFromCompany()));
        j(linkedHashMap, "mid", advertDetails.getMetroId());
        j(linkedHashMap, "iid", advertDetails.getId());
        j(linkedHashMap, "lid", advertDetails.getLocationId());
        j(linkedHashMap, "sid", advertDetails.getShopId());
        AdjustParameters adjustParameters = advertDetails.getAdjustParameters();
        j(linkedHashMap, "mcid", adjustParameters != null ? adjustParameters.getMicroCategoryId() : null);
        j(linkedHashMap, "item_condition", this.f398391g);
        ScreenSource screenSource = this.f398392h;
        if (screenSource != null) {
            j(linkedHashMap, "from_page", screenSource.f251773b);
        }
        Boolean bool = this.f398393i;
        if (bool != null) {
            j(linkedHashMap, "is_multiitems_variation", bool);
        }
        j(linkedHashMap, "x", C35800g5.b(new C35792f5(this.f398396l)));
        j(linkedHashMap, "multiitem_source", this.f398394j);
        j(linkedHashMap, "multiitem_click_param_name", this.f398395k);
        return linkedHashMap;
    }
}
