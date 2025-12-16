package ru.ok.android.externcalls.sdk.events.end;

import defpackage.fni;
import defpackage.ho7;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0010\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0010\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006&À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "", "key", "", "getKey", "()Ljava/lang/String;", "AcceptedOnAnotherDevice", "Banned", "Busy", "CallTimeout", "Canceled", "ConversationAlreadyEnded", "EndedForAll", "Error", "Hangup", "Missed", "ObsoleteClient", "PeerConnectionTimeout", "Rejected", "RemovedFromCall", "SignalingTimeout", "Unknown", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$AcceptedOnAnotherDevice;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Banned;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Busy;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$CallTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Canceled;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$ConversationAlreadyEnded;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$EndedForAll;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Error;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Hangup;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Missed;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$ObsoleteClient;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$PeerConnectionTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Rejected;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$RemovedFromCall;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$SignalingTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Unknown;", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ConversationEndReason {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$AcceptedOnAnotherDevice;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AcceptedOnAnotherDevice implements ConversationEndReason {
        public static final AcceptedOnAnotherDevice INSTANCE = new AcceptedOnAnotherDevice();
        private static final String key = "another_device";

        private AcceptedOnAnotherDevice() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AcceptedOnAnotherDevice);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 941556652;
        }

        public String toString() {
            return "AcceptedOnAnotherDevice";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Banned;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Banned implements ConversationEndReason {
        public static final Banned INSTANCE = new Banned();
        private static final String key = "banned";

        private Banned() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Banned);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -2039493819;
        }

        public String toString() {
            return "Banned";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Busy;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Busy implements ConversationEndReason {
        public static final Busy INSTANCE = new Busy();
        private static final String key = "busy";

        private Busy() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Busy);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -1199866912;
        }

        public String toString() {
            return "Busy";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$CallTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CallTimeout implements ConversationEndReason {
        public static final CallTimeout INSTANCE = new CallTimeout();
        private static final String key = "timeout";

        private CallTimeout() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CallTimeout);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 746379612;
        }

        public String toString() {
            return "CallTimeout";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Canceled;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Canceled implements ConversationEndReason {
        public static final Canceled INSTANCE = new Canceled();
        private static final String key = "canceled";

        private Canceled() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Canceled);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 284189440;
        }

        public String toString() {
            return "Canceled";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$ConversationAlreadyEnded;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConversationAlreadyEnded implements ConversationEndReason {
        public static final ConversationAlreadyEnded INSTANCE = new ConversationAlreadyEnded();
        private static final String key = "canceled";

        private ConversationAlreadyEnded() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ConversationAlreadyEnded);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -513124916;
        }

        public String toString() {
            return "ConversationAlreadyEnded";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$EndedForAll;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EndedForAll implements ConversationEndReason {
        public static final EndedForAll INSTANCE = new EndedForAll();
        private static final String key = "hangup";

        private EndedForAll() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EndedForAll);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 1468058539;
        }

        public String toString() {
            return "EndedForAll";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Error;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "throwable", "", "(Ljava/lang/Throwable;)V", "key", "", "getKey", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements ConversationEndReason {
        private final String key = NegotiationErrorStat.KEY_ERROR;
        private final Throwable throwable;

        public Error(Throwable th) {
            this.throwable = th;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && fni.a(this.throwable, ((Error) other).throwable);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return this.key;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Hangup;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Hangup implements ConversationEndReason {
        public static final Hangup INSTANCE = new Hangup();
        private static final String key = "hangup";

        private Hangup() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Hangup);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -1867725132;
        }

        public String toString() {
            return "Hangup";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Missed;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Missed implements ConversationEndReason {
        public static final Missed INSTANCE = new Missed();
        private static final String key = "missed";

        private Missed() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Missed);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -1717031230;
        }

        public String toString() {
            return "Missed";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$ObsoleteClient;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "explanationHtml", "", "(Ljava/lang/String;)V", "getExplanationHtml", "()Ljava/lang/String;", "key", "getKey", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ObsoleteClient implements ConversationEndReason {
        private final String explanationHtml;
        private final String key = "failed";

        public ObsoleteClient(String str) {
            this.explanationHtml = str;
        }

        public static /* synthetic */ ObsoleteClient copy$default(ObsoleteClient obsoleteClient, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = obsoleteClient.explanationHtml;
            }
            return obsoleteClient.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getExplanationHtml() {
            return this.explanationHtml;
        }

        public final ObsoleteClient copy(String explanationHtml) {
            return new ObsoleteClient(explanationHtml);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ObsoleteClient) && fni.a(this.explanationHtml, ((ObsoleteClient) other).explanationHtml);
        }

        public final String getExplanationHtml() {
            return this.explanationHtml;
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return this.key;
        }

        public int hashCode() {
            String str = this.explanationHtml;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return ho7.i("ObsoleteClient(explanationHtml=", this.explanationHtml, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$PeerConnectionTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PeerConnectionTimeout implements ConversationEndReason {
        public static final PeerConnectionTimeout INSTANCE = new PeerConnectionTimeout();
        private static final String key = "timeout";

        private PeerConnectionTimeout() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PeerConnectionTimeout);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -303820710;
        }

        public String toString() {
            return "PeerConnectionTimeout";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Rejected;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Rejected implements ConversationEndReason {
        public static final Rejected INSTANCE = new Rejected();
        private static final String key = "rejected";

        private Rejected() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Rejected);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -201133339;
        }

        public String toString() {
            return "Rejected";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$RemovedFromCall;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemovedFromCall implements ConversationEndReason {
        public static final RemovedFromCall INSTANCE = new RemovedFromCall();
        private static final String key = "removed";

        private RemovedFromCall() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof RemovedFromCall);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 354659681;
        }

        public String toString() {
            return "RemovedFromCall";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$SignalingTimeout;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SignalingTimeout implements ConversationEndReason {
        public static final SignalingTimeout INSTANCE = new SignalingTimeout();
        private static final String key = "timeout";

        private SignalingTimeout() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SignalingTimeout);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -269234386;
        }

        public String toString() {
            return "SignalingTimeout";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason$Unknown;", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Unknown implements ConversationEndReason {
        public static final Unknown INSTANCE = new Unknown();
        private static final String key = "failed";

        private Unknown() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unknown);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 1252320515;
        }

        public String toString() {
            return "Unknown";
        }
    }

    String getKey();
}
