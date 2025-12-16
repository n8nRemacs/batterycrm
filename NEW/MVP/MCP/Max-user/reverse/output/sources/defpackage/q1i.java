package defpackage;

/* loaded from: classes.dex */
public final class q1i implements Comparable {
    public final int a;
    public final i1i b;

    public q1i(int i, i1i i1iVar) {
        this.a = i;
        this.b = i1iVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((q1i) obj).a);
    }
}
