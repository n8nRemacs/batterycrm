package defpackage;

/* loaded from: classes2.dex */
public final class lz {
    public static final lz d = new lz(mz.a, null, null);
    public final long a;
    public final m00 b;
    public final yl7 c;

    public lz(long j, m00 m00Var, yl7 yl7Var) {
        this.a = j;
        this.b = m00Var;
        this.c = yl7Var;
    }

    public final boolean a() {
        int i = mz.b;
        return (4 & this.a) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz)) {
            return false;
        }
        lz lzVar = (lz) obj;
        long j = lzVar.a;
        int i = mz.b;
        return this.a == j && fni.a(this.b, lzVar.b) && fni.a(this.c, lzVar.c);
    }

    public final int hashCode() {
        int i = mz.b;
        int iHashCode = Long.hashCode(this.a) * 31;
        m00 m00Var = this.b;
        int iHashCode2 = (iHashCode + (m00Var == null ? 0 : m00Var.hashCode())) * 31;
        yl7 yl7Var = this.c;
        return iHashCode2 + (yl7Var != null ? yl7Var.hashCode() : 0);
    }

    public final String toString() {
        int i = mz.b;
        return "AttachInfo(flags=" + a9h.d(this.a, "AttachInfoFlags(rawValue=", ")") + ", attachModel=" + this.b + ", inlineKeyboard=" + this.c + ")";
    }
}
