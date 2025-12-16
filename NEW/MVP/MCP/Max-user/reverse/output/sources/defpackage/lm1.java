package defpackage;

/* loaded from: classes.dex */
public final class lm1 extends en1 {
    public final String D;

    public lm1(String str) {
        this.D = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lm1) && fni.a(this.D, ((lm1) obj).D);
    }

    public final int hashCode() {
        return this.D.hashCode();
    }

    public final String toString() {
        return ho7.i("CopyCallLink(link=", this.D, ")");
    }
}
