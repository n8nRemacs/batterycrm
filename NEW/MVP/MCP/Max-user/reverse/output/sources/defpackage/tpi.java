package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class tpi extends u1a implements ni0 {
    public final boolean X;

    public tpi(oi0 oi0Var, fyi fyiVar, Executor executor, fcj fcjVar) {
        super(fyiVar, executor);
        boolean zC = zei.c();
        this.X = zC;
        hk4 hk4Var = new hk4();
        hk4Var.b = zei.a(oi0Var);
        h7j h7jVar = new h7j(hk4Var);
        ra3 ra3Var = new ra3();
        ra3Var.c = zC ? t6j.TYPE_THICK : t6j.TYPE_THIN;
        ra3Var.d = h7jVar;
        spi.a.execute(new b6i(9, fcjVar, new lk6(ra3Var, 1), v6j.ON_DEVICE_BARCODE_CREATE, fcjVar.c(), false));
    }

    @Override // defpackage.u1a, java.io.Closeable, java.lang.AutoCloseable, defpackage.ni0
    public final synchronized void close() {
        super.close();
    }

    @Override // defpackage.bjb
    public final qt5[] l() {
        return this.X ? cjb.a : new qt5[]{cjb.b};
    }
}
