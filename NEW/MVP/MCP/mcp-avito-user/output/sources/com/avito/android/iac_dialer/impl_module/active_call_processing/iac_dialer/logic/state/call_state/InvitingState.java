package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InvitingState.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u000f\u0010\u0011\u0012\u0013\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0006\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;", "LdL/d;", "", "comparatorIndex", "<init>", "(I)V", PluralsKeys.OTHER, "compareTo", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;)I", "I", "getComparatorIndex", "()I", "", "isTerminal", "()Z", "Active", "Allocated", "Allocating", "Ringing", "Terminated", "Terminating", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState$Active;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState$Allocated;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState$Allocating;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState$Ringing;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState$Terminated;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState$Terminating;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class InvitingState implements dL.d {
    public static final int $stable = 0;
    private final int comparatorIndex;

    /* compiled from: InvitingState.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState$Active;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Active extends InvitingState {
        public static final int $stable = 0;

        @Y61.k
        public static final Active INSTANCE = new Active();

        private Active() {
            super(4, null);
        }

        public boolean equals(@Y61.l Object other) {
            return this == other || (other instanceof Active);
        }

        public int hashCode() {
            return -761176229;
        }

        @Y61.k
        public String toString() {
            return "Active";
        }
    }

    /* compiled from: InvitingState.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState$Allocated;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Allocated extends InvitingState {
        public static final int $stable = 0;

        @Y61.k
        public static final Allocated INSTANCE = new Allocated();

        private Allocated() {
            super(2, null);
        }

        public boolean equals(@Y61.l Object other) {
            return this == other || (other instanceof Allocated);
        }

        public int hashCode() {
            return 1375837266;
        }

        @Y61.k
        public String toString() {
            return "Allocated";
        }
    }

    /* compiled from: InvitingState.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState$Allocating;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Allocating extends InvitingState {
        public static final int $stable = 0;

        @Y61.k
        public static final Allocating INSTANCE = new Allocating();

        private Allocating() {
            super(1, null);
        }

        public boolean equals(@Y61.l Object other) {
            return this == other || (other instanceof Allocating);
        }

        public int hashCode() {
            return -298713457;
        }

        @Y61.k
        public String toString() {
            return "Allocating";
        }
    }

    /* compiled from: InvitingState.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState$Ringing;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Ringing extends InvitingState {
        public static final int $stable = 0;

        @Y61.k
        public static final Ringing INSTANCE = new Ringing();

        private Ringing() {
            super(3, null);
        }

        public boolean equals(@Y61.l Object other) {
            return this == other || (other instanceof Ringing);
        }

        public int hashCode() {
            return 247196157;
        }

        @Y61.k
        public String toString() {
            return "Ringing";
        }
    }

    /* compiled from: InvitingState.kt */
    @P
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState$Terminated;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/u;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "reason", "", "isLocally", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;Z)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "component2", "()Z", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;Z)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState$Terminated;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "getReason", "Z", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Terminated extends InvitingState implements u {
        public static final int $stable = 0;
        private final boolean isLocally;

        @Y61.k
        private final TerminateReason reason;

        public Terminated(@Y61.k TerminateReason terminateReason, boolean z12) {
            super(6, null);
            this.reason = terminateReason;
            this.isLocally = z12;
        }

        public static /* synthetic */ Terminated copy$default(Terminated terminated, TerminateReason terminateReason, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                terminateReason = terminated.reason;
            }
            if ((i12 & 2) != 0) {
                z12 = terminated.isLocally;
            }
            return terminated.copy(terminateReason, z12);
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final TerminateReason getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLocally() {
            return this.isLocally;
        }

        @Y61.k
        public final Terminated copy(@Y61.k TerminateReason reason, boolean isLocally) {
            return new Terminated(reason, isLocally);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Terminated)) {
                return false;
            }
            Terminated terminated = (Terminated) other;
            return L.f(this.reason, terminated.reason) && this.isLocally == terminated.isLocally;
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.u
        @Y61.k
        public TerminateReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLocally) + (this.reason.hashCode() * 31);
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.u
        public boolean isLocally() {
            return this.isLocally;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Terminated(reason=");
            sb2.append(this.reason);
            sb2.append(", isLocally=");
            return androidx.appcompat.app.r.x(sb2, this.isLocally, ')');
        }
    }

    /* compiled from: InvitingState.kt */
    @P
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState$Terminating;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/u;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "reason", "", "isLocally", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;Z)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "component2", "()Z", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;Z)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState$Terminating;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "getReason", "Z", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Terminating extends InvitingState implements u {
        public static final int $stable = 0;
        private final boolean isLocally;

        @Y61.k
        private final TerminateReason reason;

        public Terminating(@Y61.k TerminateReason terminateReason, boolean z12) {
            super(5, null);
            this.reason = terminateReason;
            this.isLocally = z12;
        }

        public static /* synthetic */ Terminating copy$default(Terminating terminating, TerminateReason terminateReason, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                terminateReason = terminating.reason;
            }
            if ((i12 & 2) != 0) {
                z12 = terminating.isLocally;
            }
            return terminating.copy(terminateReason, z12);
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final TerminateReason getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLocally() {
            return this.isLocally;
        }

        @Y61.k
        public final Terminating copy(@Y61.k TerminateReason reason, boolean isLocally) {
            return new Terminating(reason, isLocally);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Terminating)) {
                return false;
            }
            Terminating terminating = (Terminating) other;
            return L.f(this.reason, terminating.reason) && this.isLocally == terminating.isLocally;
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.u
        @Y61.k
        public TerminateReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLocally) + (this.reason.hashCode() * 31);
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.u
        public boolean isLocally() {
            return this.isLocally;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Terminating(reason=");
            sb2.append(this.reason);
            sb2.append(", isLocally=");
            return androidx.appcompat.app.r.x(sb2, this.isLocally, ')');
        }
    }

    public /* synthetic */ InvitingState(int i12, C42822w c42822w) {
        this(i12);
    }

    public final int compareTo(@Y61.k InvitingState other) {
        return L.g(this.comparatorIndex, other.comparatorIndex);
    }

    public final int getComparatorIndex() {
        return this.comparatorIndex;
    }

    public final boolean isTerminal() {
        return this instanceof u;
    }

    private InvitingState(int i12) {
        this.comparatorIndex = i12;
    }
}
