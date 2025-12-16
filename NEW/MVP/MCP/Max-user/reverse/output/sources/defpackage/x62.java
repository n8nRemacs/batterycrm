package defpackage;

/* loaded from: classes.dex */
public final class x62 extends nof implements Comparable {
    public long t0;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x62 x62Var = (x62) obj;
        if (j(4) != x62Var.j(4)) {
            return j(4) ? 1 : -1;
        }
        long j = this.X - x62Var.X;
        if (j == 0) {
            j = this.t0 - x62Var.t0;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
