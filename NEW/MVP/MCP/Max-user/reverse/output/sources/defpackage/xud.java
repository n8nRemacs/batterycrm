package defpackage;

/* loaded from: classes3.dex */
public final class xud {
    public final bh8 a;
    public volatile int f;
    public volatile int c = Integer.MAX_VALUE;
    public volatile int d = -1;
    public volatile int e = -1;
    public volatile int b = 500;
    public volatile int g = 25;

    public xud(bh8 bh8Var) {
        this.a = bh8Var;
    }

    public final int a() {
        return this.e == -1 ? this.b / 4 : this.e;
    }

    public final int b() {
        return this.d == -1 ? this.b : this.d;
    }
}
