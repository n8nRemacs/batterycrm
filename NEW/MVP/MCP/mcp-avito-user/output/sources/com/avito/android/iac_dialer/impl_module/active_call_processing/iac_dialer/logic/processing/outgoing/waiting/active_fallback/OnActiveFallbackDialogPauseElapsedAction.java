package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.waiting.active_fallback;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallMeta;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.p;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import nJ.C44278m;

/* compiled from: OnActiveFallbackDialogPauseElapsedAction.kt */
@P
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/active_fallback/OnActiveFallbackDialogPauseElapsedAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "<init>", "(Ljava/lang/String;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/active_fallback/OnActiveFallbackDialogPauseElapsedAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnActiveFallbackDialogPauseElapsedAction implements IacAction {
    public static final int $stable = 0;

    @k
    private final String callId;

    public OnActiveFallbackDialogPauseElapsedAction(@k String str) {
        this.callId = str;
    }

    public static /* synthetic */ OnActiveFallbackDialogPauseElapsedAction copy$default(OnActiveFallbackDialogPauseElapsedAction onActiveFallbackDialogPauseElapsedAction, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = onActiveFallbackDialogPauseElapsedAction.callId;
        }
        return onActiveFallbackDialogPauseElapsedAction.copy(str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @k
    public final OnActiveFallbackDialogPauseElapsedAction copy(@k String callId) {
        return new OnActiveFallbackDialogPauseElapsedAction(callId);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnActiveFallbackDialogPauseElapsedAction) && L.f(this.callId, ((OnActiveFallbackDialogPauseElapsedAction) other).callId);
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
        return this.callId.hashCode();
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        if (!(iacActionProcessing.getState() instanceof IacState.InUse.Alive.Outgoing.Waiting) || !L.f(((IacState.InUse.Alive.Outgoing.Waiting) iacActionProcessing.getState()).getCallId(), this.callId)) {
            f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
            return;
        }
        if (((IacState.InUse.Alive.Outgoing.Waiting) iacActionProcessing.getState()).getCall().getWasRingingReceived()) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new p("No need to display ActiveFallback dialog cause wasRingingReceived==true"));
            return;
        }
        IacActionOutput out = iacActionProcessing.getOut();
        CallMeta.Item item = ((IacState.InUse.Alive.Outgoing.Waiting) iacActionProcessing.getState()).getCall().getMeta().getItem();
        iacActionProcessing.plusAssign(out, new IacEvent.Analytics.Track(new C44278m(item != null ? Long.valueOf(item.getId()).toString() : null, ((IacState.InUse.Alive.Outgoing.Waiting) iacActionProcessing.getState()).getCallId(), ((IacState.InUse.Alive.Outgoing.Waiting) iacActionProcessing.getState()).getCall().getMeta().getScenario(), ((IacState.InUse.Alive.Outgoing.Waiting) iacActionProcessing.getState()).getCall().getLocalUserId())));
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.RingingPlayer.ShortVibration(iacActionProcessing.getState().getAppearance().getRingingMode()));
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), IacEvent.CallScreen.ActiveFallbackDialog.DisplayActiveFallbackDialog.INSTANCE);
    }

    @k
    public String toString() {
        return C22026a.c(new StringBuilder("OnActiveFallbackDialogPauseElapsedAction(callId="), this.callId, ')');
    }
}
