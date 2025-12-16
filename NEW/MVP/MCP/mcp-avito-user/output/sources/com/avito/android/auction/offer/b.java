package com.avito.android.auction.offer;

import Nd.InterfaceC14561a;
import com.avito.android.auction.offer.AuctionOfferFragment;
import com.avito.android.deep_linking.links.AuctionLink;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: AuctionOfferFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuctionOfferFragment f92446b;

    public b(AuctionOfferFragment auctionOfferFragment) {
        this.f92446b = auctionOfferFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        if (((C43501a) obj).f413261b instanceof AuctionLink.b) {
            AuctionOfferFragment.a aVar = AuctionOfferFragment.f92425x0;
            this.f92446b.q5().accept(InterfaceC14561a.f.f11622a);
        }
    }
}
