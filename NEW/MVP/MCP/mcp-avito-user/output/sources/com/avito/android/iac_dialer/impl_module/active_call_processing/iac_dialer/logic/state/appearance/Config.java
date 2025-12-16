package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: Config.kt */
@P
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Config;", "LdL/d;", "", "outgoingAcceptTimeout", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "J", "getOutgoingAcceptTimeout", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Config implements dL.d {
    public static final int $stable = 0;
    private final long outgoingAcceptTimeout;

    public Config(long j12) {
        this.outgoingAcceptTimeout = j12;
    }

    public static /* synthetic */ Config copy$default(Config config, long j12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j12 = config.outgoingAcceptTimeout;
        }
        return config.copy(j12);
    }

    /* renamed from: component1, reason: from getter */
    public final long getOutgoingAcceptTimeout() {
        return this.outgoingAcceptTimeout;
    }

    @Y61.k
    public final Config copy(long outgoingAcceptTimeout) {
        return new Config(outgoingAcceptTimeout);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Config) && this.outgoingAcceptTimeout == ((Config) other).outgoingAcceptTimeout;
    }

    public final long getOutgoingAcceptTimeout() {
        return this.outgoingAcceptTimeout;
    }

    public int hashCode() {
        return Long.hashCode(this.outgoingAcceptTimeout);
    }

    @Y61.k
    public String toString() {
        return androidx.appcompat.app.r.u(new StringBuilder("Config(outgoingAcceptTimeout="), this.outgoingAcceptTimeout, ')');
    }
}
