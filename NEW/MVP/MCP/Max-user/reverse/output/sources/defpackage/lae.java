package defpackage;

/* loaded from: classes.dex */
public final class lae implements Comparable {
    public final long a;
    public final ze4 b;

    public lae(long j, ze4 ze4Var) {
        this.a = j;
        this.b = ze4Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((lae) obj).a);
    }
}
