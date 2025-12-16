package com.avito.android.advert_details_items.optimal_price;

import com.avito.android.advert_details_items.optimal_price.AdvertDetailsOptimalPriceItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsOptimalPricePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsOptimalPriceItem f84986l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f84987m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AdvertDetailsOptimalPriceItem advertDetailsOptimalPriceItem, d dVar) {
        super(0);
        this.f84986l = advertDetailsOptimalPriceItem;
        this.f84987m = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        AdvertDetailsOptimalPriceItem.Button button = this.f84986l.f84972i;
        if (button != null && (deepLink = button.f84974c) != null) {
            b.a.a(this.f84987m.f84988b, deepLink, null, null, 6);
        }
        return G0.f406611a;
    }
}
