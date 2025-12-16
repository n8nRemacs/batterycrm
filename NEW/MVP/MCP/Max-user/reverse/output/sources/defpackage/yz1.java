package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class yz1 implements tz1 {
    public static final long f = TimeUnit.SECONDS.toNanos(2);
    public static final /* synthetic */ int g = 0;
    public final ry1 a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final de7 d;
    public final w7c e;

    public yz1(ry1 ry1Var, qee qeeVar, a07 a07Var, w7c w7cVar) {
        this.a = ry1Var;
        this.b = qeeVar;
        this.c = a07Var;
        this.e = w7cVar;
        de7 de7Var = ry1Var.q;
        Objects.requireNonNull(de7Var);
        this.d = de7Var;
    }

    @Override // defpackage.tz1
    public final ha8 a(TotalCaptureResult totalCaptureResult) {
        gri.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
        AtomicReference atomicReference = new AtomicReference();
        wu1 wu1VarA = ixi.a(new tu0(atomicReference, 1));
        sn6 sn6VarA = sn6.a(ixi.a(new i00(this, 9, atomicReference)));
        xz1 xz1Var = new xz1(this, 0);
        sn6VarA.getClass();
        Executor executor = this.b;
        q72 q72VarL = wsf.l(wsf.l(wsf.l(wsf.l(wsf.l(sn6VarA, xz1Var, executor), new xz1(this, 1), executor), new i00(this, 10, wu1VarA), executor), new xz1(this, 2), executor), new xz1(this, 3), executor);
        lz1 lz1Var = new lz1(3);
        return wsf.l(q72VarL, new usd(19, lz1Var), ayi.a());
    }

    @Override // defpackage.tz1
    public final boolean b() {
        return false;
    }

    @Override // defpackage.tz1
    public final void c() {
        ry1 ry1Var = this.a;
        c86 c86Var = ry1Var.h;
        gri.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
        if (this.e.r()) {
            ry1Var.r(false);
        }
        c86Var.c(false).d(new mc(7), this.b);
        c86Var.a(false, true);
        a07 a07VarD = ayi.d();
        de7 de7Var = this.d;
        Objects.requireNonNull(de7Var);
        a07VarD.execute(new vy1(4, de7Var));
    }
}
