package com.avito.android.re_agent_landing.landing.flows_dialog.mvi;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.ReAgentProfileCreateLandingFlowsState;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.a;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ReAgentProfileCreateLandingFlowsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/a;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/ReAgentProfileCreateLandingFlowsState;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.arch.mvi.a<com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.a, com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.b, ReAgentProfileCreateLandingFlowsState> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f250678a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f250678a = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.b> b(com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.a aVar, ReAgentProfileCreateLandingFlowsState reAgentProfileCreateLandingFlowsState) {
        C43210w c43210w;
        com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.a aVar2 = aVar;
        ReAgentProfileCreateLandingFlowsState reAgentProfileCreateLandingFlowsState2 = reAgentProfileCreateLandingFlowsState;
        if (aVar2 instanceof a.d) {
            return new C43210w(b.c.f250696a);
        }
        if (aVar2 instanceof a.b) {
            c43210w = new C43210w(new b.a(((a.b) aVar2).f250691a));
        } else {
            if (!(aVar2 instanceof a.c)) {
                if (aVar2 instanceof a.C7523a) {
                    return C43175k.G(new a(reAgentProfileCreateLandingFlowsState2, this, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new b.C7524b(((a.c) aVar2).f250692a));
        }
        return c43210w;
    }
}
