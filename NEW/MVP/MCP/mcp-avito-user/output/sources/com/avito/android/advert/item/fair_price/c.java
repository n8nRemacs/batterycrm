package com.avito.android.advert.item.fair_price;

import com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import q5.C47201a;

/* compiled from: FairPricePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f75377l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f75378m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ FairPriceItem f75379n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, g gVar, FairPriceItem fairPriceItem) {
        super(0);
        this.f75377l = eVar;
        this.f75378m = gVar;
        this.f75379n = fairPriceItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AdvertFairPriceModel.Explanation explanation = this.f75379n.f75372g.f75404e;
        e eVar = this.f75377l;
        C47201a c47201a = eVar.f75392c;
        c47201a.f429032a.c(new q5.c(c47201a.f429033b));
        eVar.f75391b.a(this.f75378m.getContext(), explanation, new d(1, eVar, e.class, "onComplainButtonClicked", "onComplainButtonClicked(Lcom/avito/android/deep_linking/links/DeepLink;)V", 0));
        return G0.f406611a;
    }
}
