package com.avito.android.payment.processing;

import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaymentStatusPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/payment/status/PaymentStatusResult;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class B extends N implements Y41.l<P2<? super PaymentStatusResult>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f214771l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c12) {
        super(1);
        this.f214771l = c12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(P2<? super PaymentStatusResult> p22) {
        P2<? super PaymentStatusResult> p23 = p22;
        boolean z12 = p23 instanceof P2.b;
        C c12 = this.f214771l;
        if (z12) {
            T t12 = ((P2.b) p23).f318720a;
            PaymentStatusResult paymentStatusResult = (PaymentStatusResult) t12;
            if (paymentStatusResult instanceof PaymentStatusResult.PaymentStatus) {
                q qVar = c12.f214774c;
                if (qVar != null) {
                    qVar.a((PaymentStatusResult.PaymentStatus) t12);
                }
            } else {
                boolean z13 = paymentStatusResult instanceof PaymentStatusResult.ForbiddenPayment;
            }
        } else if (p23 instanceof P2.a) {
            String strK = com.avito.android.error.z.k(((P2.a) p23).f318719a);
            q qVar2 = c12.f214774c;
            if (qVar2 != null) {
                qVar2.onError(strK);
            }
        } else {
            p23.equals(P2.c.f318721a);
        }
        return G0.f406611a;
    }
}
