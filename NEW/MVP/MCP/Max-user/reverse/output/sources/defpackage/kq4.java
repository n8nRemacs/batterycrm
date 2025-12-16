package defpackage;

/* loaded from: classes.dex */
public final class kq4 implements Comparable {
    public final boolean a;
    public final boolean b;

    public kq4(int i, hf6 hf6Var) {
        this.a = (hf6Var.e & 1) != 0;
        this.b = tk0.k(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        kq4 kq4Var = (kq4) obj;
        return cj3.a.d(this.b, kq4Var.b).d(this.a, kq4Var.a).f();
    }
}
