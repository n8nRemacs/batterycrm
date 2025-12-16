package defpackage;

import android.util.ArrayMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class oy1 extends k02 {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public /* synthetic */ oy1() {
    }

    @Override // defpackage.k02
    public void a(int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    k02 k02Var = (k02) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(k02Var)).execute(new l30(k02Var, i, 4));
                    } catch (RejectedExecutionException e) {
                        gri.c("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                    }
                }
                break;
        }
    }

    @Override // defpackage.k02
    public final void b(int i, r02 r02Var) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    k02 k02Var = (k02) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(k02Var)).execute(new mn1(k02Var, i, r02Var, 2));
                    } catch (RejectedExecutionException e) {
                        gri.c("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                    }
                }
                break;
            default:
                ((tu1) this.b).b(null);
                ((l22) this.c).r(this);
                break;
        }
    }

    @Override // defpackage.k02
    public void c(int i, jbe jbeVar) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    k02 k02Var = (k02) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(k02Var)).execute(new mn1(k02Var, i, jbeVar, 1));
                    } catch (RejectedExecutionException e) {
                        gri.c("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                    }
                }
                break;
        }
    }

    public oy1(tu1 tu1Var, l22 l22Var) {
        this.b = tu1Var;
        this.c = l22Var;
    }
}
