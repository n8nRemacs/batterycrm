package defpackage;

/* loaded from: classes2.dex */
public final class fa8 {
    public final Float a;
    public final boolean b;

    public fa8(Float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa8)) {
            return false;
        }
        fa8 fa8Var = (fa8) obj;
        return fni.a(this.a, fa8Var.a) && this.b == fa8Var.b;
    }

    public final int hashCode() {
        Float f = this.a;
        return Boolean.hashCode(this.b) + ((f == null ? 0 : f.hashCode()) * 31);
    }

    public final String toString() {
        return "ListeningState(progress=" + this.a + ", isPlaying=" + this.b + ")";
    }
}
