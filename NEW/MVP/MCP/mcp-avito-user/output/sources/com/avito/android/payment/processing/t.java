package com.avito.android.payment.processing;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import u60.InterfaceC48808a;

/* compiled from: PaymentStatusInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/payment/status/PaymentStatusResult;", "invoke", "()Lio/reactivex/rxjava3/core/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class t extends N implements Y41.a<io.reactivex.rxjava3.core.z<TypedResult<PaymentStatusResult>>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC48808a f214808l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f214809m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(InterfaceC48808a interfaceC48808a, String str) {
        super(0);
        this.f214808l = interfaceC48808a;
        this.f214809m = str;
    }

    @Override // Y41.a
    public final io.reactivex.rxjava3.core.z<TypedResult<PaymentStatusResult>> invoke() {
        return this.f214808l.a(this.f214809m);
    }
}
