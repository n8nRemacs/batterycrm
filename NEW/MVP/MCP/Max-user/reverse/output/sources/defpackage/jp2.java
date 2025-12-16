package defpackage;

/* loaded from: classes.dex */
public final class jp2 {
    public static final jp2 c = new jp2(0, 0.0f);
    public final int a;
    public final float b;

    public jp2(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp2)) {
            return false;
        }
        jp2 jp2Var = (jp2) obj;
        return this.a == jp2Var.a && Float.compare(this.b, jp2Var.b) == 0;
    }

    public final int hashCode() {
        int i = this.a;
        return Float.hashCode(this.b) + ((i == 0 ? 0 : az1.v(i)) * 31);
    }

    public final String toString() {
        return "OrientState(screenOrientation=" + vb9.l(this.a) + ", angle=" + this.b + ")";
    }
}
