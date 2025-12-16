package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.resolving;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckSchedulingMiddleware;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions.OutgoingPreconditions;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: OutgoingPreconditionsCheckSchedulingMiddleware.kt */
@P
@s0
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001¨\u0006\u0013"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/resolving/OutgoingPreconditionsCheckSchedulingMiddleware;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/resolving/BasePreconditionsCheckSchedulingMiddleware;", "()V", "createCheckPreconditionAction", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "isResolvingState", VoiceInfo.STATE, "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "isStepNotChecked", "isStepRoutedToSystemSettingsForPermissions", "preconditionScreenId", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final /* data */ class OutgoingPreconditionsCheckSchedulingMiddleware implements BasePreconditionsCheckSchedulingMiddleware {
    public static final int $stable = 0;

    @k
    public static final OutgoingPreconditionsCheckSchedulingMiddleware INSTANCE = new OutgoingPreconditionsCheckSchedulingMiddleware();

    private OutgoingPreconditionsCheckSchedulingMiddleware() {
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckSchedulingMiddleware
    @k
    public IacAction createCheckPreconditionAction() {
        return OutgoingPreconditionsCheckAction.INSTANCE;
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof OutgoingPreconditionsCheckSchedulingMiddleware);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckSchedulingMiddleware, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return 856507290;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckSchedulingMiddleware
    public boolean isResolvingState(@k IacState state) {
        return state instanceof IacState.InUse.Alive.Outgoing.Resolving;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckSchedulingMiddleware
    public boolean isStepNotChecked(@k IacState state) {
        return (state instanceof IacState.InUse.Alive.Outgoing.Resolving) && L.f(((IacState.InUse.Alive.Outgoing.Resolving) state).getPreconditions().getStep(), OutgoingPreconditions.Step.NotChecked.INSTANCE);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckSchedulingMiddleware
    public boolean isStepRoutedToSystemSettingsForPermissions(@k IacState state) {
        return (state instanceof IacState.InUse.Alive.Outgoing.Resolving) && L.f(((IacState.InUse.Alive.Outgoing.Resolving) state).getPreconditions().getStep(), OutgoingPreconditions.Step.RoutedToSystemSettingsForPermissions.INSTANCE);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckSchedulingMiddleware
    public int preconditionScreenId(@k IacState state) {
        OutgoingPreconditions preconditions;
        if (!(state instanceof IacState.InUse.Alive.Outgoing.Resolving)) {
            state = null;
        }
        IacState.InUse.Alive.Outgoing.Resolving resolving = (IacState.InUse.Alive.Outgoing.Resolving) state;
        if (resolving == null || (preconditions = resolving.getPreconditions()) == null) {
            return -1;
        }
        return preconditions.getScreenId();
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing) {
        IacMiddlewareDistinctBy.a.a(this, iacMiddlewareProcessing);
    }

    @k
    public String toString() {
        return "OutgoingPreconditionsCheckSchedulingMiddleware";
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    @k
    public BasePreconditionsCheckSchedulingMiddleware.Payload getPayloadFromState(@k IacState iacState) {
        return new BasePreconditionsCheckSchedulingMiddleware.Payload(isStepNotChecked(iacState), iacState.getAppearance().getScreen().getIsAtLeastStarted(), iacState.getAppearance().getScreen().getId());
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing, @k BasePreconditionsCheckSchedulingMiddleware.Payload payload, @k BasePreconditionsCheckSchedulingMiddleware.Payload payload2) {
        BasePreconditionsCheckSchedulingMiddleware.a.a(this, iacMiddlewareProcessing, payload, payload2);
    }
}
