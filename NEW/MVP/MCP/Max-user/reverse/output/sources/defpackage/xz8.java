package defpackage;

/* loaded from: classes.dex */
public final class xz8 implements lw0 {
    public static final xz8 X = new xz8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float o;

    public xz8(long j, long j2, long j3, float f, float f2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
        this.o = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz8)) {
            return false;
        }
        xz8 xz8Var = (xz8) obj;
        return this.a == xz8Var.a && this.b == xz8Var.b && this.c == xz8Var.c && this.d == xz8Var.d && this.o == xz8Var.o;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.d;
        int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.o;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
