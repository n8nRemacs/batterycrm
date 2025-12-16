package defpackage;

/* loaded from: classes2.dex */
public final class rf {
    public final Float a;
    public final Float b;

    public rf(Float f, Float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf)) {
            return false;
        }
        rf rfVar = (rf) obj;
        return this.a.equals(rfVar.a) && this.b.equals(rfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimatedValues(start=" + this.a + ", finish=" + this.b + ")";
    }
}
