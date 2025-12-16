package com.avito.android.comfortable_deal.select_agent.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction;
import dq.InterfaceC39778a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SelectAgentActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "Ldq/a;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "Ldq/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC39778a, SelectAgentInternalAction, dq.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.repository.a f122748a;

    @Inject
    public c(@Y61.k com.avito.android.comfortable_deal.repository.a aVar) {
        this.f122748a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SelectAgentInternalAction> b(InterfaceC39778a interfaceC39778a, dq.c cVar) {
        C43210w c43210w;
        InterfaceC39778a interfaceC39778a2 = interfaceC39778a;
        dq.c cVar2 = cVar;
        if (interfaceC39778a2 instanceof InterfaceC39778a.C11035a) {
            return new C43210w(new SelectAgentInternalAction.SelectAgent(((InterfaceC39778a.C11035a) interfaceC39778a2).f394073a));
        }
        if (interfaceC39778a2.equals(InterfaceC39778a.b.f394074a)) {
            c43210w = new C43210w(new SelectAgentInternalAction.SelectAgent(null));
        } else {
            if (!interfaceC39778a2.equals(InterfaceC39778a.c.f394075a)) {
                if (interfaceC39778a2.equals(InterfaceC39778a.d.f394076a)) {
                    return C43175k.G(new a(cVar2, this, null));
                }
                if (interfaceC39778a2.equals(InterfaceC39778a.e.f394077a)) {
                    return C43175k.G(new b(cVar2, this, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(SelectAgentInternalAction.CloseDialog.f122757b);
        }
        return c43210w;
    }
}
