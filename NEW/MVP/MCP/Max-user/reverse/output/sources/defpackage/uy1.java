package defpackage;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class uy1 implements uu1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez1 b;

    public /* synthetic */ uy1(ez1 ez1Var, int i) {
        this.a = i;
        this.b = ez1Var;
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        switch (this.a) {
            case 0:
                ez1 ez1Var = this.b;
                try {
                    ArrayList arrayList = new ArrayList(ez1Var.a.n().g().c);
                    arrayList.add((b22) ez1Var.H0.X);
                    arrayList.add(new xy1(ez1Var, tu1Var));
                    ez1Var.b.a.I(ez1Var.s0.a, ez1Var.c, oxi.a(arrayList));
                    return "configAndCloseTask";
                } catch (CameraAccessExceptionCompat | SecurityException e) {
                    ez1Var.t("Unable to open camera for configAndClose: " + e.getMessage(), e);
                    tu1Var.d(e);
                    return "configAndCloseTask";
                }
            default:
                ez1 ez1Var2 = this.b;
                try {
                    ez1Var2.c.execute(new my1(ez1Var2, 4, tu1Var));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    tu1Var.d(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
        }
    }
}
