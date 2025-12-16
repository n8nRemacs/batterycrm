package com.avito.android.str_seller_orders.strsellerorders.mvi;

import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import yz0.InterfaceC50329c;

/* compiled from: StrSellerOrdersOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/o;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "Lyz0/c;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o implements com.avito.android.arch.mvi.t<StrSellerOrdersInternalAction, InterfaceC50329c> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC50329c b(StrSellerOrdersInternalAction strSellerOrdersInternalAction) {
        StrSellerOrdersInternalAction strSellerOrdersInternalAction2 = strSellerOrdersInternalAction;
        if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.OpenDeeplink) {
            return new InterfaceC50329c.C12936c(((StrSellerOrdersInternalAction.OpenDeeplink) strSellerOrdersInternalAction2).f289870b);
        }
        if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.CloseScreen) {
            return InterfaceC50329c.b.f443650a;
        }
        if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.UxInfoLoadingComplete) {
            SK0.f fVar = ((StrSellerOrdersInternalAction.UxInfoLoadingComplete) strSellerOrdersInternalAction2).f289879b;
            if (fVar != null) {
                return new InterfaceC50329c.i(fVar);
            }
        } else {
            if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.OpenSellerOrdersDialog) {
                return new InterfaceC50329c.d(((StrSellerOrdersInternalAction.OpenSellerOrdersDialog) strSellerOrdersInternalAction2).f289871b);
            }
            if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.PassNewDialogData) {
                return new InterfaceC50329c.f(((StrSellerOrdersInternalAction.PassNewDialogData) strSellerOrdersInternalAction2).f289873b);
            }
            if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.ShowConfirmationBottomSheet) {
                StrSellerOrdersInternalAction.ShowConfirmationBottomSheet showConfirmationBottomSheet = (StrSellerOrdersInternalAction.ShowConfirmationBottomSheet) strSellerOrdersInternalAction2;
                return new InterfaceC50329c.g(showConfirmationBottomSheet.f289874b, showConfirmationBottomSheet.f289875c);
            }
            if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.OpenWebView) {
                return new InterfaceC50329c.e(((StrSellerOrdersInternalAction.OpenWebView) strSellerOrdersInternalAction2).f289872b);
            }
            if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.ShowToast) {
                StrSellerOrdersInternalAction.ShowToast showToast = (StrSellerOrdersInternalAction.ShowToast) strSellerOrdersInternalAction2;
                return new InterfaceC50329c.h(showToast.f289876b, showToast.f289877c);
            }
            if (strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.LoadingError ? true : strSellerOrdersInternalAction2 instanceof StrSellerOrdersInternalAction.CloseDialog) {
                return InterfaceC50329c.a.f443649a;
            }
        }
        return null;
    }
}
