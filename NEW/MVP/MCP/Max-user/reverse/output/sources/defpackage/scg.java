package defpackage;

/* loaded from: classes.dex */
public final class scg {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final jcg f;

    public scg(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, jcg jcgVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = jcgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scg)) {
            return false;
        }
        scg scgVar = (scg) obj;
        return this.a == scgVar.a && this.b == scgVar.b && this.c == scgVar.c && this.d == scgVar.d && this.e == scgVar.e && fni.a(this.f, scgVar.f);
    }

    public final int hashCode() {
        int iB = a9h.b(a9h.b(a9h.b(a9h.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        jcg jcgVar = this.f;
        return iB + (jcgVar == null ? 0 : jcgVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbP = ho7.p("TopPanelState(isGroupCall=", this.a, ", shouldShowTitleAndStatus=", this.b, ", isRecordEnabled=");
        az1.t(", isMenuButtonVisible=", ", isAddUserEnabled=", sbP, this.c, this.d);
        sbP.append(this.e);
        sbP.append(", recordStateTooltip=");
        sbP.append(this.f);
        sbP.append(")");
        return sbP.toString();
    }
}
