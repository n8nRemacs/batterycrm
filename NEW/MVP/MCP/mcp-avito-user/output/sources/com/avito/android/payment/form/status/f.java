package com.avito.android.payment.form.status;

import android.os.Parcelable;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.payment.status.form.PaymentStatusFormResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.N;
import u60.InterfaceC48808a;

/* compiled from: PaymentStatusFormInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/form/status/f;", "Lcom/avito/android/payment/form/status/e;", "Lcom/avito/android/payment/caching_interactor/a;", "Lcom/avito/android/remote/model/payment/status/form/PaymentStatusFormResult;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements e, com.avito.android.payment.caching_interactor.a<PaymentStatusFormResult> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.payment.caching_interactor.d<PaymentStatusFormResult> f214414a;

    /* compiled from: PaymentStatusFormInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/payment/status/form/PaymentStatusFormResult;", "invoke", "()Lio/reactivex/rxjava3/core/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<io.reactivex.rxjava3.core.z<TypedResult<PaymentStatusFormResult>>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC48808a f214415l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f214416m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC48808a interfaceC48808a, String str) {
            super(0);
            this.f214415l = interfaceC48808a;
            this.f214416m = str;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.z<TypedResult<PaymentStatusFormResult>> invoke() {
            return this.f214415l.d(this.f214416m);
        }
    }

    /* compiled from: PaymentStatusFormInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/payment/status/form/PaymentStatusFormResult;", "result", "Lcom/avito/android/util/Kundle;", "kundle", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/payment/status/form/PaymentStatusFormResult;Lcom/avito/android/util/Kundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<PaymentStatusFormResult, Kundle, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f214417l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(PaymentStatusFormResult paymentStatusFormResult, Kundle kundle) {
            PaymentStatusFormResult paymentStatusFormResult2 = paymentStatusFormResult;
            Kundle kundle2 = kundle;
            if (paymentStatusFormResult2 instanceof PaymentStatusFormResult.StatusForm) {
                kundle2.j((Parcelable) paymentStatusFormResult2, "PaymentStatusFormInteractor_cached_results");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentStatusFormInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/payment/status/form/PaymentStatusFormResult;", "kundle", "Lcom/avito/android/util/Kundle;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.l<Kundle, PaymentStatusFormResult> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f214418l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final PaymentStatusFormResult invoke(Kundle kundle) {
            Kundle kundle2 = kundle;
            if (kundle2.f318647b.containsKey("PaymentStatusFormInteractor_cached_results")) {
                return (PaymentStatusFormResult.StatusForm) kundle2.d("PaymentStatusFormInteractor_cached_results");
            }
            return null;
        }
    }

    public f(@Y61.k InterfaceC48808a interfaceC48808a, @Y61.k String str, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.l Kundle kundle) {
        this.f214414a = new com.avito.android.payment.caching_interactor.d<>(interfaceC35745a5, kundle, new a(interfaceC48808a, str), b.f214417l, c.f214418l);
    }

    @Override // com.avito.android.payment.form.status.e
    @Y61.k
    public final io.reactivex.rxjava3.core.z<P2<PaymentStatusFormResult>> a() {
        return this.f214414a.a(B0.f406639b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // com.avito.android.payment.form.status.e
    @Y61.k
    public final Kundle d0() {
        com.avito.android.payment.caching_interactor.d<PaymentStatusFormResult> dVar = this.f214414a;
        dVar.getClass();
        Kundle kundle = new Kundle();
        PaymentStatusFormResult paymentStatusFormResult = dVar.f214002d;
        if (paymentStatusFormResult != null) {
            dVar.f214001c.invoke(paymentStatusFormResult, kundle);
        }
        return kundle;
    }
}
