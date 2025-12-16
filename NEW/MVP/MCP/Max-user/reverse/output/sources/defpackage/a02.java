package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a02 implements tz1 {
    public static final long g = TimeUnit.SECONDS.toNanos(2);
    public static final /* synthetic */ int h = 0;
    public final ry1 a;
    public final int b;
    public boolean c = false;
    public final Executor d;
    public final ScheduledExecutorService e;
    public final boolean f;

    public a02(ry1 ry1Var, int i, qee qeeVar, a07 a07Var, boolean z) {
        this.a = ry1Var;
        this.b = i;
        this.d = qeeVar;
        this.e = a07Var;
        this.f = z;
    }

    @Override // defpackage.tz1
    public final ha8 a(TotalCaptureResult totalCaptureResult) {
        gri.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + w30.h(this.b, totalCaptureResult));
        if (w30.h(this.b, totalCaptureResult)) {
            if (!this.a.r) {
                gri.a("Camera2CapturePipeline", "Turn on torch");
                this.c = true;
                sn6 sn6VarA = sn6.a(ixi.a(new zz1(this, 0)));
                zz1 zz1Var = new zz1(this, 1);
                Executor executor = this.d;
                sn6VarA.getClass();
                return wsf.l(wsf.l(wsf.l(sn6VarA, zz1Var, executor), new zz1(this, 2), this.d), new usd(19, new lz1(4)), ayi.a());
            }
            gri.a("Camera2CapturePipeline", "Torch already on, not turn on");
        }
        return wsf.f(Boolean.FALSE);
    }

    @Override // defpackage.tz1
    public final boolean b() {
        return this.b == 0;
    }

    @Override // defpackage.tz1
    public final void c() {
        if (this.c) {
            ry1 ry1Var = this.a;
            ry1Var.j.a(null, false);
            gri.a("Camera2CapturePipeline", "Turning off torch");
            if (this.f) {
                ry1Var.h.a(false, true);
            }
        }
    }
}
