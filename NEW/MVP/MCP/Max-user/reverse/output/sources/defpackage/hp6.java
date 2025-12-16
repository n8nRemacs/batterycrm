package defpackage;

/* loaded from: classes2.dex */
public final class hp6 implements lp6 {
    public final int a;
    public final String b;
    public final vd8 c;

    public hp6(int i, String str, vd8 vd8Var) {
        this.a = i;
        this.b = str;
        this.c = vd8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp6)) {
            return false;
        }
        hp6 hp6Var = (hp6) obj;
        return this.a == hp6Var.a && fni.a(this.b, hp6Var.b) && fni.a(this.c, hp6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + u45.e(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "OpenFullScreenMedia(uiPosition=" + this.a + ", albumId=" + this.b + ", item=" + this.c + ")";
    }
}
