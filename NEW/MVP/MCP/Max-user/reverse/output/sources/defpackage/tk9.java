package defpackage;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class tk9 {
    public final long a;
    public final long b;
    public final Layout c;
    public final qk9 d;
    public final lk9 e;
    public final boolean f;

    public tk9(long j, long j2, Layout layout, qk9 qk9Var, lk9 lk9Var, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = layout;
        this.d = qk9Var;
        this.e = lk9Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk9)) {
            return false;
        }
        tk9 tk9Var = (tk9) obj;
        return this.a == tk9Var.a && this.b == tk9Var.b && fni.a(this.c, tk9Var.c) && fni.a(this.d, tk9Var.d) && fni.a(this.e, tk9Var.e) && this.f == tk9Var.f;
    }

    public final int hashCode() {
        int iA = a9h.a(Long.hashCode(this.a) * 31, 31, this.b);
        Layout layout = this.c;
        int iHashCode = (iA + (layout == null ? 0 : layout.hashCode())) * 31;
        qk9 qk9Var = this.d;
        int iHashCode2 = (iHashCode + (qk9Var == null ? 0 : qk9Var.hashCode())) * 31;
        lk9 lk9Var = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (lk9Var != null ? lk9Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "MessageLink(messageId=", ", messageLinkId=");
        sbL.append(this.b);
        sbL.append(", senderLayout=");
        sbL.append(this.c);
        sbL.append(", replyModel=");
        sbL.append(this.d);
        sbL.append(", forwardModel=");
        sbL.append(this.e);
        return vb9.f(sbL, ", isFloating=", this.f, ")");
    }
}
