package com.avito.android.comfortable_deal.contract_sign.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.comfortable_deal.contract_sign.mvi.entity.ContractSignInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import op.InterfaceC44835a;
import pp.C47122c;
import pp.InterfaceC47120a;

/* compiled from: ContractSignActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/contract_sign/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "Lpp/a;", "Lcom/avito/android/comfortable_deal/contract_sign/mvi/entity/ContractSignInternalAction;", "Lpp/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC47120a, ContractSignInternalAction, C47122c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.repository.a f120848a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44835a f120849b;

    @Inject
    public c(@Y61.k com.avito.android.comfortable_deal.repository.a aVar, @Y61.k InterfaceC44835a interfaceC44835a) {
        this.f120848a = aVar;
        this.f120849b = interfaceC44835a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ContractSignInternalAction> b(InterfaceC47120a interfaceC47120a, C47122c c47122c) {
        InterfaceC47120a interfaceC47120a2 = interfaceC47120a;
        C47122c c47122c2 = c47122c;
        if (interfaceC47120a2 instanceof InterfaceC47120a.c) {
            return new C43210w(ContractSignInternalAction.NavigateBack.f120863b);
        }
        if (interfaceC47120a2 instanceof InterfaceC47120a.C12289a) {
            return C43175k.G(new a(this, null, c47122c2));
        }
        if (interfaceC47120a2 instanceof InterfaceC47120a.b) {
            return C43175k.G(new b(this, null, c47122c2));
        }
        if (interfaceC47120a2 instanceof InterfaceC47120a.d) {
            return new C43210w(ContractSignInternalAction.OpenClientsFragment.f120864b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
