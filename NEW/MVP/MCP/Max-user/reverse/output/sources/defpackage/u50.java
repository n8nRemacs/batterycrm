package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import ru.ok.android.externcalls.sdk.AudioSampleEnergyCalculator;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class u50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u50(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                yl5 yl5Var = (yl5) ((xo8) obj).c;
                String str = zxg.a;
                nj4 nj4Var = yl5Var.a.D0;
                id idVarH = nj4Var.H();
                nj4Var.I(idVarH, 1010, new ny1(idVarH, j, 3));
                break;
            case 1:
                ((AudioSampleEnergyCalculator) obj).lambda$onSample$0(j);
                break;
            case 2:
                ((vb4) obj).c.a(j);
                break;
            case 3:
                pl0 pl0Var = ((bd4) obj).Z;
                if (pl0Var != null) {
                    pl0Var.a(j);
                    break;
                }
                break;
            case 4:
                ((FeedbackListenerManagerImpl) obj).tryToRemoveOld(j);
                break;
            case 5:
                a37 a37Var = ((MessagesListWidget) obj).y0;
                x27 x27Var = a37Var.d;
                a37Var.a(new x27(j, (x27Var == null || x27Var.a != j) ? null : x27Var.b));
                break;
            default:
                ((wgb) obj).d.a(j);
                break;
        }
    }
}
