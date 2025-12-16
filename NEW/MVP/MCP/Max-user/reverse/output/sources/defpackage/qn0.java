package defpackage;

/* loaded from: classes.dex */
public abstract class qn0 {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public Object e;

    public qn0(ln0 ln0Var, on0 on0Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.d = on0Var;
        this.b = i;
        this.c = new in0(ln0Var, j, j2, j3, j4, j5);
    }

    public static int c(hp5 hp5Var, long j, n7 n7Var) {
        if (j == hp5Var.getPosition()) {
            return 0;
        }
        n7Var.a = j;
        return 1;
    }

    public static int d(ip5 ip5Var, long j, n7 n7Var) {
        if (j == ip5Var.getPosition()) {
            return 0;
        }
        n7Var.a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        return c(r28, r9, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(defpackage.hp5 r28, defpackage.n7 r29) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn0.a(hp5, n7):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        return d(r28, r9, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(defpackage.ip5 r28, defpackage.n7 r29) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn0.b(ip5, n7):int");
    }

    public final void e(long j) {
        switch (this.a) {
            case 0:
                kn0 kn0Var = (kn0) this.e;
                if (kn0Var == null || kn0Var.a != j) {
                    in0 in0Var = (in0) this.c;
                    this.e = new kn0(j, in0Var.a.a(j), in0Var.c, in0Var.d, in0Var.e, in0Var.f, 0);
                    break;
                }
                break;
            default:
                kn0 kn0Var2 = (kn0) this.e;
                if (kn0Var2 == null || kn0Var2.a != j) {
                    jn0 jn0Var = (jn0) this.c;
                    this.e = new kn0(j, jn0Var.a.a(j), jn0Var.c, jn0Var.d, jn0Var.o, jn0Var.X, 1);
                    break;
                }
                break;
        }
    }

    public qn0(mn0 mn0Var, pn0 pn0Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.d = pn0Var;
        this.b = i;
        this.c = new jn0(mn0Var, j, j2, j3, j4, j5);
    }
}
