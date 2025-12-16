package com.avito.android.str_seller_orders.orders_buyer.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.str_seller_orders.orders_buyer.mvi.entity.StrOrdersBuyerInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import oz0.InterfaceC44963a;
import pz0.C47173d;
import pz0.e;

/* compiled from: StrOrdersBuyerReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction;", "Lpz0/d;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements u<StrOrdersBuyerInternalAction, C47173d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44963a f289099b;

    @Inject
    public k(@Y61.k InterfaceC44963a interfaceC44963a) {
        this.f289099b = interfaceC44963a;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C47173d a(StrOrdersBuyerInternalAction strOrdersBuyerInternalAction, C47173d c47173d) {
        StrOrdersBuyerInternalAction strOrdersBuyerInternalAction2 = strOrdersBuyerInternalAction;
        C47173d c47173d2 = c47173d;
        if (strOrdersBuyerInternalAction2 instanceof StrOrdersBuyerInternalAction.ShowLoading) {
            return C47173d.a(c47173d2, null, e.c.f428937a, 1);
        }
        if (!(strOrdersBuyerInternalAction2 instanceof StrOrdersBuyerInternalAction.ShowContent)) {
            return c47173d2;
        }
        return this.f289099b.a(C47173d.a(c47173d2, ((StrOrdersBuyerInternalAction.ShowContent) strOrdersBuyerInternalAction2).f289087b, null, 2));
    }
}
