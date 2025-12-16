package com.avito.android.seller_promotions.mvi;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;
import yn.C50271a;

/* compiled from: SellerPromotionsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/B;", "", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface B {
    @Y61.k
    InterfaceC43160i<SellerPromotionsInternalAction> a();

    @Y61.l
    Object b(@Y61.k List<C50271a> list, @Y61.k Continuation<? super TypedResult<Sq0.e>> continuation);

    @Y61.k
    InterfaceC43160i<SellerPromotionsInternalAction> c();

    @Y61.k
    InterfaceC43160i d(int i12, long j12);
}
