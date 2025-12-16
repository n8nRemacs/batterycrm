package com.avito.android.payment.processing;

import com.avito.android.remote.model.payment.generic.PaymentGenericResult;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaymentGenericPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/payment/generic/PaymentGenericResult;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j extends N implements Y41.l<P2<? super PaymentGenericResult>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f214799l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(1);
        this.f214799l = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(com.avito.android.util.P2<? super com.avito.android.remote.model.payment.generic.PaymentGenericResult> r4) {
        /*
            r3 = this;
            com.avito.android.util.P2 r4 = (com.avito.android.util.P2) r4
            boolean r0 = r4 instanceof com.avito.android.util.P2.b
            com.avito.android.payment.processing.k r1 = r3.f214799l
            if (r0 == 0) goto L7a
            com.avito.android.util.P2$b r4 = (com.avito.android.util.P2.b) r4
            T r4 = r4.f318720a
            r0 = r4
            com.avito.android.remote.model.payment.generic.PaymentGenericResult r0 = (com.avito.android.remote.model.payment.generic.PaymentGenericResult) r0
            boolean r2 = r0 instanceof com.avito.android.remote.model.payment.generic.PaymentGenericResult.Ok
            if (r2 == 0) goto L38
            com.avito.android.remote.model.payment.generic.PaymentGenericResult$Ok r4 = (com.avito.android.remote.model.payment.generic.PaymentGenericResult.Ok) r4
            java.lang.String r4 = r4.getUri()
            com.avito.android.deep_linking.x r0 = r1.f214801b
            com.avito.android.deep_linking.links.DeepLink r0 = r0.b(r4)
            boolean r2 = r0 instanceof com.avito.android.deep_linking.links.PaymentStatusLink
            if (r2 == 0) goto L30
            com.avito.android.deep_linking.links.PaymentStatusLink r0 = (com.avito.android.deep_linking.links.PaymentStatusLink) r0
            boolean r2 = r0.f133572c
            if (r2 == 0) goto L30
            r2 = 1
            java.lang.String r0 = r0.f133571b
            com.avito.android.payment.processing.k.a(r2, r1, r0, r4)
            goto L93
        L30:
            com.avito.android.payment.processing.q r0 = r1.f214804e
            if (r0 == 0) goto L93
            r0.b(r4)
            goto L93
        L38:
            boolean r2 = r0 instanceof com.avito.android.remote.model.payment.generic.PaymentGenericResult.FormIncorrectData
            if (r2 == 0) goto L56
            com.avito.android.remote.model.payment.generic.PaymentGenericResult$FormIncorrectData r4 = (com.avito.android.remote.model.payment.generic.PaymentGenericResult.FormIncorrectData) r4
            java.util.Map r4 = r4.getMessages()
            java.util.Collection r4 = r4.values()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Object r4 = kotlin.collections.C42745f0.D(r4)
            java.lang.String r4 = (java.lang.String) r4
            com.avito.android.payment.processing.q r0 = r1.f214804e
            if (r0 == 0) goto L93
            r0.onError(r4)
            goto L93
        L56:
            boolean r2 = r0 instanceof com.avito.android.remote.model.payment.generic.PaymentGenericResult.DuplicatePayment
            if (r2 == 0) goto L68
            com.avito.android.remote.model.payment.generic.PaymentGenericResult$DuplicatePayment r4 = (com.avito.android.remote.model.payment.generic.PaymentGenericResult.DuplicatePayment) r4
            java.lang.String r4 = r4.getMessage()
            com.avito.android.payment.processing.q r0 = r1.f214804e
            if (r0 == 0) goto L93
            r0.onError(r4)
            goto L93
        L68:
            boolean r0 = r0 instanceof com.avito.android.remote.model.payment.generic.PaymentGenericResult.ForbiddenPayment
            if (r0 == 0) goto L93
            com.avito.android.remote.model.payment.generic.PaymentGenericResult$ForbiddenPayment r4 = (com.avito.android.remote.model.payment.generic.PaymentGenericResult.ForbiddenPayment) r4
            java.lang.String r4 = r4.getMessage()
            com.avito.android.payment.processing.q r0 = r1.f214804e
            if (r0 == 0) goto L93
            r0.onError(r4)
            goto L93
        L7a:
            boolean r0 = r4 instanceof com.avito.android.util.P2.a
            if (r0 == 0) goto L8e
            com.avito.android.util.P2$a r4 = (com.avito.android.util.P2.a) r4
            com.avito.android.remote.error.ApiError r4 = r4.f318719a
            java.lang.String r4 = com.avito.android.error.z.k(r4)
            com.avito.android.payment.processing.q r0 = r1.f214804e
            if (r0 == 0) goto L93
            r0.onError(r4)
            goto L93
        L8e:
            com.avito.android.util.P2$c r0 = com.avito.android.util.P2.c.f318721a
            r4.equals(r0)
        L93:
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.payment.processing.j.invoke(java.lang.Object):java.lang.Object");
    }
}
