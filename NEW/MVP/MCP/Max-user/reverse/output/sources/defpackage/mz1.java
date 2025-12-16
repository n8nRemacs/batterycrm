package defpackage;

import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes.dex */
public final class mz1 implements tz1 {
    public final ry1 a;
    public final cs0 b;
    public final int c;
    public boolean d = false;

    public mz1(ry1 ry1Var, int i, cs0 cs0Var) {
        this.a = ry1Var;
        this.c = i;
        this.b = cs0Var;
    }

    @Override // defpackage.tz1
    public final ha8 a(TotalCaptureResult totalCaptureResult) {
        if (!w30.h(this.c, totalCaptureResult)) {
            return wsf.f(Boolean.FALSE);
        }
        gri.a("Camera2CapturePipeline", "Trigger AE");
        this.d = true;
        sn6 sn6VarA = sn6.a(ixi.a(new xtd(23, this)));
        lz1 lz1Var = new lz1(0);
        ex4 ex4VarA = ayi.a();
        sn6VarA.getClass();
        return wsf.l(sn6VarA, new usd(19, lz1Var), ex4VarA);
    }

    @Override // defpackage.tz1
    public final boolean b() {
        return this.c == 0;
    }

    @Override // defpackage.tz1
    public final void c() {
        if (this.d) {
            gri.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
            this.a.h.a(false, true);
            this.b.b = false;
        }
    }
}
