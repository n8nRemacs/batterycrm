package com.avito.android.iac_avcalls.public_module.models;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvCallsInvitingState.kt */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState;", "", "()V", "toString", "", "Active", "Allocated", "Allocating", "Ringing", "Terminated", "Terminating", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState$Active;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState$Allocated;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState$Allocating;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState$Ringing;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState$Terminated;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState$Terminating;", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AvCallsInvitingState {

    /* compiled from: AvCallsInvitingState.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState$Active;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState;", "()V", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Active extends AvCallsInvitingState {

        @k
        public static final Active INSTANCE = new Active();

        private Active() {
            super(null);
        }
    }

    /* compiled from: AvCallsInvitingState.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState$Allocated;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState;", "()V", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Allocated extends AvCallsInvitingState {

        @k
        public static final Allocated INSTANCE = new Allocated();

        private Allocated() {
            super(null);
        }
    }

    /* compiled from: AvCallsInvitingState.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState$Allocating;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState;", "()V", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Allocating extends AvCallsInvitingState {

        @k
        public static final Allocating INSTANCE = new Allocating();

        private Allocating() {
            super(null);
        }
    }

    /* compiled from: AvCallsInvitingState.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState$Ringing;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState;", "()V", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ringing extends AvCallsInvitingState {

        @k
        public static final Ringing INSTANCE = new Ringing();

        private Ringing() {
            super(null);
        }
    }

    /* compiled from: AvCallsInvitingState.kt */
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState$Terminated;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState;", "reason", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason;", "isLocally", "", "(Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason;Z)V", "()Z", "getReason", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason;", "component1", "component2", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Terminated extends AvCallsInvitingState {
        private final boolean isLocally;

        @k
        private final AvCallsTerminateReason reason;

        public Terminated(@k AvCallsTerminateReason avCallsTerminateReason, boolean z12) {
            super(null);
            this.reason = avCallsTerminateReason;
            this.isLocally = z12;
        }

        public static /* synthetic */ Terminated copy$default(Terminated terminated, AvCallsTerminateReason avCallsTerminateReason, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                avCallsTerminateReason = terminated.reason;
            }
            if ((i12 & 2) != 0) {
                z12 = terminated.isLocally;
            }
            return terminated.copy(avCallsTerminateReason, z12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final AvCallsTerminateReason getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLocally() {
            return this.isLocally;
        }

        @k
        public final Terminated copy(@k AvCallsTerminateReason reason, boolean isLocally) {
            return new Terminated(reason, isLocally);
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
        public final AvCallsTerminateReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLocally) + (this.reason.hashCode() * 31);
        }

        public final boolean isLocally() {
            return this.isLocally;
        }

        @Override // com.avito.android.iac_avcalls.public_module.models.AvCallsInvitingState
        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Terminated(reason=");
            sb2.append(this.reason);
            sb2.append(", isLocally=");
            return r.x(sb2, this.isLocally, ')');
        }
    }

    /* compiled from: AvCallsInvitingState.kt */
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState$Terminating;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState;", "reason", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason;", "isLocally", "", "(Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason;Z)V", "()Z", "getReason", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason;", "component1", "component2", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Terminating extends AvCallsInvitingState {
        private final boolean isLocally;

        @k
        private final AvCallsTerminateReason reason;

        public Terminating(@k AvCallsTerminateReason avCallsTerminateReason, boolean z12) {
            super(null);
            this.reason = avCallsTerminateReason;
            this.isLocally = z12;
        }

        public static /* synthetic */ Terminating copy$default(Terminating terminating, AvCallsTerminateReason avCallsTerminateReason, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                avCallsTerminateReason = terminating.reason;
            }
            if ((i12 & 2) != 0) {
                z12 = terminating.isLocally;
            }
            return terminating.copy(avCallsTerminateReason, z12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final AvCallsTerminateReason getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLocally() {
            return this.isLocally;
        }

        @k
        public final Terminating copy(@k AvCallsTerminateReason reason, boolean isLocally) {
            return new Terminating(reason, isLocally);
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
        public final AvCallsTerminateReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLocally) + (this.reason.hashCode() * 31);
        }

        public final boolean isLocally() {
            return this.isLocally;
        }

        @Override // com.avito.android.iac_avcalls.public_module.models.AvCallsInvitingState
        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Terminating(reason=");
            sb2.append(this.reason);
            sb2.append(", isLocally=");
            return r.x(sb2, this.isLocally, ')');
        }
    }

    public /* synthetic */ AvCallsInvitingState(C42822w c42822w) {
        this();
    }

    @k
    public String toString() {
        return getClass().getSimpleName();
    }

    private AvCallsInvitingState() {
    }
}
