package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.waiting;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.TerminateCallInAvCallsAndTelecomAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.i;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions.OutgoingPreconditions;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StartOutgoingCallWaitingAction.kt */
@P
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/StartOutgoingCallWaitingAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class StartOutgoingCallWaitingAction implements IacAction {
    public static final int $stable = 0;

    @k
    public static final StartOutgoingCallWaitingAction INSTANCE = new StartOutgoingCallWaitingAction();

    private StartOutgoingCallWaitingAction() {
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof StartOutgoingCallWaitingAction);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return 783620142;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        if (!(iacActionProcessing.getState() instanceof IacState.InUse.Alive.Outgoing.Resolving) || !L.f(((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).getPreconditions().getStep(), OutgoingPreconditions.Step.Resolved.INSTANCE)) {
            f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
        } else if (i.a(iacActionProcessing.getState(), ((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).getCallId()) == null) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), ((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).getCallId(), null, 4, null));
        } else {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), ((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).toWaiting());
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.Telecom.Registered.SetActive(((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).getCallId()));
        }
    }

    @k
    public String toString() {
        return "StartOutgoingCallWaitingAction";
    }
}
