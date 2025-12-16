package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.resolving;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions.OutgoingPreconditions;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.timer_interactor.IacTimerInteractor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnOutgoingCallStartPauseElapsedAction.kt */
@P
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/resolving/OnOutgoingCallStartPauseElapsedAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor$Timer$OutgoingCallStartPause;", "timer", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor$Timer$OutgoingCallStartPause;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor$Timer$OutgoingCallStartPause;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor$Timer$OutgoingCallStartPause;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/resolving/OnOutgoingCallStartPauseElapsedAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor$Timer$OutgoingCallStartPause;", "getTimer", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnOutgoingCallStartPauseElapsedAction implements IacAction {
    public static final int $stable = 0;

    @k
    private final IacTimerInteractor.Timer.OutgoingCallStartPause timer;

    public OnOutgoingCallStartPauseElapsedAction(@k IacTimerInteractor.Timer.OutgoingCallStartPause outgoingCallStartPause) {
        this.timer = outgoingCallStartPause;
    }

    public static /* synthetic */ OnOutgoingCallStartPauseElapsedAction copy$default(OnOutgoingCallStartPauseElapsedAction onOutgoingCallStartPauseElapsedAction, IacTimerInteractor.Timer.OutgoingCallStartPause outgoingCallStartPause, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            outgoingCallStartPause = onOutgoingCallStartPauseElapsedAction.timer;
        }
        return onOutgoingCallStartPauseElapsedAction.copy(outgoingCallStartPause);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final IacTimerInteractor.Timer.OutgoingCallStartPause getTimer() {
        return this.timer;
    }

    @k
    public final OnOutgoingCallStartPauseElapsedAction copy(@k IacTimerInteractor.Timer.OutgoingCallStartPause timer) {
        return new OnOutgoingCallStartPauseElapsedAction(timer);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnOutgoingCallStartPauseElapsedAction) && L.f(this.timer, ((OnOutgoingCallStartPauseElapsedAction) other).timer);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    @k
    public final IacTimerInteractor.Timer.OutgoingCallStartPause getTimer() {
        return this.timer;
    }

    public int hashCode() {
        return this.timer.hashCode();
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        IacState state = iacActionProcessing.getState();
        if ((state instanceof IacState.InUse.Finished ? true : state instanceof IacState.Idle) || !(state instanceof IacState.InUse.Alive)) {
            return;
        }
        if ((iacActionProcessing.getState() instanceof IacState.InUse.Alive.Outgoing.Resolving) && L.f(((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).getPreconditions().getStep(), OutgoingPreconditions.Step.WaitingBeforeStartCall.INSTANCE) && L.f(((IacState.InUse.Alive) iacActionProcessing.getState()).getCallId(), this.timer.getCallId())) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), IacState.InUse.Alive.Outgoing.Resolving.copy$default((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState(), OutgoingPreconditions.copy$default(((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).getPreconditions(), OutgoingPreconditions.Step.NotChecked.INSTANCE, 0, 2, null), null, null, null, 14, null));
        } else {
            f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
        }
    }

    @k
    public String toString() {
        return "OnOutgoingCallStartPauseElapsedAction(timer=" + this.timer + ')';
    }
}
