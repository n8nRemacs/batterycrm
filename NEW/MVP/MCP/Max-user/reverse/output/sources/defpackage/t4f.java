package defpackage;

/* loaded from: classes.dex */
public final class t4f implements Comparable {
    public final long a;
    public final double b;

    public t4f(long j, double d) {
        this.a = j;
        this.b = d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((t4f) obj).a);
    }
}
