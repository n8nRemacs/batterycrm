package defpackage;

/* loaded from: classes2.dex */
public final class a7g {
    public final wuf a;

    public a7g(wuf wufVar) {
        this.a = wufVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7g) && fni.a(this.a, ((a7g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SvgPattern(svgPattern=" + this.a + ")";
    }
}
