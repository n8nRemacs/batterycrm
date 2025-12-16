package defpackage;

/* loaded from: classes.dex */
public final class gc4 extends hc4 {
    @Override // defpackage.hc4
    public final void c(StringBuilder sb) {
        sb.append('(');
        sb.append(this.a);
    }

    @Override // defpackage.hc4
    public final void d(StringBuilder sb) {
        sb.append(this.a);
        sb.append(']');
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Comparable, java.lang.Object] */
    @Override // defpackage.hc4
    public final boolean g(Comparable comparable) {
        int i = o7d.c;
        return this.a.compareTo(comparable) < 0;
    }

    @Override // defpackage.hc4
    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return "/" + this.a + "\\";
    }
}
