package defpackage;

/* loaded from: classes.dex */
public final class txg {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final vch d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final vch h;

    public txg(long j, boolean z, boolean z2, vch vchVar, boolean z3, boolean z4, boolean z5, vch vchVar2) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = vchVar;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = vchVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txg)) {
            return false;
        }
        txg txgVar = (txg) obj;
        return this.a == txgVar.a && this.b == txgVar.b && this.c == txgVar.c && fni.a(this.d, txgVar.d) && this.e == txgVar.e && this.f == txgVar.f && this.g == txgVar.g && fni.a(this.h, txgVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + a9h.b(a9h.b(a9h.b((this.d.hashCode() + a9h.b(a9h.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbJ = xc0.j(this.a, "UserVideoState(id=", ", isMe=", this.b);
        sbJ.append(", isVideoEnabled=");
        sbJ.append(this.c);
        sbJ.append(", videoState=");
        sbJ.append(this.d);
        hf3.f(", isConnected=", ", isAccepted=", sbJ, this.e, this.f);
        sbJ.append(", isScreenCaptureEnabled=");
        sbJ.append(this.g);
        sbJ.append(", screenCaptureState=");
        sbJ.append(this.h);
        sbJ.append(")");
        return sbJ.toString();
    }
}
