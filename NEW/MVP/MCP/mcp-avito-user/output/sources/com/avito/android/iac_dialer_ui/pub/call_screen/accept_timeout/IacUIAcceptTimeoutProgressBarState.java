package com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.H0;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacUIAcceptTimeoutProgressBar.kt */
@H0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/accept_timeout/IacUIAcceptTimeoutProgressBarState;", "LdL/d;", "", "outgoingAcceptTimeout", "callTimeRingingAt", "<init>", "(JLjava/lang/Long;)V", "component1", "()J", "component2", "()Ljava/lang/Long;", "copy", "(JLjava/lang/Long;)Lcom/avito/android/iac_dialer_ui/pub/call_screen/accept_timeout/IacUIAcceptTimeoutProgressBarState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "J", "getOutgoingAcceptTimeout", "Ljava/lang/Long;", "getCallTimeRingingAt", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacUIAcceptTimeoutProgressBarState implements dL.d {
    public static final int $stable = 0;

    @l
    private final Long callTimeRingingAt;
    private final long outgoingAcceptTimeout;

    public IacUIAcceptTimeoutProgressBarState(long j12, @l Long l12) {
        this.outgoingAcceptTimeout = j12;
        this.callTimeRingingAt = l12;
    }

    public static /* synthetic */ IacUIAcceptTimeoutProgressBarState copy$default(IacUIAcceptTimeoutProgressBarState iacUIAcceptTimeoutProgressBarState, long j12, Long l12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j12 = iacUIAcceptTimeoutProgressBarState.outgoingAcceptTimeout;
        }
        if ((i12 & 2) != 0) {
            l12 = iacUIAcceptTimeoutProgressBarState.callTimeRingingAt;
        }
        return iacUIAcceptTimeoutProgressBarState.copy(j12, l12);
    }

    /* renamed from: component1, reason: from getter */
    public final long getOutgoingAcceptTimeout() {
        return this.outgoingAcceptTimeout;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Long getCallTimeRingingAt() {
        return this.callTimeRingingAt;
    }

    @k
    public final IacUIAcceptTimeoutProgressBarState copy(long outgoingAcceptTimeout, @l Long callTimeRingingAt) {
        return new IacUIAcceptTimeoutProgressBarState(outgoingAcceptTimeout, callTimeRingingAt);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacUIAcceptTimeoutProgressBarState)) {
            return false;
        }
        IacUIAcceptTimeoutProgressBarState iacUIAcceptTimeoutProgressBarState = (IacUIAcceptTimeoutProgressBarState) other;
        return this.outgoingAcceptTimeout == iacUIAcceptTimeoutProgressBarState.outgoingAcceptTimeout && L.f(this.callTimeRingingAt, iacUIAcceptTimeoutProgressBarState.callTimeRingingAt);
    }

    @l
    public final Long getCallTimeRingingAt() {
        return this.callTimeRingingAt;
    }

    public final long getOutgoingAcceptTimeout() {
        return this.outgoingAcceptTimeout;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.outgoingAcceptTimeout) * 31;
        Long l12 = this.callTimeRingingAt;
        return iHashCode + (l12 == null ? 0 : l12.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacUIAcceptTimeoutProgressBarState(outgoingAcceptTimeout=");
        sb2.append(this.outgoingAcceptTimeout);
        sb2.append(", callTimeRingingAt=");
        return m.m(sb2, this.callTimeRingingAt, ')');
    }
}
