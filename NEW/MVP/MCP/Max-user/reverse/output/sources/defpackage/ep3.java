package defpackage;

/* loaded from: classes2.dex */
public final class ep3 extends id0 {
    public final ei4 b;

    public ep3(ei4 ei4Var) {
        super(7);
        this.b = ei4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep3) && fni.a(this.b, ((ep3) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "TwoFACheckPassword(twoFALink=" + this.b + ")";
    }
}
