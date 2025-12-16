package defpackage;

/* loaded from: classes.dex */
public final class qd1 extends ud1 {
    public final CharSequence a;
    public final String b;

    public qd1(String str, CharSequence charSequence) {
        this.a = charSequence;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd1)) {
            return false;
        }
        qd1 qd1Var = (qd1) obj;
        return fni.a(this.a, qd1Var.a) && fni.a(this.b, qd1Var.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Name(name=" + ((Object) this.a) + ", accessibility=" + this.b + ")";
    }
}
