package defpackage;

/* loaded from: classes2.dex */
public final class xoe extends ape {
    public final String a;
    public final n5g b;

    public xoe(String str, n5g n5gVar) {
        this.a = str;
        this.b = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoe)) {
            return false;
        }
        xoe xoeVar = (xoe) obj;
        return fni.a(this.a, xoeVar.a) && this.b.equals(xoeVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.c) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CopyToClipboard(textToCopy=" + this.a + ", snackbarTitle=" + this.b + ")";
    }
}
