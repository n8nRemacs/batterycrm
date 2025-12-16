package defpackage;

/* loaded from: classes2.dex */
public final class lbc implements mbc {
    public final r5g a;

    public lbc(r5g r5gVar) {
        this.a = r5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lbc) && this.a.equals(((lbc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Text(text=" + this.a + ")";
    }
}
