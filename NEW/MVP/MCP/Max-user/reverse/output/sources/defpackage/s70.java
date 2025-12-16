package defpackage;

/* loaded from: classes2.dex */
public final class s70 extends l0g {
    public final long c;

    public s70(long j) {
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s70) && this.c == ((s70) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return a9h.d(this.c, "Response(timestampRemoveProfile=", ")");
    }
}
