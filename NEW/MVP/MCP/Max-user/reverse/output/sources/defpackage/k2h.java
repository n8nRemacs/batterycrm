package defpackage;

/* loaded from: classes2.dex */
public final class k2h {
    public final l2h a;
    public final boolean b;
    public final String c;
    public final String d;

    public k2h(dl6 dl6Var) {
        this.a = (l2h) dl6Var.b;
        this.b = dl6Var.a;
        this.c = (String) dl6Var.c;
        this.d = (String) dl6Var.d;
    }

    public final dl6 a() {
        dl6 dl6Var = new dl6();
        dl6Var.b = this.a;
        dl6Var.a = this.b;
        dl6Var.c = this.c;
        dl6Var.d = this.d;
        return dl6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k2h.class == obj.getClass()) {
            k2h k2hVar = (k2h) obj;
            String str = k2hVar.d;
            String str2 = k2hVar.c;
            l2h l2hVar = k2hVar.a;
            if (this.b != k2hVar.b) {
                return false;
            }
            l2h l2hVar2 = this.a;
            if (l2hVar2 == null ? l2hVar != null : !l2hVar2.equals(l2hVar)) {
                return false;
            }
            String str3 = this.c;
            if (str3 == null ? str2 != null : !str3.equals(str2)) {
                return false;
            }
            String str4 = this.d;
            if (str4 != null) {
                return str4.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        l2h l2hVar = this.a;
        int iHashCode = (((l2hVar != null ? l2hVar.hashCode() : 0) * 31) + (this.b ? 1 : 0)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoConversion{videoConversionData=");
        sb.append(this.a);
        sb.append(", finished=");
        sb.append(this.b);
        sb.append(", preparedPath='");
        sb.append(this.c);
        sb.append("', resultPath='");
        return ho7.l(sb, this.d, "'}");
    }
}
