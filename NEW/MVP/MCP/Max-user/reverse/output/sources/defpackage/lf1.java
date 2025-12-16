package defpackage;

/* loaded from: classes.dex */
public final class lf1 implements nf1 {
    public final String a;

    public lf1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lf1) && fni.a(this.a, ((lf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("Create(link=", this.a, ")");
    }
}
