package defpackage;

/* loaded from: classes.dex */
public final class iqg {
    public final CharSequence a;
    public final CharSequence b;
    public final d51 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public iqg(CharSequence charSequence, String str, d51 d51Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = charSequence;
        this.b = str;
        this.c = d51Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqg)) {
            return false;
        }
        iqg iqgVar = (iqg) obj;
        return fni.a(this.a, iqgVar.a) && fni.a(this.b, iqgVar.b) && fni.a(this.c, iqgVar.c) && this.d == iqgVar.d && this.e == iqgVar.e && this.f == iqgVar.f && this.g == iqgVar.g;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        d51 d51Var = this.c;
        return Boolean.hashCode(this.g) + a9h.b(a9h.b(a9h.b((iHashCode2 + (d51Var != null ? d51Var.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnavailableCallState(callDescription=");
        sb.append((Object) this.a);
        sb.append(", callStateStatus=");
        sb.append((Object) this.b);
        sb.append(", chatInfo=");
        sb.append(this.c);
        sb.append(", isCallBackAvailable=");
        sb.append(this.d);
        sb.append(", isVideoCall=");
        az1.t(", isBlockedLabelVisible=", ", isSendMessageAvailable=", sb, this.e, this.f);
        return az1.k(sb, this.g, ")");
    }
}
