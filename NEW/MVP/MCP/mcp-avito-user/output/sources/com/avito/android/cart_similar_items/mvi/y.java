package com.avito.android.cart_similar_items.mvi;

import com.avito.android.R;
import com.avito.android.beduin_shared.model.transform.LocalParameterTransform;
import com.avito.android.cart_similar_items.mvi.entity.CartSimilarItemsInternalAction;
import com.avito.android.remote.error.ApiError;
import java.io.Serializable;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lj.d;
import mn.InterfaceC44103c;

/* compiled from: CartSimilarItemsOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/y;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "Lmn/c;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class y implements com.avito.android.arch.mvi.t<CartSimilarItemsInternalAction, InterfaceC44103c> {
    @Inject
    public y() {
    }

    public static InterfaceC44103c.a a(boolean z12) {
        return new InterfaceC44103c.a(new d.e(Collections.singletonMap("loadingParameters", Collections.singletonList(new LocalParameterTransform("isLoading", Boolean.valueOf(z12))))));
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC44103c b(CartSimilarItemsInternalAction cartSimilarItemsInternalAction) {
        InterfaceC44103c hVar;
        CartSimilarItemsInternalAction cartSimilarItemsInternalAction2 = cartSimilarItemsInternalAction;
        if (cartSimilarItemsInternalAction2.equals(CartSimilarItemsInternalAction.CloseScreen.f116020b)) {
            return InterfaceC44103c.b.f414690a;
        }
        if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.OpenDeepLink) {
            hVar = new InterfaceC44103c.e(((CartSimilarItemsInternalAction.OpenDeepLink) cartSimilarItemsInternalAction2).f116035b, null, null, 6, null);
        } else if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.OpenAdvertDetails) {
            CartSimilarItemsInternalAction.OpenAdvertDetails openAdvertDetails = (CartSimilarItemsInternalAction.OpenAdvertDetails) cartSimilarItemsInternalAction2;
            hVar = new InterfaceC44103c.d(openAdvertDetails.f116032b, openAdvertDetails.f116033c, openAdvertDetails.f116034d);
        } else if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.PageLoadingError) {
            Throwable th2 = ((CartSimilarItemsInternalAction.PageLoadingError) cartSimilarItemsInternalAction2).f116038b;
            String strJ = com.avito.android.error.z.j(th2);
            hVar = new InterfaceC44103c.g(strJ != null ? com.avito.android.printable_text.b.f(strJ) : com.avito.android.printable_text.b.c(R.string.cart_similar_items_failed_to_load_page_message, new Serializable[0]), th2);
        } else if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.HandleBeduinActions) {
            hVar = new InterfaceC44103c.C11840c();
        } else {
            if (!(cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.UpdateCartIconQuantity)) {
                if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.UpdateItemsLoadingStarted) {
                    return a(true);
                }
                if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.UpdateItemsLoadingFinished) {
                    return a(false);
                }
                if (!(cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.UpdateItemsError)) {
                    return null;
                }
                ApiError apiError = ((CartSimilarItemsInternalAction.UpdateItemsError) cartSimilarItemsInternalAction2).f116047b;
                String strI = com.avito.android.error.z.i(apiError);
                return new InterfaceC44103c.f(apiError, strI != null ? com.avito.android.printable_text.b.f(strI) : com.avito.android.printable_text.b.c(R.string.update_cart_items_error, new Serializable[0]), null, true, 4, null);
            }
            hVar = new InterfaceC44103c.h(((CartSimilarItemsInternalAction.UpdateCartIconQuantity) cartSimilarItemsInternalAction2).f116045b);
        }
        return hVar;
    }
}
