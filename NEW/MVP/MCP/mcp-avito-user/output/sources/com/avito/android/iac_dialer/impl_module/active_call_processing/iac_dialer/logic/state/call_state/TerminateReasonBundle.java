package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TerminateReason.kt */
@P
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReasonBundle;", "LdL/d;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "reason", "", "isLocal", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;Z)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "component2", "()Z", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;Z)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReasonBundle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "getReason", "Z", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TerminateReasonBundle implements dL.d {
    public static final int $stable = 0;
    private final boolean isLocal;

    @Y61.k
    private final TerminateReason reason;

    public TerminateReasonBundle(@Y61.k TerminateReason terminateReason, boolean z12) {
        this.reason = terminateReason;
        this.isLocal = z12;
    }

    public static /* synthetic */ TerminateReasonBundle copy$default(TerminateReasonBundle terminateReasonBundle, TerminateReason terminateReason, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            terminateReason = terminateReasonBundle.reason;
        }
        if ((i12 & 2) != 0) {
            z12 = terminateReasonBundle.isLocal;
        }
        return terminateReasonBundle.copy(terminateReason, z12);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final TerminateReason getReason() {
        return this.reason;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLocal() {
        return this.isLocal;
    }

    @Y61.k
    public final TerminateReasonBundle copy(@Y61.k TerminateReason reason, boolean isLocal) {
        return new TerminateReasonBundle(reason, isLocal);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TerminateReasonBundle)) {
            return false;
        }
        TerminateReasonBundle terminateReasonBundle = (TerminateReasonBundle) other;
        return L.f(this.reason, terminateReasonBundle.reason) && this.isLocal == terminateReasonBundle.isLocal;
    }

    @Y61.k
    public final TerminateReason getReason() {
        return this.reason;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLocal) + (this.reason.hashCode() * 31);
    }

    public final boolean isLocal() {
        return this.isLocal;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TerminateReasonBundle(reason=");
        sb2.append(this.reason);
        sb2.append(", isLocal=");
        return androidx.appcompat.app.r.x(sb2, this.isLocal, ')');
    }
}
