package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class l97 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ py4 d;

    public /* synthetic */ l97(py4 py4Var, float f, long j, int i) {
        this.a = i;
        this.d = py4Var;
        this.b = f;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        py4 py4Var = this.d;
        switch (i) {
            case 0:
                m97 m97Var = (m97) py4Var;
                if (!m97Var.X.get()) {
                    long jNanoTime = System.nanoTime();
                    long j = m97Var.Y;
                    float f = this.b;
                    if (j == 0 || Math.abs(jNanoTime - j) > 1000000000) {
                        m97Var.Y = jNanoTime;
                        wqi.c("n97", "onFileUploadProgress: progress=%f, total %d", Float.valueOf(f), Long.valueOf(this.c));
                    }
                    m97Var.o.f(new j97(f, false));
                    break;
                }
                break;
            default:
                ea7 ea7Var = (ea7) py4Var;
                if (!ea7Var.Z.get()) {
                    long jNanoTime2 = System.nanoTime();
                    long j2 = ea7Var.s0;
                    float f2 = this.b;
                    long j3 = this.c;
                    if (j2 == 0 || Math.abs(jNanoTime2 - j2) > 1000000000) {
                        ea7Var.s0 = jNanoTime2;
                        wqi.c("fa7", "onFileUploadProgress: progress=%f, total %d", Float.valueOf(f2), Long.valueOf(j3));
                    }
                    ea7Var.Y.f(new da7(false, null, f2, j3));
                    break;
                }
                break;
        }
    }
}
