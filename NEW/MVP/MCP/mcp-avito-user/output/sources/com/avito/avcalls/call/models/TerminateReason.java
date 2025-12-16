package com.avito.avcalls.call.models;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.avcalls.signaling.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TerminateReason.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\n\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\t\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/avcalls/call/models/TerminateReason;", "", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "toString", "AnswerTimeout", "Busy", "Companion", "ConnectTimeout", "Hangup", "InternalError", "NoMicAccess", "Reject", "ServerError", "Unknown", "Lcom/avito/avcalls/call/models/TerminateReason$AnswerTimeout;", "Lcom/avito/avcalls/call/models/TerminateReason$Busy;", "Lcom/avito/avcalls/call/models/TerminateReason$ConnectTimeout;", "Lcom/avito/avcalls/call/models/TerminateReason$Hangup;", "Lcom/avito/avcalls/call/models/TerminateReason$InternalError;", "Lcom/avito/avcalls/call/models/TerminateReason$NoMicAccess;", "Lcom/avito/avcalls/call/models/TerminateReason$Reject;", "Lcom/avito/avcalls/call/models/TerminateReason$ServerError;", "Lcom/avito/avcalls/call/models/TerminateReason$Unknown;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class TerminateReason {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final String reason;

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/avito/avcalls/call/models/TerminateReason$AnswerTimeout;", "Lcom/avito/avcalls/call/models/TerminateReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnswerTimeout extends TerminateReason {

        @k
        public static final AnswerTimeout INSTANCE = new AnswerTimeout();

        private AnswerTimeout() {
            super("answer_timeout", null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof AnswerTimeout);
        }

        public int hashCode() {
            return -787776660;
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/avito/avcalls/call/models/TerminateReason$Busy;", "Lcom/avito/avcalls/call/models/TerminateReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Busy extends TerminateReason {

        @k
        public static final Busy INSTANCE = new Busy();

        private Busy() {
            super("busy", null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Busy);
        }

        public int hashCode() {
            return 1494022192;
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/avito/avcalls/call/models/TerminateReason$Companion;", "", "<init>", "()V", "", "reason", "Lcom/avito/avcalls/call/models/TerminateReason;", "fromReason", "(Ljava/lang/String;)Lcom/avito/avcalls/call/models/TerminateReason;", "Lcom/avito/avcalls/signaling/v;", "error", "fromError", "(Lcom/avito/avcalls/signaling/v;)Lcom/avito/avcalls/call/models/TerminateReason;", "REASON_ANSWER_TIMEOUT", "Ljava/lang/String;", "REASON_BUSY", "REASON_CONNECT_TIMEOUT", "REASON_HANGUP", "REASON_INTERNAL_ERROR", "REASON_NO_MIC_ACCESS", "REASON_REJECT", "REASON_SERVER_ERROR", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final TerminateReason fromError(@k v error) {
            return error.equals(v.b.f333439b) ? true : error.equals(v.e.f333441b) ? ServerError.INSTANCE : error.equals(v.a.f333438b) ? InternalError.INSTANCE : new Unknown(error.f333437a);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @k
        public final TerminateReason fromReason(@k String reason) {
            switch (reason.hashCode()) {
                case -1224574323:
                    if (reason.equals("hangup")) {
                        return Hangup.INSTANCE;
                    }
                    break;
                case -934710369:
                    if (reason.equals("reject")) {
                        return Reject.INSTANCE;
                    }
                    break;
                case 3035641:
                    if (reason.equals("busy")) {
                        return Busy.INSTANCE;
                    }
                    break;
                case 495510284:
                    if (reason.equals("connect_timeout")) {
                        return ConnectTimeout.INSTANCE;
                    }
                    break;
                case 778975750:
                    if (reason.equals("internal_error")) {
                        return ServerError.INSTANCE;
                    }
                    break;
                case 1597281178:
                    if (reason.equals("no_mic_access")) {
                        return NoMicAccess.INSTANCE;
                    }
                    break;
                case 1646564832:
                    if (reason.equals("answer_timeout")) {
                        return AnswerTimeout.INSTANCE;
                    }
                    break;
            }
            return new Unknown(reason);
        }

        private Companion() {
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/avito/avcalls/call/models/TerminateReason$ConnectTimeout;", "Lcom/avito/avcalls/call/models/TerminateReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConnectTimeout extends TerminateReason {

        @k
        public static final ConnectTimeout INSTANCE = new ConnectTimeout();

        private ConnectTimeout() {
            super("connect_timeout", null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof ConnectTimeout);
        }

        public int hashCode() {
            return -1896284530;
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/avito/avcalls/call/models/TerminateReason$Hangup;", "Lcom/avito/avcalls/call/models/TerminateReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Hangup extends TerminateReason {

        @k
        public static final Hangup INSTANCE = new Hangup();

        private Hangup() {
            super("hangup", null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Hangup);
        }

        public int hashCode() {
            return 1389391620;
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/avito/avcalls/call/models/TerminateReason$InternalError;", "Lcom/avito/avcalls/call/models/TerminateReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InternalError extends TerminateReason {

        @k
        public static final InternalError INSTANCE = new InternalError();

        private InternalError() {
            super("internal_error", null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof InternalError);
        }

        public int hashCode() {
            return 1198862580;
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/avito/avcalls/call/models/TerminateReason$NoMicAccess;", "Lcom/avito/avcalls/call/models/TerminateReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoMicAccess extends TerminateReason {

        @k
        public static final NoMicAccess INSTANCE = new NoMicAccess();

        private NoMicAccess() {
            super("no_mic_access", null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof NoMicAccess);
        }

        public int hashCode() {
            return -377589837;
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/avito/avcalls/call/models/TerminateReason$Reject;", "Lcom/avito/avcalls/call/models/TerminateReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Reject extends TerminateReason {

        @k
        public static final Reject INSTANCE = new Reject();

        private Reject() {
            super("reject", null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Reject);
        }

        public int hashCode() {
            return 1679255574;
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001¨\u0006\t"}, d2 = {"Lcom/avito/avcalls/call/models/TerminateReason$ServerError;", "Lcom/avito/avcalls/call/models/TerminateReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServerError extends TerminateReason {

        @k
        public static final ServerError INSTANCE = new ServerError();

        private ServerError() {
            super("server_error", null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof ServerError);
        }

        public int hashCode() {
            return -1221262738;
        }
    }

    /* compiled from: TerminateReason.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/avcalls/call/models/TerminateReason$Unknown;", "Lcom/avito/avcalls/call/models/TerminateReason;", "", "reason", "<init>", "(Ljava/lang/String;)V", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Unknown extends TerminateReason {

        @k
        private final String reason;

        public Unknown(@k String str) {
            super(str, null);
            this.reason = str;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && L.f(this.reason, ((Unknown) other).reason);
        }

        @Override // com.avito.avcalls.call.models.TerminateReason
        @k
        public String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }
    }

    public /* synthetic */ TerminateReason(String str, C42822w c42822w) {
        this(str);
    }

    @k
    public String getReason() {
        return this.reason;
    }

    @k
    public final String toString() {
        return getReason();
    }

    private TerminateReason(String str) {
        this.reason = str;
    }
}
