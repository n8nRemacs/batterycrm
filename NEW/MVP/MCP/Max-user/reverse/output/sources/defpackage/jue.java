package defpackage;

/* loaded from: classes2.dex */
public final class jue {
    public final s5g a;
    public final String b;

    public jue(s5g s5gVar, String str) {
        this.a = s5gVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jue)) {
            return false;
        }
        jue jueVar = (jue) obj;
        return fni.a(this.a, jueVar.a) && fni.a(this.b, jueVar.b);
    }

    public final int hashCode() {
        s5g s5gVar = this.a;
        int iHashCode = (s5gVar == null ? 0 : s5gVar.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "QuoteContent(body=" + this.a + ", imageUri=" + this.b + ")";
    }
}
