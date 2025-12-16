package com.avito.android.str_seller_orders.strsellerordersrange.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.StrCalendarOrdersRangeResponse;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.entity.StrSellerOrdersRangeInternalAction;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.entity.StrSellerOrdersRangeState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrSellerOrdersRangeReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeInternalAction;", "Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeState;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements u<StrSellerOrdersRangeInternalAction, StrSellerOrdersRangeState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f290318b;

    @Inject
    public m(@Y61.k o oVar) {
        this.f290318b = oVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final StrSellerOrdersRangeState a(StrSellerOrdersRangeInternalAction strSellerOrdersRangeInternalAction, StrSellerOrdersRangeState strSellerOrdersRangeState) {
        StrSellerOrdersRangeInternalAction strSellerOrdersRangeInternalAction2 = strSellerOrdersRangeInternalAction;
        StrSellerOrdersRangeState strSellerOrdersRangeState2 = strSellerOrdersRangeState;
        boolean z12 = strSellerOrdersRangeInternalAction2 instanceof StrSellerOrdersRangeInternalAction.StartLoading;
        o oVar = this.f290318b;
        if (z12) {
            return oVar.a(StrSellerOrdersRangeState.a(strSellerOrdersRangeState2, null, null, null, null, StrSellerOrdersRangeState.LoadingState.f290286b, 95));
        }
        if (strSellerOrdersRangeInternalAction2 instanceof StrSellerOrdersRangeInternalAction.ShowError) {
            return oVar.a(StrSellerOrdersRangeState.a(strSellerOrdersRangeState2, null, null, ((StrSellerOrdersRangeInternalAction.ShowError) strSellerOrdersRangeInternalAction2).f290275b, null, StrSellerOrdersRangeState.LoadingState.f290288d, 95));
        }
        if (!(strSellerOrdersRangeInternalAction2 instanceof StrSellerOrdersRangeInternalAction.ShowContent)) {
            return strSellerOrdersRangeState2;
        }
        StrCalendarOrdersRangeResponse strCalendarOrdersRangeResponse = ((StrSellerOrdersRangeInternalAction.ShowContent) strSellerOrdersRangeInternalAction2).f290274b;
        return oVar.a(StrSellerOrdersRangeState.a(strSellerOrdersRangeState2, strCalendarOrdersRangeResponse.getTitle(), strCalendarOrdersRangeResponse.getOrders(), null, null, StrSellerOrdersRangeState.LoadingState.f290287c, 71));
    }
}
