package com.avito.avcalls.call.models;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;

/* compiled from: InvitingState.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\t\n\u000b\f\r\u000eB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/avcalls/call/models/InvitingState;", "", "order", "", "(I)V", "compareTo", VoiceInfo.STATE, "toString", "", "Active", "Allocated", "Allocating", "Ringing", "Terminated", "Terminating", "Lcom/avito/avcalls/call/models/InvitingState$Active;", "Lcom/avito/avcalls/call/models/InvitingState$Allocated;", "Lcom/avito/avcalls/call/models/InvitingState$Allocating;", "Lcom/avito/avcalls/call/models/InvitingState$Ringing;", "Lcom/avito/avcalls/call/models/InvitingState$Terminated;", "Lcom/avito/avcalls/call/models/InvitingState$Terminating;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class InvitingState {
    private final int order;

    /* compiled from: InvitingState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/avcalls/call/models/InvitingState$Active;", "Lcom/avito/avcalls/call/models/InvitingState;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Active extends InvitingState {

        @k
        public static final Active INSTANCE = new Active();

        private Active() {
            super(3, null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Active);
        }

        public int hashCode() {
            return -1064301161;
        }

        @Override // com.avito.avcalls.call.models.InvitingState
        @k
        public String toString() {
            return "Active";
        }
    }

    /* compiled from: InvitingState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/avcalls/call/models/InvitingState$Allocated;", "Lcom/avito/avcalls/call/models/InvitingState;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Allocated extends InvitingState {

        @k
        public static final Allocated INSTANCE = new Allocated();

        private Allocated() {
            super(1, null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Allocated);
        }

        public int hashCode() {
            return -997755754;
        }

        @Override // com.avito.avcalls.call.models.InvitingState
        @k
        public String toString() {
            return "Allocated";
        }
    }

    /* compiled from: InvitingState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/avcalls/call/models/InvitingState$Allocating;", "Lcom/avito/avcalls/call/models/InvitingState;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Allocating extends InvitingState {

        @k
        public static final Allocating INSTANCE = new Allocating();

        private Allocating() {
            super(0, null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Allocating);
        }

        public int hashCode() {
            return -865653045;
        }

        @Override // com.avito.avcalls.call.models.InvitingState
        @k
        public String toString() {
            return "Allocating";
        }
    }

    /* compiled from: InvitingState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/avcalls/call/models/InvitingState$Ringing;", "Lcom/avito/avcalls/call/models/InvitingState;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Ringing extends InvitingState {

        @k
        public static final Ringing INSTANCE = new Ringing();

        private Ringing() {
            super(2, null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Ringing);
        }

        public int hashCode() {
            return -559742143;
        }

        @Override // com.avito.avcalls.call.models.InvitingState
        @k
        public String toString() {
            return "Ringing";
        }
    }

    /* compiled from: InvitingState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/avcalls/call/models/InvitingState$Terminated;", "Lcom/avito/avcalls/call/models/InvitingState;", "Lcom/avito/avcalls/call/models/TerminateReason;", "reason", "", "isLocally", "<init>", "(Lcom/avito/avcalls/call/models/TerminateReason;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/avcalls/call/models/TerminateReason;", "getReason", "()Lcom/avito/avcalls/call/models/TerminateReason;", "Z", "()Z", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Terminated extends InvitingState {
        private final boolean isLocally;

        @k
        private final TerminateReason reason;

        public Terminated(@k TerminateReason terminateReason, boolean z12) {
            super(5, null);
            this.reason = terminateReason;
            this.isLocally = z12;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Terminated)) {
                return false;
            }
            Terminated terminated = (Terminated) other;
            return L.f(this.reason, terminated.reason) && this.isLocally == terminated.isLocally;
        }

        @k
        public final TerminateReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLocally) + (this.reason.hashCode() * 31);
        }

        /* renamed from: isLocally, reason: from getter */
        public final boolean getIsLocally() {
            return this.isLocally;
        }

        @Override // com.avito.avcalls.call.models.InvitingState
        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Terminated(reason=");
            sb2.append(this.reason);
            sb2.append(", isLocally=");
            return r.x(sb2, this.isLocally, ')');
        }
    }

    /* compiled from: InvitingState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/avcalls/call/models/InvitingState$Terminating;", "Lcom/avito/avcalls/call/models/InvitingState;", "Lcom/avito/avcalls/call/models/TerminateReason;", "reason", "", "isLocally", "<init>", "(Lcom/avito/avcalls/call/models/TerminateReason;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/avcalls/call/models/TerminateReason;", "getReason", "()Lcom/avito/avcalls/call/models/TerminateReason;", "Z", "()Z", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Terminating extends InvitingState {
        private final boolean isLocally;

        @k
        private final TerminateReason reason;

        public Terminating(@k TerminateReason terminateReason, boolean z12) {
            super(4, null);
            this.reason = terminateReason;
            this.isLocally = z12;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Terminating)) {
                return false;
            }
            Terminating terminating = (Terminating) other;
            return L.f(this.reason, terminating.reason) && this.isLocally == terminating.isLocally;
        }

        @k
        public final TerminateReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLocally) + (this.reason.hashCode() * 31);
        }

        /* renamed from: isLocally, reason: from getter */
        public final boolean getIsLocally() {
            return this.isLocally;
        }

        @Override // com.avito.avcalls.call.models.InvitingState
        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Terminating(reason=");
            sb2.append(this.reason);
            sb2.append(", isLocally=");
            return r.x(sb2, this.isLocally, ')');
        }
    }

    public /* synthetic */ InvitingState(int i12, C42822w c42822w) {
        this(i12);
    }

    public final int compareTo(@k InvitingState state) {
        return L.g(this.order, state.order);
    }

    @k
    public String toString() {
        String strL0 = m0.f406844a.b(getClass()).l0();
        return strL0 == null ? "" : strL0;
    }

    private InvitingState(int i12) {
        this.order = i12;
    }
}
