package defpackage;

/* loaded from: classes2.dex */
public final class i7a extends mxi {
    public final long a;

    public i7a(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7a) && this.a == ((i7a) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "AudioRecord(recordAudioId=", ")");
    }
}
