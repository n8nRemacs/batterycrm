package defpackage;

/* loaded from: classes.dex */
public final class l9g implements lw0 {
    public boolean X;
    public u8 Y = u8.X;
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long o;

    public final long a(int i, int i2) {
        s8 s8VarA = this.Y.a(i);
        if (s8VarA.b != -1) {
            return s8VarA.o[i2];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        s8 s8VarA;
        int i;
        u8 u8Var = this.Y;
        long j2 = this.d;
        int i2 = u8Var.a;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = u8Var.d;
            while (i3 < i2 && ((u8Var.a(i3).a != Long.MIN_VALUE && u8Var.a(i3).a <= j) || ((i = (s8VarA = u8Var.a(i3)).b) != -1 && s8VarA.a(-1) >= i))) {
                i3++;
            }
            if (i3 < i2) {
                return i3;
            }
        }
        return -1;
    }

    public final int c(long j) {
        u8 u8Var = this.Y;
        long j2 = this.d;
        int i = u8Var.a - 1;
        while (i >= 0 && j != Long.MIN_VALUE) {
            long j3 = u8Var.a(i).a;
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
                i--;
            } else {
                if (j2 != -9223372036854775807L && j >= j2) {
                    break;
                }
                i--;
            }
        }
        if (i >= 0) {
            s8 s8VarA = u8Var.a(i);
            int i2 = s8VarA.b;
            if (i2 != -1) {
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = s8VarA.d[i3];
                    if (i4 != 0 && i4 != 1) {
                    }
                }
            }
            return i;
        }
        return -1;
    }

    public final int d(int i, int i2) {
        s8 s8VarA = this.Y.a(i);
        if (s8VarA.b != -1) {
            return s8VarA.d[i2];
        }
        return 0;
    }

    public final int e(int i) {
        return this.Y.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l9g.class.equals(obj.getClass())) {
            l9g l9gVar = (l9g) obj;
            if (xxg.a(this.a, l9gVar.a) && xxg.a(this.b, l9gVar.b) && this.c == l9gVar.c && this.d == l9gVar.d && this.o == l9gVar.o && this.X == l9gVar.X && xxg.a(this.Y, l9gVar.Y)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(int i) {
        return this.Y.a(i).Y;
    }

    public final void g(Object obj, Object obj2, int i, long j, long j2, u8 u8Var, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.o = j2;
        this.Y = u8Var;
        this.X = z;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j = this.d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.o;
        return this.Y.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.X ? 1 : 0)) * 31);
    }
}
