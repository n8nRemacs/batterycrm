package defpackage;

/* loaded from: classes2.dex */
public final class st {
    public final fje a;

    public st(fje fjeVar) {
        this.a = fjeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof st) && fni.a(this.a, ((st) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StopAsrRecord(sessionRoomId=" + this.a + ")";
    }
}
