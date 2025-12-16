package defpackage;

/* loaded from: classes.dex */
public final class jcg {
    public final p5g a;
    public final n5g b;

    public jcg(p5g p5gVar, n5g n5gVar) {
        this.a = p5gVar;
        this.b = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcg)) {
            return false;
        }
        jcg jcgVar = (jcg) obj;
        return this.a.equals(jcgVar.a) && this.b.equals(jcgVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.c) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TooltipState(title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
