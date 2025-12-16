package com.avito.android.comfortable_deal.select_agent.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction;
import dq.b;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectAgentOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "Ldq/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements t<SelectAgentInternalAction, dq.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final dq.b b(SelectAgentInternalAction selectAgentInternalAction) {
        SelectAgentInternalAction selectAgentInternalAction2 = selectAgentInternalAction;
        if (selectAgentInternalAction2.equals(SelectAgentInternalAction.CloseDialog.f122757b)) {
            return b.a.f394078a;
        }
        if (selectAgentInternalAction2.equals(SelectAgentInternalAction.SubmitSuccess.f122764b)) {
            return b.a.f394078a;
        }
        if (!(selectAgentInternalAction2 instanceof SelectAgentInternalAction.SubmitError)) {
            return null;
        }
        String message = ((SelectAgentInternalAction.SubmitError) selectAgentInternalAction2).f122762b.getMessage();
        String str = message.length() > 0 ? message : null;
        return new b.C11036b(str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.printable_text.b.c(R.string.comfortable_deal_common_error, new Serializable[0]));
    }
}
