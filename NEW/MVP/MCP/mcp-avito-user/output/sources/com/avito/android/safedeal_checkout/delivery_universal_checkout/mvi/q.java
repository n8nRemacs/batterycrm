package com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi;

import ao0.C23646c;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryUniversalCheckoutReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lao0/c$a$a;", "invoke", "(Lao0/c$a$a;)Lao0/c$a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class q extends N implements Y41.l<C23646c.a.C1971a, C23646c.a.C1971a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DeliveryUniversalCheckoutInternalAction f257182l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(DeliveryUniversalCheckoutInternalAction deliveryUniversalCheckoutInternalAction) {
        super(1);
        this.f257182l = deliveryUniversalCheckoutInternalAction;
    }

    @Override // Y41.l
    public final C23646c.a.C1971a invoke(C23646c.a.C1971a c1971a) {
        C23646c.a.C1971a c1971a2 = c1971a;
        DeliveryUniversalCheckoutInternalAction.ContentChanged contentChanged = (DeliveryUniversalCheckoutInternalAction.ContentChanged) this.f257182l;
        return C23646c.a.C1971a.a(c1971a2, contentChanged.f257117b, contentChanged.f257118c, contentChanged.f257119d, false, 799);
    }
}
