package defpackage;

/* loaded from: classes2.dex */
public final class zjg implements bkg {
    public final String a;
    public final up7 b;

    public zjg(String str, up7 up7Var) {
        this.a = str;
        this.b = up7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjg)) {
            return false;
        }
        zjg zjgVar = (zjg) obj;
        return fni.a(this.a, zjgVar.a) && fni.a(this.b, zjgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GoToRestore(trackId=" + this.a + ", navData=" + this.b + ")";
    }
}
