package defpackage;

/* loaded from: classes.dex */
public class qz8 {
    public static final qz8 i = new qz8(new oz8());
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public static final String p = Integer.toString(6, 36);
    public static final String q = Integer.toString(7, 36);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public qz8(oz8 oz8Var) {
        this.a = zxg.m0(oz8Var.a);
        this.c = zxg.m0(oz8Var.b);
        this.b = oz8Var.a;
        this.d = oz8Var.b;
        this.e = oz8Var.c;
        this.f = oz8Var.d;
        this.g = oz8Var.e;
        this.h = oz8Var.f;
    }

    public final oz8 a() {
        oz8 oz8Var = new oz8();
        oz8Var.a = this.b;
        oz8Var.b = this.d;
        oz8Var.c = this.e;
        oz8Var.d = this.f;
        oz8Var.e = this.g;
        oz8Var.f = this.h;
        return oz8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz8)) {
            return false;
        }
        qz8 qz8Var = (qz8) obj;
        return this.b == qz8Var.b && this.d == qz8Var.d && this.e == qz8Var.e && this.f == qz8Var.f && this.g == qz8Var.g && this.h == qz8Var.h;
    }

    public final int hashCode() {
        long j2 = this.b;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.d;
        return ((((((((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
