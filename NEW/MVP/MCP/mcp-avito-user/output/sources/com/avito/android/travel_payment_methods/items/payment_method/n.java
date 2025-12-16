package com.avito.android.travel_payment_methods.items.payment_method;

import com.avito.android.travel_payment_methods.items.payment_method.q;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentMethodPresenterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_payment_methods/items/payment_method/n;", "Lcom/avito/android/travel_payment_methods/items/payment_method/g;", "Lcom/avito/android/travel_payment_methods/items/payment_method/o;", "Lcom/avito/android/travel_payment_methods/items/payment_method/PaymentMethodItem;", "_avito_travel-payment-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements g<o, PaymentMethodItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f302523b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final N f302524c;

    /* JADX WARN: Multi-variable type inference failed */
    public n(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k Y41.l<? super String, G0> lVar) {
        this.f302523b = aVar;
        this.f302524c = (N) lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        o oVar = (o) eVar;
        PaymentMethodItem paymentMethodItem = (PaymentMethodItem) aVar;
        oVar.pK(paymentMethodItem, new l(this), new m(this));
        oVar.Bc(paymentMethodItem.f302517c.f302552d);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        o oVar = (o) eVar;
        PaymentMethodItem paymentMethodItem = (PaymentMethodItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        List list2 = (List) (obj instanceof List ? obj : null);
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        if (list2.isEmpty()) {
            oVar.pK(paymentMethodItem, new l(this), new m(this));
            oVar.Bc(paymentMethodItem.f302517c.f302552d);
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((q) it.next()) instanceof q.a) {
                    oVar.Bc(paymentMethodItem.f302517c.f302552d);
                }
            }
        }
    }
}
