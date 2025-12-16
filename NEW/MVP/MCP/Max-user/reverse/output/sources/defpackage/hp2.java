package defpackage;

/* loaded from: classes.dex */
public final class hp2 {
    public final boolean a;
    public final boolean b;

    public hp2(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp2)) {
            return false;
        }
        hp2 hp2Var = (hp2) obj;
        return this.a == hp2Var.a && this.b == hp2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xc0.g("LoadingState(hasPrev=", this.a, ", hasNext=", this.b, ")");
    }
}
