package com.avito.android.return_checkout;

import Wm0.InterfaceC15776a;
import android.view.View;
import com.avito.android.return_checkout.DeliveryReturnCheckoutFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f255240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DeliveryReturnCheckoutFragment f255241c;

    public /* synthetic */ d(DeliveryReturnCheckoutFragment deliveryReturnCheckoutFragment, int i12) {
        this.f255240b = i12;
        this.f255241c = deliveryReturnCheckoutFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DeliveryReturnCheckoutFragment deliveryReturnCheckoutFragment = this.f255241c;
        switch (this.f255240b) {
            case 0:
                DeliveryReturnCheckoutFragment.a aVar = DeliveryReturnCheckoutFragment.f255211K0;
                deliveryReturnCheckoutFragment.requireActivity().onBackPressed();
                break;
            default:
                DeliveryReturnCheckoutFragment.a aVar2 = DeliveryReturnCheckoutFragment.f255211K0;
                ((o) deliveryReturnCheckoutFragment.f255223u0.getValue()).accept(InterfaceC15776a.C1281a.f18033a);
                break;
        }
    }
}
