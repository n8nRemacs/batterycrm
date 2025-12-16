package defpackage;

/* loaded from: classes2.dex */
public final class ds {
    public float a;
    public float b;
    public float c;
    public float d;

    public ds(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds)) {
            return false;
        }
        ds dsVar = (ds) obj;
        return Float.compare(this.a, dsVar.a) == 0 && Float.compare(this.b, dsVar.b) == 0 && Float.compare(this.c, dsVar.c) == 0 && Float.compare(this.d, dsVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + hf3.b(hf3.b(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "ArcFrame(t=" + this.a + ", trimStart=" + this.b + ", trimEnd=" + this.c + ", rotationDeg=" + this.d + ")";
    }
}
