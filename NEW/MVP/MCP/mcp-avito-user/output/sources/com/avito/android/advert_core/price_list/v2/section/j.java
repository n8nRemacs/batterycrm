package com.avito.android.advert_core.price_list.v2.section;

import com.avito.android.advert_core.price_list.AdvertPriceListSectionItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertPriceListSectionItemViewPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertPriceListSectionItem f84178l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f84179m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AdvertPriceListSectionItem advertPriceListSectionItem, c cVar) {
        super(0);
        this.f84178l = advertPriceListSectionItem;
        this.f84179m = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AdvertPriceListSectionItem advertPriceListSectionItem = this.f84178l;
        boolean z12 = advertPriceListSectionItem.f84013f;
        advertPriceListSectionItem.f84013f = !z12;
        c cVar = this.f84179m;
        if (z12) {
            cVar.yF();
        } else {
            cVar.yL(advertPriceListSectionItem.f84015h);
        }
        return G0.f406611a;
    }
}
