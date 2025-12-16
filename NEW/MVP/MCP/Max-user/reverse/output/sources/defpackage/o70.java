package defpackage;

/* loaded from: classes2.dex */
public final class o70 extends l0g {
    public final String c;

    public o70(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o70) && fni.a(this.c, ((o70) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.pj0
    public final String toString() {
        return ho7.i("Response(trackId='", this.c, "')");
    }
}
