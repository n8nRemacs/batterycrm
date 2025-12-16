package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TerminateReason.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "LdL/d;", "<init>", "()V", "AnswerTimeout", "Busy", "ConnectTimeout", "Hangup", "InternalError", "NoMicAccess", "Reject", "ServerError", "Unknown", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$AnswerTimeout;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$Busy;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$ConnectTimeout;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$Hangup;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$InternalError;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$NoMicAccess;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$Reject;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$ServerError;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$Unknown;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class TerminateReason implements dL.d {
    public static final int $stable = 0;

    /* compiled from: TerminateReason.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$AnswerTimeout;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnswerTimeout extends TerminateReason {
        public static final int $stable = 0;

        @Y61.k
        public static final AnswerTimeout INSTANCE = new AnswerTimeout();

        private AnswerTimeout() {
            super(null);
        }

        public boolean equals(@Y61.l Object other) {
            return this == other || (other instanceof AnswerTimeout);
        }

        public int hashCode() {
            return -954210776;
        }

        @Y61.k
        public String toString() {
            return "AnswerTimeout";
        }
    }

    /* compiled from: TerminateReason.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$Busy;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Busy extends TerminateReason {
        public static final int $stable = 0;

        @Y61.k
        public static final Busy INSTANCE = new Busy();

        private Busy() {
            super(null);
        }

        public boolean equals(@Y61.l Object other) {
            return this == other || (other instanceof Busy);
        }

        public int hashCode() {
            return 1797147124;
        }

        @Y61.k
        public String toString() {
            return "Busy";
        }
    }

    /* compiled from: TerminateReason.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$ConnectTimeout;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConnectTimeout extends TerminateReason {
        public static final int $stable = 0;

        @Y61.k
        public static final ConnectTimeout INSTANCE = new ConnectTimeout();

        private ConnectTimeout() {
            super(null);
        }

        public boolean equals(@Y61.l Object other) {
            return this == other || (other instanceof ConnectTimeout);
        }

        public int hashCode() {
            return 1534192466;
        }

        @Y61.k
        public String toString() {
            return "ConnectTimeout";
        }
    }

    /* compiled from: TerminateReason.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$Hangup;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Hangup extends TerminateReason {
        public static final int $stable = 0;

        @Y61.k
        public static final Hangup INSTANCE = new Hangup();

        private Hangup() {
            super(null);
        }

        public boolean equals(@Y61.l Object other) {
            return this == other || (other instanceof Hangup);
        }

        public int hashCode() {
            return 634675144;
        }

        @Y61.k
        public String toString() {
            return "Hangup";
        }
    }

    /* compiled from: TerminateReason.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$InternalError;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InternalError extends TerminateReason {
        public static final int $stable = 0;

        @Y61.k
        public static final InternalError INSTANCE = new InternalError();

        private InternalError() {
            super(null);
        }

        public boolean equals(@Y61.l Object other) {
            return this == other || (other instanceof InternalError);
        }

        public int hashCode() {
            return 1032428464;
        }

        @Y61.k
        public String toString() {
            return "InternalError";
        }
    }

    /* compiled from: TerminateReason.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$NoMicAccess;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoMicAccess extends TerminateReason {
        public static final int $stable = 0;

        @Y61.k
        public static final NoMicAccess INSTANCE = new NoMicAccess();

        private NoMicAccess() {
            super(null);
        }

        public boolean equals(@Y61.l Object other) {
            return this == other || (other instanceof NoMicAccess);
        }

        public int hashCode() {
            return 1508268399;
        }

        @Y61.k
        public String toString() {
            return "NoMicAccess";
        }
    }

    /* compiled from: TerminateReason.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$Reject;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Reject extends TerminateReason {
        public static final int $stable = 0;

        @Y61.k
        public static final Reject INSTANCE = new Reject();

        private Reject() {
            super(null);
        }

        public boolean equals(@Y61.l Object other) {
            return this == other || (other instanceof Reject);
        }

        public int hashCode() {
            return 924539098;
        }

        @Y61.k
        public String toString() {
            return "Reject";
        }
    }

    /* compiled from: TerminateReason.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$ServerError;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServerError extends TerminateReason {
        public static final int $stable = 0;

        @Y61.k
        public static final ServerError INSTANCE = new ServerError();

        private ServerError() {
            super(null);
        }

        public boolean equals(@Y61.l Object other) {
            return this == other || (other instanceof ServerError);
        }

        public int hashCode() {
            return 664595498;
        }

        @Y61.k
        public String toString() {
            return "ServerError";
        }
    }

    /* compiled from: TerminateReason.kt */
    @P
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason$Unknown;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Unknown extends TerminateReason {
        public static final int $stable = 0;

        @Y61.k
        private final String reason;

        public Unknown(@Y61.k String str) {
            super(null);
            this.reason = str;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = unknown.reason;
            }
            return unknown.copy(str);
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @Y61.k
        public final Unknown copy(@Y61.k String reason) {
            return new Unknown(reason);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && L.f(this.reason, ((Unknown) other).reason);
        }

        @Y61.k
        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @Y61.k
        public String toString() {
            return C22026a.c(new StringBuilder("Unknown(reason="), this.reason, ')');
        }
    }

    public /* synthetic */ TerminateReason(C42822w c42822w) {
        this();
    }

    private TerminateReason() {
    }
}
