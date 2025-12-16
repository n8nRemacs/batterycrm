package com.avito.android.re_agent_landing.landing.flows_dialog.mvi;

import Rh0.InterfaceC15042a;
import com.avito.android.arch.mvi.t;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReAgentProfileCreateLandingFlowsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/re_agent_landing/landing/flows_dialog/mvi/entity/b;", "LRh0/a;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements t<com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.b, InterfaceC15042a> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15042a b(com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.b bVar) {
        com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.b bVar2 = bVar;
        if (bVar2 instanceof b.c) {
            return InterfaceC15042a.b.f14565a;
        }
        if (bVar2 instanceof b.C7524b) {
            return new InterfaceC15042a.C0971a(((b.C7524b) bVar2).f250695a);
        }
        if (bVar2 instanceof b.d) {
            return InterfaceC15042a.c.f14566a;
        }
        return null;
    }
}
