package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.incoming.rejecting;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReason;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.InlineFilterValue;
import dL.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import mJ.AbstractC43973b;

/* compiled from: OnIncomingCallRejectClickedAction.kt */
@P
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001c\u001d\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/rejecting/OnIncomingCallRejectClickedAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/rejecting/OnIncomingCallRejectClickedAction$FromArg;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/rejecting/OnIncomingCallRejectClickedAction$FromArg;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "trackClick", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "process", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/rejecting/OnIncomingCallRejectClickedAction$FromArg;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/rejecting/OnIncomingCallRejectClickedAction$FromArg;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/rejecting/OnIncomingCallRejectClickedAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/rejecting/OnIncomingCallRejectClickedAction$FromArg;", "getFrom", "FromArg", "FromCallNotification", "FromCallScreen", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnIncomingCallRejectClickedAction implements IacAction {
    public static final int $stable = 8;

    @k
    private final FromArg from;

    /* compiled from: OnIncomingCallRejectClickedAction.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/rejecting/OnIncomingCallRejectClickedAction$FromArg;", "LdL/d;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/rejecting/OnIncomingCallRejectClickedAction$FromCallNotification;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/rejecting/OnIncomingCallRejectClickedAction$FromCallScreen;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface FromArg extends d {
    }

    /* compiled from: OnIncomingCallRejectClickedAction.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/rejecting/OnIncomingCallRejectClickedAction$FromCallNotification;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/rejecting/OnIncomingCallRejectClickedAction$FromArg;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FromCallNotification implements FromArg {
        public static final int $stable = 0;

        @k
        public static final FromCallNotification INSTANCE = new FromCallNotification();

        private FromCallNotification() {
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof FromCallNotification);
        }

        public int hashCode() {
            return -122671187;
        }

        @k
        public String toString() {
            return "FromCallNotification";
        }
    }

    /* compiled from: OnIncomingCallRejectClickedAction.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/rejecting/OnIncomingCallRejectClickedAction$FromCallScreen;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/rejecting/OnIncomingCallRejectClickedAction$FromArg;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FromCallScreen implements FromArg {
        public static final int $stable = 0;

        @k
        public static final FromCallScreen INSTANCE = new FromCallScreen();

        private FromCallScreen() {
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof FromCallScreen);
        }

        public int hashCode() {
            return -2029510482;
        }

        @k
        public String toString() {
            return "FromCallScreen";
        }
    }

    public OnIncomingCallRejectClickedAction(@k FromArg fromArg) {
        this.from = fromArg;
    }

    public static /* synthetic */ OnIncomingCallRejectClickedAction copy$default(OnIncomingCallRejectClickedAction onIncomingCallRejectClickedAction, FromArg fromArg, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            fromArg = onIncomingCallRejectClickedAction.from;
        }
        return onIncomingCallRejectClickedAction.copy(fromArg);
    }

    private final void trackClick(IacActionProcessing iacActionProcessing) {
        IacState state = iacActionProcessing.getState();
        if ((state instanceof IacState.InUse ? (IacState.InUse) state : null) == null) {
            return;
        }
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.Analytics.TrackRedButtonClickedEvent4683(((IacState.InUse) iacActionProcessing.getState()).getCallId(), ((IacState.InUse) iacActionProcessing.getState()).getCall().getMeta().getScenario(), L.f(this.from, FromCallScreen.INSTANCE) ? AbstractC43973b.C11823b.f414452b : AbstractC43973b.g.f414457b));
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final FromArg getFrom() {
        return this.from;
    }

    @k
    public final OnIncomingCallRejectClickedAction copy(@k FromArg from) {
        return new OnIncomingCallRejectClickedAction(from);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnIncomingCallRejectClickedAction) && L.f(this.from, ((OnIncomingCallRejectClickedAction) other).from);
    }

    @k
    public final FromArg getFrom() {
        return this.from;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return this.from.hashCode();
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        trackClick(iacActionProcessing);
        IacState state = iacActionProcessing.getState();
        if ((state instanceof IacState.Idle) || !(state instanceof IacState.InUse)) {
            return;
        }
        IacState.InUse inUse = (IacState.InUse) iacActionProcessing.getState();
        if (inUse instanceof IacState.InUse.Finished ? true : inUse instanceof IacState.InUse.Alive.Outgoing) {
            return;
        }
        if (inUse instanceof IacState.InUse.Alive.Incoming ? true : inUse instanceof IacState.InUse.Alive.Talking) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.AvCalls.TerminateCall(((IacState.InUse) iacActionProcessing.getState()).getCallId(), TerminateReason.Reject.INSTANCE));
        }
    }

    @k
    public String toString() {
        return "OnIncomingCallRejectClickedAction(from=" + this.from + ')';
    }
}
