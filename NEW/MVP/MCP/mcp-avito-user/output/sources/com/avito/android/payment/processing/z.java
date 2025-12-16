package com.avito.android.payment.processing;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import u60.InterfaceC48808a;

/* compiled from: PaymentStatusPollingInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/processing/z;", "Lcom/avito/android/payment/processing/y;", "_avito_payment-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48808a f214813a;

    /* compiled from: PaymentStatusPollingInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/payment/status/PaymentStatusResult;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f214814b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(((TypedResult.Success) typedResult).getResult());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public z(@Y61.k InterfaceC48808a interfaceC48808a) {
        this.f214813a = interfaceC48808a;
    }

    @Override // com.avito.android.payment.processing.y
    @Y61.k
    public final io.reactivex.rxjava3.core.z<P2<PaymentStatusResult>> a(@Y61.k String str) {
        return this.f214813a.a(str).d0(a.f214814b).r0(P2.c.f318721a);
    }
}
