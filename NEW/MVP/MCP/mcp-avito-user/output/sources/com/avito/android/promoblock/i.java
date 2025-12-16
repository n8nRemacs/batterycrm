package com.avito.android.promoblock;

import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TnsPromoBlockPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/promoblock/i;", "Lcom/avito/android/promoblock/e;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l41.g<a> f231793b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.util.groupable_item.b f231794c;

    @Inject
    public i(@Y61.k l41.g<a> gVar, @Y61.k com.avito.android.lib.util.groupable_item.b bVar) {
        this.f231793b = gVar;
        this.f231794c = bVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        TnsPromoBlockItem tnsPromoBlockItem = (TnsPromoBlockItem) aVar;
        kVar.j5();
        kVar.hq(tnsPromoBlockItem);
        this.f231794c.a(kVar, tnsPromoBlockItem);
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        cVar.b(kVar.A1().t0(new f(this, tnsPromoBlockItem)));
        cVar.b(kVar.getF231807l().t0(new g(this, tnsPromoBlockItem)));
        AttributedText f229132e = tnsPromoBlockItem.getF229132e();
        if (f229132e != null) {
            f229132e.setOnDeepLinkClickListener(new com.avito.android.advert_details_items.buyer_bonuses.g(5, this, tnsPromoBlockItem));
        }
        kVar.d(new h(kVar, f229132e, cVar));
    }
}
