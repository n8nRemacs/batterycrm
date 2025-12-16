package com.avito.android.advert_details_items.price;

import com.avito.android.advert_details_items.price.AdvertDetailsPriceItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsPricePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsPriceItem f85171l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f85172m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f85173n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AdvertDetailsPriceItem advertDetailsPriceItem, e eVar, g gVar) {
        super(0);
        this.f85171l = advertDetailsPriceItem;
        this.f85172m = eVar;
        this.f85173n = gVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AdvertDetailsPriceItem.OldPriceHintBottomSheet oldPriceHintBottomSheet = this.f85171l.f85145i;
        if (oldPriceHintBottomSheet != null) {
            e eVar = this.f85172m;
            eVar.f85176d.a(this.f85173n.getContext(), oldPriceHintBottomSheet.f85159b, oldPriceHintBottomSheet.f85160c, oldPriceHintBottomSheet.f85161d, oldPriceHintBottomSheet.f85162e);
        }
        return G0.f406611a;
    }
}
