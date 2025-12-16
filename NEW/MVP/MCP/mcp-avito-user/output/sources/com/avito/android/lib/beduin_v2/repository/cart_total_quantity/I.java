package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import kotlin.Metadata;

/* compiled from: CartMenuIconView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/I;", "Landroidx/lifecycle/q;", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class I implements InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f176453b;

    public I(L l12) {
        this.f176453b = l12;
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onDestroy(@Y61.k InterfaceC22983P interfaceC22983P) {
        interfaceC22983P.getLifecycle().c(this);
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onResume(@Y61.k InterfaceC22983P interfaceC22983P) {
        L l12 = this.f176453b;
        if (l12.f176457b) {
            l12.f176456a.le();
        }
    }
}
