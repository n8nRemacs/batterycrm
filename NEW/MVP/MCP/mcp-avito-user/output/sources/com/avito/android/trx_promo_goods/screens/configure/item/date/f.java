package com.avito.android.trx_promo_goods.screens.configure.item.date;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TrxPromoGoodsConfigureDatePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/item/date/f;", "Lcom/avito/android/trx_promo_goods/screens/configure/item/date/d;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f303513b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super DeepLink, G0> lVar) {
        this.f303513b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        hVar.setTitle(cVar.f303508b);
        hVar.C9(cVar.f303509c);
        hVar.a(new e(this, cVar));
    }
}
