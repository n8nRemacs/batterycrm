package defpackage;

/* loaded from: classes.dex */
public final class r1i implements Comparable {
    public final int a;
    public final j1i b;

    public r1i(int i, j1i j1iVar) {
        this.a = i;
        this.b = j1iVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((r1i) obj).a);
    }
}
