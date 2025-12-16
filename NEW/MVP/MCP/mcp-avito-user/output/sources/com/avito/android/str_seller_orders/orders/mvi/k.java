package com.avito.android.str_seller_orders.orders.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.str_seller_orders.orders.mvi.entity.StrOrdersInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import mz0.C44158c;

/* compiled from: StrOrdersReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/orders/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction;", "Lmz0/c;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements u<StrOrdersInternalAction, C44158c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C44158c a(StrOrdersInternalAction strOrdersInternalAction, C44158c c44158c) {
        StrOrdersInternalAction strOrdersInternalAction2 = strOrdersInternalAction;
        C44158c c44158c2 = c44158c;
        if (!(strOrdersInternalAction2 instanceof StrOrdersInternalAction.ShowContent)) {
            return strOrdersInternalAction2 instanceof StrOrdersInternalAction.NewSelectedTab ? new C44158c(c44158c2.f414841b, ((StrOrdersInternalAction.NewSelectedTab) strOrdersInternalAction2).f288888b) : c44158c2;
        }
        StrOrdersInternalAction.ShowContent showContent = (StrOrdersInternalAction.ShowContent) strOrdersInternalAction2;
        return new C44158c(showContent.f288889b, showContent.f288890c);
    }
}
