package defpackage;

/* loaded from: classes.dex */
public final class wd0 {
    public final mc0 a;
    public final String b;

    public wd0(mc0 mc0Var, String str) {
        this.a = mc0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd0)) {
            return false;
        }
        wd0 wd0Var = (wd0) obj;
        return fni.a(this.a, wd0Var.a) && fni.a(this.b, wd0Var.b);
    }

    public final int hashCode() {
        mc0 mc0Var = this.a;
        int iHashCode = (mc0Var == null ? 0 : mc0Var.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AvatarInfo(abbreviationModel=" + this.a + ", url=" + this.b + ")";
    }
}
