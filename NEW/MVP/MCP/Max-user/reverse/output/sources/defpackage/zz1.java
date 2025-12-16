package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class zz1 implements uu1, yu {
    public final /* synthetic */ int a;
    public final /* synthetic */ a02 b;

    public /* synthetic */ zz1(a02 a02Var, int i) {
        this.a = i;
        this.b = a02Var;
    }

    @Override // defpackage.yu
    public ha8 apply(Object obj) {
        switch (this.a) {
            case 1:
                a02 a02Var = this.b;
                if (!a02Var.f) {
                    return ag7.c;
                }
                c86 c86Var = a02Var.a.h;
                c86Var.getClass();
                return ixi.a(new wo4(26, c86Var));
            default:
                long j = a02.g;
                a02 a02Var2 = this.b;
                ScheduledExecutorService scheduledExecutorService = a02Var2.e;
                ry1 ry1Var = a02Var2.a;
                uy0 uy0Var = new uy0(24);
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
        this.b.a.j.a(tu1Var, true);
        return "TorchOn";
    }
}
