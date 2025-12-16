package com.avito.android.comfortable_deal.client_room.seller_recall.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity.SellerRecallInternalAction;
import ip.InterfaceC42086b;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SellerRecallOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction;", "Lip/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements t<SellerRecallInternalAction, InterfaceC42086b> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC42086b b(SellerRecallInternalAction sellerRecallInternalAction) {
        SellerRecallInternalAction sellerRecallInternalAction2 = sellerRecallInternalAction;
        if (sellerRecallInternalAction2.equals(SellerRecallInternalAction.Close.f119988b)) {
            return InterfaceC42086b.c.f405245a;
        }
        if (sellerRecallInternalAction2 instanceof SellerRecallInternalAction.OpenUrl) {
            return new InterfaceC42086b.d(((SellerRecallInternalAction.OpenUrl) sellerRecallInternalAction2).f119989b);
        }
        if (sellerRecallInternalAction2.equals(SellerRecallInternalAction.SubmitSuccess.f119991b)) {
            return new InterfaceC42086b.e(com.avito.android.printable_text.b.c(R.string.recall_seller_submit_success, new Serializable[0]));
        }
        if (sellerRecallInternalAction2 instanceof SellerRecallInternalAction.SelectReason) {
            return new InterfaceC42086b.C11536b(false);
        }
        if (sellerRecallInternalAction2.equals(SellerRecallInternalAction.ValidationPhoneFailure.f119994b)) {
            return new InterfaceC42086b.a();
        }
        if (sellerRecallInternalAction2.equals(SellerRecallInternalAction.ValidationReasonFailure.f119995b)) {
            return new InterfaceC42086b.C11536b(true);
        }
        return null;
    }
}
