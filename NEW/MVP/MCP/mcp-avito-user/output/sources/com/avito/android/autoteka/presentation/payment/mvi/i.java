package com.avito.android.autoteka.presentation.payment.mvi;

import Nf.InterfaceC14568a;
import com.avito.android.arch.mvi.a;
import com.avito.android.autoteka.deeplinks.PaymentDetails;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentInternalAction;
import com.avito.android.autoteka.presentation.payment.mvi.entity.AutotekaPaymentState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutotekaPaymentActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/autoteka/presentation/payment/mvi/i;", "Lcom/avito/android/arch/mvi/a;", "LNf/a;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentInternalAction;", "Lcom/avito/android/autoteka/presentation/payment/mvi/entity/AutotekaPaymentState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements com.avito.android.arch.mvi.a<InterfaceC14568a, AutotekaPaymentInternalAction, AutotekaPaymentState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.order.k f97475a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.order.f f97476b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.a f97477c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PaymentDetails f97478d;

    @Inject
    public i(@Y61.k com.avito.android.autoteka.data.order.k kVar, @Y61.k com.avito.android.autoteka.data.order.f fVar, @Y61.k com.avito.android.autoteka.data.a aVar, @Y61.k PaymentDetails paymentDetails) {
        this.f97475a = kVar;
        this.f97476b = fVar;
        this.f97477c = aVar;
        this.f97478d = paymentDetails;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AutotekaPaymentInternalAction> b(InterfaceC14568a interfaceC14568a, AutotekaPaymentState autotekaPaymentState) {
        InterfaceC14568a interfaceC14568a2 = interfaceC14568a;
        AutotekaPaymentState autotekaPaymentState2 = autotekaPaymentState;
        if (interfaceC14568a2 instanceof InterfaceC14568a.c) {
            return C43175k.G(new C28719a(autotekaPaymentState2, this, null));
        }
        if (interfaceC14568a2 instanceof InterfaceC14568a.h) {
            return C43175k.G(new C28720b(autotekaPaymentState2, interfaceC14568a2, this, null));
        }
        if (interfaceC14568a2 instanceof InterfaceC14568a.b) {
            return C43175k.G(new c(interfaceC14568a2, null));
        }
        if (interfaceC14568a2 instanceof InterfaceC14568a.d) {
            return C43175k.G(new d(autotekaPaymentState2, this, null));
        }
        if (interfaceC14568a2 instanceof InterfaceC14568a.e) {
            return C43175k.G(new e(autotekaPaymentState2, interfaceC14568a2, null));
        }
        if (interfaceC14568a2.equals(InterfaceC14568a.f.f11689a)) {
            return C43175k.G(new f(autotekaPaymentState2, this, null));
        }
        if (interfaceC14568a2 instanceof InterfaceC14568a.C0753a) {
            return C43175k.G(new g(autotekaPaymentState2, interfaceC14568a2, null));
        }
        if (interfaceC14568a2.equals(InterfaceC14568a.g.f11690a)) {
            return C43175k.G(new h(2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
