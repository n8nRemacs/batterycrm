package defpackage;

/* loaded from: classes.dex */
public final class ct3 {
    public final float a;
    public final double b;
    public final int c;
    public final long d;
    public int e;

    public ct3(int i, long j, float f) {
        hsi.b(j > 0);
        hsi.b(f > 0.0f);
        hsi.b(0 < j);
        this.d = j;
        this.a = f;
        this.c = Math.max(Math.round((j / 1000000.0f) * f), 1);
        this.b = 1000000.0f / f;
    }

    public final ct3 a() {
        return new ct3(0, this.d, this.a);
    }

    public final boolean b() {
        return this.e < this.c;
    }
}
