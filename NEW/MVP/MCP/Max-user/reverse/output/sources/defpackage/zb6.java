package defpackage;

/* loaded from: classes2.dex */
public final class zb6 extends l0g {
    public final long c;

    public zb6(long j) {
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zb6) && this.c == ((zb6) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return a9h.d(this.c, "Response(folderSync=", ")");
    }
}
