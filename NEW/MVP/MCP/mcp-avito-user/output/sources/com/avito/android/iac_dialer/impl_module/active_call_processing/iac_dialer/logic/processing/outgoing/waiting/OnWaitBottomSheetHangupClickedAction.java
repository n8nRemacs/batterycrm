package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.waiting;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import mJ.AbstractC43973b;

/* compiled from: OnWaitBottomSheetHangupClickedAction.kt */
@P
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u001f !\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f¨\u0006#"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction$FromArg;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction$FromArg;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "LmJ/b;", "dialerScenario", "Lkotlin/G0;", "track4683", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;LmJ/b;)V", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction$FromArg;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction$FromArg;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction$FromArg;", "getFrom", "Dialing", "FromArg", "Gsm", "Ringing", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnWaitBottomSheetHangupClickedAction implements IacAction {
    public static final int $stable = 8;

    @k
    private final FromArg from;

    /* compiled from: OnWaitBottomSheetHangupClickedAction.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction$Dialing;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction$FromArg;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Dialing implements FromArg {
        public static final int $stable = 0;

        @k
        public static final Dialing INSTANCE = new Dialing();

        private Dialing() {
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Dialing);
        }

        public int hashCode() {
            return 122335147;
        }

        @k
        public String toString() {
            return "Dialing";
        }
    }

    /* compiled from: OnWaitBottomSheetHangupClickedAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction$FromArg;", "LdL/d;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction$Dialing;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction$Gsm;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction$Ringing;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface FromArg extends d {
    }

    /* compiled from: OnWaitBottomSheetHangupClickedAction.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction$Gsm;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction$FromArg;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Gsm implements FromArg {
        public static final int $stable = 0;

        @k
        public static final Gsm INSTANCE = new Gsm();

        private Gsm() {
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Gsm);
        }

        public int hashCode() {
            return -603050310;
        }

        @k
        public String toString() {
            return "Gsm";
        }
    }

    /* compiled from: OnWaitBottomSheetHangupClickedAction.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction$Ringing;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetHangupClickedAction$FromArg;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Ringing implements FromArg {
        public static final int $stable = 0;

        @k
        public static final Ringing INSTANCE = new Ringing();

        private Ringing() {
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Ringing);
        }

        public int hashCode() {
            return -325658389;
        }

        @k
        public String toString() {
            return "Ringing";
        }
    }

    public OnWaitBottomSheetHangupClickedAction(@k FromArg fromArg) {
        this.from = fromArg;
    }

    public static /* synthetic */ OnWaitBottomSheetHangupClickedAction copy$default(OnWaitBottomSheetHangupClickedAction onWaitBottomSheetHangupClickedAction, FromArg fromArg, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            fromArg = onWaitBottomSheetHangupClickedAction.from;
        }
        return onWaitBottomSheetHangupClickedAction.copy(fromArg);
    }

    private final void track4683(IacActionProcessing iacActionProcessing, AbstractC43973b abstractC43973b) {
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.Analytics.TrackRedButtonClickedEvent4683(((IacState.InUse) iacActionProcessing.getState()).getCallId(), ((IacState.InUse) iacActionProcessing.getState()).getCall().getMeta().getScenario(), abstractC43973b));
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final FromArg getFrom() {
        return this.from;
    }

    @k
    public final OnWaitBottomSheetHangupClickedAction copy(@k FromArg from) {
        return new OnWaitBottomSheetHangupClickedAction(from);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnWaitBottomSheetHangupClickedAction) && L.f(this.from, ((OnWaitBottomSheetHangupClickedAction) other).from);
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
        AbstractC43973b abstractC43973b;
        if (!(iacActionProcessing.getState() instanceof IacState.InUse.Alive.Outgoing.Waiting)) {
            f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
            return;
        }
        FromArg fromArg = this.from;
        if (L.f(fromArg, Dialing.INSTANCE) || L.f(fromArg, Ringing.INSTANCE)) {
            abstractC43973b = AbstractC43973b.f.f414456b;
        } else {
            if (!L.f(fromArg, Gsm.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            abstractC43973b = AbstractC43973b.e.f414455b;
        }
        track4683(iacActionProcessing, abstractC43973b);
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.AvCalls.TerminateCall(((IacState.InUse.Alive.Outgoing.Waiting) iacActionProcessing.getState()).getCallId(), TerminateReason.Hangup.INSTANCE));
    }

    @k
    public String toString() {
        return "OnWaitBottomSheetHangupClickedAction(from=" + this.from + ')';
    }
}
