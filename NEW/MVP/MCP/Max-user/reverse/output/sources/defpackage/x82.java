package defpackage;

/* loaded from: classes2.dex */
public final class x82 implements z82 {
    public final int a;
    public final w82 b;
    public final String c;
    public final s5g d;
    public final Integer e;
    public final boolean f;

    public x82(int i, w82 w82Var, String str, s5g s5gVar, Integer num, boolean z) {
        this.a = i;
        this.b = w82Var;
        this.c = str;
        this.d = s5gVar;
        this.e = num;
        this.f = z;
    }

    public static x82 a(x82 x82Var, String str, s5g s5gVar, Integer num, boolean z, int i) {
        int i2 = x82Var.a;
        w82 w82Var = x82Var.b;
        if ((i & 4) != 0) {
            str = x82Var.c;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z = x82Var.f;
        }
        return new x82(i2, w82Var, str2, s5gVar, num, z);
    }

    public final boolean b(z82 z82Var) {
        if (z82Var == null || !(z82Var instanceof x82)) {
            return false;
        }
        x82 x82Var = (x82) z82Var;
        return (this.b == x82Var.b && fni.a(this.c, x82Var.c)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x82)) {
            return false;
        }
        x82 x82Var = (x82) obj;
        return this.a == x82Var.a && this.b == x82Var.b && fni.a(this.c, x82Var.c) && fni.a(this.d, x82Var.d) && fni.a(this.e, x82Var.e) && this.f == x82Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        s5g s5gVar = this.d;
        int iHashCode3 = (iHashCode2 + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31;
        Integer num = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Chat(title=" + this.a + ", type=" + this.b + ", link=" + this.c + ", hint=" + this.d + ", hintColor=" + this.e + ", hasError=" + this.f + ")";
    }

    public /* synthetic */ x82(w82 w82Var, String str) {
        this(u8b.M1, w82Var, str, null, null, false);
    }
}
