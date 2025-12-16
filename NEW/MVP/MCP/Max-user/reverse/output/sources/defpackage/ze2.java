package defpackage;

/* loaded from: classes2.dex */
public final class ze2 {
    public final long a;
    public final int b;
    public final long c;
    public final String d;

    public ze2(ye2 ye2Var) {
        this.a = ye2Var.b;
        this.b = ye2Var.a;
        this.c = ye2Var.c;
        this.d = (String) ye2Var.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdminParticipant{id=");
        sb.append(this.a);
        sb.append(", permissions=");
        sb.append(this.b);
        sb.append(", inviterId=");
        sb.append(this.c);
        sb.append(", alias='");
        return ho7.l(sb, this.d, "'}");
    }
}
