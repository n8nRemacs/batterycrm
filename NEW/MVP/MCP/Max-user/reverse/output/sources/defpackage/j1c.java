package defpackage;

/* loaded from: classes.dex */
public final class j1c {
    public final int a;
    public final int b;

    public j1c(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1c)) {
            return false;
        }
        j1c j1cVar = (j1c) obj;
        return this.a == j1cVar.a && this.b == j1cVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("PipBoundariesOffset(topYOffset=", this.a, ", bottomYOffset=", this.b, ")");
    }
}
