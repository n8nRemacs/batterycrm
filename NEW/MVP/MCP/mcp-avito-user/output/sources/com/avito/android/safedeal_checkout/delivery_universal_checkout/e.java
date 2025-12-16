package com.avito.android.safedeal_checkout.delivery_universal_checkout;

import android.view.View;
import ao0.InterfaceC23644a;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.DeliveryUniversalCheckoutFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f257056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DeliveryUniversalCheckoutFragment f257057c;

    public /* synthetic */ e(DeliveryUniversalCheckoutFragment deliveryUniversalCheckoutFragment, int i12) {
        this.f257056b = i12;
        this.f257057c = deliveryUniversalCheckoutFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DeliveryUniversalCheckoutFragment deliveryUniversalCheckoutFragment = this.f257057c;
        switch (this.f257056b) {
            case 0:
                DeliveryUniversalCheckoutFragment.a aVar = DeliveryUniversalCheckoutFragment.f256862L0;
                deliveryUniversalCheckoutFragment.requireActivity().onBackPressed();
                break;
            default:
                DeliveryUniversalCheckoutFragment.a aVar2 = DeliveryUniversalCheckoutFragment.f256862L0;
                deliveryUniversalCheckoutFragment.D5().accept(InterfaceC23644a.C1969a.f56222a);
                break;
        }
    }
}
