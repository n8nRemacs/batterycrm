package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class xz1 implements yu, uu1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yz1 b;

    public /* synthetic */ xz1(yz1 yz1Var, int i) {
        this.a = i;
        this.b = yz1Var;
    }

    @Override // defpackage.yu
    public ha8 apply(Object obj) {
        switch (this.a) {
            case 0:
                return this.b.a.h.c(true);
            case 1:
                return ixi.a(new xz1(this.b, 4));
            case 2:
                c86 c86Var = this.b.a.h;
                c86Var.getClass();
                return ixi.a(new wo4(26, c86Var));
            default:
                long j = yz1.f;
                yz1 yz1Var = this.b;
                ScheduledExecutorService scheduledExecutorService = yz1Var.c;
                ry1 ry1Var = yz1Var.a;
                uy0 uy0Var = new uy0(23);
                long millis = TimeUnit.NANOSECONDS.toMillis(j);
                vz1 vz1Var = new vz1(uy0Var);
                ry1Var.p(vz1Var);
                my1 my1Var = new my1(ry1Var, 6, vz1Var);
                qee qeeVar = ry1Var.c;
                wu1 wu1Var = vz1Var.b;
                wu1Var.b.d(my1Var, qeeVar);
                return ixi.a(new pv3(wu1Var, scheduledExecutorService, millis, 3));
        }
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        yz1 yz1Var = this.b;
        if (!yz1Var.e.r()) {
            tu1Var.b(null);
            return "EnableTorchInternal";
        }
        gri.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
        yz1Var.a.r(true);
        tu1Var.b(null);
        return "EnableTorchInternal";
    }
}
