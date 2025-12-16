package com.avito.android.iac_avcalls.public_module.models;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvCallsTerminateReason.kt */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0005\u0006\u0007\b\t\n\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0082\u0001\t\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason;", "", "()V", "toString", "", "AnswerTimeout", "Busy", "ConnectTimeout", "Hangup", "InternalError", "NoMicAccess", "Reject", "ServerError", "Unknown", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$AnswerTimeout;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$Busy;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$ConnectTimeout;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$Hangup;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$InternalError;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$NoMicAccess;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$Reject;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$ServerError;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$Unknown;", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AvCallsTerminateReason {

    /* compiled from: AvCallsTerminateReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$AnswerTimeout;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason;", "()V", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnswerTimeout extends AvCallsTerminateReason {

        @k
        public static final AnswerTimeout INSTANCE = new AnswerTimeout();

        private AnswerTimeout() {
            super(null);
        }
    }

    /* compiled from: AvCallsTerminateReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$Busy;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason;", "()V", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Busy extends AvCallsTerminateReason {

        @k
        public static final Busy INSTANCE = new Busy();

        private Busy() {
            super(null);
        }
    }

    /* compiled from: AvCallsTerminateReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$ConnectTimeout;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason;", "()V", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConnectTimeout extends AvCallsTerminateReason {

        @k
        public static final ConnectTimeout INSTANCE = new ConnectTimeout();

        private ConnectTimeout() {
            super(null);
        }
    }

    /* compiled from: AvCallsTerminateReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$Hangup;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason;", "()V", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Hangup extends AvCallsTerminateReason {

        @k
        public static final Hangup INSTANCE = new Hangup();

        private Hangup() {
            super(null);
        }
    }

    /* compiled from: AvCallsTerminateReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$InternalError;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason;", "()V", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InternalError extends AvCallsTerminateReason {

        @k
        public static final InternalError INSTANCE = new InternalError();

        private InternalError() {
            super(null);
        }
    }

    /* compiled from: AvCallsTerminateReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$NoMicAccess;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason;", "()V", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoMicAccess extends AvCallsTerminateReason {

        @k
        public static final NoMicAccess INSTANCE = new NoMicAccess();

        private NoMicAccess() {
            super(null);
        }
    }

    /* compiled from: AvCallsTerminateReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$Reject;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason;", "()V", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Reject extends AvCallsTerminateReason {

        @k
        public static final Reject INSTANCE = new Reject();

        private Reject() {
            super(null);
        }
    }

    /* compiled from: AvCallsTerminateReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$ServerError;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason;", "()V", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ServerError extends AvCallsTerminateReason {

        @k
        public static final ServerError INSTANCE = new ServerError();

        private ServerError() {
            super(null);
        }
    }

    /* compiled from: AvCallsTerminateReason.kt */
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason$Unknown;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsTerminateReason;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Unknown extends AvCallsTerminateReason {

        @k
        private final String reason;

        public Unknown(@k String str) {
            super(null);
            this.reason = str;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = unknown.reason;
            }
            return unknown.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @k
        public final Unknown copy(@k String reason) {
            return new Unknown(reason);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && L.f(this.reason, ((Unknown) other).reason);
        }

        @k
        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @Override // com.avito.android.iac_avcalls.public_module.models.AvCallsTerminateReason
        @k
        public String toString() {
            return C22026a.c(new StringBuilder("Unknown(reason="), this.reason, ')');
        }
    }

    public /* synthetic */ AvCallsTerminateReason(C42822w c42822w) {
        this();
    }

    @k
    public String toString() {
        return getClass().getSimpleName();
    }

    private AvCallsTerminateReason() {
    }
}
