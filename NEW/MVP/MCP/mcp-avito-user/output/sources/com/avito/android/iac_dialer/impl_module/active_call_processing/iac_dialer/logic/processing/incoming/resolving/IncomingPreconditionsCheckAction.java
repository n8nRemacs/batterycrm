package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.incoming.resolving;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions.IncomingPreconditions;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: IncomingPreconditionsCheckAction.kt */
@P
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0007*\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/resolving/IncomingPreconditionsCheckAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/resolving/BasePreconditionsCheckAction;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step;", "step", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "movePreconditionStepTo", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "movePreconditionStepToWaitingForScreenToRequestPermissions", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "movePreconditionStepToMicPermissionRequesting", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IncomingPreconditionsCheckAction implements BasePreconditionsCheckAction {
    public static final int $stable = 0;

    @k
    public static final IncomingPreconditionsCheckAction INSTANCE = new IncomingPreconditionsCheckAction();

    private IncomingPreconditionsCheckAction() {
    }

    private final IacState movePreconditionStepTo(IacActionProcessing iacActionProcessing, IncomingPreconditions.Step step) {
        return IacState.InUse.Alive.Incoming.Resolving.copy$default((IacState.InUse.Alive.Incoming.Resolving) iacActionProcessing.getState(), IncomingPreconditions.copy$default(((IacState.InUse.Alive.Incoming.Resolving) iacActionProcessing.getState()).getPreconditions(), step, 0, 2, null), null, null, null, 14, null);
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof IncomingPreconditionsCheckAction);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckAction, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return -1116867510;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckAction
    @k
    public IacState movePreconditionStepToMicPermissionRequesting(@k IacActionProcessing iacActionProcessing) {
        return movePreconditionStepTo(iacActionProcessing, IncomingPreconditions.Step.MicPermissionRequesting.INSTANCE);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckAction
    @k
    public IacState movePreconditionStepToWaitingForScreenToRequestPermissions(@k IacActionProcessing iacActionProcessing) {
        return movePreconditionStepTo(iacActionProcessing, IncomingPreconditions.Step.WaitingForScreenToRequestPermissions.INSTANCE);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        if (!(iacActionProcessing.getState() instanceof IacState.InUse.Alive.Incoming.Resolving)) {
            f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
            return;
        }
        IacState iacStateRequestMicPermission = requestMicPermission(iacActionProcessing);
        if (iacStateRequestMicPermission == null) {
            iacStateRequestMicPermission = movePreconditionStepTo(iacActionProcessing, IncomingPreconditions.Step.Resolved.INSTANCE);
        }
        IacState.InUse.Alive.Incoming.Resolving resolving = (IacState.InUse.Alive.Incoming.Resolving) iacStateRequestMicPermission;
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving, IncomingPreconditions.copy$default(resolving.getPreconditions(), null, iacActionProcessing.getState().getAppearance().getScreen().getId(), 1, null), null, null, null, 14, null));
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckAction
    @l
    public IacState requestMicPermission(@k IacActionProcessing iacActionProcessing) {
        return BasePreconditionsCheckAction.a.a(this, iacActionProcessing);
    }

    @k
    public String toString() {
        return "IncomingPreconditionsCheckAction";
    }
}
