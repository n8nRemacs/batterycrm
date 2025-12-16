package defpackage;

/* loaded from: classes.dex */
public abstract class e57 implements Comparable {
    public final x45 X;
    public final String Y;
    public final String Z;
    public final String a;
    public final c57 b;
    public final long c;
    public final int d;
    public final long o;
    public final long s0;
    public final long t0;
    public final boolean u0;

    public e57(String str, c57 c57Var, long j, int i, long j2, x45 x45Var, String str2, String str3, long j3, long j4, boolean z) {
        this.a = str;
        this.b = c57Var;
        this.c = j;
        this.d = i;
        this.o = j2;
        this.X = x45Var;
        this.Y = str2;
        this.Z = str3;
        this.s0 = j3;
        this.t0 = j4;
        this.u0 = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        long j = this.o;
        if (j > jLongValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
