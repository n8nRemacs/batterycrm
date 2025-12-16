package defpackage;

/* loaded from: classes2.dex */
public final class crh {
    public static final brh Companion = new brh();
    public static final zy7[] d = {null, nh7.Companion.serializer(), null};
    public final String a;
    public final nh7 b;
    public final boolean c;

    public /* synthetic */ crh(int i, String str, nh7 nh7Var, boolean z) {
        if (7 != (i & 7)) {
            g5j.c(i, 7, arh.a.d());
            throw null;
        }
        this.a = str;
        this.b = nh7Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crh)) {
            return false;
        }
        crh crhVar = (crh) obj;
        return fni.a(this.a, crhVar.a) && this.b == crhVar.b && this.c == crhVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppHapticFeedbackImpact(requestId=");
        sb.append(this.a);
        sb.append(", impactStyle=");
        sb.append(this.b);
        sb.append(", disableVibrationFallback=");
        return az1.k(sb, this.c, ")");
    }
}
