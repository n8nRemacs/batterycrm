package defpackage;

/* loaded from: classes2.dex */
public final class j9h extends n9h {
    public final h5h a;
    public final boolean b;

    public j9h(h5h h5hVar, boolean z) {
        this.a = h5hVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9h)) {
            return false;
        }
        j9h j9hVar = (j9h) obj;
        return fni.a(this.a, j9hVar.a) && this.b == j9hVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BackCamera(torchState=" + this.a + ", isTimerVisible=" + this.b + ")";
    }
}
