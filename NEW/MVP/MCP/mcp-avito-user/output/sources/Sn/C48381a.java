package sn;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.cart_recommendations.model.FromPage;
import com.avito.android.cart_recommendations.model.Srcp;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ItemAddedToCartEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsn/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C48381a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f438846b;

    public C48381a(int i12, @k FromPage fromPage, @l Srcp srcp, @l Integer num, @k String str, @k String str2, @l String str3, @l Map map, boolean z12) {
        this.f438846b = new ParametrizedClickStreamEvent(5942, 12, "Avito.Marketplace / Корзина / Добавление объявления в корзину", C35755b0.c(P0.k(P0.g(new Q("uid", str), new Q("iid", str2), new Q("cart_added_item_num", Integer.valueOf(i12)), new Q("position", num), new Q("from_page", fromPage.f115334b), new Q("x", str3), new Q("is_bundle", Boolean.valueOf(z12)), new Q("srcp", srcp != null ? srcp.f115338b : null)), map == null ? P0.c() : map)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF5939c() {
        return this.f438846b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f438846b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF5940d() {
        return this.f438846b.f90248c;
    }

    public /* synthetic */ C48381a(String str, String str2, int i12, FromPage fromPage, String str3, Integer num, boolean z12, Srcp srcp, Map map, int i13, C42822w c42822w) {
        this(i12, fromPage, srcp, num, str, str2, str3, map, (i13 & 64) != 0 ? false : z12);
    }
}
