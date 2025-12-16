package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.telecom.state;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.incoming.waiting.OnIncomingCallAnswerClickedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.TerminateCallInAvCallsAndTelecomAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.FgType;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.ServiceStatus;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.i;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.p;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnAnswerRequestFromTelecomAction.kt */
@P
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/telecom/state/OnAnswerRequestFromTelecomAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "", "isVideo", "<init>", "(Ljava/lang/String;Z)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/telecom/state/OnAnswerRequestFromTelecomAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "Z", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnAnswerRequestFromTelecomAction implements IacAction {
    public static final int $stable = 0;

    @k
    private final String callId;
    private final boolean isVideo;

    public OnAnswerRequestFromTelecomAction(@k String str, boolean z12) {
        this.callId = str;
        this.isVideo = z12;
    }

    public static /* synthetic */ OnAnswerRequestFromTelecomAction copy$default(OnAnswerRequestFromTelecomAction onAnswerRequestFromTelecomAction, String str, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = onAnswerRequestFromTelecomAction.callId;
        }
        if ((i12 & 2) != 0) {
            z12 = onAnswerRequestFromTelecomAction.isVideo;
        }
        return onAnswerRequestFromTelecomAction.copy(str, z12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    @k
    public final OnAnswerRequestFromTelecomAction copy(@k String callId, boolean isVideo) {
        return new OnAnswerRequestFromTelecomAction(callId, isVideo);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnAnswerRequestFromTelecomAction)) {
            return false;
        }
        OnAnswerRequestFromTelecomAction onAnswerRequestFromTelecomAction = (OnAnswerRequestFromTelecomAction) other;
        return L.f(this.callId, onAnswerRequestFromTelecomAction.callId) && this.isVideo == onAnswerRequestFromTelecomAction.isVideo;
    }

    @k
    public final String getCallId() {
        return this.callId;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return Boolean.hashCode(this.isVideo) + (this.callId.hashCode() * 31);
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        if (!(iacActionProcessing.getState() instanceof IacState.InUse) || !L.f(((IacState.InUse) iacActionProcessing.getState()).getCallId(), this.callId)) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), this.callId, null, 4, null));
            return;
        }
        if (i.a(iacActionProcessing.getState(), this.callId) == null) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), this.callId, null, 4, null));
            return;
        }
        IacState.InUse inUse = (IacState.InUse) iacActionProcessing.getState();
        if (inUse instanceof IacState.InUse.Alive.Outgoing ? true : inUse instanceof IacState.InUse.Finished) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), this.callId, null, 4, null));
            return;
        }
        if (!(inUse instanceof IacState.InUse.Alive.Incoming.Waiting)) {
            if (inUse instanceof IacState.InUse.Alive.Incoming.Resolving ? true : inUse instanceof IacState.InUse.Alive.Incoming.Accepting ? true : inUse instanceof IacState.InUse.Alive.Talking) {
                iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new p("Ignore answer_request_from_telecom in this state"));
                return;
            }
            return;
        }
        ServiceStatus service = iacActionProcessing.getState().getAppearance().getService();
        FgType fgType = service != null ? service.getFgType() : null;
        if (!(fgType != null && fgType.getMic())) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new p("IacMediaService is lauched with fgType=" + fgType + ". Ignore answer answer_request_from_telecom"));
            return;
        }
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new p("IacMediaService is lauched with fgType=" + fgType + ". Let's handle answer_request_from_telecom"));
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new OnIncomingCallAnswerClickedAction(OnIncomingCallAnswerClickedAction.FromTelecom.INSTANCE));
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("OnAnswerRequestFromTelecomAction(callId=");
        sb2.append(this.callId);
        sb2.append(", isVideo=");
        return r.x(sb2, this.isVideo, ')');
    }
}
