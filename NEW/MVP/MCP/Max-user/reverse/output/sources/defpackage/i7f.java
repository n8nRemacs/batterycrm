package defpackage;

/* loaded from: classes2.dex */
public final class i7f implements Comparable {
    public final int a;
    public final int b;

    public i7f(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((i7f) obj).a;
    }
}
