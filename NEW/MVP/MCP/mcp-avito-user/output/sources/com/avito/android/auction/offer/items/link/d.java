package com.avito.android.auction.offer.items.link;

import Rh.C15041a;
import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AuctionLinkPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auction/offer/items/link/d;", "LTV0/d;", "Lcom/avito/android/auction/offer/items/link/f;", "Lcom/avito/android/auction/offer/items/link/AuctionLinkItem;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements TV0.d<f, AuctionLinkItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f92551b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.auction.offer.a f92552c;

    @Inject
    public d(@k com.avito.android.util.text.a aVar, @k com.avito.android.auction.offer.a aVar2) {
        this.f92551b = aVar;
        this.f92552c = aVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AuctionLinkItem auctionLinkItem = (AuctionLinkItem) aVar;
        C15041a c15041a = new C15041a(this, 12);
        AttributedText attributedText = auctionLinkItem.f92546c;
        attributedText.setOnDeepLinkClickListener(c15041a);
        fVar.I30(this.f92551b.c(fVar.getContext(), attributedText), new c(auctionLinkItem));
    }
}
