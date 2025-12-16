package defpackage;

/* loaded from: classes2.dex */
public final class q4g {
    public final t5g a;
    public final int b;

    public q4g(t5g t5gVar, int i) {
        this.a = t5gVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4g)) {
            return false;
        }
        q4g q4gVar = (q4g) obj;
        return fni.a(this.a, q4gVar.a) && this.b == q4gVar.b;
    }

    public final int hashCode() {
        return t75.b.hashCode() + xrf.k(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TextPaintCacheKey(textStyle=" + this.a + ", textColor=" + this.b + ", dynamicFont=" + t75.b + ")";
    }
}
