package defpackage;

/* loaded from: classes2.dex */
public final class fmd {
    public final int a;
    public final int b;
    public final String c;
    public final k10 d;
    public final long e;

    public fmd(int i, int i2, String str, k10 k10Var, long j) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = k10Var;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmd)) {
            return false;
        }
        fmd fmdVar = (fmd) obj;
        return this.a == fmdVar.a && this.b == fmdVar.b && fni.a(this.c, fmdVar.c) && fni.a(this.d, fmdVar.d) && this.e == fmdVar.e;
    }

    public final int hashCode() {
        int iE = u45.e(utb.k(this.b, az1.v(this.a) * 31, 31), 31, this.c);
        k10 k10Var = this.d;
        return Long.hashCode(this.e) + ((iE + (k10Var == null ? 0 : k10Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyButton(type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNKNOWN" : "LOCATION" : "CONTACT" : "IMAGE" : "MESSAGE");
        sb.append(", intent=");
        int i2 = this.b;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "UNKNOWN" : "NEGATIVE" : "POSITIVE" : "DEFAULT");
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", outgoingMessageId=");
        return ho7.k(sb, this.e, ")");
    }
}
