package com.avito.android.checkout.ui.items.price;

import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CheckoutPriceItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/checkout/ui/items/price/f;", "Lcom/avito/android/checkout/ui/items/price/d;", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f118420b;

    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.S9(aVar2.f118410g);
        hVar.bC(aVar2.f118406c, aVar2.f118407d, aVar2.f118408e);
        hVar.g(aVar2.f118411h);
        ArrayList arrayList = aVar2.f118409f;
        if (arrayList == null || arrayList.isEmpty()) {
            hVar.K70();
        } else {
            hVar.Ly(arrayList, this.f118420b, new e(this, hVar));
        }
    }
}
