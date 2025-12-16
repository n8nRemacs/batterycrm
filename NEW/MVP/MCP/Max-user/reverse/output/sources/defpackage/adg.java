package defpackage;

/* loaded from: classes2.dex */
public final class adg {
    public final bdg a;

    public adg(bdg bdgVar) {
        this.a = bdgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof adg) && fni.a(this.a, ((adg) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "TopbarStrokeColors(separator=" + this.a + ")";
    }
}
