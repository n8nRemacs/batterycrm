package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.InvitingState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: IacStateExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {
    public static final boolean a(@Y61.k IacState iacState) {
        CallState call;
        CallState call2;
        if (!(b(iacState) || ((iacState instanceof IacState.InUse.Alive.Talking) && ((IacState.InUse.Alive.Talking) iacState).getCall().isVideo()))) {
            return false;
        }
        IacState.InUse inUseAsInUse = iacState.asInUse();
        if (inUseAsInUse != null && (call2 = inUseAsInUse.getCall()) != null && call2.getLocalSendingVideo()) {
            return true;
        }
        IacState.InUse inUseAsInUse2 = iacState.asInUse();
        return (inUseAsInUse2 == null || (call = inUseAsInUse2.getCall()) == null || !call.getPeerSendingVideo()) ? false : true;
    }

    public static final boolean b(@Y61.k IacState iacState) {
        if (!(iacState instanceof IacState.InUse)) {
            return false;
        }
        IacState.InUse inUse = (IacState.InUse) iacState;
        if (!inUse.getCall().isVideo() || !inUse.getCall().getVideoTxAllowed() || (iacState instanceof IacState.InUse.Alive.Incoming) || (iacState instanceof IacState.InUse.Alive.Outgoing.Launching) || (iacState instanceof IacState.InUse.Alive.Outgoing.Resolving)) {
            return false;
        }
        if (iacState instanceof IacState.InUse.Alive.Outgoing.Waiting) {
            if (inUse.getCall().getInvitingState().compareTo(InvitingState.Ringing.INSTANCE) < 0) {
                return false;
            }
        } else if (!(iacState instanceof IacState.InUse.Alive.Talking)) {
            if (iacState instanceof IacState.InUse.Finished) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        return true;
    }
}
