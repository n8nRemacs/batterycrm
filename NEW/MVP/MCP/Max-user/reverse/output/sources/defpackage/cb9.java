package defpackage;

/* loaded from: classes2.dex */
public final class cb9 implements db9 {
    public final cf8 a;
    public final float b;
    public final long c;

    public cb9(float f, long j, cf8 cf8Var) {
        this.a = cf8Var;
        this.b = f;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb9)) {
            return false;
        }
        cb9 cb9Var = (cb9) obj;
        return fni.a(this.a, cb9Var.a) && Float.compare(this.b, cb9Var.b) == 0 && this.c == cb9Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + hf3.b(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendLocation(locationData=");
        sb.append(this.a);
        sb.append(", zoom=");
        sb.append(this.b);
        sb.append(", livePeriod=");
        return ho7.k(sb, this.c, ")");
    }
}
