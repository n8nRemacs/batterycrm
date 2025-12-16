package com.avito.android.payment.form;

import com.avito.android.payment.ParametersTree;
import com.avito.android.payment.form.P;
import com.avito.android.remote.model.payment.form.PaymentGenericFormResult;
import com.avito.android.util.Kundle;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PaymentGenericFormPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/payment/form/PaymentGenericFormResult;", "loadingState", "Lcom/avito/android/payment/form/P;", "apply", "(Lcom/avito/android/util/P2;)Lcom/avito/android/payment/form/P;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class B<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33012o f214319b;

    public B(C33012o c33012o) {
        this.f214319b = c33012o;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        P2 p22 = (P2) obj;
        if (!(p22 instanceof P2.b)) {
            if (p22 instanceof P2.a) {
                return new P.b(com.avito.android.error.z.k(((P2.a) p22).f318719a));
            }
            if (p22 instanceof P2.c) {
                return new P.c();
            }
            throw new NoWhenBranchMatchedException();
        }
        PaymentGenericFormResult paymentGenericFormResult = (PaymentGenericFormResult) ((P2.b) p22).f318720a;
        if (!(paymentGenericFormResult instanceof PaymentGenericFormResult.Ok)) {
            throw new NoWhenBranchMatchedException();
        }
        PaymentGenericFormResult.Ok ok2 = (PaymentGenericFormResult.Ok) paymentGenericFormResult;
        C33012o c33012o = this.f214319b;
        Kundle kundle = c33012o.f214370e;
        ParametersTree parametersTree = kundle != null ? (ParametersTree) kundle.d("PaymentGenericFormPresenterImpl_entered_params") : null;
        if (parametersTree == null) {
            parametersTree = new ParametersTree(ok2.getFields());
        }
        c33012o.f214371f = parametersTree;
        C32998a c32998a = new C32998a(ok2.getTitle(), ok2.getSubmitText(), ok2.getInformation(), ok2.getPaymentSessionId(), ok2.getMethodSignature());
        c33012o.f214372g = c32998a;
        boolean z12 = kundle == null;
        ParametersTree parametersTree2 = c33012o.f214371f;
        return c33012o.f214368c.a(c32998a, parametersTree2 != null ? parametersTree2 : null, z12);
    }
}
