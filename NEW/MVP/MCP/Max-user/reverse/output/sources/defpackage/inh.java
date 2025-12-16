package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class inh {
    public static final hnh Companion = new hnh();
    public static final zy7[] h = {null, null, new os(rmf.a), null, null, null, null};
    public final String a;
    public final boolean b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public /* synthetic */ inh(int i, String str, boolean z, List list, boolean z2, boolean z3, boolean z4, String str2) {
        if (127 != (i & 127)) {
            g5j.c(i, 127, gnh.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inh)) {
            return false;
        }
        inh inhVar = (inh) obj;
        return fni.a(this.a, inhVar.a) && this.b == inhVar.b && fni.a(this.c, inhVar.c) && this.d == inhVar.d && this.e == inhVar.e && this.f == inhVar.f && fni.a(this.g, inhVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + a9h.b(a9h.b(a9h.b(xrf.l(this.c, a9h.b(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppBiometryInfoResponse(requestId=");
        sb.append(this.a);
        sb.append(", available=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", accessRequested=");
        sb.append(this.d);
        sb.append(", accessGranted=");
        az1.t(", tokenSaved=", ", deviceId=", sb, this.e, this.f);
        return ho7.l(sb, this.g, ")");
    }

    public inh(String str, List list, boolean z, boolean z2, boolean z3, String str2) {
        this.a = str;
        this.b = true;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str2;
    }
}
