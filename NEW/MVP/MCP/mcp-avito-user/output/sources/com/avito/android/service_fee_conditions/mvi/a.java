package com.avito.android.service_fee_conditions.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.service_fee_conditions.mvi.entity.ServiceFeeConditionsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qu0.InterfaceC47449a;

/* compiled from: ServiceFeeConditionsActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_fee_conditions/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lqu0/a;", "Lcom/avito/android/service_fee_conditions/mvi/entity/ServiceFeeConditionsInternalAction;", "Lqu0/c;", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC47449a, ServiceFeeConditionsInternalAction, qu0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_fee_conditions.domain.a f278440a;

    @Inject
    public a(@Y61.k com.avito.android.service_fee_conditions.domain.a aVar) {
        this.f278440a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ServiceFeeConditionsInternalAction> b(InterfaceC47449a interfaceC47449a, qu0.c cVar) {
        C43210w c43210w;
        InterfaceC47449a interfaceC47449a2 = interfaceC47449a;
        qu0.c cVar2 = cVar;
        if (interfaceC47449a2 instanceof InterfaceC47449a.b) {
            return this.f278440a.a();
        }
        boolean z12 = interfaceC47449a2 instanceof InterfaceC47449a.c;
        boolean z13 = cVar2.f429478b;
        if (z12) {
            c43210w = new C43210w(z13 ? ServiceFeeConditionsInternalAction.FinishFlow.f278453b : ServiceFeeConditionsInternalAction.Back.f278449b);
        } else {
            if (!(interfaceC47449a2 instanceof InterfaceC47449a.C12342a)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(z13 ? ServiceFeeConditionsInternalAction.FinishFlow.f278453b : ServiceFeeConditionsInternalAction.Back.f278449b);
        }
        return c43210w;
    }
}
