package com.avito.android.trx_promo_impl.item.discount_v2;

import Y41.l;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoStrDiscountV2BannerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/item/discount_v2/g;", "Lcom/avito/android/trx_promo_impl/item/discount_v2/d;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<DeepLink, G0> f304282b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@Y61.k l<? super DeepLink, G0> lVar) {
        this.f304282b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((j) eVar, (c) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle == null || !bundle.getBoolean("trx_promo_payload_discount_texts_change")) {
            k(jVar, cVar);
            return;
        }
        jVar.e(cVar.f304274c);
        jVar.g(cVar.f304275d);
        jVar.a(new f(cVar, this));
    }

    public final void k(@Y61.k j jVar, @Y61.k c cVar) {
        Integer num = cVar.f304273b;
        jVar.fc(num != null ? num.intValue() : R.attr.gradientLinearMixedHorizontalBlueRed);
        jVar.e(cVar.f304274c);
        jVar.g(cVar.f304275d);
        jVar.tt(cVar.f304276e);
        jVar.a(new e(cVar, this));
    }
}
