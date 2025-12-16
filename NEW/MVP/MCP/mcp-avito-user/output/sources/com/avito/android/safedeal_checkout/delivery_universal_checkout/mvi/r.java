package com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi;

import ao0.C23646c;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryUniversalCheckoutReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lao0/c$a$a;", "invoke", "(Lao0/c$a$a;)Lao0/c$a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r extends N implements Y41.l<C23646c.a.C1971a, C23646c.a.C1971a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DeliveryUniversalCheckoutInternalAction f257183l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(DeliveryUniversalCheckoutInternalAction deliveryUniversalCheckoutInternalAction) {
        super(1);
        this.f257183l = deliveryUniversalCheckoutInternalAction;
    }

    @Override // Y41.l
    public final C23646c.a.C1971a invoke(C23646c.a.C1971a c1971a) {
        return C23646c.a.C1971a.a(c1971a, null, null, null, ((DeliveryUniversalCheckoutInternalAction.ExecuteRequestStateChanged) this.f257183l).f257122b, 767);
    }
}
