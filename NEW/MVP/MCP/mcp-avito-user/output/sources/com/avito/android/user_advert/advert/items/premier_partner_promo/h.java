package com.avito.android.user_advert.advert.items.premier_partner_promo;

import Y61.k;
import Y61.l;
import Yo.w;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PremierPartnerPromoItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/premier_partner_promo/h;", "Lcom/avito/android/user_advert/advert/items/premier_partner_promo/e;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f309831b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f309832c;

    @Inject
    public h(@k w wVar) {
        this.f309831b = wVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        fVar.dh();
        fVar.XO(new g(this, (a) aVar));
    }

    @Override // com.avito.android.user_advert.advert.items.premier_partner_promo.e
    public final void c0() {
        this.f309832c = null;
    }

    @Override // com.avito.android.user_advert.advert.items.premier_partner_promo.e
    public final void s2(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309832c = myAdvertDetailsActivity;
    }
}
