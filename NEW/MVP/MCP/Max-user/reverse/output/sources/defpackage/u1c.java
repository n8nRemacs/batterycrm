package defpackage;

/* loaded from: classes.dex */
public final class u1c {
    public static final u1c e = new u1c(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public u1c(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1c)) {
            return false;
        }
        u1c u1cVar = (u1c) obj;
        return Float.compare(this.a, u1cVar.a) == 0 && Float.compare(this.b, u1cVar.b) == 0 && Float.compare(this.c, u1cVar.c) == 0 && Float.compare(this.d, u1cVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + hf3.b(hf3.b(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "PipBounds(maxLeftOffset=" + this.a + ", maxRightOffset=" + this.b + ", maxTopOffset=" + this.c + ", maxBottomOffset=" + this.d + ")";
    }
}
