package com.avito.android.str_seller_orders.strsellerordersdialog.mvi;

import Bz0.InterfaceC13209b;
import com.avito.android.arch.mvi.t;
import com.avito.android.str_seller_orders.strsellerordersdialog.mvi.entity.StrSellerOrdersDialogInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrSellerOrdersDialogOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction;", "LBz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements t<StrSellerOrdersDialogInternalAction, InterfaceC13209b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13209b b(StrSellerOrdersDialogInternalAction strSellerOrdersDialogInternalAction) {
        StrSellerOrdersDialogInternalAction strSellerOrdersDialogInternalAction2 = strSellerOrdersDialogInternalAction;
        if (strSellerOrdersDialogInternalAction2 instanceof StrSellerOrdersDialogInternalAction.NotifyOrderClicked) {
            return new InterfaceC13209b.c(((StrSellerOrdersDialogInternalAction.NotifyOrderClicked) strSellerOrdersDialogInternalAction2).f290155b);
        }
        if (strSellerOrdersDialogInternalAction2 instanceof StrSellerOrdersDialogInternalAction.NotifyOrderButtonClick) {
            StrSellerOrdersDialogInternalAction.NotifyOrderButtonClick notifyOrderButtonClick = (StrSellerOrdersDialogInternalAction.NotifyOrderButtonClick) strSellerOrdersDialogInternalAction2;
            return new InterfaceC13209b.C0083b(notifyOrderButtonClick.f290153c, notifyOrderButtonClick.f290152b, notifyOrderButtonClick.f290154d);
        }
        if (strSellerOrdersDialogInternalAction2 instanceof StrSellerOrdersDialogInternalAction.Close) {
            return InterfaceC13209b.a.f1829a;
        }
        if (!(strSellerOrdersDialogInternalAction2 instanceof StrSellerOrdersDialogInternalAction.ShowErrorToast)) {
            return null;
        }
        StrSellerOrdersDialogInternalAction.ShowErrorToast showErrorToast = (StrSellerOrdersDialogInternalAction.ShowErrorToast) strSellerOrdersDialogInternalAction2;
        return new InterfaceC13209b.d(showErrorToast.f290156b, showErrorToast.f290157c);
    }
}
