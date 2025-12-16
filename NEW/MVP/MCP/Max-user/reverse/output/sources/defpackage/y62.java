package defpackage;

/* loaded from: classes.dex */
public final class y62 extends oof implements Comparable {
    public long u0;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y62 y62Var = (y62) obj;
        if (j(4) != y62Var.j(4)) {
            return j(4) ? 1 : -1;
        }
        long j = this.Y - y62Var.Y;
        if (j == 0) {
            j = this.u0 - y62Var.u0;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
