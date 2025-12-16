package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.incoming.waiting;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions.IncomingPreconditions;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.InlineFilterValue;
import dL.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnIncomingCallAnswerClickedAction.kt */
@P
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u001c\u001d\u001e\u001f B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006!"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromArg;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromArg;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "trackClick", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "process", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromArg;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromArg;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromArg;", "getFrom", "FromArg", "FromCallNotification", "FromCallScreen", "FromReserveNotification", "FromTelecom", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnIncomingCallAnswerClickedAction implements IacAction {
    public static final int $stable = 8;

    @k
    private final FromArg from;

    /* compiled from: OnIncomingCallAnswerClickedAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromArg;", "LdL/d;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromCallNotification;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromCallScreen;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromReserveNotification;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromTelecom;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface FromArg extends d {
    }

    /* compiled from: OnIncomingCallAnswerClickedAction.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromCallNotification;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromArg;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            return 836413794;
        }

        @k
        public String toString() {
            return "FromCallNotification";
        }
    }

    /* compiled from: OnIncomingCallAnswerClickedAction.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromCallScreen;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromArg;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            return 690570787;
        }

        @k
        public String toString() {
            return "FromCallScreen";
        }
    }

    /* compiled from: OnIncomingCallAnswerClickedAction.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromReserveNotification;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromArg;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FromReserveNotification implements FromArg {
        public static final int $stable = 0;

        @k
        public static final FromReserveNotification INSTANCE = new FromReserveNotification();

        private FromReserveNotification() {
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof FromReserveNotification);
        }

        public int hashCode() {
            return -1348324818;
        }

        @k
        public String toString() {
            return "FromReserveNotification";
        }
    }

    /* compiled from: OnIncomingCallAnswerClickedAction.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromTelecom;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/incoming/waiting/OnIncomingCallAnswerClickedAction$FromArg;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FromTelecom implements FromArg {
        public static final int $stable = 0;

        @k
        public static final FromTelecom INSTANCE = new FromTelecom();

        private FromTelecom() {
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof FromTelecom);
        }

        public int hashCode() {
            return 517622398;
        }

        @k
        public String toString() {
            return "FromTelecom";
        }
    }

    public OnIncomingCallAnswerClickedAction(@k FromArg fromArg) {
        this.from = fromArg;
    }

    public static /* synthetic */ OnIncomingCallAnswerClickedAction copy$default(OnIncomingCallAnswerClickedAction onIncomingCallAnswerClickedAction, FromArg fromArg, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            fromArg = onIncomingCallAnswerClickedAction.from;
        }
        return onIncomingCallAnswerClickedAction.copy(fromArg);
    }

    private final void trackClick(IacActionProcessing iacActionProcessing) {
        if (iacActionProcessing.getState() instanceof IacState.InUse) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.Analytics.TrackGreenButtonClickedEvent4682(((IacState.InUse) iacActionProcessing.getState()).getCallId(), L.f(this.from, FromCallScreen.INSTANCE)));
        }
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final FromArg getFrom() {
        return this.from;
    }

    @k
    public final OnIncomingCallAnswerClickedAction copy(@k FromArg from) {
        return new OnIncomingCallAnswerClickedAction(from);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnIncomingCallAnswerClickedAction) && L.f(this.from, ((OnIncomingCallAnswerClickedAction) other).from);
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
        if (!(iacActionProcessing.getState() instanceof IacState.InUse.Alive.Incoming)) {
            f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
            return;
        }
        trackClick(iacActionProcessing);
        IacState.InUse.Alive.Incoming incoming = (IacState.InUse.Alive.Incoming) iacActionProcessing.getState();
        if (incoming instanceof IacState.InUse.Alive.Incoming.Waiting) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), ((IacState.InUse.Alive.Incoming.Waiting) iacActionProcessing.getState()).toResolving(new IncomingPreconditions(IncomingPreconditions.Step.NotChecked.INSTANCE, iacActionProcessing.getState().getAppearance().getScreen().getId())));
            return;
        }
        if (incoming instanceof IacState.InUse.Alive.Incoming.Resolving) {
            if (L.f(this.from, FromCallScreen.INSTANCE)) {
                return;
            }
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), IacState.InUse.Alive.Incoming.Resolving.copy$default((IacState.InUse.Alive.Incoming.Resolving) iacActionProcessing.getState(), new IncomingPreconditions(IncomingPreconditions.Step.NotChecked.INSTANCE, -1), null, null, null, 14, null));
        } else if (incoming instanceof IacState.InUse.Alive.Incoming.Accepting) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new r("Ignore answer click cause state is already Accepting"));
        }
    }

    @k
    public String toString() {
        return "OnIncomingCallAnswerClickedAction(from=" + this.from + ')';
    }
}
