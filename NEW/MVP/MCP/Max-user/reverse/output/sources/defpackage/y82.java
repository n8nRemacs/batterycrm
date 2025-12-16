package defpackage;

/* loaded from: classes2.dex */
public final class y82 implements z82 {
    public final int a;
    public final String b;
    public final s5g c;
    public final Integer d;
    public final boolean e;

    public y82(int i, String str, s5g s5gVar, Integer num, boolean z) {
        this.a = i;
        this.b = str;
        this.c = s5gVar;
        this.d = num;
        this.e = z;
    }

    public static y82 a(y82 y82Var, String str, s5g s5gVar, Integer num, boolean z, int i) {
        return new y82(y82Var.a, (i & 2) != 0 ? y82Var.b : str, s5gVar, num, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y82)) {
            return false;
        }
        y82 y82Var = (y82) obj;
        return this.a == y82Var.a && fni.a(this.b, y82Var.b) && fni.a(this.c, y82Var.c) && fni.a(this.d, y82Var.d) && this.e == y82Var.e;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        s5g s5gVar = this.c;
        int iHashCode3 = (iHashCode2 + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31;
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact(title=");
        sb.append(this.a);
        sb.append(", link=");
        sb.append(this.b);
        sb.append(", hint=");
        sb.append(this.c);
        sb.append(", hintColor=");
        sb.append(this.d);
        sb.append(", hasError=");
        return az1.k(sb, this.e, ")");
    }
}
