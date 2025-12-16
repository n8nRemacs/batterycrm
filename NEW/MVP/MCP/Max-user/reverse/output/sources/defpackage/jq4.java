package defpackage;

/* loaded from: classes.dex */
public final class jq4 implements Comparable {
    public final boolean a;
    public final boolean b;

    public jq4(gf6 gf6Var, int i) {
        this.a = (gf6Var.d & 1) != 0;
        this.b = zq4.c(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        jq4 jq4Var = (jq4) obj;
        return cj3.a.d(this.b, jq4Var.b).d(this.a, jq4Var.a).f();
    }
}
