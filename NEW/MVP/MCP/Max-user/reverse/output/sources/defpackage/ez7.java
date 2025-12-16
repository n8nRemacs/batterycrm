package defpackage;

/* loaded from: classes2.dex */
public final class ez7 {
    public float a;
    public float b;
    public float c;
    public float d;

    public ez7(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez7)) {
            return false;
        }
        ez7 ez7Var = (ez7) obj;
        return Float.compare(this.a, ez7Var.a) == 0 && Float.compare(this.b, ez7Var.b) == 0 && Float.compare(this.c, ez7Var.c) == 0 && Float.compare(this.d, ez7Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + hf3.b(hf3.b(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "KeyFrame(t=" + this.a + ", alpha=" + this.b + ", trimStart=" + this.c + ", trimEnd=" + this.d + ")";
    }
}
