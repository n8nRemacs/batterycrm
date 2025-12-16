package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class zad implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k18 b;

    public /* synthetic */ zad(k18 k18Var, int i) {
        this.a = i;
        this.b = k18Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        k18 k18Var = this.b;
        switch (i) {
            case 0:
                return ((n0g) ((m0g) k18Var.getValue())).a();
            case 1:
                return (ScheduledExecutorService) ((g4b) k18Var.getValue()).m.getValue();
            case 2:
                return (ScheduledExecutorService) ((g4b) k18Var.getValue()).m.getValue();
            case 3:
                g4b g4bVar = (g4b) k18Var.getValue();
                return g4bVar.h(g4bVar.f(1, "ONEME_FB_BLOCK", Runtime.getRuntime().availableProcessors(), 1, true), "ONEME_FB_BLOCK");
            case 4:
                return (ScheduledExecutorService) ((g4b) k18Var.getValue()).o.getValue();
            case 5:
                return new rj5((ScheduledExecutorService) ((g4b) k18Var.getValue()).o.getValue(), true);
            case 6:
                g4b g4bVar2 = (g4b) k18Var.getValue();
                jj5 jj5Var = g4bVar2.j;
                yy7 yy7Var = g4b.q[3];
                ExecutorService executorServiceE = g4bVar2.e(jj5Var);
                j3f j3fVar = u0e.a;
                return new rj5(executorServiceE, false);
            case 7:
                return new rj5((ScheduledExecutorService) ((g4b) k18Var.getValue()).m.getValue(), true);
            case 8:
                return new rj5((ScheduledExecutorService) ((g4b) k18Var.getValue()).n.getValue(), true);
            case 9:
                g4b g4bVar3 = (g4b) k18Var.getValue();
                return new rj5(g4bVar3.h(g4bVar3.f(0, "upload", 2, 5, true), "upload"), true);
            case 10:
                g4b g4bVar4 = (g4b) k18Var.getValue();
                return new rj5(g4bVar4.h(g4bVar4.f(0, "media-transform", 2, 5, false), "media-transform"), true);
            case 11:
                g4b g4bVar5 = (g4b) k18Var.getValue();
                return g4bVar5.i(g4bVar5.b().a("srvc-rqst", true), "srvc-rqst");
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((g4b) k18Var.getValue()).g();
            default:
                w5 w5Var = ((dlh) k18Var.getValue()).a;
                return new rqh(w5Var.d(49), w5Var.d(8));
        }
    }
}
