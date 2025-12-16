package defpackage;

/* loaded from: classes2.dex */
public final class eld extends l0g {
    public final long c;

    public eld(long j) {
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eld) && this.c == ((eld) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return a9h.d(this.c, "Response(timestampRemoveProfile=", ")");
    }
}
