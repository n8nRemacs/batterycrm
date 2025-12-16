package defpackage;

/* loaded from: classes2.dex */
public final class thb implements Comparable {
    public final int a;
    public final j1i b;

    public thb(int i, j1i j1iVar) {
        this.a = i;
        this.b = j1iVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((thb) obj).a);
    }
}
