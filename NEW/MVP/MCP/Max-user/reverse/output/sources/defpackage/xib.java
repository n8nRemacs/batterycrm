package defpackage;

/* loaded from: classes.dex */
public final class xib {
    public final wd0 a;
    public final String b;
    public final zi1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final txg g;
    public final uxg h;
    public final boolean i;
    public final CharSequence j;

    public xib(wd0 wd0Var, String str, zi1 zi1Var, boolean z, boolean z2, boolean z3, txg txgVar, uxg uxgVar, boolean z4, CharSequence charSequence) {
        this.a = wd0Var;
        this.b = str;
        this.c = zi1Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = txgVar;
        this.h = uxgVar;
        this.i = z4;
        this.j = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xib)) {
            return false;
        }
        xib xibVar = (xib) obj;
        return fni.a(this.a, xibVar.a) && fni.a(this.b, xibVar.b) && fni.a(this.c, xibVar.c) && this.d == xibVar.d && this.e == xibVar.e && this.f == xibVar.f && fni.a(this.g, xibVar.g) && this.h == xibVar.h && this.i == xibVar.i && fni.a(this.j, xibVar.j);
    }

    public final int hashCode() {
        wd0 wd0Var = this.a;
        int iHashCode = (wd0Var == null ? 0 : wd0Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        zi1 zi1Var = this.c;
        int iB = a9h.b(a9h.b(a9h.b((iHashCode2 + (zi1Var == null ? 0 : zi1Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        txg txgVar = this.g;
        int iB2 = a9h.b((this.h.hashCode() + ((iB + (txgVar == null ? 0 : txgVar.hashCode())) * 31)) * 31, 31, this.i);
        CharSequence charSequence = this.j;
        return iB2 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpponentPipState(avatar=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", isTalking=");
        sb.append(this.d);
        sb.append(", isMicrophoneEnabled=");
        az1.t(", isConnecting=", ", videoState=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", action=");
        sb.append(this.h);
        sb.append(", isMe=");
        sb.append(this.i);
        sb.append(", userNameWithState=");
        sb.append((Object) this.j);
        sb.append(")");
        return sb.toString();
    }
}
