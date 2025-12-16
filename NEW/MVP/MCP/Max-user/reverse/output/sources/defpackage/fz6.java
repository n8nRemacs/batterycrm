package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class fz6 implements Serializable {
    public final String X;
    public final boolean Y;
    public final boolean Z;
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String o;
    public final int s0;
    public final gz6 t0;

    public fz6(long j, boolean z, boolean z2, boolean z3, String str, String str2, boolean z4, boolean z5, int i, gz6 gz6Var) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.o = str;
        this.X = str2;
        this.Y = z4;
        this.Z = z5;
        this.s0 = i;
        this.t0 = gz6Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fz6 a(defpackage.tm9 r23) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz6.a(tm9):fz6");
    }

    public final String toString() {
        String str;
        int i = this.s0;
        if (i == 1) {
            str = "DISABLED";
        } else if (i == 2) {
            str = "MEMBERS";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "ALL";
        }
        String string = this.t0.toString();
        StringBuilder sbJ = xc0.j(this.a, "{groupId=", ", isAnswered=", this.b);
        hf3.f(", isModerator=", ", isImportant=", sbJ, this.c, this.d);
        ho7.r(sbJ, ", name=", this.o, ", baseIconUrl=", this.X);
        hf3.f(", isCustomTitle=", ", isMember=", sbJ, this.Y, this.Z);
        ho7.r(sbJ, ", messagingPermissions=", str, ", groupOptions=", string);
        sbJ.append("}");
        return sbJ.toString();
    }
}
