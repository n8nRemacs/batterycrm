package defpackage;

import androidx.work.WorkRequest;

/* loaded from: classes2.dex */
public final class ri1 {
    public final long a;

    public ri1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri1)) {
            return false;
        }
        ri1 ri1Var = (ri1) obj;
        ri1Var.getClass();
        return this.a == ri1Var.a;
    }

    public final int hashCode() {
        return Long.hashCode(12000L) + a9h.a(a9h.a(a9h.a(a9h.a(iti.a(30000, iti.a(5, Integer.hashCode(30000) * 31)), 31, 20000L), 31, WorkRequest.MIN_BACKOFF_MILLIS), 31, WorkRequest.MIN_BACKOFF_MILLIS), 31, this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "Timeouts(timeoutIceReconnectMillis=30000, signalingMaxRetryCount=5, signalingMaxRetryTimeout=30000, signalingPingTimeout=20000, noSoundTimeoutMs=10000, noPeerConnectionTimeoutMs=10000, mediaReceivingTimeoutMs=", ", noDataTimeout=12000)");
    }
}
