package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class wd7 extends uk0 {
    public final /* synthetic */ zd7 a;

    public wd7(zd7 zd7Var) {
        this.a = zd7Var;
    }

    @Override // defpackage.uk0, defpackage.fnd
    public final void a(rf7 rf7Var, String str, boolean z) {
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        zd7 zd7Var = this.a;
        if (zIsCurrentThread) {
            zd7Var.setRemoteImageState(qd7.a);
            return;
        }
        Handler handler = zd7Var.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new ud7(zd7Var, 7));
        } else {
            zd7Var.post(new ud7(zd7Var, 8));
        }
    }

    @Override // defpackage.uk0, defpackage.fnd
    public final void b(rf7 rf7Var, Object obj, String str, boolean z) {
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        zd7 zd7Var = this.a;
        if (zIsCurrentThread) {
            if (zd7Var.getShowProgress()) {
                zd7Var.setRemoteImageState(rd7.a);
            }
        } else {
            Handler handler = zd7Var.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(new ud7(zd7Var, 5));
            } else {
                zd7Var.post(new ud7(zd7Var, 6));
            }
        }
    }

    @Override // defpackage.fnd
    public final void c(rf7 rf7Var, String str, Throwable th, boolean z) {
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        zd7 zd7Var = this.a;
        if (zIsCurrentThread) {
            zd7Var.setRemoteImageState(sd7.a);
            return;
        }
        Handler handler = zd7Var.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new ud7(zd7Var, 3));
        } else {
            zd7Var.post(new ud7(zd7Var, 4));
        }
    }

    @Override // defpackage.uk0, defpackage.fnd
    public final void k(String str) {
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        zd7 zd7Var = this.a;
        if (zIsCurrentThread) {
            zd7Var.setRemoteImageState(sd7.a);
            return;
        }
        Handler handler = zd7Var.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new ud7(zd7Var, 1));
        } else {
            zd7Var.post(new ud7(zd7Var, 2));
        }
    }
}
