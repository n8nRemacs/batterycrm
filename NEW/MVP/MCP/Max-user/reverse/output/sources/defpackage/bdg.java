package defpackage;

/* loaded from: classes2.dex */
public final class bdg {
    public final cdg a;

    public bdg(cdg cdgVar) {
        this.a = cdgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdg) && fni.a(this.a, ((bdg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TopbarStrokeSeparatorColors(default=" + this.a + ")";
    }
}
