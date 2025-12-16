package defpackage;

/* loaded from: classes2.dex */
public final class ma3 {
    public final k18 a;
    public final k18 b;

    public ma3(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public final void a(long j, long j2) {
        wqi.c("ma3", "clearChat id=%d, time=%d", Long.valueOf(j), Long.valueOf(j2));
        ((ve2) this.a.getValue()).y(j, j2);
        ((y7b) this.b.getValue()).d(j);
    }
}
