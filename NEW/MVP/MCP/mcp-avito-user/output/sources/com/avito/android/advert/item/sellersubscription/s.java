package com.avito.android.advert.item.sellersubscription;

import com.avito.android.advert.item.I1;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerNotificationsState;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: SellerSubscriptionPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.sellersubscription.SellerSubscriptionPresenterImpl$attachSubscriptionSettingsView$1$1", f = "SellerSubscriptionPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class s extends SuspendLambda implements Y41.p<G0, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ SellerSubscriptionPresenterImpl f79772q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f79772q = sellerSubscriptionPresenterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new s(this.f79772q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
        return ((s) create(g02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        I1 i12;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl = this.f79772q;
        SellerSubscriptionItem sellerSubscriptionItem = sellerSubscriptionPresenterImpl.f79699r;
        if (sellerSubscriptionItem != null && (i12 = sellerSubscriptionPresenterImpl.f79693l) != null) {
            if (sellerSubscriptionPresenterImpl.f79684c.b()) {
                SellerNotificationsState f85537g = sellerSubscriptionItem.getF85537g();
                if (f85537g != null) {
                    int iOrdinal = f85537g.ordinal();
                    if (iOrdinal == 0) {
                        sellerSubscriptionPresenterImpl.i(sellerSubscriptionItem);
                    } else if (iOrdinal == 1) {
                        sellerSubscriptionPresenterImpl.h(sellerSubscriptionItem);
                    }
                }
            } else {
                i12.U();
            }
        }
        return G0.f406611a;
    }
}
