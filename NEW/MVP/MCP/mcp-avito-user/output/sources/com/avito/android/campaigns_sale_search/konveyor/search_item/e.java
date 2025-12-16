package com.avito.android.campaigns_sale_search.konveyor.search_item;

import com.avito.android.campaigns_sale.network.remote.model.SearchBonusInfo;
import com.avito.android.campaigns_sale.network.remote.model.SearchBonusInfoCard;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import um.b;

/* compiled from: SearchItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f114613l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f114614m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, d dVar) {
        super(0);
        this.f114613l = aVar;
        this.f114614m = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        SearchBonusInfoCard card;
        DeepLink deeplink;
        SearchBonusInfo searchBonusInfo = this.f114613l.f114605i;
        if (searchBonusInfo != null && (card = searchBonusInfo.getCard()) != null && (deeplink = card.getDeeplink()) != null) {
            this.f114614m.f114611c.invoke(new b.h(deeplink));
        }
        return G0.f406611a;
    }
}
