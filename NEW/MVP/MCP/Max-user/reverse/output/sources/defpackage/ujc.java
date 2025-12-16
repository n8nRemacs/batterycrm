package defpackage;

/* loaded from: classes2.dex */
public final class ujc {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ujc(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static ujc a(ujc ujcVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            z = ujcVar.a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = ujcVar.b;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = ujcVar.c;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = ujcVar.d;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = ujcVar.e;
        }
        ujcVar.getClass();
        return new ujc(z6, z7, z8, z9, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujc)) {
            return false;
        }
        ujc ujcVar = (ujc) obj;
        return this.a == ujcVar.a && this.b == ujcVar.b && this.c == ujcVar.c && this.d == ujcVar.d && this.e == ujcVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + a9h.b(a9h.b(a9h.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = ho7.p("ProfileMemberPermissionsModel(changePhoto=", this.a, ", canAddMembers=", this.b, ", canPinMessage=");
        az1.t(", canCallInChat=", ", canSeePrivateChatLink=", sbP, this.c, this.d);
        return az1.k(sbP, this.e, ")");
    }
}
