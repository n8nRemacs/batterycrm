package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* loaded from: classes.dex */
public abstract class azi {
    public static final void a(BottomSheetWidget bottomSheetWidget, String str, sm6 sm6Var) {
        sm6Var.invoke(new d53(new d53(((s78) bqe.a.getAccessor().d(140).getValue()).f(str), 29), 12), new k(29, bottomSheetWidget));
    }

    public static void b(vqa vqaVar, gu3 gu3Var, gu3 gu3Var2, p6 p6Var) {
        v08 v08Var = new v08(gu3Var, gu3Var2, p6Var);
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        jk3 jk3Var = new jk3(1, linkedBlockingQueue);
        v08Var.c(jk3Var);
        vqaVar.a(jk3Var);
        while (!jk3Var.e()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e) {
                    jk3Var.dispose();
                    v08Var.onError(e);
                    return;
                }
            }
            if (jk3Var.e() || objPoll == jk3.c || tma.c(v08Var, objPoll)) {
                return;
            }
        }
    }
}
