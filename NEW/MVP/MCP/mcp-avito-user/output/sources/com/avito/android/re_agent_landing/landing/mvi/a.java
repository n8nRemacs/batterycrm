package com.avito.android.re_agent_landing.landing.mvi;

import Sh0.InterfaceC15186a;
import com.avito.android.arch.mvi.a;
import com.avito.android.re_agent_landing.landing.items.action_block.ActionStatus;
import com.avito.android.re_agent_landing.landing.mvi.entity.ReAgentProfileCreateLandingInternalAction;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ReAgentProfileCreateLandingActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LSh0/a;", "Lcom/avito/android/re_agent_landing/landing/mvi/entity/ReAgentProfileCreateLandingInternalAction;", "LSh0/c;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC15186a, ReAgentProfileCreateLandingInternalAction, Sh0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.re_agent_landing.landing.interactor.a f250809a;

    @Inject
    public a(@Y61.k com.avito.android.re_agent_landing.landing.interactor.a aVar) {
        this.f250809a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ReAgentProfileCreateLandingInternalAction> b(InterfaceC15186a interfaceC15186a, Sh0.c cVar) {
        Object next;
        C43210w c43210w;
        Object next2;
        InterfaceC15186a interfaceC15186a2 = interfaceC15186a;
        Sh0.c cVar2 = cVar;
        if (interfaceC15186a2 instanceof InterfaceC15186a.C1030a) {
            return new C43210w(ReAgentProfileCreateLandingInternalAction.Close.f250827b);
        }
        boolean z12 = interfaceC15186a2 instanceof InterfaceC15186a.e;
        com.avito.android.re_agent_landing.landing.interactor.a aVar = this.f250809a;
        if (z12) {
            return aVar.O();
        }
        if (interfaceC15186a2 instanceof InterfaceC15186a.d) {
            return cVar2.f15128e ? aVar.O() : C43175k.w();
        }
        boolean z13 = interfaceC15186a2 instanceof InterfaceC15186a.c;
        List<com.avito.conveyor_item.a> list = cVar2.f15125b;
        if (z13) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (L.f(((com.avito.conveyor_item.a) next2).getF250735b(), "action_block_item")) {
                    break;
                }
            }
            com.avito.android.re_agent_landing.landing.items.action_block.c cVar3 = next2 instanceof com.avito.android.re_agent_landing.landing.items.action_block.c ? (com.avito.android.re_agent_landing.landing.items.action_block.c) next2 : null;
            return (cVar3 != null ? cVar3.f250741h : null) != null ? new C43210w(new ReAgentProfileCreateLandingInternalAction.OpenFlowsDialog(cVar3.f250741h)) : C43175k.w();
        }
        if (!(interfaceC15186a2 instanceof InterfaceC15186a.b)) {
            if (!(interfaceC15186a2 instanceof InterfaceC15186a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (L.f(((com.avito.conveyor_item.a) next).getF250735b(), "action_block_item")) {
                    break;
                }
            }
            com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) next;
            int iIndexOf = list.indexOf(aVar2);
            if (iIndexOf != -1) {
                com.avito.android.re_agent_landing.landing.items.action_block.c cVar4 = aVar2 instanceof com.avito.android.re_agent_landing.landing.items.action_block.c ? (com.avito.android.re_agent_landing.landing.items.action_block.c) aVar2 : null;
                if ((cVar4 != null ? cVar4.f250736c : null) != ActionStatus.f250711b) {
                    c43210w = new C43210w(new ReAgentProfileCreateLandingInternalAction.ScrollToItem(iIndexOf));
                }
            }
            return C43175k.w();
        }
        InterfaceC15186a.b bVar = (InterfaceC15186a.b) interfaceC15186a2;
        c43210w = new C43210w(new ReAgentProfileCreateLandingInternalAction.FollowDeeplink(bVar.f15113a, bVar.f15114b));
        return c43210w;
    }
}
