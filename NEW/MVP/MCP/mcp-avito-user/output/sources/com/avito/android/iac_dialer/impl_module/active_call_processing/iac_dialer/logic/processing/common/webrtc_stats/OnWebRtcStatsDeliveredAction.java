package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.webrtc_stats;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import nJ.E;

/* compiled from: OnWebRtcStatsDeliveredAction.kt */
@P
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/webrtc_stats/OnWebRtcStatsDeliveredAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "", "statsReportJson", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "call", "<init>", "(Ljava/lang/String;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "copy", "(Ljava/lang/String;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/webrtc_stats/OnWebRtcStatsDeliveredAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatsReportJson", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "getCall", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnWebRtcStatsDeliveredAction implements IacAction {
    public static final int $stable = 8;

    @k
    private final CallState call;

    @k
    private final String statsReportJson;

    public OnWebRtcStatsDeliveredAction(@k String str, @k CallState callState) {
        this.statsReportJson = str;
        this.call = callState;
    }

    public static /* synthetic */ OnWebRtcStatsDeliveredAction copy$default(OnWebRtcStatsDeliveredAction onWebRtcStatsDeliveredAction, String str, CallState callState, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = onWebRtcStatsDeliveredAction.statsReportJson;
        }
        if ((i12 & 2) != 0) {
            callState = onWebRtcStatsDeliveredAction.call;
        }
        return onWebRtcStatsDeliveredAction.copy(str, callState);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getStatsReportJson() {
        return this.statsReportJson;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final CallState getCall() {
        return this.call;
    }

    @k
    public final OnWebRtcStatsDeliveredAction copy(@k String statsReportJson, @k CallState call) {
        return new OnWebRtcStatsDeliveredAction(statsReportJson, call);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnWebRtcStatsDeliveredAction)) {
            return false;
        }
        OnWebRtcStatsDeliveredAction onWebRtcStatsDeliveredAction = (OnWebRtcStatsDeliveredAction) other;
        return L.f(this.statsReportJson, onWebRtcStatsDeliveredAction.statsReportJson) && L.f(this.call, onWebRtcStatsDeliveredAction.call);
    }

    @k
    public final CallState getCall() {
        return this.call;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    @k
    public final String getStatsReportJson() {
        return this.statsReportJson;
    }

    public int hashCode() {
        return this.call.hashCode() + (this.statsReportJson.hashCode() * 31);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.Analytics.Track(new E(this.call.getCallId(), this.call.getDirection(), this.statsReportJson)));
    }

    @k
    public String toString() {
        return "OnWebRtcStatsDeliveredAction(statsReportJson=" + this.statsReportJson + ", call=" + this.call + ')';
    }
}
