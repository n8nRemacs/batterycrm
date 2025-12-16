package com.avito.android.payment.form.status;

import com.avito.android.payment.form.status.A;
import com.avito.android.remote.model.payment.status.form.PaymentStatusFormResult;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PaymentStatusFormPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/payment/status/form/PaymentStatusFormResult;", "loadingState", "Lcom/avito/android/payment/form/status/A;", "apply", "(Lcom/avito/android/util/P2;)Lcom/avito/android/payment/form/status/A;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class o<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f214443b;

    public o(k kVar) {
        this.f214443b = kVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        P2 p22 = (P2) obj;
        if (!(p22 instanceof P2.b)) {
            if (p22 instanceof P2.a) {
                return new A.b(com.avito.android.error.z.k(((P2.a) p22).f318719a));
            }
            if (p22 instanceof P2.c) {
                return new A.c();
            }
            throw new NoWhenBranchMatchedException();
        }
        PaymentStatusFormResult paymentStatusFormResult = (PaymentStatusFormResult) ((P2.b) p22).f318720a;
        if (!(paymentStatusFormResult instanceof PaymentStatusFormResult.StatusForm)) {
            throw new NoWhenBranchMatchedException();
        }
        PaymentStatusFormResult.StatusForm statusForm = (PaymentStatusFormResult.StatusForm) paymentStatusFormResult;
        k kVar = this.f214443b;
        kVar.getClass();
        kVar.f214427h.t0(new m(kVar, statusForm));
        return kVar.f214421b.a(statusForm);
    }
}
