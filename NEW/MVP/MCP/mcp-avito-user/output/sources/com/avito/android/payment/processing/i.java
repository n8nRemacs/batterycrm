package com.avito.android.payment.processing;

import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentGenericPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/payment/status/PaymentStatusResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f214795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f214796c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f214797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f214798e;

    public i(int i12, k kVar, String str, String str2) {
        this.f214795b = i12;
        this.f214796c = kVar;
        this.f214797d = str;
        this.f214798e = str2;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        q qVar;
        int i12;
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.b;
        k kVar = this.f214796c;
        if (!z12) {
            if (!(p22 instanceof P2.a)) {
                p22.equals(P2.c.f318721a);
                return;
            }
            String strK = com.avito.android.error.z.k(((P2.a) p22).f318719a);
            q qVar2 = kVar.f214804e;
            if (qVar2 != null) {
                qVar2.onError(strK);
                return;
            }
            return;
        }
        PaymentStatusResult paymentStatusResult = (PaymentStatusResult) ((P2.b) p22).f318720a;
        boolean z13 = paymentStatusResult instanceof PaymentStatusResult.PaymentStatus;
        String str = this.f214798e;
        if (!z13) {
            if (!(paymentStatusResult instanceof PaymentStatusResult.ForbiddenPayment) || (qVar = kVar.f214804e) == null) {
                return;
            }
            qVar.b(str);
            return;
        }
        if (L.f(((PaymentStatusResult.PaymentStatus) paymentStatusResult).getState(), "active") && (i12 = this.f214795b) < 3) {
            k.a(i12 + 1, kVar, this.f214797d, str);
            return;
        }
        q qVar3 = kVar.f214804e;
        if (qVar3 != null) {
            qVar3.b(str);
        }
    }
}
