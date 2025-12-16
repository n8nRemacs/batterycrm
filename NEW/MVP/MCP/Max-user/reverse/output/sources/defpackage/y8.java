package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public class y8 implements fn6, Serializable {
    public final int X;
    public final int Y;
    public final Object a;
    public final Class b;
    public final String c;
    public final String d;
    public final boolean o;

    public y8(int i, Class cls, String str, int i2) {
        this(i, i2, cls, nu1.NO_RECEIVER, "<init>", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8)) {
            return false;
        }
        y8 y8Var = (y8) obj;
        return this.o == y8Var.o && this.X == y8Var.X && this.Y == y8Var.Y && fni.a(this.a, y8Var.a) && fni.a(this.b, y8Var.b) && this.c.equals(y8Var.c) && this.d.equals(y8Var.d);
    }

    @Override // defpackage.fn6
    public final int getArity() {
        return this.X;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.b;
        return ((((u45.e(u45.e((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.c), 31, this.d) + (this.o ? 1231 : 1237)) * 31) + this.X) * 31) + this.Y;
    }

    public final String toString() {
        vid.a.getClass();
        return wid.a(this);
    }

    public y8(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.a = obj;
        this.b = cls;
        this.c = str;
        this.d = str2;
        this.o = false;
        this.X = i;
        this.Y = i2 >> 1;
    }
}
