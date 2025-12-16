package com.avito.android.comfortable_deal.client_room.seller_recall.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallInternalAction;
import com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SellerRecallReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/i;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallState;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements u<SellerRecallInternalAction, SellerRecallState> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final SellerRecallState a(SellerRecallInternalAction sellerRecallInternalAction, SellerRecallState sellerRecallState) {
        SellerRecallInternalAction sellerRecallInternalAction2 = sellerRecallInternalAction;
        SellerRecallState sellerRecallState2 = sellerRecallState;
        return sellerRecallInternalAction2 instanceof SellerRecallInternalAction.SelectReason ? SellerRecallState.a(sellerRecallState2, null, null, ((SellerRecallInternalAction.SelectReason) sellerRecallInternalAction2).f119990b, 59) : sellerRecallInternalAction2 instanceof SellerRecallInternalAction.UpdateComment ? SellerRecallState.a(sellerRecallState2, null, ((SellerRecallInternalAction.UpdateComment) sellerRecallInternalAction2).f119992b, null, 61) : sellerRecallInternalAction2 instanceof SellerRecallInternalAction.UpdatePhone ? SellerRecallState.a(sellerRecallState2, ((SellerRecallInternalAction.UpdatePhone) sellerRecallInternalAction2).f119993b, null, null, 62) : sellerRecallState2;
    }
}
