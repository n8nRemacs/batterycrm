package com.avito.android.advert.item.fair_price;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.fair_price.model.AdvertFairPriceModel;
import javax.inject.Inject;
import kotlin.Metadata;
import q5.C47201a;

/* compiled from: FairPricePresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/fair_price/e;", "LTV0/d;", "Lcom/avito/android/advert/item/fair_price/g;", "Lcom/avito/android/advert/item/fair_price/FairPriceItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements TV0.d<g, FairPriceItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.fair_price.dialog.d f75391b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C47201a f75392c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f75393d;

    @Inject
    public e(@k com.avito.android.advert.item.fair_price.dialog.d dVar, @k C47201a c47201a, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f75391b = dVar;
        this.f75392c = c47201a;
        this.f75393d = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        FairPriceItem fairPriceItem = (FairPriceItem) aVar;
        AdvertFairPriceModel advertFairPriceModel = fairPriceItem.f75372g;
        gVar.p(advertFairPriceModel.f75401b);
        gVar.h(advertFairPriceModel.f75402c);
        gVar.my(advertFairPriceModel.f75403d);
        gVar.n10(new c(this, gVar, fairPriceItem));
    }
}
