package com.avito.android.auction;

import com.avito.android.auction.remote.model.AuctionSendingResult;
import com.avito.android.deep_linking.links.AuctionAddLink;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;

/* compiled from: SendDraftToAuctionInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/z;", "", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface z {
    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<AuctionSendingResult>> a(@Y61.k AuctionAddLink.Arguments arguments);
}
