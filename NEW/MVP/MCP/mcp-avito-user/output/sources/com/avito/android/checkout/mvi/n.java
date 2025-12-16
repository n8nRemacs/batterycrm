package com.avito.android.checkout.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.checkout.mvi.entity.CheckoutInternalAction;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.Metadata;
import xo.InterfaceC49973b;

/* compiled from: CheckoutOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/checkout/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction;", "Lxo/b;", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements t<CheckoutInternalAction, InterfaceC49973b> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49973b b(CheckoutInternalAction checkoutInternalAction) {
        InterfaceC49973b eVar;
        CheckoutInternalAction checkoutInternalAction2 = checkoutInternalAction;
        if (checkoutInternalAction2 instanceof CheckoutInternalAction.CloseScreen) {
            return InterfaceC49973b.a.f442637a;
        }
        InterfaceC49973b.c cVar = null;
        if (!(checkoutInternalAction2 instanceof CheckoutInternalAction.HandleDeeplink)) {
            if (checkoutInternalAction2 instanceof CheckoutInternalAction.FinishFlowWithDeepLink) {
                eVar = new InterfaceC49973b.C12880b(((CheckoutInternalAction.FinishFlowWithDeepLink) checkoutInternalAction2).f118361b);
            } else if (checkoutInternalAction2 instanceof CheckoutInternalAction.HandlePromoCodeDeeplink) {
                CheckoutInternalAction.HandlePromoCodeDeeplink handlePromoCodeDeeplink = (CheckoutInternalAction.HandlePromoCodeDeeplink) checkoutInternalAction2;
                eVar = new InterfaceC49973b.d(handlePromoCodeDeeplink.f118364b, handlePromoCodeDeeplink.f118365c);
            } else if (checkoutInternalAction2 instanceof CheckoutInternalAction.ScrollToPosition) {
                eVar = new InterfaceC49973b.e(((CheckoutInternalAction.ScrollToPosition) checkoutInternalAction2).f118370b);
            }
            return eVar;
        }
        CheckoutInternalAction.HandleDeeplink handleDeeplink = (CheckoutInternalAction.HandleDeeplink) checkoutInternalAction2;
        DeepLink deepLink = handleDeeplink.f118362b;
        if (deepLink != null) {
            cVar = new InterfaceC49973b.c(handleDeeplink.f118363c, deepLink);
        }
        return cVar;
    }
}
