package com.avito.android.payment.processing;

import com.avito.android.payment.remote.PaymentSessionTypeMarker;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.payment.generic.PaymentGenericResult;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import u60.InterfaceC48808a;

/* compiled from: PaymentGenericInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/payment/generic/PaymentGenericResult;", "invoke", "()Lio/reactivex/rxjava3/core/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.payment.processing.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33030c extends N implements Y41.a<io.reactivex.rxjava3.core.z<TypedResult<PaymentGenericResult>>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PaymentSessionTypeMarker f214787l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC48808a f214788m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f214789n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f214790o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f214791p;

    /* compiled from: PaymentGenericInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.payment.processing.c$a */
    public /* synthetic */ class a {
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
    public C33030c(PaymentSessionTypeMarker paymentSessionTypeMarker, InterfaceC48808a interfaceC48808a, String str, String str2, LinkedHashMap linkedHashMap) {
        super(0);
        this.f214787l = paymentSessionTypeMarker;
        this.f214788m = interfaceC48808a;
        this.f214789n = str;
        this.f214790o = str2;
        this.f214791p = linkedHashMap;
    }

    @Override // Y41.a
    public final io.reactivex.rxjava3.core.z<TypedResult<PaymentGenericResult>> invoke() {
        int iOrdinal = this.f214787l.ordinal();
        LinkedHashMap linkedHashMap = this.f214791p;
        String str = this.f214790o;
        String str2 = this.f214789n;
        InterfaceC48808a interfaceC48808a = this.f214788m;
        if (iOrdinal == 0) {
            return interfaceC48808a.b(str2, str, linkedHashMap);
        }
        if (iOrdinal == 1) {
            return interfaceC48808a.b(str2, str, linkedHashMap);
        }
        if (iOrdinal == 2) {
            return interfaceC48808a.b(str2, str, linkedHashMap);
        }
        throw new NoWhenBranchMatchedException();
    }
}
