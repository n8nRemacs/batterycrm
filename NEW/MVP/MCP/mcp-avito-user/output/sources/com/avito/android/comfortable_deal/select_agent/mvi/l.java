package com.avito.android.comfortable_deal.select_agent.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.comfortable_deal.select_agent.model.SelectAgentArguments;
import com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SelectAgentReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "Ldq/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements u<SelectAgentInternalAction, dq.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.select_agent.mvi.builder.d f122778b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.select_agent.mvi.builder.a f122779c;

    @Inject
    public l(@Y61.k com.avito.android.comfortable_deal.select_agent.mvi.builder.d dVar, @Y61.k com.avito.android.comfortable_deal.select_agent.mvi.builder.a aVar) {
        this.f122778b = dVar;
        this.f122779c = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final dq.c a(SelectAgentInternalAction selectAgentInternalAction, dq.c cVar) {
        SelectAgentInternalAction selectAgentInternalAction2 = selectAgentInternalAction;
        dq.c cVarA = cVar;
        if (selectAgentInternalAction2 instanceof SelectAgentInternalAction.Init) {
            SelectAgentArguments selectAgentArguments = ((SelectAgentInternalAction.Init) selectAgentInternalAction2).f122758b;
            cVarA = dq.c.a(cVarA, null, selectAgentArguments.f122735d, selectAgentArguments.f122734c, false, false, false, null, 121);
        } else if (selectAgentInternalAction2 instanceof SelectAgentInternalAction.StartLoading) {
            cVarA = dq.c.a(cVarA, null, null, null, false, true, false, null, 103);
        } else {
            boolean z12 = selectAgentInternalAction2 instanceof SelectAgentInternalAction.AgentsLoaded;
            com.avito.android.comfortable_deal.select_agent.mvi.builder.a aVar = this.f122779c;
            if (z12) {
                cVarA = dq.c.a(cVarA, aVar.c(cVarA.f394083c, ((SelectAgentInternalAction.AgentsLoaded) selectAgentInternalAction2).f122756b), null, null, false, false, false, null, 102);
            } else if (selectAgentInternalAction2 instanceof SelectAgentInternalAction.LoadingError) {
                cVarA = dq.c.a(cVarA, null, null, null, true, false, false, null, 103);
            } else {
                boolean z13 = selectAgentInternalAction2 instanceof SelectAgentInternalAction.SelectAgent;
                List list = cVarA.f394082b;
                if (z13) {
                    if (list == null) {
                        list = C42784z0.f406748b;
                    }
                    SelectAgentInternalAction.SelectAgent selectAgent = (SelectAgentInternalAction.SelectAgent) selectAgentInternalAction2;
                    cVarA = dq.c.a(cVarA, aVar.b(selectAgent.f122761b, list), selectAgent.f122761b, null, false, false, false, null, 124);
                } else if (selectAgentInternalAction2.equals(SelectAgentInternalAction.SubmitStarted.f122763b)) {
                    if (list == null) {
                        list = C42784z0.f406748b;
                    }
                    cVarA = dq.c.a(cVarA, aVar.a(list, false), null, null, false, false, true, null, 94);
                } else if (selectAgentInternalAction2.equals(SelectAgentInternalAction.SubmitSuccess.f122764b)) {
                    if (list == null) {
                        list = C42784z0.f406748b;
                    }
                    cVarA = dq.c.a(cVarA, aVar.a(list, true), null, null, false, false, false, null, 94);
                } else if (selectAgentInternalAction2 instanceof SelectAgentInternalAction.SubmitError) {
                    if (list == null) {
                        list = C42784z0.f406748b;
                    }
                    cVarA = dq.c.a(cVarA, aVar.a(list, true), null, null, false, false, false, null, 94);
                }
            }
        }
        return this.f122778b.a(cVarA);
    }
}
