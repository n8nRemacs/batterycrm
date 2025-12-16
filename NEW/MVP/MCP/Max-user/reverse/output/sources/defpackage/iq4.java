package defpackage;

/* loaded from: classes.dex */
public final class iq4 extends wq4 implements Comparable {
    public final int X;
    public final int o;

    public iq4(int i, lfg lfgVar, int i2, nq4 nq4Var, int i3) {
        super(i, lfgVar, i2);
        this.o = tk0.k(i3, nq4Var.t0) ? 1 : 0;
        this.X = this.d.b();
    }

    @Override // defpackage.wq4
    public final int a() {
        return this.o;
    }

    @Override // defpackage.wq4
    public final /* bridge */ /* synthetic */ boolean c(wq4 wq4Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.X, ((iq4) obj).X);
    }
}
