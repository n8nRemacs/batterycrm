package com.avito.android.auction.offer.domain;

import Y61.l;
import com.avito.android.auction.remote.model.AuctionSendingResult;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AuctionOfferInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/offer/domain/d;", "", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface d {
    @l
    Object a(@Y61.k String str, @l String str2, @Y61.k Continuation<? super TypedResult<AuctionSendingResult>> continuation);

    @l
    Object b(@Y61.k String str, @Y61.k SuspendLambda suspendLambda);

    @l
    Object c(@Y61.k String str, @Y61.k SuspendLambda suspendLambda);
}
