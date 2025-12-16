package defpackage;

/* loaded from: classes2.dex */
public final class ltc implements ntc {
    public final long a;

    public ltc(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ltc) && this.a == ((ltc) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "ModeRecordingVideo(startTimeMs=", ")");
    }
}
