package defpackage;

/* loaded from: classes2.dex */
public final class t18 implements u18 {
    public final String a;
    public final mc0 b;
    public final bwf c = new bwf(new fr7(3, this));

    public t18(mc0 mc0Var, String str) {
        this.a = str;
        this.b = mc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t18)) {
            return false;
        }
        t18 t18Var = (t18) obj;
        if (!this.a.equals(t18Var.a)) {
            return false;
        }
        mxa mxaVar = mxa.a;
        return mxaVar.equals(mxaVar) && this.b.equals(t18Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (((this.a.hashCode() * 31) - 1477604012) * 31);
    }

    public final String toString() {
        return "Media(iconUrl=" + this.a + ", shape=" + mxa.a + ", placeholder=" + this.b + ")";
    }
}
