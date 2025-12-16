package com.avito.android.autoteka.presentation.waitingForPayment.mvi;

import Uf.InterfaceC15514a;
import com.avito.android.arch.mvi.a;
import com.avito.android.autoteka.deeplinks.WaitingForPaymentDetails;
import com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentInternalAction;
import com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutotekaWaitingForPaymentActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LUf/a;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentInternalAction;", "Lcom/avito/android/autoteka/presentation/waitingForPayment/mvi/entity/AutotekaWaitingForPaymentState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC15514a, AutotekaWaitingForPaymentInternalAction, AutotekaWaitingForPaymentState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.orderStatus.a f97870a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final WaitingForPaymentDetails f97871b;

    @Inject
    public b(@Y61.k com.avito.android.autoteka.data.orderStatus.a aVar, @Y61.k WaitingForPaymentDetails waitingForPaymentDetails) {
        this.f97870a = aVar;
        this.f97871b = waitingForPaymentDetails;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AutotekaWaitingForPaymentInternalAction> b(InterfaceC15514a interfaceC15514a, AutotekaWaitingForPaymentState autotekaWaitingForPaymentState) {
        InterfaceC15514a interfaceC15514a2 = interfaceC15514a;
        AutotekaWaitingForPaymentState autotekaWaitingForPaymentState2 = autotekaWaitingForPaymentState;
        if (interfaceC15514a2 instanceof InterfaceC15514a.c) {
            return C43175k.G(new a(autotekaWaitingForPaymentState2, interfaceC15514a2, this, null));
        }
        if (interfaceC15514a2 instanceof InterfaceC15514a.b) {
            return new C43210w(new AutotekaWaitingForPaymentInternalAction.OpenDeepLink(((InterfaceC15514a.b) interfaceC15514a2).f16536a));
        }
        if (interfaceC15514a2.equals(InterfaceC15514a.C1133a.f16535a)) {
            return new C43210w(AutotekaWaitingForPaymentInternalAction.CloseScreen.f97884b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
