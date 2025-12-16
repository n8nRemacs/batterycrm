package com.avito.android.payment.form;

import android.os.Parcelable;
import com.avito.android.payment.ParametersTree;
import com.avito.android.payment.remote.PaymentSessionTypeMarker;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.payment.form.PaymentGenericFormResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.P2;
import com.avito.android.validation.InterfaceC36020m;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.B0;
import u60.InterfaceC48808a;

/* compiled from: PaymentGenericFormInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/form/g;", "Lcom/avito/android/payment/form/f;", "Lcom/avito/android/payment/caching_interactor/a;", "Lcom/avito/android/remote/model/payment/form/PaymentGenericFormResult;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.payment.form.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C33004g implements InterfaceC33003f, com.avito.android.payment.caching_interactor.a<PaymentGenericFormResult> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36020m f214354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.payment.caching_interactor.d<PaymentGenericFormResult> f214355b;

    /* compiled from: PaymentGenericFormInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/payment/form/PaymentGenericFormResult;", "invoke", "()Lio/reactivex/rxjava3/core/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.payment.form.g$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.z<TypedResult<PaymentGenericFormResult>>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ PaymentSessionTypeMarker f214356l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC48808a f214357m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f214358n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f214359o;

        /* compiled from: PaymentGenericFormInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.payment.form.g$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6429a {
            static {
                int[] iArr = new int[PaymentSessionTypeMarker.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    PaymentSessionTypeMarker paymentSessionTypeMarker = PaymentSessionTypeMarker.f214815b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    PaymentSessionTypeMarker paymentSessionTypeMarker2 = PaymentSessionTypeMarker.f214815b;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PaymentSessionTypeMarker paymentSessionTypeMarker, InterfaceC48808a interfaceC48808a, String str, String str2) {
            super(0);
            this.f214356l = paymentSessionTypeMarker;
            this.f214357m = interfaceC48808a;
            this.f214358n = str;
            this.f214359o = str2;
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.z<TypedResult<PaymentGenericFormResult>> invoke() {
            int iOrdinal = this.f214356l.ordinal();
            String str = this.f214359o;
            String str2 = this.f214358n;
            InterfaceC48808a interfaceC48808a = this.f214357m;
            if (iOrdinal == 0) {
                return interfaceC48808a.e(str2, str);
            }
            if (iOrdinal == 1) {
                return interfaceC48808a.e(str2, str);
            }
            if (iOrdinal == 2) {
                return interfaceC48808a.e(str2, str);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: PaymentGenericFormInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/payment/form/PaymentGenericFormResult;", "result", "Lcom/avito/android/util/Kundle;", "kundle", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/payment/form/PaymentGenericFormResult;Lcom/avito/android/util/Kundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.payment.form.g$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<PaymentGenericFormResult, Kundle, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f214360l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(PaymentGenericFormResult paymentGenericFormResult, Kundle kundle) {
            PaymentGenericFormResult paymentGenericFormResult2 = paymentGenericFormResult;
            Kundle kundle2 = kundle;
            if (paymentGenericFormResult2 instanceof PaymentGenericFormResult.Ok) {
                kundle2.j((Parcelable) paymentGenericFormResult2, "PaymentGenericFormInteractor_cached_results");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentGenericFormInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/payment/form/PaymentGenericFormResult;", "kundle", "Lcom/avito/android/util/Kundle;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.payment.form.g$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Kundle, PaymentGenericFormResult> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f214361l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final PaymentGenericFormResult invoke(Kundle kundle) {
            Kundle kundle2 = kundle;
            if (kundle2.f318647b.containsKey("PaymentGenericFormInteractor_cached_results")) {
                return (PaymentGenericFormResult.Ok) kundle2.d("PaymentGenericFormInteractor_cached_results");
            }
            return null;
        }
    }

    public C33004g(@Y61.k InterfaceC48808a interfaceC48808a, @Y61.k InterfaceC36020m interfaceC36020m, @Y61.k String str, @Y61.k String str2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k PaymentSessionTypeMarker paymentSessionTypeMarker, @Y61.l Kundle kundle) {
        this.f214354a = interfaceC36020m;
        this.f214355b = new com.avito.android.payment.caching_interactor.d<>(interfaceC35745a5, kundle, new a(paymentSessionTypeMarker, interfaceC48808a, str, str2), b.f214360l, c.f214361l);
    }

    @Override // com.avito.android.payment.form.InterfaceC33003f
    @Y61.k
    public final io.reactivex.rxjava3.core.z<PretendResult> a(@Y61.k ParametersTree parametersTree) {
        return this.f214354a.b(parametersTree);
    }

    @Override // com.avito.android.payment.form.InterfaceC33003f
    @Y61.k
    public final io.reactivex.rxjava3.core.z<P2<PaymentGenericFormResult>> b() {
        return this.f214355b.a(B0.f406639b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // com.avito.android.payment.form.InterfaceC33003f
    @Y61.k
    public final Kundle d0() {
        com.avito.android.payment.caching_interactor.d<PaymentGenericFormResult> dVar = this.f214355b;
        dVar.getClass();
        Kundle kundle = new Kundle();
        PaymentGenericFormResult paymentGenericFormResult = dVar.f214002d;
        if (paymentGenericFormResult != null) {
            dVar.f214001c.invoke(paymentGenericFormResult, kundle);
        }
        return kundle;
    }
}
