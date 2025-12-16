package com.avito.android.advert_details_items.buyer_bonuses;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonuses;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BuyerBonusesPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/buyer_bonuses/d;", "Lcom/avito/android/advert_details_items/buyer_bonuses/c;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f84483b;

    /* compiled from: BuyerBonusesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<DeepLink, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            b.a.a(d.this.f84483b, deepLink, null, null, 6);
            return G0.f406611a;
        }
    }

    @Inject
    public d(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f84483b = aVar;
    }

    @Override // com.avito.android.advert_details_items.buyer_bonuses.c
    public final void k(@k f fVar, @k BuyerBonusesItem buyerBonusesItem, int i12) {
        fVar.fa();
        BuyerBonuses buyerBonuses = buyerBonusesItem.f84471d;
        fVar.B00(buyerBonuses);
        fVar.bB(buyerBonuses.getBuyerBonusesInfo(), new a());
        fVar.Si(buyerBonusesItem.f84472e, buyerBonusesItem.f84473f);
        fVar.X70(buyerBonusesItem.f84474g);
    }
}
